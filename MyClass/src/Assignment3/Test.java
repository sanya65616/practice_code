package Assignment3;


class Person {
	String name;
	Person(String name){
		this.name = name;
	}
}

class Employee extends Person implements Comparable<Employee> {
	double annualSalary;
	int year;
	String nationalInsuranceNumber;
	
	Employee(String name, double annualSalary, int year, String nationalInsuranceNumber){
		super(name);
		this.annualSalary = annualSalary;
		this.year = year;
		this.nationalInsuranceNumber = nationalInsuranceNumber;
	}
	
	public void display() {
		System.out.println("Name : "+this.name+"\nAnnaul Salary : "+this.annualSalary+"\nYear of Employment : "+this.year+"\nNational Insurance Number : "+this.nationalInsuranceNumber);
	}
	
	public int compareTo(Employee employee) {
		return nationalInsuranceNumber.compareTo(nationalInsuranceNumber);
	}
	
	@Override
	public boolean equals(Object obj) {
		if( obj == this.nationalInsuranceNumber)
			return true;
		if(!(obj instanceof Employee))
			return false;
		Employee employee = (Employee) obj;
		return nationalInsuranceNumber.compareTo( employee.nationalInsuranceNumber) == 0;
	}
	
}

public class Test {
	
	public static void main(String[] args) {
		Employee employee1 = new Employee("Sanya Gupta", 1000000.0, 5, "DTKPE93628");
		Employee employee2 = new Employee("Depti Kumari", 1200000.0, 5, "JREKA86293");
		employee1.display();
		employee2.display();
		if(employee1.equals(employee2))
				System.out.println("##Same Employee");
		else
			System.out.println("##Different Employee");
	}

}
