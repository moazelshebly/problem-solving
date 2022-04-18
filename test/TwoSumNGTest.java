import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TwoSumNGTest {
	@Test
	void twoSum() {
		int [] test = {15,9,3,7};
		int target = 10;
		int[] result = TwoSum.twoSum(test, 10);

		assertNotNull(result);
		assertEquals(target,test[result[0]] + test[result[1]]);
	}
}