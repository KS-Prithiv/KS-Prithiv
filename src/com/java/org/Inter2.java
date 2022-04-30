package com.java.org;

public class Inter2 implements Inter1{

	@Override
	public void student1() {
		System.out.println("good person");
	}

	@Override
	public void student2() {
		System.out.println("bad person");

	}

	@Override
	public void student3() {
		System.out.println("avg person");

	}
	public static void main(String[] args) {
		Inter2 i = new Inter2();
		i.student1();
		i.student2();
		i.student3();
	}

}
