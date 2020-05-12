class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i, n, uniq;
        n = nums.length;
        for(i = 0; i < n; i++){
            if(i < n - 1 && nums[i] == nums[i + 1]){
                i += 1;
            }
            else{
                return nums[i];
            }
        }
        return nums[0];
    }
}
