package interview_problems.number_palindrome;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberPalindromeTest {
    @Test
    public void testFindPalindrome() {
        NumberPalindrome np = new NumberPalindrome();
        assertEquals(55,np.findPalindrome(32) );
        assertEquals(363,np.findPalindrome(39) );
    }
}
