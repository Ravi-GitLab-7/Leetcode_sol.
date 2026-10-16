import java.util.HashMap;
import java.util.Map;
class Solution {
    public int totalFruit(int[] arr) {
        int n = arr.length;
        int i = 0, j = 0, maxLen = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while (j < n) {
            // First part: j pointer
            if (map.containsKey(arr[j])) {
                map.put(arr[j], map.get(arr[j]) + 1);
            } else {
                map.put(arr[j], 1);
            }

            // Second part: i pointer
            while (map.size() > 2) {
                int freq = map.get(arr[i]);

                if (freq == 1) {
                    map.remove(arr[i]);
                } else {
                    map.put(arr[i], freq - 1);
                }
                i++;
            }

            // Third part: calculate maximum length
            int len = j - i + 1;
            maxLen = Math.max(maxLen, len);

            j++;
        }

        return maxLen;
    }
}
