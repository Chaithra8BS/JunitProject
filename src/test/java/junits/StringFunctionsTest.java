package junits;
import org.junit.jupiter.api.Test;

import code.StringFunctions;

import org.junit.jupiter.api.Assertions;

public class StringFunctionsTest {
	
	@Test
	public void test1()
	{
		Assertions.assertTrue(StringFunctions.isPalindrome("madam"));
	}
	
	
	@Test
	public void test2()
	{
		Assertions.assertFalse(StringFunctions.isPalindrome("Chaithra"));
	}
	

}
