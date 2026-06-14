class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int left=0;
        int right=n-1;
        int maxv=0;
        while(left<right)
        {
            int area=(right-left)*Math.min(heights[left],heights[right]);
            maxv=Math.max(maxv,area);
        if(heights[left]<heights[right])
        {
            left++;
        }
        else
        {
            right--;
        }
        }
        return maxv;
    }
}
