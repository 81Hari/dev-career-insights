package sorting;
/*
 * This Class is responsible for sort the array using MergeSort
 */
public class MergeSort {
    
    /*
     * This method divides the array into half in recursive way until array has one element (Divide and conqueor)
     * @param nums the array which want to be sorted
     * @param start the lowerbound of the array
     * @param end the upperbound of the array
     */
    public int[] sort(int nums[],int start,int end){
        if(start<end){
            int mid = (start+end)/2;
            sort(nums, start, mid);
            sort(nums, mid+1, end);
            merge(nums,start,mid,end);
        }
        return nums;
    }

    /*
     * This method merges divided arrays in the sorted way
     * @param nums the array which want to be sorted
     * @param start the lowerbound of the array
     * @param mid the middle position of the array
     * @param end the upperbound of the array
     */
    private void merge(int[] nums, int start, int mid, int end) {
        int temp[] = new int[end-start+1];
        int i,j,k;
        i = start;
        j = mid+1;
        k = 0;

        while(i<=mid && j<=end){
            if(nums[i]<nums[j]){
                temp[k++] = nums[i++];
            }
            else{
                temp[k++] = nums[j++];
            }
        }

        while(i<=mid){
            temp[k++] = nums[i++];
        }

        while(j<=end){
            temp[k++] = nums[j++];
        }

        for ( i = 0,j=start; i < temp.length; i++,j++) {
            nums[j] = temp[i];
        }
    }
}
