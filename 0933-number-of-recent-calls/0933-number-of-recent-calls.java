class RecentCounter {
    LinkedList<Integer> reg;
    public RecentCounter() {
        reg = new LinkedList<Integer>();
    }
    
    public int ping(int t) {
        reg.add(t);
        while(reg.getFirst()<t-3000){
            reg.remove();
        }
        return reg.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */