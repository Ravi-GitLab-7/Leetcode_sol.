class Solution {
    public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());       
    for(int ele : stones){
            pq.add(ele);
        }
        while(pq.size()>1){
            int y = pq.remove();
            int x = pq.remove();
            if(y!=x) pq.add(y-x);            
        }
        if(pq.size()==0) return 0;
        else return pq.remove();
    }
}