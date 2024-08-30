package fr.gjouneau.HTML.nodes;

import java.util.List;

public class HTMLNodeEmptyTag extends HTMLNodeBaseTag {
	
	public HTMLNodeEmptyTag(String tag, List<HTMLNodeAttribute> attributes) {
		super(tag, attributes);
	}
	
	@Override
	public String execute() {
		String out = "<"+stringTag;
		for (int i = 0; i < attributes.length; i++) {
			out += " "+attributes[i].execute();
		}
		out += "/>";
		return out;
	}

}
