package lab;

public class GFG {
	static int power(int N, int P) 
	{ 
		if (P == 0) 
			return 1; 
		else
			return N * power(N, P - 1); 
	} 

	public static void main(String[] args) 
	{ 
		int N = 8; 
		int P = 3; 

		System.out.println(power(N, P)); 
	}

}
