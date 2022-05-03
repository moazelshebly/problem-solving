public class Haystack {

	/**
	 * https://leetcode.com/problems/implement-strstr/
	 *
	 * @param haystack The string that should be searched
	 * @param needle   The string that should be found
	 * @return Given two strings, return the index of the occurrence of the second string in the first string
	 */
	public static int strStr(String haystack, String needle) {
		if (needle == null || needle.isEmpty()) {
			return 0;
		}
		return haystack.indexOf(needle);
	}
}
