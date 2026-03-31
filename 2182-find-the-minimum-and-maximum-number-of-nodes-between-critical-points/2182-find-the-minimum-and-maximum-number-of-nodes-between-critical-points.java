class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode left = head;
        ListNode mid = head.next;
        ListNode right = head.next.next;

        int first = -1, last = -1;
        int idx = 1;
        int[] arr = {-1, -1};
        int minDistance = Integer.MAX_VALUE;

        while (right != null) {
            if ((mid.val < left.val && mid.val < right.val) || 
                (mid.val > left.val && mid.val > right.val)) {
                if (first == -1) {
                    first = idx;
                } else {
                    int dist = idx - last;
                    minDistance = Math.min(minDistance, dist);
                }
                last = idx;
            }
            idx++;
            left = left.next;
            mid = mid.next;
            right = right.next;
        }

        //  if less than 2 critical points
        if (first == -1 || first == last) return arr;

        int maxDistance = last - first;
        arr[0] = minDistance;
        arr[1] = maxDistance;

        return arr;
    }
}