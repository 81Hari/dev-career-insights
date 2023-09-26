package interview_problems.number_palindrome;

public class NumberPalindrome {
    
    int findPalindrome(int num){

        int tempNum,revNum;

        

        for(int i=0;i<5;i++){
            tempNum = num;
            revNum = 0;

            while(tempNum != 0){
                revNum = revNum*10 + tempNum%10;
                tempNum/=10;
            }

            if(revNum!=num){
                num+=revNum;
            }
            else{
                break;
            }

        }
        
        return num;

    }
}
