package main;



public class Main {
	public static void main(String[] args) {
		
		Set<Element> set = new Set<Element>();
		Element testElement = new Element("jerome");
		System.out.println(testElement);
		
		set.addElement(testElement);
		
		// display contents;
		set.displayElements();
		
	}
}
