public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int i, level, valleys;
        level = valleys = 0;
        for(i = 0; i < n; i++){
            if(s.charAt(i) == U){
                level++;
            }else if(s.charAt(i) == D){
                if(level == 0){
                    valleys++;
                }
                level--;
            }
        }
        return valleys;
    }
} 
