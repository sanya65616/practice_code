package lab;

public class MethodPass {
	public static int getValue() {
		return 5;
	}
	public static void setValue(int n) {
		int value = n;
		System.out.println(value);
	}
	public static void main(String[] args) {
		setValue(getValue());
	}
}
