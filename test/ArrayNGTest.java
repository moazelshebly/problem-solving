import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayNGTest {

	@Test
	public void testRemoveElement() {
		int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
		assertEquals(Array.removeElement(nums, 2), 5);
		int[] expected = {0, 1, 3, 0, 4, 0, 4, 2};
		assertEquals(nums, expected);
	}

	@Test
	public void testRemoveElement1() {
		int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
		assertEquals(Array.removeElement1(nums, 2), 5);
		int[] expected = {0, 1, 4, 0, 3, 0, 4, 2};
		assertEquals(nums, expected);
	}
}