package Assignment2;

class Triangle{
	double height, base, hypotenuse;
    Triangle(double height, double base){
		this.height = height;
		this.base = base;
	}
	Triangle(double height, double base, double hypotenuse){
		this.height = height;
		this.base = base;
		this.hypotenuse = hypotenuse;
	}
	public void getPerimeter() {
		System.out.println("Perimeter of given triangle is "+(this.height+this.base+this.hypotenuse));
	}
	public void getArea() {
		System.out.println("Area pf given triangle is "+(this.height*this.base)/2);
	}
}

public class ConstructorOverloading {
	public static void main(String[] args) {
		Triangle triangle1 = new Triangle(4,3,5);
		triangle1.getPerimeter();
		Triangle triangle2 = new Triangle(6,3);
		triangle2.getArea();
	}

}
