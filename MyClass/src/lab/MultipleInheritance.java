package lab;

//First Parent class 
class Parent1 
{ 
 void fun() 
 { 
     System.out.println("Parent1"); 
 } 
} 

//Second Parent Class 
class Parent2 
{ 
 void fun() 
 { 
     System.out.println("Parent2"); 
 } 
} 



//Error : Test is inheriting from multiple 




public class MultipleInheritance extends Parent1, Parent2 {
	public static void main(String args[]) 
	{ 
		MultipleInheritance t = new MultipleInheritance(); 
	    t.fun(); 
	} 

}
