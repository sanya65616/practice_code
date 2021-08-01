package Assignment2;

class Animal {
	public void makeNoise() {
		System.out.println("Speak");
	}
	public void eat() {
		System.out.println("Eating");
	}
	public void sleep() {
		System.out.println("Sleep");
	}
	public void roam() {
		System.out.println("Roaming");
	}
	
}

class Cat extends Animal{
	public void makeNoise() {
		System.out.println("meows");
	}
	public void eat() {
		System.out.println("Eating milk and rat");
	}
}

class Dog extends Animal{
	public void makeNoise() {
		System.out.println("Bark");
	}
	public void eat() {
		System.out.println("Eating bones and cat");
	}
}

public class hierarchicalInheritance {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		System.out.println("#For Cat");
		cat.makeNoise();
		cat.roam();
		System.out.println("#For Dog");
		dog.eat();
		dog.sleep();
	}

}
