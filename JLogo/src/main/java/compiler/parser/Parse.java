package compiler.parser;

public class Parse {
	public ParseType type;
	public String name;
	public int valueNeeded;
	public int currentValueIndex = 0;
	public String[] value;
	
	public Parse(ParseType type, String name, int valueNeeded) {
		this.type = type;
		this.name = name;
		setValueNeeded(valueNeeded);
	}
	public Parse() {
		this(ParseType.NULL, null, 0);
	}
	public void setValueNeeded(int value) {
		valueNeeded = value;
		this.value = new String[valueNeeded];
	}
}
