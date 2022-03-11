package goShoppingDemo;

public abstract class ShopAcc {
	private int accNo;
	private String accNm;
	private float charges; 
	public abstract void bookProduct(float charges); 
	
	public abstract void items(float charges);
	@Override
	public String toString() {
		return accNm;
	}
	

}
