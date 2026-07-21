class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[0];
        int maxx=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])
            {
                sum=sum+nums[i];
            }
            else
            {
                sum=nums[i];
            }
            maxx=Math.max(maxx,sum);
        }
        return maxx;
    }
}