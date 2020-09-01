package Bank;

public class UserAccount {
	int accountNumber, pin, phoneNumber, age;
	String firstName, secondName, lastName, address;
	float amt;
	
	public void addAccount(String firstN, String secondN, String lastN, String add, int phoneNum, int ageInput, int accountNum, int pinInput) {
	   firstName = firstN;
	   secondName = secondN;
	   lastName  = lastN;
	   address = add;
	   phoneNumber = phoneNum;
	   age = ageInput;
	   accountNumber = accountNum;
	   pin = pinInput;
	}
	
	public float amount() {
		
	}

}
