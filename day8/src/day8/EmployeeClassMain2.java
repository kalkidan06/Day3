package day8;

 class EmpClass2 {
		static String myname = "Daniel kafele";
		static int age = 24;
//		int salary = 20000;
		static int salary = 20000;
		
		
		public static void getEmpDetails(){
			System.out.println("Name: "+ myname);
			System.out.println("Age: "+ age);
			System.out.println("Salary: "+ salary);
			
}
		
		public void printEmpDetails(){
			EmpClass2 a1 = new EmpClass2(); // created an object to access salary
			System.out.println(a1.salary); //???
			System.out.println("Name: "+ myname);
			System.out.println("Age: "+ age);
			System.out.println("Salary: "+ salary);
			}
			}





public class EmployeeClassMain2 {


	public static void main(String[] args) {
		EmpClass2.getEmpDetails(); // Allowed to call without object creation

//		EmpClass2 e1 = new EmpClass2();
//		e1.printEmpDetails();
//		System.out.println(e1.printEmpDetails);
		
//		EmpClass2.printEmpDetails(); // Not Allowed

}
}
