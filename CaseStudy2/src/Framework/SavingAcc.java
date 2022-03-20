package Framework;
public abstract class SavingAcc extends BankAcc {

	private boolean isSalaried;
	private static float MINBAL;
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}

	@Override
	public void withdraw(float amount) {
		/*if(getAccBal()>=MINBAL) {
			setAccBal(getAccBal()-MINBAL);
			System.out.println("Your Prsent Balance is: "+getAccBal());
		}
		else {
			System.out.println("You Are not Having sufficent balance to withdraw the Money");
		}
	}*/
		super.withdraw(amount);
	}
	
	
	public boolean isSalary() {
		return isSalaried;
	}

	public void setSalary(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}


	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalaried + ", MINBAL=" + MINBAL + "]";
	}


	

}
