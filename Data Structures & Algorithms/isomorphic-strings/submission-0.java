class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Character> ans1=new HashMap<>();
        HashMap<Character,Character> ans2=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(ans1.containsKey(ch1))
            {
                if(ans1.get(ch1)!=ch2)
                {
                    return false;
                }
            }
                else
                {
                    ans1.put(ch1,ch2);
                }
            if(ans2.containsKey(ch2))
            {
                if(ans2.get(ch2)!=ch1)
                {
                    return false;
                }
            }
            else
                {
                    ans2.put(ch2,ch1);
                }
        }
        return true;
    }
}