package com.icraft;

public class InstanceVariabledDemo {
	
	int age = 34;
	
	void methodOne() {
		int i = 10;
		System.out.println("value of i:" + i);
		System.out.println("value of age:" + age);
	}
	
	void methodTwo() {
		
		int k = 20;
		System.out.println("value of i:" + k);
		System.out.println("value of age:" + age);
		
	}
	
	public static void main(String[] args) {
		
		InstanceVariabledDemo m2 = new InstanceVariabledDemo();
		
		m2.age = 56;
		m2.methodOne();
		m2.methodTwo();
		
		System.out.println("------------");
		
		InstanceVariabledDemo m3 = new InstanceVariabledDemo();
		
		m3.age = 44;
		m3.methodOne();
		
		
		System.out.println("------------");
		
		InstanceVariabledDemo m4 = new InstanceVariabledDemo();
		
		m4.methodOne();
	}

}
