package lab;
interface A{
	 void method1();
}
interface B {
	void method2();
}
interface C extends B, A{
	void method3();
}
public class InterfaceExtendsInterface implements C {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("From Interface A");	
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("From Interface B");	
	}	
	
	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("From Interface C");
	}
	
	public static void main(String[] args) {
		InterfaceExtendsInterface obj = new InterfaceExtendsInterface();
		obj.method1();
		obj.method2();
		obj.method3();
	}	
}
