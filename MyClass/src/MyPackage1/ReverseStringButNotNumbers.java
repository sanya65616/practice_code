package MyPackage1;

import java.util.Scanner;

public class ReverseStringButNotNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String strNew = null;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 65 || str.charAt(i) <= 90 && str.charAt(i) >= 97 || str.charAt(i) <= 122) {
				str.
				StringBuffer strB = new StringBuffer();
				strB.append(str);
				strB = strB.reverse();
				//System.out.println(strB);
				strNew = strB.toString();
			}
		}
		System.out.println(strNew);
	}

}
