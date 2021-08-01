package Assignment11;

import java.util.Scanner;

public class FindKeyword {
	String[] list = {"abstract", "boolean", "break", "byte", "case", "catch", "char", "class", "continue", "default",
			 "do", "double", "else", "extends", "final", "finally", "float", "for", "if", "implements", "import", "instanceof",
			 "int", "interface", "long", "new", "package", "private", "protected", "public", "return", "short", "static", "super", 
			 "switch", "synchronized", "this", "throw", "throws","try", "void", "while" };

	 public static void main(String[] args) {
		 
		 Scanner scan = new Scanner(System.in);
		 String input = scan.next();
		 
		 FindKeyword word = new FindKeyword();
		 boolean flag = word.checkKeyword(input);
		 if(flag == true) 
			 System.out.println(input + " is a keyword");
		 
		 else
			 System.out.println(input + " is not a keyword");
		 
	 } 
		 public boolean checkKeyword(String str) {
			 
		 for(int i = 0; i < 42; i++) {
			 if(str.equals(list[i]))
				 return true;
		 }
		return false;
		 
	 }

}
