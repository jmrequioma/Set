package main;

import java.util.ArrayList;

public class Set<Element> {
	ArrayList<Element> set;
	Element e;
	public Set() {
		set = new ArrayList<Element>();
	}
	
	public void addElement(Element e) {
		set.add(e);
	}
	
	public void displayElements() {
		for (int i = 0; i < set.size(); i++) {
			System.out.println(set.get(i));
		}
	}
}
