package interview_problems.longest_continuous_range;

import sorting.MergeSort;

public class LongestContinuousRange {
    
    int[] find(int nums[]){

        nums = new MergeSort().sort(nums, 0, nums.length-1);
        int start,lStart,lEnd;
        lStart = lEnd = 0;
        start = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-1 != nums[i-1]){
                if((i-1 - start)>(lEnd - lStart)){
                    lStart = start;
                    lEnd = i-1;
                }
                start = i;
            }
        }

        int res[] = new int[lEnd-lStart+1];
        int i=lStart,j=0;

        while(i<=lEnd){
            res[j++] = nums[i++]; 
        }

        return res;
    }
}
