package lab;

public class Question17 extends BaseClass {
	
	public void print() {
		System.out.println("Inside derived Class");
	}
	
	public static void main(String[] args) {
		BaseClass object = new BaseClass();
		object.print();
		object = new Question17();
		object.print();
	}

}

class BaseClass {
	public void print() {
		System.out.println("Inside Base Class");
	}
}
