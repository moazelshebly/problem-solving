import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/majority-element/
 * Given an array nums of size n, return the element that appears more than ⌊n / 2⌋ times.
 */
public class MajorityElement {

	/**
	 * Using a HashMap to map every element to its number of occurrences.
	 *
	 * @param nums An array of unsorted integers
	 * @return The element that is repeated more than n/2 times in the array
	 */
	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> occurrences = new HashMap<>();

		for (int num : nums) {
			int numberOfOccurrences = occurrences.getOrDefault(num, 0) + 1;
			if (numberOfOccurrences > nums.length / 2) {
				return num;
			}
			occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
		}
		return 0;
	}

	/**
	 * Uses Boyer-Moore voting algorithm since we know that there has to be a majority element
	 *
	 * @param nums An array of unsorted integers
	 * @return The element that is repeated more than n/2 times in the array
	 */
	public static int majorityElementMoore(int[] nums) {
		int count = 0;
		Integer candidate = null;

		for (int num : nums) {
			if (count == 0)
				candidate = num;
			count += num == candidate ? 1 : -1;
		}

		return candidate;
	}
}
