class Solution {
    public int singleNumber(int[] nums) {
        /*HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            if(set.contains(num))
            {
                set.remove(num);
            }
            else
            {
                set.add(num);
            }
        }
        return set.iterator().next();
    */
    int ans=0;
    for(int num:nums)
    {
        ans=ans^num;
    }
    return ans;
    }
}
