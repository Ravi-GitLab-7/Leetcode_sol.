class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] pre = new int[n];
        pre[0] = 1;
        for (int i = 1; i < n; i++) {
            pre[i] = arr[i - 1] * pre[i - 1];
        }
        int suf = 1;
        for (int i = n - 2; i >= 0; i--) {
            suf *= arr[i + 1];
            pre[i] *= suf;
        }
        return pre;
    }
}