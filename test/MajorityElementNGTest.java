import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MajorityElementNGTest {

	@Test
	public void testMajorityElement() {
		int[] nums = {1, 1, 1, 1, 1, 5, 2, 5, 3, 2, 1, 2, 1, 1, 1, 5, 5, 2, 1};
		assertEquals(MajorityElement.majorityElement(nums), 1);
		assertEquals(MajorityElement.majorityElementMoore(nums), 1);
	}

	@Test
	public void testMajorityElement2() {
		int[] nums = {2, 2, 1, 1, 1, 2, 2};
		assertEquals(MajorityElement.majorityElement(nums), 2);
		assertEquals(MajorityElement.majorityElementMoore(nums), 2);
	}
}