package com.java.org;

public class String_Concept {
	public static void main(String[] args) {
		String s = "Welcome to java";
		String s1 = "Welcome to java";
		int size = s.length();
		System.out.println(size);
		char at = s.charAt(5);
		System.out.println(at);
		boolean b = s.contains("to");
		System.out.println(b);
		boolean c = s.equalsIgnoreCase("Welcome");
		System.out.println(c);
		int i = s.indexOf(at);
		System.out.println(i);
		
		System.out.println("*************immutable*****************************");
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		String concat2 = s.concat(s1);
		System.out.println(concat2);
		System.out.println(System.identityHashCode(concat2));
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		
		
		System.out.println("*******************muttable***********************************");
		
		
		StringBuffer sb = new StringBuffer("java");
		StringBuffer sb1 =new StringBuffer("java");
		System.out.println(System.identityHashCode(sb));
		System.out.println(System.identityHashCode(sb1));
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);
		StringBuffer append = sb.append(10);
		System.out.println(append);
		System.out.println(System.identityHashCode(append));
		System.out.println(sb);
		
		
		
		
		
		
		
		
		
		}

}
