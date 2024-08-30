package html_ASOS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class HTMLParser {
	
	private final String content;
	private int index;
	private final List<Character> WS = Arrays.asList(' ','\r','\n','\t');
	
	public static final String[] VOID_ELEMENTS = new String[]{
            "AREA",
            "BASE",
            "BR",
            "COL",
            "EMBED",
            "HR",
            "IMG",
            "INPUT",
            "LINK",
            "META",
            "PARAM",
            "SOURCE",
            "TRACK",
            "WBR"
	};
	
	public HTMLParser(String fileContent) {
		this.content = fileContent;
	}
	
	public HTMLNodeRoot parse() {
		index = content.indexOf("<html");
		HTMLNodeBlockTag htmlBlock = (HTMLNodeBlockTag) parseNext(content.length());
		//Truffle.getRuntime().createCallTarget(rootNode)
		HTMLNodeRoot out = html_ASOS.Html_ASOSFactory.eINSTANCE.createHTMLNodeRoot();
		out.setRoot(htmlBlock);
		return out;
	}
	
	private HTMLNodeBase parseNext(int endIndex) {
		int tempI = index;
		do {
			while(WS.contains(content.charAt(tempI)) && tempI < endIndex) {
				tempI++;
			}
		}while((isEndTag() || (isComment(tempI) && 0<(tempI=bypassComment(tempI)))) && tempI < endIndex);
		if(tempI >= endIndex) {
			index = endIndex;
			return null;
		}
		
		if(content.charAt(tempI) == '<') {
			index = tempI+1;
			return parseTag(endIndex);
		} else {
			return parseText(endIndex);
		}
	}
	
	private HTMLNodeBaseTag parseTag(int endIndex) {
		int sourceSectionStart = index;
		String stringTag = "";
		while(!WS.contains(content.charAt(index)) && content.charAt(index) != '>') {
			stringTag += content.charAt(index);
			index++;
		}
		
		if(Arrays.asList(VOID_ELEMENTS).contains(stringTag.toUpperCase())) {
			return parseEmpty(sourceSectionStart, endIndex, stringTag);
		}
		
		int endTagIndex = findEndTagIndex(stringTag, index, endIndex);
		if (endTagIndex < 0 || endTagIndex > endIndex) {
			return parseEmpty(sourceSectionStart, endIndex, stringTag);
		} else {
			return parseBlock(sourceSectionStart, endIndex, endTagIndex, stringTag);
		}
	}
	
	private HTMLNodeBlockTag parseBlock(int startindex, int endIndex, int blockEnd, String stringTag) {
		int tagEnd = findIndexOf('>',index,endIndex);
		HTMLNodeAttribute attr;
		List<HTMLNodeAttribute> attributes = new ArrayList<HTMLNodeAttribute>();
		while((attr = parseAttribute(tagEnd)) != null) {
			attributes.add(attr);
		}
		List<HTMLNodeBase> children = new ArrayList<HTMLNodeBase>();
		
		if (stringTag.toLowerCase().equals("script") 
				|| stringTag.toLowerCase().equals("style")
				|| stringTag.toLowerCase().equals("svg")) {
			String inner = content.substring(index,blockEnd);
			HTMLNodeText elem = Html_ASOSFactory.eINSTANCE.createHTMLNodeText();
			elem.setContent(inner);
			children.add(elem);
			index = blockEnd;
		} else {
			while(index < endIndex) {
				HTMLNodeBase elem = parseNext(blockEnd);
				if(elem != null) {
					children.add(elem);
				} else {
					break;
				}
			}
		}
		if(index < endIndex) {
			index = Math.min(endIndex, index + stringTag.length()+3);
		}
		HTMLNodeBlockTag out = html_ASOS.Html_ASOSFactory.eINSTANCE.createHTMLNodeBlockTag();
		out.setTag(stringTag);
		out.getAttributes().addAll(attributes);
		out.getChildren().addAll(children);
		return out;
	}
	
	private HTMLNodeEmptyTag parseEmpty(int startindex, int endIndex, String stringTag) {
		int tagEnd = findIndexOf('>',index,endIndex);
		int padding = (content.charAt(tagEnd-1)=='/')?1:0;
		HTMLNodeAttribute attr;
		List<HTMLNodeAttribute> attributes = new ArrayList<HTMLNodeAttribute>();
		while((attr = parseAttribute(tagEnd-padding)) != null) {
			attributes.add(attr);
		}
		index += padding;
		HTMLNodeEmptyTag out = html_ASOS.Html_ASOSFactory.eINSTANCE.createHTMLNodeEmptyTag();
		out.setTag(stringTag);
		out.getAttributes().addAll(attributes);
		return out;
	}
	
	private HTMLNodeText parseText(int endIndex) {
		int sourceSectionStart = index;
		StringBuilder out = new StringBuilder();
		do {
			while(content.charAt(index) != '<') {
				out.append(content.charAt(index));
				index++;
			}
		}while(isComment() && bypassComment());
		HTMLNodeText res = html_ASOS.Html_ASOSFactory.eINSTANCE.createHTMLNodeText();
		res.setContent(out.toString());
		return res;
	}
	
	private HTMLNodeAttribute parseAttribute(int endIndex) {
		while(WS.contains(content.charAt(index))) {
			index++;
		}
		if(index >= endIndex) {
			index++;
			return null;
		}
		int sourceSectionStart = index;
		String name = "";
		while(!WS.contains(content.charAt(index)) && content.charAt(index)!='=' && index < endIndex) {
			name += content.charAt(index);
			index++;
		}
		if(content.charAt(index)=='=') {
			index++;
			AttributeType type;
			char endChar = ' ';
			switch (content.charAt(index)) {
			case '"':
				type = AttributeType.DOUBLE_QUOTED;
				index++;
				endChar = '"';
				break;
			case '\'':
				type = AttributeType.SIMPLE_QUOTED;
				index++;
				endChar = '\'';
				break;
			default:
				type = AttributeType.UNQUOTED;
				break;
			}
			String value = "";
			while(content.charAt(index) != endChar  && index < endIndex) {
				value += content.charAt(index);
				index++;
			}
			if(index < endIndex && type!=AttributeType.UNQUOTED) {
				index++;
			}
			HTMLNodeAttribute res = html_ASOS.Html_ASOSFactory.eINSTANCE.createHTMLNodeAttribute();
			res.setName(name);
			res.setValue(value);
			res.setType(type);
			return res;
		}
		HTMLNodeAttribute res = html_ASOS.Html_ASOSFactory.eINSTANCE.createHTMLNodeAttribute();
		res.setName(name);
		return res;
	}
	
	private int findEndTagIndex(String tag, int startIndex, int endIndex) {
		int count = 1;
		startIndex = content.indexOf('<', startIndex)+1;
		while(startIndex < endIndex && startIndex > 0) {
			int sign = 1;
			if(content.charAt(startIndex)=='/') {
				sign = -1;
				startIndex++;
			}
			String stringTag = "";
			while(!WS.contains(content.charAt(startIndex)) && content.charAt(startIndex) != '>') {
				stringTag += content.charAt(startIndex);
				startIndex++;
			}

			if(stringTag.toLowerCase().equals(tag.toLowerCase())) {
				count += sign;
			}
			if(count <= 0) {
				return startIndex - stringTag.length() -2;
			}
			startIndex = content.indexOf('<', startIndex)+1;
		}
		
		return -1;
	}
	
	private int findIndexOf(char c, int startIndex, int endIndex) {
		int i = content.indexOf(c, startIndex);
		return endIndex<=i?-1:i;
	}
	
	private boolean isComment(int index) {
		return content.startsWith("<!--", index);
	}
	
	private boolean isComment() {
		return isComment(index);
	}
	
	private int bypassComment(int index) {
		int out = content.indexOf("-->", index);
		if(out == -1) return content.length();
		return out+3;
	}
	
	private boolean bypassComment() {
		index = content.indexOf("-->", index)+3;
		return true;
	}
	
	private boolean isEndTag() {
		return content.startsWith("</", index);
	}
	
}
