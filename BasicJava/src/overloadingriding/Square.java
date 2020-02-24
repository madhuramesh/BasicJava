package overloadingriding;

public class Square extends Shape{
	double area = 15;
	public void print() {
		System.out.println("Printing from Square");
	}
	
//Overloading	
	public double computeArea() {
		return area;
	}
}