package leetcode.easy.tree;

import java.util.ArrayList;
import java.util.List;

import leetcode.TreeNode;

/**
 * Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.
	Assume a BST is defined as follows:
	The left subtree of a node contains only nodes with keys less than or equal to the node's key.
	The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
	Both the left and right subtrees must also be binary search trees.
	 
	For example:
	Given BST [1,null,2,2],
	   1
	    \
	     2
	    /
	   2
	 
	return [2].
	Note: If a tree has more than one mode, you can return them in any order.
	Follow up: Could you do that without using any extra space? (Assume that the implicit stack space incurred due to recursion does not count).
 * @author yiming.li
 *
 */
public class FindModeIBinarySearchTree {
	private int maxCount =0;
	private int currentCount =0 ;
	List<Integer> a = new ArrayList<>();
	public static void main(String[] args) {
		TreeNode treeNode = new TreeNode(1);
		TreeNode treeNodel = new TreeNode(2);
		treeNode.left = treeNodel;
		
		TreeNode treeNodelr = new TreeNode(2);
		treeNodel.right = treeNodelr;
	}
	
    public int[] findMode(TreeNode root) {
    	if(root == null){
    		return null;
    	}
    	if (root.right != null) {
    		
		}
    	
    	return null;
    }
    
    public int findRootVal(TreeNode root){
    	int val = 1;
    	if(root.right != null){
    		val = findRootVal(root.right);
    		if(root.right.val == root.val){
    			val++;
    		}
    	}
    	return val;
    }
}
