package MyPackage1;



class Address{
	int streetNum;
	String StreetName,city, state, country;
	Address(int streetNum, String street, String c, String st, String coun){
		this.streetNum = streetNum;
		this.StreetName = street;
		this.city = c;
		this.state = st;
		this.country = coun;
	}
	public String disp() {
		return (this.streetNum+"-"+this.StreetName+", "+this.city+", "+this.state+", "+this.country);
}
}

class Member{
	String name, phn;
	int age;
	double salary;
	Address add;
	Member(String name, int age, String phn, double salary, Address add){
		this.name = name;
		this.age = age;
		this.phn = phn;
		this.salary = salary;
		this.add = add;
	}
	public void printInfo() {
		System.out.println("Name: "+name+"\nAge: "+age+"\nPhone number: "+phn+"\nAddress: "+add.disp());
	}

	public void printSalary() {
		System.out.println("Salary: "+salary);
	}
}

class Employee extends Member{
	String special;
	String dept;
	Employee(String name, int age, String phn, double salary, Address add, String special, String dept) {
		super(name, age, phn, salary, add);
		// TODO Auto-generated constructor stub
		this.special = special;
		this.dept = dept;
	}
	
	
	public void printSpecialization() {
		System.out.println("Specialization: "+special);
	}
	public void printDepartment() {
		System.out.println("Department: "+dept);
	}


}
class Manager extends Member{
	String special;
	String dept;
	Manager(String name, int age, String phn, double salary, Address add, String special, String dept) {
		super(name, age, phn, salary, add);
		// TODO Auto-generated constructor stub
		this.special = special;
		this.dept = dept;
	}
	
	public void printSpecialization() {
		System.out.println("Specialization: "+special);
	}
	public void printDepartment() {
		System.out.println("Department: "+dept);
	}
	
}

public class CA1{
	public static void main(String[] args) {
		Address addr1 = new Address(12, "Ramji Road", "Patna", "Bihar", "India");
		Address addr2 = new Address(55, "Kurji Road", "Banglore", "Karnataka", "India");
		Employee emp = new Employee("Aman", 34, "8786556498", 45000.0, addr1, "Java", "Testing" );
		Manager manager = new Manager("Anubhav", 45, "867564635", 79000.0, addr2, "Java, Python", "Software development");
		emp.printInfo();
		emp.printSalary();
		manager.printInfo();
		manager.printSalary();
	}
	
}


