package junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;

import code.Calculator;

public class calculatorTest {
	
	@Disabled
	@DisplayName("Two Positive num test")
	@Test
	public void test1()
	{
		int result = Calculator.add(4, 5);
		//System.out.println(result);
		//assertions
		assertEquals(9, result);
	}
	
	@Test
	@Tag("Sanity")
	@DisplayName("One Positive and One negative num test")
	public void test2()
	{
		int result = Calculator.add(-4, 5);
		//System.out.println(result);
		//assertions
		assertEquals(1, result);
	}
	
	@RepeatedTest(3)
	@DisplayName("Sum is not matching")
	//@Test
	public void test3()
	{
		int result = Calculator.add(4, 5);
		Assertions.assertNotEquals(10, result);
	}
	
	@CustomAnnotation
	public void test4()
	{
		int result = Calculator.add(4, 5);
		Assertions.assertNotEquals(10, result);
	}

}
