class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        int n=details.length;
        for(int i=0;i<n;i++)
        {
            char a[]=details[i].toCharArray();
            int age=(a[11]-'0')*10+(a[12]-'0');
            if(age>60)
            {
                count++;
            }
        }
        return count;
    }
}