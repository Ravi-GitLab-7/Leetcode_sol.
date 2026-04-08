class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        // ArrayList<Integer> ans = new ArrayList<>();
        // int n = arr.length;
        // for(int i = 0;i<n;i++){
        //     int nextGreater = -1;
            
        //     for(int j= i+1;j<n;j++){
        //         if(arr[j] > arr[i]){
        //             nextGreater = arr[j];
        //             break;
        //         }
        //     }
        //     ans.add(nextGreater);
        // }
        // return ans;
  
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));
        
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans.set(i, -1);
            } else {
                ans.set(i, st.peek());
            }

            st.push(arr[i]);
        }

        return ans;
    }
}