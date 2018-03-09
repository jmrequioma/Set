package main;
public class Element {
	private Integer intValue;
	private String strValue;
	int indicator;   // 0 for int, 1 for String
	
	public Element(int intValue) {
		this.setIntValue(intValue);
		indicator = 0;
	}
	
	public Element(String strValue) {
		this.setStrValue(strValue);
		indicator = 1;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

	public String getStrValue() {
		return strValue;
	}

	public void setStrValue(String strValue) {
		this.strValue = strValue;
	}
	
	public String toString() {
		if (indicator == 0) {
			return intValue.toString();
		} else {
			return strValue;
		}
		
	}
}

