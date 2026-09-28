class Solution {
    public int findKthLargest(int[] nums, int k) {
        // minHeap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : nums){
            pq.add(ele);
            if(pq.size() > k) pq.remove();
        }
        return pq.peek();
    }
}