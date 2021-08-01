package Assignment2;

class Rectangle{
	
	double length, width;
	Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	public void getParimeter() {
		System.out.println("Parimeter of given rectangle is "+2*(this.length+this.width));
	}
	public void getArea() {
		System.out.println("Area of given rectangle is "+(this.length*this.width));
	}
}

public class ParameterizedConstructor {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(12,9);
		rec.getParimeter();
		rec.getArea();
	}

}
