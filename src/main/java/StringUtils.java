public abstract class StringUtils {
	/**
	 * https://leetcode.com/problems/length-of-last-word/
	 * Given a string [s] consisting of some words separated by some number of spaces, returns the length of the last word in the string.
	 * @param s The input string.
	 * @return The length of the last word in the input string.
	 */
	static public int lengthOfLastWord(String s) {
		s = s.trim();
		int result = 0;
		for(int i = s.length() -1 ; i>=0 ; i--) {
			if(s.charAt(i) == ' '){
				break;
			}
			result++;
		}
		return result;
	}
}
