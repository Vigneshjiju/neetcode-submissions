class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int i=0;
        int temp=0;
        while(i<n)
        {
            int correctindex=nums[i]-1;
            if(nums[i]>0 && nums[i]<=n && nums[i]!=nums[correctindex])
            {
                temp=nums[i];
                nums[i]=nums[correctindex];
                nums[correctindex]=temp;
            }
            else
            {
                i++;
            }
        }
        for(i=0;i<n;i++)
            {
                if(nums[i]!=i+1)
                {
                    return i+1;
                }
            }
        return n+1;
    }
}