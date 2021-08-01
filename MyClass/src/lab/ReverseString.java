package lab;

public class ReverseString {
	public static void main(String[] args) {
		String str = "jkdsciuhcdsj";
		reverse(str);
	}

	private static void reverse(String str) {
		// TODO Auto-generated method stub
		if((str == null) || (str.length() <= 1)) {
			System.out.println(str);
		}
		else {
			System.out.print(str.charAt(str.length()-1));
			reverse(str.substring(0, str.length()-1));
		}
	}
	

}
