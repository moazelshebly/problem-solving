public abstract class TwoSum {

	/**
	 * https://leetcode.com/problems/two-sum/
	 * Given an array of integers [nums] and an integer [target], return indices of the two numbers such that they add up to [target].
	 * @param nums The input array containing random integers.
	 * @param target The target number that two of the numbers in the array add up to.
	 * @return Array containing the indices of the two integers that add up to [target].
	 */
	static public int[] twoSum(int[] nums, int target) {
		for(int i = 0; i<nums.length; i++){
			for(int j = i+1; j<nums.length ;j++){
				if(nums[i]+ nums[j] == target){
					return new int[]{i,j};
				}
			}
		}
		return null;
	}
}
