public abstract class SortedArray {

	/**
	 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
	 * Given an integer array [nums] sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
	 * The relative order of the elements should be kept the same. More formally, if there are k elements after removing the duplicates,
	 * then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
	 * @param nums The sorted integer array.
	 * @return The number of elements in the array after removing the duplicates.
	 */
	static public int removeDuplicates(int[] nums) {
		int duplicates = 0;
		for(int i=0; i < nums.length-duplicates-1; i++){
			if(nums[i] == nums[i+1]){
				duplicates++;
				for(int j = i+1; j <nums.length-1; j++){
					nums[j] = nums[j+1];
				}
				nums[nums.length-1] = nums[i];
				i--;
			}
		}
		return nums.length - duplicates;
	}
}
