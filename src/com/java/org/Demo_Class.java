package com.java.org;

import java.util.Scanner;

public class Demo_Class {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter your age");
		int age = sc.nextInt();
		if (age > 18 && age<=60) {
			System.out.println("You Are Eligible To Vote");
		}
		if (age<18) {
			System.out.println("You Are Not Eligible To Vote");
		} else {
			if (age >=60 && age <=70) {
				System.out.println("you are seniour citizen");
			} else {
				System.out.println("you are dead");
				
			}
			
			}}}		