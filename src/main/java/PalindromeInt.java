import java.util.ArrayList;

public abstract class PalindromeInt {
	/**
	 * https://leetcode.com/problems/palindrome-number/
	 * Given an integer [x], returns true if [x] is palindrome integer.
	 * @param x The integer number.
	 * @return True if [x] is palindrome, otherwise false.
	 */
	static public boolean isPalindrome(int x){
		ArrayList<Integer> input = new ArrayList<>();

		if(x < 0) return false;
		else if(x<10) return true;
		while (x != 0){
			int lastDigit = Math.abs(x) % 10;
			input.add(lastDigit);
			x = x /10;
		}

		for (int i = 0, j=input.size() -1; i<input.size(); i++, j--){
			if (!input.get(i).equals(input.get(j))){
				return false;
			}
		}
		return true;
	}
}
