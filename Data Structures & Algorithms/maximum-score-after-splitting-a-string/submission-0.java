class Solution {
    public int maxScore(String s) {

        int ones = 0;

        // Count total ones
        for (char ch : s.toCharArray()) {
            if (ch == '1')
                ones++;
        }

        int leftZero = 0;
        int rightOne = ones;
        int ans = 0;

        // Stop at n-2 because right part cannot be empty
        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == '0') {
                leftZero++;
            } else {
                rightOne--;
            }

            ans = Math.max(ans, leftZero + rightOne);
        }

        return ans;
    }
}