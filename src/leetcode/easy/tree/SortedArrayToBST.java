package leetcode.easy.tree;

import leetcode.TreeNode;
/**
 * 108. 将有序数组转换为二叉搜索树
 * @author yiming.li
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
	本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
	示例:
	给定有序数组: [-10,-3,0,5,9],
	
	一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
	
	      0
	     / \
	   -3   9
	   /   /
	 -10  5
 */
public class SortedArrayToBST {

	public static void main(String[] args) {
		int[] nums = new int[]{-10,-3,0,5,9};
		SortedArrayToBST sortedArrayToBST = new SortedArrayToBST();
		System.out.println(sortedArrayToBST.sortedArrayToBST(nums));;
	}
	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums.length==0){
			return null;
		}
		if(nums.length==1){
			return new TreeNode(nums[0]);
		}
		int midIndex = (nums.length/2);
		int midNodeValue = nums[midIndex];
		TreeNode treeNode = new TreeNode(midNodeValue);
		treeNode.left = recursionL(nums,0,midIndex);
		treeNode.right = recursionL(nums,midIndex+1,nums.length);
		return treeNode;
    }
	
	public TreeNode recursionL(int[] nums,int bIndex,int endIndex){
		if(endIndex-bIndex<=0){
			return null;
		}
		int midIndex = (endIndex-bIndex)/2+bIndex;
		int midNodeValue = nums[midIndex];
		TreeNode treeNode = new TreeNode(midNodeValue);
		treeNode.left = recursionL(nums,bIndex,midIndex);
		treeNode.right = recursionL(nums,midIndex+1,endIndex);
		return treeNode;
	}
}
