package lab;

public class CallConstructor {
	int value;
	CallConstructor(){
		//this(4);
		System.out.println("you are in default constructor");
		this(4);
	}
	CallConstructor(int n){
		value = n;
		System.out.println("you are in parameter constructor with value "+ value);
		
	}

	public static void main(String[] args) {
		CallConstructor obj = new CallConstructor();
	}

}
