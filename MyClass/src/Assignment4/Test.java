package Assignment4;

abstract class A{
	public abstract void disp();
}

class B extends A{
	public void disp() {
		System.out.println("call me from B");
	}
}

public class Test {
	public static void main(String[] args) {
		B b = new B();
		b.disp();
	}

}
