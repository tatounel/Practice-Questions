import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class CapCaseTest {

	
	CapCase capCase = new CapCase();
	
	@Test
	public void test() {
		assertEquals("toCapCase doesn't return a valide CapCase String! try again please :)", capCase.toCapCase("most trees are blue"), "Most Trees Are Blue");
	}
	
	@Test
	public void testNullArg() {
		assertNull("Must return null when the arg is null", capCase.toCapCase(null));
	}
	
	@Test
	public void testEmptyArg() {
		assertNull("Must return null when the arg is null", capCase.toCapCase(""));
	}

}
