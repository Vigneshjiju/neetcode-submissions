class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxpiles=0;
        for(int pile:piles)
        {
            maxpiles=Math.max(maxpiles,pile);
        }
        int ans=0;
        int low=1;
        int high=maxpiles;
        while(high>=low)
        {
            int mid=low+(high-low)/2;
            long hour=0;
            for(int pile:piles)
            {
                hour=hour+(pile+mid-1)/mid;
            }
            if(hour<=h)
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
}
