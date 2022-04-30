package com.java.org;

public class Abstract2 extends Abstact1 {

	@Override
	public void student1() {
		System.out.println("today is working day");
	}

	@Override
	public void student2() {
		System.out.println("today is holiday");
	}
	public static void main(String[] args) {
		Abstract2 a = new Abstract2();
		a.student1();
		a.student2();
		a.student3();
	}
}
