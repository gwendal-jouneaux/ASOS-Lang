package fr.gjouneau.HTML.nodes;

import java.util.List;

public class HTMLNodeBlockTag extends HTMLNodeBaseTag {
	
	private HTMLNodeBase[] children;

	public HTMLNodeBlockTag(String tag, List<HTMLNodeAttribute> attributes, List<HTMLNodeBase> children) {
		super(tag, attributes);
		this.children = new HTMLNodeBase[children.size()];
		for (int i = 0; i < this.children.length; i++) {
			this.children[i] = children.get(i);
		}
	}

	@Override
	public String execute() {
		String out = "<"+stringTag;
		for (int i = 0; i < attributes.length; i++) {
			out += " "+attributes[i].execute();
		}
		out += ">";
		for (HTMLNodeBase child : children) {
			if(child != null) out += child.execute();
		}
		out += "</"+stringTag + ">";
		return out;
	}

	public HTMLNodeBase[] children() {
		return children;
	}

	
}
