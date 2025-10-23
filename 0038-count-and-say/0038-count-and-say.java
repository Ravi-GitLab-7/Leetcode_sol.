class Solution {
    public String countAndSay(int n) {
        if (n == 1)
            return "1"; // base case
        String s = countAndSay(n - 1)+"@";  //any thing u want to put symbol
        //now modify
        int i = 0, j = 0;
        String ans = "";
        while (j < s.length()) {
            if (s.charAt(i) == s.charAt(j))
                j++;
            else {
                int len = j - i;
                ans += len;
                ans += s.charAt(i);
                i = j;
            }
        }
        // int len = j - i;  // if add sbmol then don't need to do this
        // ans += len;
        // ans += s.charAt(i);
        // i = j;
        return ans;
    }
}