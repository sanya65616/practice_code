package Assignment4;

abstract class Vehicle{
	public abstract void engine();
}

class Car extends Vehicle{
	public void engine() {
		System.out.println("car has good engine");
	}
}

class Truck extends Vehicle{
	public void engine() {
		System.out.println("truck has bad engine");
	}
}

public class AbstarctTest {
	public static void main(String[] args) {
		Car car = new Car();
		Truck truck = new Truck();
		car.engine();
		truck.engine();
	}
}
