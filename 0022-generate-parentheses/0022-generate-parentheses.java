class Solution {
    static List<String> ans;

    public void print(int open, int close, int n, String s) {
        if (s.length() == 2 * n) {
            ans.add(s);
            return;
        }
        if (open < n)
            print(open + 1, close, n, s + "(");
        if (close < open)
            print(open, close + 1, n, s + ")");
    }

    public List<String> generateParenthesis(int n) {
        ans = new ArrayList<>(); //re-intialize
        print(0, 0, n, "");
        return ans;
    }
}