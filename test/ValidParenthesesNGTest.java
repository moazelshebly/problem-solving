import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ValidParenthesesNGTest {

	@Test
	public void testIsValid() {
		String input = "()";
		assertTrue(ValidParentheses.isValid(input));
	}

	@Test
	public void testIsValidMultipleParentheses() {
		String input = "()[]{}";
		assertTrue(ValidParentheses.isValid(input));
	}

	@Test
	public void testIsValidNestedParentheses() {
		String input = "(())";
		assertTrue(ValidParentheses.isValid(input));
	}

	@Test
	public void testIsNotValid() {
		String input = "(]";
		assertFalse(ValidParentheses.isValid(input));
	}

	@Test
	public void testIsNotValidMultipleParentheses() {
		String input = "{[(])}";
		assertFalse(ValidParentheses.isValid(input));
	}

	@Test
	public void testIsNotValidFalseOrder() {
		String input = ")(";
		assertFalse(ValidParentheses.isValid(input));
	}

	@Test
	public void testIsNotValidOnlyClosingParentheses() {
		String input = "))";
		assertFalse(ValidParentheses.isValid(input));
	}

	@Test
	public void testIsNotValidOnlyOpenParentheses() {
		String input = "((";
		assertFalse(ValidParentheses.isValid(input));
	}

	@Test
	public void testIsNotValidMissingClosingParenthesis() {
		String input = "{([])";
		assertFalse(ValidParentheses.isValid(input));
	}

}