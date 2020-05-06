class Solution {
    private int count(int[] a, int k){
        int cnt = 0;
        for(int i = 0; i < a.length; i++)
            if(a[i] == k)
                cnt++;
        return cnt;
    }
    public int majorityElement(int[] nums) {
        int i, cnt = 0, maxCnt = nums.length/2;
        for(i = 0; i < nums.length; i++){
            cnt = count(nums, nums[i]);
            if(cnt > maxCnt){
                return nums[i];
            }
        }
        return -1;
    }
} 
