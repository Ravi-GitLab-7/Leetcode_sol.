class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count0 = 0;
        int count1 = 0;

        // Count number of 0s and 1s
        for (int s : students) {
            if (s == 0) count0++;
            else count1++;
        }

        // Process sandwiches
        for (int i = 0; i < sandwiches.length; i++) {
            if (sandwiches[i] == 0) {
                if (count0 == 0) {
                    return sandwiches.length - i;
                }
                count0--;
            } else {
                if (count1 == 0) {
                    return sandwiches.length - i;
                }
                count1--;
            }
        }
        return 0;
    }
}