package goShoppingDemo;

public abstract class ShopAcc {
	private int accNo;
	private String accNm;
	private float charges; 
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getCharges() {
		return charges;
	}

	public void setCharges(float charges) {
		this.charges = charges;
	}

	public abstract void bookProduct(float charges); 
	
	public abstract void items(float charges);
	@Override
	public String toString() {
		return accNm;
	}
	

}
