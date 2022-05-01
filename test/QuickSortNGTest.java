import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class QuickSortNGTest {

	@Test
	public void testSort() {
		List<Integer> input = List.of(15, 2, 12, 3, 7, 19, 22, 50, 5, 8, 12);
		List<Integer> expected = List.of(2, 3, 5, 7, 8, 12, 15, 19, 22, 50);
		assertEquals(QuickSort.sort(input), expected);
	}
}