package bankApplication;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalary;
	private float MINBAL;
	
	public abstract void withdraw(float MINBAL);

	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", MINBAL=" + MINBAL + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
