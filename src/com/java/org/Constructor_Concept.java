package com.java.org;

public class Constructor_Concept {
	public Constructor_Concept() {
		System.out.println("iam non parameterized constructor");
	}

	public Constructor_Concept(String s) {
		System.out.println("iam " + s);
	}
	
	
	public Constructor_Concept(int i) {
		System.out.println("value is " +i);
	}
	public static void main(String[] args) {
		Constructor_Concept c1 = new Constructor_Concept();
		Constructor_Concept c2 = new Constructor_Concept("parameterized constructor");
		Constructor_Concept c3 = new Constructor_Concept(69);
	}
}
