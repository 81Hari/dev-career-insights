package interview_problems.alternative_sort;
import sorting.MergeSort;

public class AlternativeSort {
    
    public int[] alternateSort(int[] nums){
        int res[] = new int[nums.length];
        new MergeSort().sort(nums, 0, nums.length-1);

        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i]; 
        }
        int i,j,k;
        i = 0;
        j = nums.length-1;
        k = 0;
        while(i<j){
            res[k++] = nums[j--]; 
            res[k++] = nums[i++];
            
        }
        if(i == j){
            res[k] = nums[j];
        }
        

        return res;
    }


}
