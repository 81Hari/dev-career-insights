package interview_problems.longest_continuous_range;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class LongestContinuousRangeTest {
    @Test
    public void testFind() {
        LongestContinuousRange lcr = new LongestContinuousRange();
        int nums[] = {1,3,10,7,9,2,4,6};
        int res[] = {1,2,3,4};
        assertArrayEquals(res, lcr.find(nums));

        int nums1[] = {1,3,9,7,8,2,4,6};
        assertArrayEquals(res, lcr.find(nums1));

    }
}
