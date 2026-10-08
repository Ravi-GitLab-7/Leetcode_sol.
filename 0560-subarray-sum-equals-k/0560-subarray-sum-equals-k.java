import java.util.*;
class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length;
        int count = 0;

        // prefixSum
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int ele = arr[i];
            if (ele == k)
                count++;

            int rem = ele - k;
            if (map.containsKey(rem))
                count += map.get(rem);

            if (map.containsKey(ele)) {
                int freq = map.get(ele);
                map.put(ele, freq + 1);
            } else {
                map.put(ele, 1);
            }
        }
        return count;
    }
}