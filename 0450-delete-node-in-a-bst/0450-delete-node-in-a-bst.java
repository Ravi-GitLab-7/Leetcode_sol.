/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode iop(TreeNode root) {
        TreeNode temp = root.left;
        while (temp.right != null)
            temp = temp.right;
        return temp;
    }

    public TreeNode predParent(TreeNode root, TreeNode pred) {
        TreeNode parent = null;
        TreeNode temp = root;
        while (temp != null && temp != pred) {
            parent = temp;
            if (pred.val < temp.val)
                temp = temp.left;
            else
                temp = temp.right;
        }
        return parent;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return null;

        if (root.val == key) { // deletion
            // case 1 : 0 child Nodes
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 : 1 child Nodes
            else if (root.left == null || root.right == null) {
                if (root.left == null)
                    return root.right;
                else
                    return root.left;
            }
            // case 3 : 2 child node
            else {
                TreeNode pred = iop(root);
                TreeNode predParent = predParent(root, pred);
                if (root == predParent) {
                    pred.right = root.right;
                    return pred;
                }
                predParent.right = pred.left;
                pred.left = root.left;
                pred.right = root.right;
                return pred;
            }
        }
        else if (root.val > key) { // LST will change
            root.left = deleteNode(root.left, key);
        }
        else { // root.right > key : RST will change
            root.right = deleteNode(root.right, key);
        }
        return root;
    }
}