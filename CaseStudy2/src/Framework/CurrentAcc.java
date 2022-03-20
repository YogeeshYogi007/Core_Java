package Framework;

public abstract class CurrentAcc extends BankAcc {
	private float creditLimit;
	
	
	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	
	@Override
	public void withdraw(float amount) {
		
		/*if(getAccBal()>=creditLimit) {
			setAccBal(getAccBal()-creditLimit);
			System.out.println("Your Prsent Balance is: "+getAccBal());
		}
		else {
			System.out.println("You Are not Having sufficent balance to withdraw the Money");
		}*/
		super.withdraw(amount);
	}
	@Override
	public String toString() {
		return  super.toString();
	}

	public float getCreditLimit() {
		return creditLimit;
	}


}
