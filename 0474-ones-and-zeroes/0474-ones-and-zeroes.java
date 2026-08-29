class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        // dp[i][j] stores the max subset size given at most i zeros and j ones
        int[][] dp = new int[m + 1][n + 1];
        
        for (String s : strs) {
            int zeros = 0;
            int ones = 0;
            
            // Count '0's and '1's in the current string
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    zeros++;
                } else {
                    ones++;
                }
            }
            
            // Update the dp table backwards to prevent reusing the same string
            for (int i = m; i >= zeros; i--) {
                for (int j = n; j >= ones; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - zeros][j - ones] + 1);
                }
            }
        }
        
        return dp[m][n];
    }
}
