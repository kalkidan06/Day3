package com.icraft;

public class StaticVariableDemo2 {
	
	static String city = "New York";
	String name = "Mohammed Ismail";
	int age = 30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		    System.out.println("city:"+StaticVariableDemo2.city);
//
//		    System.out.println("name:"+StaticVariableDemo2.name);
//	        System.out.println("age:"+StaticVariableDemo2.age);

		    StaticVariableDemo2 m1 = new StaticVariableDemo2();

		m1.city = "Addis Ababa";
		m1.name = "James Bond";

		System.out.println("City: " + m1.city); // StaticVariableDemo2.city
		System.out.println("Name: " + m1.name);
		System.out.println("Age: " + m1.age);

//		System.out.println("----------------------");
//
		StaticVariableDemo2 m2 = new StaticVariableDemo2();

		System.out.println("City: " + m2.city); // StaticVariableDemo2.city
		System.out.println("Name: " + m2.name);
		System.out.println("Age: " + m2.age);

	}

}
