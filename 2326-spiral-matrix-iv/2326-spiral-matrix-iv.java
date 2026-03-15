/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {  

        int[][] matrix = new int[m][n];                        

        // 🔴 ADDED (fill matrix with -1 first)
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = -1;
            }
        }

        int minr = 0, maxr = m - 1;                           
        int minc = 0, maxc = n - 1;

        while (minr <= maxr && minc <= maxc && head != null) {  

            // left to right
            for (int j = minc; j <= maxc && head != null; j++) {  
                matrix[minr][j] = head.val;                      
                head = head.next;                               
            }
            minr++;

            if (minr > maxr || minc > maxc)
                break;

            // top to bottom
            for (int i = minr; i <= maxr && head != null; i++) {  
                matrix[i][maxc] = head.val;                      
                head = head.next;                               
            }
            maxc--;

            if (minr > maxr || minc > maxc)
                break;

            // right to left
            for (int j = maxc; j >= minc && head != null; j--) {  
                matrix[maxr][j] = head.val;                      
                head = head.next;                               
            }
            maxr--;

            if (minr > maxr || minc > maxc)
                break;

            // bottom to top
            for (int i = maxr; i >= minr && head != null; i--) { 
                matrix[i][minc] = head.val;                     
                head = head.next;                                
            }
            minc++;
        }

        return matrix;
    }
}