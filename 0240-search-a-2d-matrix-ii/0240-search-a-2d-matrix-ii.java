class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length, n = arr[0].length;
        int i = m - 1, j = 0;

        while (i >= 0 && j < n) {
            if (arr[i][j] == target) return true;
            else if (arr[i][j] > target) {
                i--; // move up
            } else {
                j++; // move right
            }
        }
        return false;
    }
}
