import java.util.*;

class Solution {

    public int longestPalindromeSubseq(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        int n = s.length();

        int[][] dp = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == rev.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[n][n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Solution sol = new Solution();
        System.out.println(sol.longestPalindromeSubseq(s));
    }
}
--------------------------------------------------------------------------------------------------------------------
//Note
Reason: The method is NOT static.

You defined the method like this:

public int longestPalindromeSubseq(String s)


Because it's non-static, it belongs to the object, not the class.

So to call it inside main(), which is static, Java forces you to create an object:

Solution sol = new Solution();
sol.longestPalindromeSubseq(s);


This is the rule:

🔥 static method cannot directly call a non-static method.
