package goShoppingDemo;

public abstract class GsPrimeAcc {
	public abstract void bookProdct(int AccNo, String accNm, float charges, boolean isPrime);

	@Override
	public String toString() {
		return "GsPrimeAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
