package com.java.org;

public class Method_Overl {
	public void students() {
		System.out.println("good person");
	}
	public void students(String s) {
		System.out.println("bad person is " + s);
	}
	public void students(String s,String a) {
		System.out.println("average person is " + s+ "very avg person is " + a);
	} 
	public void students(int a,String b,char c) {
		System.out.println("very good person id is " + a +  " name is " + b +" . " + c);
	}
	public void students(float f) {
		System.out.println("very bad person salary is "+ f);
	}
	public static void main(String[] args) {
		Method_Overl m = new Method_Overl();
		m.students();
		m.students("ARUN");
		m.students("arun ", "ram");
		m.students(69 , " ram" ,'B');
		m.students(11000.25f);
	}
}
