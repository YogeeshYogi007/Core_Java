import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AssumptionDemo {
	@Test
	void testDev()
	{
		System.setProperty("Env", "Dev");
		Assumptions.assumeTrue("Dev".equals(System.getProperty("Env")));
	}
	@Disabled
	@Test
	void TestEnv()
	{
		System.setProperty("Env", "testing");
		Assumptions.assumeTrue("Sam".equals(System.getProperty("Env")));
	}
	String message()
	  {
		return "Today's test execution failed :: ";
	  }
}
