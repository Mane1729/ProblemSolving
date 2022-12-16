/*
  Given the root of a binary tree, return the inorder traversal of its nodes' values.
 */

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

public class Leetcode94 {    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);      
        return list;
    }
    
    public void inorder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        inorder(root.left, list);
        list.add(root.val);        
        inorder(root.right, list);
    }
}

/*
    Time complexity: O(n)
    
    Space complexity: O(n)
*/
