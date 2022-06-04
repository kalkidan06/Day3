package day8;

class My_Calculation1{
	int z;
	public void addition(int x, int y) {
		z = x+y;
		System.out.println("The sum of the given numbers:"+z);
	}
	public void Subtraction(int x, int y) {
		z= x-y;
		System.out.println("The difference between the given numbers:"+z);
	}
}

class My_Calculation2 extends My_Calculation1{
	public void multiplication(int x, int y) {
		z=x*y;
		System.out.println("The product of  the given numbers:"+z);
	}

}
class My_Calculation3 extends My_Calculation2{
	public void division (int x, int y) {
		z= x/y;
		System.out.println("The division of the given numbers:"+z);
	}
}

public class CalculationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		My_Calculation2 m1 = new My_Calculation2();
		My_Calculation3 m2 = new My_Calculation3();
		m1.addition(20, 40);
		m1.Subtraction(10,2);
		m1.multiplication(80,6);
		m2.division(8,2);
		
		   // creating object with my_calculation1( the first parent)
//		My_Calculation1 m2 =new My_Calculation1();
//		m2.addition(20, 40);
//		m2.Subtraction(10,2);
//		m2.multiplication(80,6); can not access multiplication in m2( in my_calculation1)
				
		
	}

}


//single inheritance is only one parent and one child.

// multiple inheritance is multiple parent classes for one child, which is not supported in Java. ex class c extends A, B 

// multilevel inheritance is when we have a child class that has a child 

// hierarchal inheritance is when a parent have multiple children( all child classes are extending to one same parent).