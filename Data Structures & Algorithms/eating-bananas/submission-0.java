class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxpiles=0;
        for(int pile:piles)
        {
            maxpiles=Math.max(maxpiles,pile);
        }
        for(int i=1;i<=maxpiles;i++)
        {
            long hour=0;
            for(int pile:piles)
            {
                hour=hour+(pile+i-1)/i;
            }
            if(h>=hour)
            {
                return i;
            }
        }
        return -1;
    }
}
