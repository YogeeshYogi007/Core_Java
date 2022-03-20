package bankApplication;
import Framework.*;
public class MMBankFactory extends BankFactory {
	@Override
	public SavingAcc getNewSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried) {
		return new MMSavingAcc(AccNo,accNm,accBal, isSalaried);
		
	}
	@Override
	public CurrentAcc getNewCurrentAcc(int AccNo, String AccNm, float AccBal, float creditLimit) {
		return new MMCurrentAcc(AccNo,AccNm,AccBal,creditLimit);
		
	}
	@Override
	public String toString() {
		return "MMBankFactory [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
