package Assignment2;

class Person1{
	String name;
	int age;
	Person1(){
		System.out.println("Creating Person");
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getName() {
		System.out.println("Name: "+this.name);
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void getAge() {
		System.out.println("Age: "+this.age);
	}
}

public class DefaultConstructor {
	public static void main(String[] args) {
		Person1 person = new Person1();
		person.setName("Sanya");
		person.getName();
		person.setAge(20);
		person.getAge();
	}

}
