class Solution {
    public int splitArray(int[] nums, int k) {
        int high=0;
        int low=0;
        for(int num:nums)
        {
            low=Math.max(low,num);
            high=high+num;
        }
        int ans=high;
        while(high>=low)
        {
            int mid=low+(high-low)/2;
            if(spliti(nums,k,mid))
            {
                ans=mid;
                high=mid-1; 
            }
            else
            {
                low=mid+1;
               
            }
        }            
        return ans;
    }
    private boolean spliti(int nums[],int k ,int maxans) 
    {
        int count=1;
        int sum=0;
        for(int num:nums)
        {
            if(sum+num <=maxans)
            {
                sum+=num;
            }
            else
            {
                count++;
                sum=num;
            }
        }
        return count<=k;
    }
}