class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int b=0;
        int a=n*(n+1)/2;
        for(int num:nums)
        {
            b=b+num;
        }
        return a-b;
    }
}
