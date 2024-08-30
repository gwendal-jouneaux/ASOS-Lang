package fr.gjouneau.HTML.nodes;

public class HTMLNodeAttribute extends HTMLNodeBase {

	private final String name;
	private final String value;
	private final attributeType type;

	public enum attributeType {
		UNQUOTED, SIMPLE_QUOTED, DOUBLE_QUOTED
	}

	public HTMLNodeAttribute() {
		this.name = "";
		this.type = null;
		this.value = "";
	}
	
	public HTMLNodeAttribute(String name, String value, attributeType type) {
		this.name = name;
		this.value = value;
		this.type = type;
	}

	@Override
	public String execute() {
		if(type == null) return name;
		switch (type) {
		case UNQUOTED:
			return name+"="+value;
		case SIMPLE_QUOTED:
			return name+"='"+value+"'";
		case DOUBLE_QUOTED:
			return name+"=\""+value+"\"";
		default:
			return name;
		}
	}
	
	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	public attributeType getType() {
		return type;
	}

}
