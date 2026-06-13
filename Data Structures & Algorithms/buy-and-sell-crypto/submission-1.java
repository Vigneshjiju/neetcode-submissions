class Solution {
    public int maxProfit(int[] prices) {
       int l=0;
       int r=1;
       int n=prices.length;
       int profit=0;
       while(r<n)
       {
            if(prices[r]>prices[l])
            {
                int pprofit=prices[r]-prices[l];
                profit=Math.max(profit,pprofit);
            }
            else
            {
                l=r;
            }
            r++;
       }
       return profit;
    }
}
