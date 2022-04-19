import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringUtilsNGTest {

	@Test
	void lengthLast(){
		String s = "luffy is still joyboy";
		assertEquals(6, StringUtils.lengthOfLastWord(s));
	}

	@Test
	void lengthLastTrimmableString(){
		String s ="   fly me   to   the moon  ";
		assertEquals(4, StringUtils.lengthOfLastWord(s));
	}

	@Test
	void lengthLastEmptyString(){
		String s = "";
		assertEquals(0, StringUtils.lengthOfLastWord(s));
	}
}