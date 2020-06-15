class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length;
        int mid = 0;
        for(int i = 0; i < r; i++)
            if(nums[i] >= target)
                return i;
        if(nums[r - 1] < target)
            return r;
        else
            return -1;
    }
}