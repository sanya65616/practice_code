package Bank;

public class ATM {
	float amount;
	int accountNumber, pin;
	public int LoadMoney(int P, int h, int t, int f) {
		private int atmPin = P;
		private int noOfHundred = h;
		private int noOfTwoHundred = t;
		private int noOfFiveHundred = f;
		return (noOfHundred*100+noOfTwoHundred*200+noOfFiveHundred*500);
	}
	public class UsersATM{
		public UsersATM(int Acc, int PinInput) {
		}
	
	    public float balanceCheck() {
	    	if(Acc == accountNumber && PinInput == pin)
		        return amount;
	    	else
	    		return -1 ;
	   }
	
	    public float cashWithdrawl(float AmountInput) {
	    	if(Acc == accountNumber && PinInput == pin) {
	    		if(AmountInput <= amount)
	    	        return (amount - AmountInput);	
	    		else
	    			return -1;
	    	}
	    }
	     
	    public float cashDeposite(float AmountInput) {
	    	if(Acc == accountNumber && PinInput == pin) 
	    		return amount + AmountInput;
	    	else return -1;	
	    }
	    
	    public void pinChange(int newPin) {
	    	if(Acc == accountNumber && PinInput == pin)
	    		pin = newPin;
	    }
    }
}	