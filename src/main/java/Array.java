public class Array {
	/**
	 * https://leetcode.com/problems/remove-element/
	 * Removes the occurrences of [val] from the array [nums] in-place. Uses two pointers from the start of the array.
	 *
	 * @param nums The array of integers
	 * @param val  The element that should be removed
	 * @return The number of elements that should be in the array after removing the occurrences of [val]
	 */
	public static int removeElement(int[] nums, int val) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				if (i != j) {
					nums[i] = nums[j];
				}
				i++;
			}
		}
		return i;
	}

	/**
	 * Another solution to removes the occurrences of [val] from the array [nums].
	 * Uses two opposing pointers, one starts at the beginning and one at the end of the array
	 *
	 * @param nums The array of integers
	 * @param val  The element that should be removed
	 * @return The number of elements that should be in the array after removing the occurrences of [val]
	 */
	public static int removeElement1(int[] nums, int val) {
		int i = 0;
		int j = nums.length - 1;
		while (i < j) {
			if (nums[i] == val) {
				if (nums[j] != val) {
					nums[i] = nums[j];
					i++;
				}
				j--;
			} else {
				i++;
			}
		}
		return i + 1;
	}
}
