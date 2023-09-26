package interview_problems.longest_substring_without_repeating_character;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSubStringWithoutRepeatingCharacter_SolutionTest {
    @Test
    public void testLengthOfLongestSubstring() {
        LongestSubStringWithoutRepeatingCharacter l = new LongestSubStringWithoutRepeatingCharacter();
        assertEquals(3, l.lengthOfLongestSubstring("dvdf"));
        assertEquals(3, l.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, l.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, l.lengthOfLongestSubstring("pwwkew"));
        assertEquals(2, l.lengthOfLongestSubstring("aab"));
        assertEquals(0, l.lengthOfLongestSubstring(""));
    }
}
