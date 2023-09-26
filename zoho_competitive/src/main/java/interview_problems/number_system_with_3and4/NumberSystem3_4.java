package interview_problems.number_system_with_3and4;

public class NumberSystem3_4 {
    
    int nthNumber(int n){
        int res = 0;
        int tempN = n-1;
        int i =0;
        while(tempN>=0){
            if(tempN%2 == 0){
                res = res+ 3 *(int) Math.pow(10, i++);
            }
            else{
                res = res + 4 *(int) Math.pow(10, i++);;
            }
            tempN/=2;
            tempN--;
        }


        return res;
    }
}
