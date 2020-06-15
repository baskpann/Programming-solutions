class Solution {
    public void sortColors(int[] a) {
        int n = a.length, i, j, tmp = 0;
        for(i = 0; i < n; i++){
            for(j = i + 1; j < n; j++){
                if(a[i] >= a[j]){
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
}