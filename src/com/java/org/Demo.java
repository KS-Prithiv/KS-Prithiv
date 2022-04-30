package com.java.org;

public class Demo {
	public static void main(String[] args) {
		int a[][] = new int[3][2];

		int size = a.length;
		System.out.println(size);

		a[0][0] = 10;
		a[0][1] = 20;
		
		a[1][0] = 30;
		a[1][1] = 40;
		
		a[2][0] = 50;
		a[2][1] = 60;
		
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 1; j++) {
				System.out.print(a[i] [j] );
				
			}
			System.out.println();
			
		
		}
		System.out.println("***********************************************************");
		int b[][] = {{10,15,20},
	               	{25,30,35,40,45},
	            	{50,55,60,65},
	            	{70,75}};
	for (int i = 0; i < b.length; i++) {
		for (int j = 0; j < b[i].length; j++) {
			System.out.print(b [i][j] + "");
		}
		System.out.println();
	}
	
	}
}
		

