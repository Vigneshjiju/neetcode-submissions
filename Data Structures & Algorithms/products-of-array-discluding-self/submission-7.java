/*class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int p=1;
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    p=p*nums[j];
                }
            }
        ans[i]=p;
        }
        return ans;
    }
} */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int a[]=new int[n];
        int ans[]=new int[n];
        int b[]=new int[n];
        int  p=1;
        for(int i=0;i<=n-1;i++)
        {
            a[i]=p;
            p=p*nums[i];
        }
        p=1;
        for(int i=n-1;i>=0;i--)
        {
            b[i]=p;
            p=p*nums[i];
        }
        for(int i=0;i<n;i++)
        {
            ans[i]=b[i]*a[i];
        }
        return ans;
    }
}  