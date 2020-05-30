package com.hashcode;

public class EqualsPractice {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = str1;
		
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str1));
		
		Student student1 = new Student(1, "ABC");
		Student student2 = new Student(1, "ABC");
		Student student3 = student1;
		
		System.out.println(student1.equals(student2));
		System.out.println(student1.equals(student3));
	}

}