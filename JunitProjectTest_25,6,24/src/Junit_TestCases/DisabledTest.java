package Junit_TestCases;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//Demonstrate disable testing
@Disabled

public class DisabledTest 
{
	@Test
	void Test1()
	{
		System.out.println("Test 1");
	}
	
	@Disabled
	@Test
	void Test2()
	{
		System.out.println("Test 2");
	}
	
	@Test
	void Test3()
	{
		System.out.println("Test 3");
	}
}
