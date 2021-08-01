package MyPackage1;

import java.util.Scanner;

public class MyException {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int age;
		char section;
		String name;
		
		try {
			name = scan.nextLine();
			name = name.toLowerCase();
			for(int i = 0; i < name.length(); i++) {
				if(name.charAt(i) <= 'a' && name.charAt(i) >= 'z') {
					count++;
				}
			}
			if(count == 0) {
				System.out.println("Hello " + name);
			}
			else {
				throw new WrongFormatNameException();
			}
		}
	}
}
