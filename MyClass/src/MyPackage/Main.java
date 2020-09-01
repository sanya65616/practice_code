package MyPackage;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Shape shape1 = new Rectangle(10,5);
	    Shape shape2 = new Square(10);
	    Scanner scan = new Scanner(System.in);
	    System.out.println("enter lenght & width of rectangle");
	    float a=0, b=0;
	    if(scan.hasNextFloat()) {
	    	a = scan.nextFloat();
	    }
	    if(scan.hasNextFloat()) {
	    	b = scan.nextFloat();
	    }
	    	Shape shape3 = new Rectangle(a,b);
	    	System.out.println("perimeter of rectangle "+shape3.getPerimeter());
	    	System.out.println("perimeter of Square");
	    	System.out.println(shape2.getPerimeter());
	    
	}

}

