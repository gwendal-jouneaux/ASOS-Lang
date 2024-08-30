package fr.gjouneau.HTML.nodes;

import java.util.List;

public abstract class HTMLNodeBaseTag extends HTMLNodeBase{

	protected final String stringTag;
	protected HTMLNodeAttribute[] attributes;
	
	public HTMLNodeBaseTag(String unknownTag, List<HTMLNodeAttribute> attributes) {
		this.stringTag = unknownTag;
		this.attributes = new HTMLNodeAttribute[attributes.size()];
		for (int i = 0; i < this.attributes.length; i++) {
			this.attributes[i] = attributes.get(i);
		}
	}

	public HTMLNodeAttribute[] getAttributes() {
		return attributes;
	}
}
