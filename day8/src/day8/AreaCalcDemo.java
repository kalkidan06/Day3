package day8;




	class AreaCalc{
		public double calcArea(int length,int width)
{
			double rectArea = length * width;
			return rectArea;
}
		public double calcArea(int radius) {
			double circleArea = 3.14 * radius * radius;
			return circleArea;
}
}
   
public class AreaCalcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AreaCalc a1 = new AreaCalc();
			double rectArea = a1.calcArea(10,10);
			double circleArea = a1.calcArea(20);
		
	
		
   System.out.println("Area of rectangel:" + rectArea);
   System.out.println("Area of circle:" + circleArea);
	}

}
