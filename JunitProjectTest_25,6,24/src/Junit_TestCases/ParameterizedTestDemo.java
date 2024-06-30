package Junit_TestCases;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo 
{
	@ParameterizedTest
	@ValueSource(strings = {"racecar","radar","madam","string"})
	void TestPalindrome(String words )
	{
		assertTrue(words.equals(new StringBuffer(words).reverse().toString()));
	}
	
}