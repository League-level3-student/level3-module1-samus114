package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {
	Stack<String> brackets = new Stack<String>();
	int curlyEqual = 0;

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS
	// A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		for (int i = 0; i < b.length(); i++) {
			brackets.add(b.charAt(b.length() - 1 - i) + "");
		}
		for (int i = 0; i < brackets.size(); i++) {
			String brac = brackets.get(i);
			System.out.println(brac);
			if (brac.equals("{")) {
				System.out.println("yot");
				curlyEqual--;
			} else if (brac.equals("}")) {	
				System.out.println("bot");
				curlyEqual++;
				if (curlyEqual < 0) {
					return false;
				}
			}
		}
		if (curlyEqual == 0) {
			return true;
		} else {
			return false;
		}
	}

}