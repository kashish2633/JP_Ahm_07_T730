package Junit_TestCases;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)   //Annotations
public class TestLifeCycle 
{
	@BeforeEach
	void beforeEachTest()
	{
		System.out.println("1] Before Each Test");
	}
	
	@AfterEach
	void afterEachTest()
	{
		System.out.println("2] After Each Test");
	}
	
	@BeforeAll
	void beforeAllTest()
	{
		System.out.println("3] Before All Test");
	}
	
	@AfterAll
	void AfterAllTest()
	{
		System.out.println("4] After All Test");
	}
	
	@Test
	void testMethod1()
	{
		System.out.println("5] Test method ...... 1");
	}
	
	@Test
	void testMethod2()
	{
		System.out.println("6] Test method ...... 2");
	}
}