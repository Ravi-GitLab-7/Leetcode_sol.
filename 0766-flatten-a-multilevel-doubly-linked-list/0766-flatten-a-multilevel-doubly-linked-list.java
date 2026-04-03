/*
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node temp = head;
        while (temp != null) {
            Node n = temp.next;
            if (temp.child != null) {
                Node c = flatten(temp.child);   //function name
                Node d = c;
                // Go to tail of child list
                while (d.next != null) d = d.next;
                // Connect temp → child
                temp.next = c;
                c.prev = temp;
                // Connect child tail → next
                if (n != null) {
                    d.next = n;       
                    n.prev = d;
                }
                temp.child = null;  
            }
            temp = n;
        }
        return head;
    }
}