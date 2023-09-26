package interview_problems.alternative_sort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class AlternativeSortTest {
    @Test
    public void testAlternateSort() {
        AlternativeSort obj = new AlternativeSort();
        
        // Test Case 1
        int nums[] = {1,2,3,4,5,6,7};
        int res[] = {7, 1, 6, 2, 5, 3, 4};
        assertArrayEquals(res, obj.alternateSort(nums));


        // Test Case 2
        int nums1[] = {3,2,1,4,5,6};
        int res1[] = {6,1,5,2,4,3};
        assertArrayEquals(res1, obj.alternateSort(nums1));

    }
}
