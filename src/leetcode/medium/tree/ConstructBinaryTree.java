/**
* @author:liyiming
* @date:2018年7月5日
* Description:
**/
package leetcode.medium.tree;

import leetcode.TreeNode;

import java.util.Arrays;

/**
 * Title: ConstructBinaryTree Description:根据一棵树的中序遍历与后序遍历构造二叉树。
 * 
 * 注意: 你可以假设树中没有重复的元素。
 * 
 * 例如，给出
 * 
 * 中序遍历 inorder = [9,3,15,20,7] 后序遍历 postorder = [9,15,7,20,3]
 * 
 * 返回如下的二叉树：
 * 
 * 3 / \ 9 20 / \ 15 7
 * 
 * 
 * Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年7月5日
 **/
public class ConstructBinaryTree{

	/**
	 * @author:liyiming
	 * @date:2018年7月5日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
	/*	int[] inorder = new int[] {9,3,15,20,7};
		int[] postorder = new int[] {9,15,7,20,3};*/
		
		int[] inorder = new int[] {16,9,10,3,15,20,7};
		int[] postorder = new int[] {16,10,9,15,7,20,3};
		ConstructBinaryTree cbt = new ConstructBinaryTree();
		System.out.println(cbt.buildTree(inorder, postorder));
	}

	public TreeNode buildTree(int[] inorder, int[] postorder) {
		if(inorder.length == 0) {
			return null;
		}
		int rootVal = postorder[postorder.length-1];
		TreeNode node = new TreeNode(rootVal);
		if(postorder.length==1) {
			return node;
		}
		for(int i=0;i<inorder.length;i++) {
			if(rootVal==inorder[i]) {
				int[] subInorderL = Arrays.copyOfRange(inorder, 0,i);
				int[] subPostorderL =  Arrays.copyOfRange(postorder, 0,i);
				TreeNode nodeL = buildTree(subInorderL, subPostorderL);
				
				int[] subInorderR = Arrays.copyOfRange(inorder, i+1,inorder.length);
				int[] subPostorderR =  Arrays.copyOfRange(postorder, i,postorder.length-1);
				TreeNode nodeR = buildTree(subInorderR, subPostorderR);
				node.left = nodeL;
				node.right = nodeR;
			}
		}
		return node;
	}
}
