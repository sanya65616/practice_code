import java.util.Scanner;

public class Roman {
	
	public static  void main(String[] args) {
		int count = 0, pre = 0, result = 0, n = 0;
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			 n = valueOf(c);
			if(pre < n) {
			if(pre == n)	
			count++;
			pre = n;
			if(count < 1) {
				 result = convertor(n);
				 System.out.print("Decimal number is "+result);
			}
			else
				System.out.print("Invalid Input");
				
			}
			if(pre >= n) {
			if(pre == n)
				count++;
			pre = n;
			if(count <3) {
				 result = convertor(n);
				System.out.print("Decimal number is "+result);
			}
			else
				System.out.print("Invalid Inpur");
			}
		}
	}

          
   public static int convertor(int n) {
	    int sum = 0;
    	if(sum>=n) 
    	return convertor(n + sum);
    	if(sum<n)
    	return convertor(n - sum);
    	else
		return -1;
    		
   }
	
	public static int valueOf(char c) {
		switch(c) {
		case 'I': return 1;
		case 'V': return 5;
		case 'X': return 10;
		case 'L': return 50;
		case 'C': return 100;
		case 'D': return 500;
		case 'M': return 1000;
		default: return -1;
		}
	}
}
