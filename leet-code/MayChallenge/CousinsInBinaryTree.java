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
    private int findLevel(TreeNode node, int key, int level){
        if(node == null)
            return 0;
        if(node.val == key)
            return level;
        int downlevel = findLevel(node.left, key, level + 1);
        if (downlevel != 0) 
            return downlevel; 
        downlevel = findLevel(node.right, key, level + 1); 
        return downlevel; 
    }
    private boolean isSibling(TreeNode node, TreeNode a, TreeNode b) { 
        // Base case 
        if (node == null) 
            return false; 
        return ((node.left == a && node.right == b) || (node.left == b && node.right == a) || isSibling(node.left, a, b) || isSibling(node.right, a, b)); 
    }
    private TreeNode getNode(TreeNode node, int val){
        LinkedList<TreeNode> tree = new LinkedList<>();
        tree.add(node);
        while(!tree.isEmpty()){
            TreeNode tmp = tree.remove(0);
            if(tmp.val == val)
                return tmp;
            if(tmp.left != null)
                tree.add(tmp.left);
            if(tmp.right != null)
                tree.add(tmp.right);
        }
        return null;
    }
    public boolean isCousins(TreeNode root, int x, int y){
        int xLevel, yLevel;
        xLevel = findLevel(root, x, 1);
        yLevel = findLevel(root, y, 1);
        TreeNode a, b;
        a = getNode(root, x);
        b = getNode(root, y);
        if(xLevel == yLevel && !isSibling(root, a, b))
            return true;
        else
            return false;
    }
}
