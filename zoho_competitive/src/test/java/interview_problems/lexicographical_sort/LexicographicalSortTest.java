package interview_problems.lexicographical_sort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class LexicographicalSortTest {
    @Test
    public void testSort() {
        LexicographicalSort ls = new LexicographicalSort();
        int nums[] = {100,1,11,21,2,3};
        int res[] = {1,100,11,2,21,3};
        assertArrayEquals(res, ls.sort(nums));
    }
}
