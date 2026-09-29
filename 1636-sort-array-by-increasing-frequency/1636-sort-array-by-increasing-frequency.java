class Solution {
    public int[] frequencySort(int[] nums) {
        // 1. Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // 2. Get all unique numbers
        List<Integer> list = new ArrayList<>(map.keySet());
        // 3. Sort unique numbers
        list.sort((a, b) -> {
            // Same frequency → larger number first
            if (map.get(a).equals(map.get(b))) {
                return b - a;
            }
            // Different frequency → smaller frequency first
            return map.get(a) - map.get(b);
        });
        // 4. Create answer
        int[] ans = new int[nums.length];
        int index = 0;

        // 5. Put every number according to its frequency
        for (int num : list) {
            int frequency = map.get(num);
            for (int i = 0; i < frequency; i++) {
                ans[index] = num;
                index++;
            }
        }
        return ans;
    }
}