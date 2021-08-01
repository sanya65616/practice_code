package MyPackage1;

public class ImmutableStringExample {

	static String lastName = "Gupta";
	static String sanya = "Sanya";
	
	public static void main(String[] args) {
		System.out.println(Integer.toHexString((lastName + sanya).hashCode()));
		sanya = "Sanya";
		System.out.println(Integer.toHexString((lastName + sanya).hashCode()));
		
		int i = 20;
		i = 10;
				
	}
}
