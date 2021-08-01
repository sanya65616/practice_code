
 class Person{
	String name;
	
	Person(String name){
		this.name = name;
	}
}

class Employee extends Person implements Comparable<Employee>{
	double annualSalary;
	int year;
	String nationalInsuranceNumber;
	
	Employee(String name, double annualSalary, int year, String nationalInsuranceNumber){
		super(name);
		this.annualSalary = annualSalary;
		this.year = year;
		this.nationalInsuranceNumber = nationalInsuranceNumber;
	}
	
	public void displace() {
		System.out.println("Name: "+this.name+"\nAnnunal Salary: "+this.annualSalary+"\nYear: "+this.year+"\nNational Insurance Number: "+this.nationalInsuranceNumber);
		
	}

	@Override
	public int compareTo(Employee o) {
		
		return nationalInsuranceNumber.compareTo(this.nationalInsuranceNumber);
	}
	
}

public class Test {
	
	 static Employee e1 = new Employee("Sanjay", 100000, 6, "DYEK359862");
	 static Employee e2 = new Employee("Sanya", 300000, 8, "UNTR692715");
	 
	public static void main(String[] args) {
		e1.displace();
		e2.displace();
	}
	
	public boolean eqaual(String e1, String e2) {
		int flag = e1.compareTo(e2);
		if (flag == 0)
		   return true;
		else
			return false;
	
	}
	System.out.println("Is Employee1 is equal to Employee2 or not? "+equal(e1, e2));
	
}
