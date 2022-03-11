package goShoppingDemo;

public abstract class PrimeAcc {
	private boolean isPrime;
	private float deliveryCharges;
	public abstract void bookProduct(float charges);
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", deliveryCharges=" + deliveryCharges + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
