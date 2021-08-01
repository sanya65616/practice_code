package Assignment4;

abstract class Shape{
	public static final double PI = 3.14;
	public abstract void volume();
}

class Cone extends Shape{
	double height, radius;
	Cone(double height, double radius){
		this.height = height;
		this.radius = radius;
	}
	public void volume() {
		double vol = PI*radius*radius*height/3.0;
		System.out.println("Volume of Cone is: "+vol);
	}
}

class Sphere extends Shape{
	double radius;
	Sphere(double radius){
		this.radius = radius;
	}
	public void volume() {
		double vol = 4.0/3.0*PI*radius*radius*radius;
		System.out.println("Volume of Sphere is: "+vol);
	}
}

public class Volume {
	public static void main(String[] args) {
		Cone cone = new Cone(7, 4);
		Sphere sphere = new Sphere(5);
		cone.volume();
		sphere.volume();
	}

}
