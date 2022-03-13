package goShoppingDemo;

public abstract class PrimeAcc extends ShopAcc {
	private boolean isPrime;
	private float deliveryCharges;
	
	public boolean isPrime() {
		return isPrime;
	}
	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}
	public float getDeliveryCharges() {
		return deliveryCharges;
	}
	public void setDeliveryCharges(float deliveryCharges) {
		this.deliveryCharges = deliveryCharges;
	}
	public abstract void bookProduct(float charges);
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", deliveryCharges=" + deliveryCharges + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
