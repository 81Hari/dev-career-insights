package interview_problems.merge_sorted_array;

public class MergeSortedArray {
    
    int[] merge(int nums1[],int[] nums2){
        int res[] = new int[nums1.length + nums2.length];
        int i,j,k;
        i = j = k =0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                res[k++] = nums1[i++];
            }
            else{
                res[k++] = nums2[j++];
            }
        }

        while(i<nums1.length){
            res[k++] = nums1[i++];
        }

        while(j<nums2.length){
            res[k++] = nums2[j++];
        }

        return res;

    }
}
