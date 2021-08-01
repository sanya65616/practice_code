package Assignment4;

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
		System.out.print(this.streetNum+"-"+this.StreetName+", "+this.city+", "+this.state+", "+this.country);
}
}

class Child{
	String name, fatherName, motherName;
	int age;
	int weight;
	int height;
	Address addr;
	Child(String name, String fatherName, String motherName, int age, int weight, int height, Address addr){
		this.name = name;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.addr = addr;
	}
	public void personalDetail() {
		System.out.print("Name: "+this.name+"\nFather's Name: "+this.fatherName+"\nMother's Name: "+this.motherName+"\nAge: "+this.age+"\nHeight: "+this.height+"\nWeight: "+this.weight+"\nAddress: ");
	}
}

class Education extends Child{
	String schoolName;
	int std, rollNum;
	Address skulAddr;
	Education(String name, String fatherName, String motherName, int age, int weight, int height, Address addr, String schoolName, int std, int rollNum, Address skulAddr){
		super(name, fatherName, motherName, age, weight, height, addr);
		this.schoolName = schoolName;
		this.std = std;
		this.rollNum = rollNum;
		this.skulAddr = skulAddr;
	}
	
	public void EducationalDetail() {
		System.out.print("\nName of School: "+this.schoolName+"\nClass: "+this.std+"\nRoll Number: "+this.rollNum+"\nSchool's Address: ");
	}
}

public class StudentDetail {
	
	public static void main(String[] args) {
		Address addr1 = new Address(03, "Bankim Chawk", "Patna", "Bihar", "India");
		Address addr2 = new Address(56, "New Road", "Patna", "Bihar", "India");
		Education student = new Education("Sanya", "S k", "Symn", 19, 50, 5, addr1, "D.A.V", 10, 49, addr2);
		student.personalDetail();
		student.addr.disp();
		student.EducationalDetail();
		student.skulAddr.disp();
	}
}

