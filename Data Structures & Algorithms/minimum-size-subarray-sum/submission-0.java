class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int n=nums.length;
        int minl=Integer.MAX_VALUE;
        for(int right=0;right<n;right++)
        {
            sum=sum+nums[right];
            while(sum>=target)
            {
                minl=Math.min(minl,right-left+1);
                sum=sum-nums[left];
                left++;
            }
        }
        return minl==Integer.MAX_VALUE?0:minl;
    }
}