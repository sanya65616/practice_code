package Assignment2;

public class Overloading {
	
	public void add(int num1, int num2, double num3) {
		System.out.println(num1 + num2 + num3);
	}
//	overloading
	public void add(double num1,int num2) {
		System.out.println(num1 + num2);
	}
	
	public static void main(String[] args) {
		int n1 = 53, n2 = 41;
		double n3 = 82.16;
		Overloading obj = new Overloading();
		obj.add(n1, n2, n3);
		obj.add(n3, n2);
	}

}
