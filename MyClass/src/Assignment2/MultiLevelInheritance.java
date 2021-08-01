package Assignment2;

class Vehicle{
	String comapany,model,ownerName;
	int vehicleNum;
	public void start() {
		System.out.println("Insert Key and start engine");
	}
}

class Car extends Vehicle {
	public void engine() {
		System.out.println("Normal Engine");
	}
	public void changeSpeed() {
		System.out.println("Gear Change");
	}
	public void travel() {
		System.out.println("Travel 50 miles per gallon and consume less fuel");
	}
}

class SportsCar extends Car {
	public void engine() {
		System.out.println("Powerfull Engine");
	}
	public void travel() {
		System.out.println("Travel 22 miles per gallon and consume high fuel");
	}
	public void brakes() {
		System.out.println("self-ventilating which avoids the car getting overheating");
	}
	
}
public class MultiLevelInheritance {
	public static void main(String[] args) {
		Car car = new Car();
		SportsCar sportsCar = new SportsCar();
		System.out.println("#For Car");
		car.start();
		car.changeSpeed();
		System.out.println("#For Sports Car");
		sportsCar.start();
		sportsCar.travel();
		sportsCar.brakes();
	}

}
