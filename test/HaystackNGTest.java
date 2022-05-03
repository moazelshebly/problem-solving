import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HaystackNGTest {

	@Test
	public void testStrStr() {
		String haystack = "hello";
		String needle = "ll";

		assertEquals(Haystack.strStr(haystack, needle), 2);
	}

	@Test
	public void testStrStr_notFound() {
		String haystack = "aaaaaaa";
		String needle = "bba";

		assertEquals(Haystack.strStr(haystack, needle), -1);
	}

	@Test
	public void testStrStr1() {
		String haystack = "hello";
		String needle = "ll";

		assertEquals(Haystack.strStr1(haystack, needle), 2);
	}

	@Test
	public void testStrStr1_notFound() {
		String haystack = "aaaaaaa";
		String needle = "bba";

		assertEquals(Haystack.strStr1(haystack, needle), -1);
	}
}