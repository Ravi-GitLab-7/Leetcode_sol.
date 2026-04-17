// class Solution {
//     public int celebrity(int arr[][]) {

//         int n = arr.length;
//         Stack<Integer> st = new Stack<>();

//         for (int i = 0; i < n; i++) {
//             st.push(i);
//         }

//         while (st.size() > 1) {  
//             int a = st.pop();
//             int b = st.pop();

//             boolean aFlag = true, bFlag = true;

//             if (arr[a][b] == 1) {  // a celeb nhi hua
//                 aFlag = false;
//             } else {          // arr[a][b] == 0 , b celeb nhi hua
//                 bFlag = false;
//             }

//             if (arr[b][a] == 1) {   // b celeb nhi hua
//                 bFlag = false;
//             } else {            // arr[b][a] == 0 , a celeb nhi hua
//                 aFlag = false;
//             }
//             if (aFlag) st.push(a);   
//             if (bFlag) st.push(b);   
//         }
//         if (st.isEmpty()) return -1;
//         int celeb = st.pop();

//         // row check
//         for (int j = 0; j < n; j++) {
//             if (j == celeb) continue;
//             if (arr[celeb][j] == 1) return -1;
//         }

//         // column check 
//         for (int i = 0; i < n; i++) {
//             if (i == celeb) continue;
//             if (arr[i][celeb] == 0) return -1;
//         }

//         return celeb;
//     }
// }

class Solution {
    public int celebrity(int arr[][]) {

        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            st.push(i);
        }

        // eliminate candidates efficiently
        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();

            if (arr[a][b] == 1) {
                st.push(b);   // a not celeb
            } else {
                st.push(a);   // b not celeb
            }
        }

        if (st.isEmpty()) return -1;

        int celeb = st.pop();

        // row check
        for (int j = 0; j < n; j++) {
            if (j != celeb && arr[celeb][j] == 1) return -1;
        }

        // column check
        for (int i = 0; i < n; i++) {
            if (i != celeb && arr[i][celeb] == 0) return -1;
        }

        return celeb;
    }
}