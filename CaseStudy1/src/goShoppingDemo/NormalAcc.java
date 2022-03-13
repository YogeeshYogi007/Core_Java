package goShoppingDemo;

public abstract class NormalAcc  extends ShopAcc {
	private float deliveryCharges;
	
	public float getDeliveryCharges() {
		return deliveryCharges;
	}

	public void setDeliveryCharges(float deliveryCharges) {
		this.deliveryCharges = deliveryCharges;
	}

	public abstract void bookProduct(float deliveryCharges);
	
	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
