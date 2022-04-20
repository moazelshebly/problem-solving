import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PalindromeIntNGTest {

	@Test
	void intIsPalindrome(){
		int test = 1489841;
		assertTrue(PalindromeInt.isPalindrome(test));
	}

	@Test
	void intIsNotPalindrome(){
		int test = 148981;
		assertFalse(PalindromeInt.isPalindrome(test));
	}
}