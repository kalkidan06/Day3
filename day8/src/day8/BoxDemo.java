package day8;

	class Box {
		double width;
		double height;
		double depth;
		Box(){
			width = 5;
			height = 10;
			depth = 3;
		}
		
		Box(double w,double h,double d){
			width = w;
			height = h;
			depth = d;
			}
			double volume(){
			return width * height *
			depth;
			}
			}



public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Box b1 = new Box();
		Box b2 = new Box(5,10,15);
		System.out.println( b1.volume());
		System.out.println(b2.volume());

	}

}
