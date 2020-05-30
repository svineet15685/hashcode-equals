package com.hashcode;

public class HashcodePractice {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Student student1 = new Student(1, "ABC");
		Student student2 = new Student(1, "ABC");
		
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
	}
	
}

class Student {
	int id;
	String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
