package bankApplication;

public abstract class CurrentAcc extends BankAcc {
	private float creditLimit;
	public abstract void withdraw();
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
