package sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MergeSortTest {
    @Test
    public void testSort() {
        MergeSort sort = new MergeSort();
        int nums[] = {10,9,8,7,6,5,4,3,2,1};
        int res[] ={1,2,3,4,5,6,7,8,9,10};
        assertArrayEquals(res, sort.sort(nums,0,nums.length-1));
    }
}
