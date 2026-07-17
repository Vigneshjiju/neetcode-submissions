class Solution {
    public int scoreOfString(String s) {
        int score=0;
        char arr[]=s.toCharArray();
        for(int i=0;i<s.length()-1;i++)
        {
            int d=Math.abs((int)arr[i]-(int)arr[i+1]);
            score=score+d;
        }
        return score;
    }
}