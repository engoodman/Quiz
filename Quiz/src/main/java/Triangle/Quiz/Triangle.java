package Triangle.Quiz;



public class Triangle extends GeometricObject {
	private double side1(){
		double side1 = 1.0;
		return side1;
	}
	private double side2(){
		double side2 = 1.0;
		return side2;
	}
	private double side3(){
		double side3 = 1.0;
		return side3;
	}

	
	public double getArea() {
		
		double Area = Math.sqrt(s(s-side1)*(s-side2)*(s-side3));
		
		return 0;
	}


	public double getPerimeter() {
		double side1 = 1.0;
		double side2 = 1.0;
		double side3 = 1.0;
		double s = (side1 + side2 + side3)/2;
		
		return 0;
	}
	public String toString(){
		return toString();
	}
	
	

}
