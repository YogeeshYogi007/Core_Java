package goShoppingDemo;

public abstract class GSShopFactory {
	public abstract GsPrimeAcc getNewPrimeAcc(int AccNo, String accNm, float charges, boolean isSalaried);
	public abstract GsNormalAcc getNewNormalacc(int AccNo, String accNm, float charges, float deliveryCharges);

}
