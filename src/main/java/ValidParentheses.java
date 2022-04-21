import java.util.*;

import static java.util.Map.entry;

public class ValidParentheses {
	private static final Map<Character, Character> matches = Map.ofEntries(
			entry(')', '('),
			entry('}', '{'),
			entry(']', '[')
	);

	/**
	 * https://leetcode.com/problems/valid-parentheses/
	 * Given a string [s], returns if the input string is valid.
	 * An input string is valid if:
	 * 1- Open brackets must be closed by the same type of brackets.
	 * 2- Open brackets must be closed in the correct order.
	 *
	 * @param s The input string containing only '(', ')', '{', '}', '[' and ']'.
	 * @return Whether the string is valid based on the mentioned conditions.
	 */
	public static boolean isValid(String s) {
		if (s.length() % 2 == 1) return false;

		Stack<Character> openParentheses = new Stack<>();
		for (Character c : s.toCharArray()) {
			if (matches.containsKey(c)) {
				if (openParentheses.isEmpty() || openParentheses.pop() != matches.get(c)) return false;
			} else {
				openParentheses.push(c);
			}
		}
		return openParentheses.isEmpty();
	}
}
