package fr.gjouneau.HTML.nodes;

public class HTMLNodePlainText extends HTMLNodeBase {
	
	private final String content;

	public HTMLNodePlainText(String content) {
		this.content = content;
	}

	@Override
	public String execute() {
		return content;
	}
}
