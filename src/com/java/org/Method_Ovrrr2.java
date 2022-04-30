package com.java.org;

public class Method_Ovrrr2 extends Method_Ovrrr1{
	@Override
	public void shirt() {
		super.shirt();
		System.out.println("i wear only half sleeve");
	}
	@Override
	public void noshirt() {
		super.noshirt();
		System.out.println("i will not wear half sleeve");
	}
	public static void main(String[] args) {
		Method_Ovrrr1 m = new Method_Ovrrr2();
		m.shirt();
		m.noshirt();
	
	}
}
