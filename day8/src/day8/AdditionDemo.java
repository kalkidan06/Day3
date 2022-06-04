package day8;

class AdditionClass{
	int add(int a) {
		return a+a;
		
	}
	int add(int a, int b) {
		return a+b;
	}
	double add(int a, double b) {
		return a+b;
	}
	double add(double a, int b) {
		return a+b;
	}
	double add(int a, double b, double c) {
		return a+b+c;
	}
}


public class AdditionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdditionClass a1 = new AdditionClass();
		AdditionClass a2 = new AdditionClass();
		AdditionClass a3 = new AdditionClass();
		AdditionClass a4 = new AdditionClass();
		
		

	}

}
