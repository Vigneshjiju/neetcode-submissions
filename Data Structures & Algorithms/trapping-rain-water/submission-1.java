class Solution {
    public int trap(int[] height) {
        /*int n=height.length;
        int water=0;
        for(int i=0;i<n;i++)
        {
            int leftmax=height[i];
            int rightmax=height[i];
            for(int j=0;j<i;j++)
            {
                leftmax=Math.max(leftmax,height[j]);
            }
            for(int j=i;j<n;j++)
            {
                rightmax=Math.max(rightmax,height[j]);
            }
            water=water+Math.min(leftmax,rightmax)-height[i];
        }
        return water;*/
        int left=0;
        int right=height.length-1;
        int water=0;
        int leftmax=height[left];
        int rightmax=height[right];
        while(left<right)
        {
            if(leftmax<rightmax)
            {
                left++;
                leftmax=Math.max(leftmax,height[left]);
                water=water+leftmax-height[left];
            }
            else
            {
                right--;
                rightmax=Math.max(rightmax,height[right]);
                water=water+rightmax-height[right];
            }
        }
        return water;
    }
}
