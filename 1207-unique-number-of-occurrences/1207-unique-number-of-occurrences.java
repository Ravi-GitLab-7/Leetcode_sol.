class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        //find the frequencies
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }
            else{
                map.put(ele,1);
            }
        }
        // convert valus from map to set
        HashSet<Integer> set = new HashSet<>();
        for(int val : map.values()){
            set.add(val);
        }
         // compare both of these
         return (map.size() == set.size());
    }
}