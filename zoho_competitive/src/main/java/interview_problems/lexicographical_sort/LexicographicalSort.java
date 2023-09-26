package interview_problems.lexicographical_sort;

public class LexicographicalSort {
    
    public int[] sort(int[] nums){
        
        String[] temp = new String[nums.length];

        for(int i=0;i<nums.length;i++){
            temp[i] = nums[i] + "";
        }

        temp = sortStrings(temp);

        for (int i = 0; i < temp.length; i++) {
            nums[i] = Integer.parseInt(temp[i]);
        }

        return nums;
    }

    private String[] sortStrings(String[] temp) {
        int j;
        String ele;
        for(int i=1;i<temp.length;i++){
            j = i-1;
            ele = temp[i];

            while(j>=0&& ele.compareTo(temp[j])<0){
                temp[j+1] = temp[j];
                j--;
            }
            temp[j+1] = ele;


        }

        return temp;
    }
}
