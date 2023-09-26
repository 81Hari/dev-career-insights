package interview_problems.longest_substring_without_repeating_character;

public class LongestSubStringWithoutRepeatingCharacter {


    public int lengthOfLongestSubstring(String s) {
        /*
            * Edge Case - string length is zero
            */
        if(s.length() == 0){
            return 0;
        }

        boolean[] map = new boolean[256]; // Storing the charcters which have already occurred
        
        int lStart,lEnd; // Storing the index of the Longest String
        int start,j; // start and j are temp variables
        start = 0;
        lStart = lEnd = -1;

        for(int i=0;i<s.length();i++){
            // If character comes for the first time, we are changing it as occurred
            if(!map[s.charAt(i)+127]){
                map[s.charAt(i)+127] = true;
            }
            else{ // if character comes for a second time we check if the existing substring is the longest and if it is the longest then we are storing thier indexes.
                
                if((lEnd-lStart)<=(i-1-start)){
                    lStart = start;
                    lEnd = i-1;
                }


                j = start;
                // Also we are reseting the map from start to the first existance of the repeated character
                while(j<i && s.charAt(i)!=s.charAt(j)){
                    map[s.charAt(j++)+127] = false;
                }
                start = j+1;
            }
        }


        if((lEnd-lStart)<=(s.length()-1-start)){
                    lStart = start;
                    lEnd = s.length()-1;
        }
        return (lEnd-lStart+1);
    }
    
    
}
