import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AssertDemo {

	@Test
	void compare()
	{
		int a=1;
		int b=2;
		assertEquals(a, b);
	}
	@Disabled
	@Test
	void compare1()
	{
		int d=1;
		int c=1;
		assertEquals(d,c);
	}
}