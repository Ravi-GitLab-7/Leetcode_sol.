class Solution {
    public class pair implements Comparable<pair> {
        int ele;
        int diff;
        pair(int ele, int diff) {
            this.ele = ele;
            this.diff = diff;
        }
        @Override 
        public int compareTo(pair p) {
            if (this.diff == p.diff) {
                return this.ele - p.ele;
            }
            return this.diff - p.diff;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int ele : arr) {
            int diff = Math.abs(x - ele);
            pq.add(new pair(ele, diff));
            if (pq.size() > k) {
                pq.remove();
            }
        }
        List<Integer> ans = new ArrayList<>();
        while (!pq.isEmpty()) {
            pair p = pq.remove();
            ans.add(p.ele);
        }
        Collections.sort(ans);
        return ans;
    }
}