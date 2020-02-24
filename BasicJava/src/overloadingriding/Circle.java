package overloadingriding;

public class Circle extends Shape{
	double radius =10;
	public void print() {
		System.out.println("Printing from Circle");
	}
	
//Overriding Shape	
	public double computeArea() {
		return radius * radius * 3.15;
	}
}