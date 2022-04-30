package com.java.org;

public class Exception_Concept {
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		try {
			System.out.println(i/j);
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}	
		finally {
			System.out.println("exception handled");
		}
		
		System.out.println("welcome all");
	}}


