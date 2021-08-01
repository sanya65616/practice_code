package lab;

public class Add {
 	int add(int num1, int num2)
    {
        return num1+num2;
    }
    int add(int num1, int num2, int num3)
    {
        return num1+num2+num3;
    }
    public static void main(String[] args) 
    {    
    	Add obj = new Add();
    	//This will call the first add method
        System.out.println("Sum of two numbers: "+obj.add(10, 20));
        //This will call second add method
        System.out.println("Sum of three numbers: "+obj.add(10, 20, 30));
    }

}
