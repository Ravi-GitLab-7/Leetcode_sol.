/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int LenA = 0;
        ListNode tempA = headA;

        while(tempA != null){
            tempA = tempA.next;
            LenA++;
        }

        int LenB = 0;
        ListNode tempB = headB;

        while(tempB != null){
            tempB = tempB.next;
            LenB++;
        }

        tempA = headA;
        tempB = headB;

        if(LenA > LenB){
            for(int i = 0; i < LenA - LenB; i++){
                tempA = tempA.next;
            }
        }
        else{
            for(int i = 0; i < LenB - LenA; i++){
                tempB = tempB.next;
            }
        }

        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return tempA;
    }
}