import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SortedArrayNGTest {
	@Test
	void removeDuplicates(){
		int[] input = {0,0,1,1,2,2,3,3,4};
		assertEquals(5, SortedArray.removeDuplicates(input));
	}

	@Test
	void removeDuplicatesNoDuplicates(){
		int[] input = {0,1,2,3,4};
		assertEquals(5, SortedArray.removeDuplicates(input));
	}
}