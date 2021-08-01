package Assignment2;

class Person{
	String name;
	int age;
}

class Kids extends Person {
	String skulName ;
	
	public void display(String name, int age, String skulName) {
	    System.out.println("Name: "+name+"\nAge :"+age+"\nSchool Name: "+skulName);
	}    
}

public class SingleInheritance {
	public static void main(String[] args) {
		Kids child = new Kids();
		child.display("Amit", 7, "D.A.V");
	}

}
