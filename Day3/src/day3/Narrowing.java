package day3;

public class Narrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d = 100.04;
		long l = (long)d; //explicit type casting required
		int i = (int)l; //explicit type casting required
		System.out.println("Double value "+d);
		System.out.println("Long value "+l);
		System.out.println("Int value "+i);


	}

}
