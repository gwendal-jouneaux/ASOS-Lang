package fr.gjouneau.HTML.nodes;

public class HTMLNodeRoot {

	private HTMLNodeBase html;

	public HTMLNodeRoot(HTMLNodeBlockTag html) {
		this.html = html;
	}
	
	public String execute() {
		return "<!doctype html>" + html.execute();
	}
}
