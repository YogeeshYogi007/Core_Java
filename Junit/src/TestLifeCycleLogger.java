import java.util.logging.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


import org.junit.jupiter.api.TestInstance.Lifecycle;

public class TestLifeCycleLogger {
@TestInstance(Lifecycle.PER_CLASS)
interface TestLifeCycleLogger
{
	@BeforeAll
	default void beforeAllTests()
	{
		System.out.println("Before all tests");
	}
	@AfterAll
	default void afterallTests()
	{
		System.out.println("After all teste");
	}
	@Test
	default void testMethod()
	{
		System.out.println("this is test method...");
	}
}
}
