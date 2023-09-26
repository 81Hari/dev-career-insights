package interview_problems.merge_sorted_array;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MergeSortedArrayTest {
    @Test
    public void testMerge() {
        MergeSortedArray msa = new MergeSortedArray();
        int nums1[] = {1,3,5,7,9,11};
        int nums2[] = {2,4,6,8};
        int res[] = {1,2,3,4,5,6,7,8,9,11};
        assertArrayEquals(res, msa.merge(nums1, nums2));
    }
}
