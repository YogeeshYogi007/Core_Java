package bankApplication;

import Framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float amount) {
		super.withdraw(amount);
		if(amount>=getCreditLimit()) {
			System.out.println("Exceeding creditLimit");
		}
		else if(amount>getAccBal()){
			System.out.println("Insufficient balance");
		}else {
			try {
				setAccBal(getAccBal()-amount);
			}
			finally {
				System.out.println("Transation successfull");
			}
		}
	}
	
	@Override
	public String toString() {
		return  super.toString() + "]";
	}
	@Override
	public float getAccBal() {
		return super.getAccBal();
	}
	@Override
	public void setAccBal(float accBal) {
		super.setAccBal(accBal);
	}
	
}