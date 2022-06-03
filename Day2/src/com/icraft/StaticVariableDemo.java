package com.icraft;

public class StaticVariableDemo {
	
	public static double salary = 4000;
	public static String dept = "Finance";
	
	
	public static void main(String[]args) {
		
//		StaticVariableDemo.salary = 1000;
		   //also we can give the value as on line 11 instead of line 5.
		
		System.out.println("Dept:" + StaticVariableDemo.dept);
		System.out.println("salary:" + StaticVariableDemo.salary);
	}

}
