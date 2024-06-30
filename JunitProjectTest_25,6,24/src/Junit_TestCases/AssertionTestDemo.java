package Junit_TestCases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

//Assertion Testing Demo
//Assumption -- assumTrue,assumFalse,assumingThat

public class AssertionTestDemo 
{
	@Test
	public void TestForAssertEquals()
	{
		int Result = 1;
		int Expected = 1;
		
		assertEquals(Result,Expected);
	}
	
	@Test
	public void TestForAssertTrue()
	{
		assertTrue("Hello".contains("e"));
	}
	
	public void TestForAssertFalse()
	{
		assertTrue("Hello".contains("k"));
	}
	
	@Test
	public void TestForAssertNull()
	{
		String s = null;
		assertNull(s);
	}
	
	@Test
	public void TestForAssertThrow()
	{
		assertThrow(IllegalArgumentException.class,() -> 
		{
			throw new IllegalAccessException("Invalid Argument");			
		});
	}

	@Test
	private void TestFail() {		
		fail("Suppose to be fail");		
	}	
}