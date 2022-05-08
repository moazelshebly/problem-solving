import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SortedArrayNGTest {
	@Test
	void removeDuplicates() {
		int[] input = {0, 0, 1, 1, 2, 2, 3, 3, 4};
		assertEquals(SortedArray.removeDuplicates(input), 5);
	}

	@Test
	void removeDuplicatesNoDuplicates() {
		int[] input = {0, 1, 2, 3, 4};
		assertEquals(SortedArray.removeDuplicates(input), 5);
	}

	@Test
	void searchInsert() {
		int[] input = {1, 3, 5, 6};
		assertEquals(SortedArray.searchInsert(input, 7), 4);
	}

	@Test
	void searchInsertOneElement() {
		int[] input = {10};
		assertEquals(SortedArray.searchInsert(input, 5), 0);
	}
}