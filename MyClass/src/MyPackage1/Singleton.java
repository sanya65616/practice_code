package MyPackage1;

public class Singleton {
	private Singleton() {

	}
	
	public static Singleton getObject() {
		Singleton single = new Singleton();
		return single;
	}
	

}
