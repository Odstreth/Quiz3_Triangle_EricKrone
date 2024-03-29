
public class Triangle extends GeometricObject{

	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(){
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}
	
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getPerimeter(){
		return this.side1 + this.side2 + this.side3;
	}
	
	public double getArea(){
		//Heron's formula
		double value = getPerimeter()/2;
		double value1 = value - this.side1;
		double value2 = value - this.side2;
		double value3 = value - this.side3;
		double area = Math.sqrt(value*value1*value2*value3);
		return area;
	}
	
	@Override
	public String toString(){
		return "This is a Triangle with sides of lenth: " + this.side1 + ", " + this.side2 + ", and " + this.side3; 
	}

}
