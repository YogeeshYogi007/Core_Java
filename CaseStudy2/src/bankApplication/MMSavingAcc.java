package bankApplication;

import Framework.SavingAcc;

public class MMSavingAcc  extends SavingAcc{
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}
	private static float MINBAL;

	@Override
	public void withdraw(float amount) {
		super.withdraw(amount);
		MINBAL=getAccBal();
		if(amount>MINBAL) {
			System.out.println("Insufficient amount");
		}
		else {
			setAccBal(getAccBal()-amount);
			System.out.println("Transaction Successfull");
		}
	}
	@Override
	public String toString() {
		return  super.toString();
	}
	
	

}
