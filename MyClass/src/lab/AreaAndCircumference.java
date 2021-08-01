package lab;

public class AreaAndCircumference {
	 static float pie= (float) 3.14;
	  public static void findArea(int r) {
		  float area = pie*r*r;
		  System.out.println("Area of a circle is "+ area);
	  }
	  public static void findCircum(int r) {
		  float circum = 2*pie*r;
		  System.out.println("Circumference of a circle is "+ circum);
	  }
	  public static void main(String[] args) {
		  int radius = 8;
		  findArea(radius);
		  findCircum(radius);
	  	
	  }
}
