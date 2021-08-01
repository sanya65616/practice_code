package Assignment3;

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
	public void disp() {
		System.out.println(this.streetNum+"-"+this.StreetName+", "+this.city+", "+this.state+", "+this.country);
}
}

class StudentClass{

	int rollNum;
	String studentName;
    Address studentAddr;
	StudentClass(int roll, String name, Address addr){
		this.rollNum = roll;
		this.studentName = name;
		this.studentAddr = addr;
	}
	public void displayStud() {
	  System.out.print("Student Name-"+this.studentName+"\nStudent Roll-"+this.rollNum+"\nStudent Address: ");
	}
}

class EmployeeClass{
	int empId;
	String employeeName;
    Address employeeAddr;
	EmployeeClass(int id, String name, Address addr){
		this.empId = id;
		this.employeeName = name;
		this.employeeAddr = addr;
	}
	public void displayEmp() {
		System.out.print("Employee Name-"+this.employeeName+"\nEmployee Id-"+this.empId+"\nEmployee Address: ");
	}
}

class StaffClass{
	int staffId;
	String staffName;
	Address staffAddr;
	StaffClass(int id, String name, Address addr){
		this.staffId = id;
		this.staffName = name;
		this.staffAddr = addr;
	}
	public void displayStaff() {
		System.out.print("Staff Name-"+this.staffName+"\nStaff Id-"+this.staffId+"\nStaff Address: ");
	}
}

public class Aggregation {
	public static void main(String[] args) {
		Address addr1 = new Address(12, "Ramji Road", "Patna", "Bihar", "India");
		Address addr2 = new Address(55, "Kurji Road", "Banglore", "Karnataka", "India");
		Address addr3 = new Address(98, "Banarsi Gali", "Agra", "Uttar Pradesh", "India");
		StudentClass student = new StudentClass(34, "Anshu", addr1);
		EmployeeClass employee = new EmployeeClass(5427, "Sanya Gupta", addr2);
		StaffClass staff = new StaffClass(123, "Archana", addr3);
		student.displayStud();
		student.studentAddr.disp();
		employee.displayEmp();
		employee.employeeAddr.disp();
		staff.displayStaff();
		staff.staffAddr.disp();
	}
}


