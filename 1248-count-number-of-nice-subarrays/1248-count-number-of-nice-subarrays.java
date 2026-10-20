class Solution {
    public int numberOfSubarrays(int[] arr, int k) {
        int n = arr.length, count = 0;
        // made all element 0
        for (int i = 0; i < n; i++)
            arr[i] %= 2;
        // find prefix
        for (int i = 1; i < n; i++)
            arr[i] += arr[i - 1];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(arr[i]))
                map.put(arr[i], i);
            int a = 0;
            if (map.containsKey(arr[i] - k))
                a = map.get(arr[i] - k);
            int b = 0;
            if (map.containsKey(arr[i] - k + 1))
                b = map.get(arr[i] - k + 1);
            if (arr[i] == k)
                count += (b - a + 1);
            if (arr[i] > k)
                count += (b - a);
        }
        return count;
    }
}