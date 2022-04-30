package com.java.org;

import java.util.Scanner;

public class Scanner_Class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter your sentence");
		String sentence = sc.nextLine();
		System.out.println("my sentence is " + sentence);
		System.out.println("enter your name");
		String name = sc.next();
		String name1 = sc.next();
		System.out.println("my name is " + name +" "+ name1);
		System.out.println("enter you age ");
		int age = sc.nextInt();
		System.out.println("my age is " + age);
		System.out.println("enter your percentage ");
		double percentage = sc.nextDouble();
		System.out.println("my percentage is "+ percentage);
	}

}
