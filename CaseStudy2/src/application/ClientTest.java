package application;
import Framework.BankFactory;
import Framework.CurrentAcc;
import Framework.SavingAcc;
import bankApplication.MMBankFactory;


public class ClientTest {
	private static BankFactory factory;
	private static SavingAcc savingAcc;
	private static CurrentAcc currentAcc;

public static void main(String[] args) {
	factory = new MMBankFactory();
	
	 
	savingAcc = factory.getNewSavingAcc(1234, "Yogi", 200000, true);
	System.out.println(savingAcc.getAccBal());
	savingAcc.withdraw(2000);
	System.out.println("Your Account balance is "+savingAcc.getAccBal());
	currentAcc = factory.getNewCurrentAcc(1256, "qwerty", 1000000, 50000);
	currentAcc.withdraw(5000);
	System.out.println("Your Account balance is "+currentAcc.getAccBal());
	
	System.out.println(currentAcc.toString());
	System.out.println(savingAcc.toString());
	
}
}