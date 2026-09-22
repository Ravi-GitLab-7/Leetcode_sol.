import java.util.HashMap;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        int[] ans = {-1, -1};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int rem = target - nums[i];

            if (map.containsKey(rem)) {

                int j = map.get(rem);

                ans[0] = j;
                ans[1] = i;

                return ans;
            } 
            else {

                map.put(nums[i], i);
            }
        }

        return ans;
    }
}