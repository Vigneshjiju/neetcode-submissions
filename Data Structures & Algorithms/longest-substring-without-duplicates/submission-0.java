class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> res=new HashSet<>();
        int left=0;
        int lengthm=0;
        for(int right=0;right<s.length();right++)
        {
            while(res.contains(s.charAt(right)))
            {
                res.remove(s.charAt(left));
                left++;
            }
            res.add(s.charAt(right));
            lengthm=Math.max(lengthm,right-left+1);
        }
        return lengthm;
    }
}
