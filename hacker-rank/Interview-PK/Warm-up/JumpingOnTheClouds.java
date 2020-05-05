public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int minJumps = 0, i;
        for(i = 0; i < c.length - 1;){
            if((i + 2) < c.length && c[i] == 0 && c[i + 2] == 0 ){
                i += 2;
                minJumps++;
            } else if((i + 1 < c.length) && c[i] == 0 && c[i + 1] == 0){
                i += 1;
                minJumps++;
            }
        }
        return minJumps;
    } 
}
