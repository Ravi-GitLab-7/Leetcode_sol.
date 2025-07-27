class Solution {
    public int compress(char[] arr) {
        String ans = "";
        int i = 0, j = 0;

        while (j < arr.length) {
            if (arr[j] == arr[i]) {
                j++;
            } else {
                ans += arr[i];
                int len = j - i;
                if (len > 1) ans += len;
                i = j;
            }
        }

        // Handle last group
        ans += arr[i];
        int len = j - i;
        if (len > 1) ans += len;

        // Overwrite input array with compressed string
        for (i = 0; i < ans.length(); i++) {
            arr[i] = ans.charAt(i);  // Fix: charAt(i), not charAt[i]
        }

        return ans.length();
    }
}
