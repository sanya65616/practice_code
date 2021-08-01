package exceptionHandling;

import java.util.Scanner;

public class MyException {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int age;
		char section;
		String name;
		
		try {
			System.out.println("Enter your Name");
			name = scan.nextLine();
			//name = "sa877";
			name = name.toLowerCase();
			for(int i = 0; i < name.length(); i++) {
				if(name.charAt(i) < 'a' || name.charAt(i) > 'z') {
					count++;
				}
			}
			if(count == 0) {
				System.out.println("Hello " + name);
			}
			else {
				throw new WrongFormatNameException();
			}
			
			System.out.println("Enter your Age");
			age = scan.nextInt();
			//age = 102;
			if(age < 0 || age > 100) {
				throw new WrongAge();
			}
			else {
				System.out.println("Your age is " + age);
			}
			
			System.out.println("Enter your Section");
			section = scan.next().charAt(0);
			//section = 'A';
			if(section == 'A' || section == 'B' || section == 'C') {
				System.out.println("Your section is " + section);
			}
			else {
				throw new WrongSection();
			}
		}
		catch(WrongFormatNameException n) {
			System.out.println(n.toString());
		}
		catch(WrongAge a) {
			System.out.println(a.toString());
		}
		catch(WrongSection s) {
			System.out.println(s.toString());
		}
		finally {
			System.out.println("End program");
		}
	}
}
