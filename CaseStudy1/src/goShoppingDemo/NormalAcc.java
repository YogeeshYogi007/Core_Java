package goShoppingDemo;

public abstract class NormalAcc {
	private float deliveryCharges;
	public abstract void bookProduct(float deliveryCharges);
	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
