import java.util.*;

class Solution {

    public String reverseWords(String s) {
        String[] st = s.split(" ");
        String x = "";

        for (int i = st.length - 1; i >= 0; i--) {
            if (st[i].isEmpty()) {
                continue;
            }
            if (x.length() == 0) {
                x += st[i];      // first word without space
            } else {
                x += " " + st[i]; // next words with space
            }
        }

        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Solution sol = new Solution();
        System.out.println(sol.reverseWords(s));
    }
}
