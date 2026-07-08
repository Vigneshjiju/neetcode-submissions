class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int weight:weights)
        {
            low=Math.max(low,weight);
            high+=weight;
        }
        while(high>=low)
        {
            int mid=low+(high-low)/2;
            if(canship(weights,mid)<=days)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }

        }
        return low;
    }
    private int canship(int weights[],int cap)
    {
        int load=0;
        int days=1;
        for(int weight:weights)
        {
            if(load+weight>cap)
            {
                days++;
                load=weight;
            }
            else
            {
                load+=weight;
            }
        }
        return days;
    }
}