package leetcode.hard.tree;

import leetcode.TreeNode;

/**
 * 99. 恢复二叉搜索树
 * @author yiming.li
 *@description 二叉搜索树中的两个节点被错误地交换。

请在不改变其结构的情况下，恢复这棵树。

示例 1:

输入: [1,3,null,null,2]

   1
  /
 3
  \
   2

输出: [3,1,null,null,2]

   3
  /
 1
  \
   2
示例 2:

输入: [3,1,4,null,null,2]

  3
 / \
1   4
   /
  2

输出: [2,1,4,null,null,3]

  2
 / \
1   4
   /
  3
进阶:

使用 O(n) 空间复杂度的解法很容易实现。
你能想出一个只使用常数空间的解决方案吗？
 */
public class RecoverBinarySearchTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode left = new TreeNode(1);
		TreeNode right = new TreeNode(4);

		TreeNode rl = new TreeNode(2);

		root.left = left;
		root.right = right;
		right.left = rl;
		RecoverBinarySearchTree rb = new RecoverBinarySearchTree();
		rb.recoverTree(root);
		System.out.println(root.toString());
	}

	TreeNode leftWrongNode = null;
	TreeNode rightWrongNode = null;
	TreeNode midLNode = null;
	TreeNode midRNode = null;

	public void recoverTree(TreeNode root) {
		recoverTree2(root,null,null,false);
	}
	public void recoverTree2(TreeNode root,TreeNode pNode, TreeNode ppNode, boolean isChange) {
		if(pNode==null){
			recoverTree2(root.left,root,null,false);
			recoverTree2(root.right,root,null,false);
		}else if(ppNode==null){
			recoverTree2(root.left,root,pNode,false);
			recoverTree2(root.right,root,null,false);
		}else{
			
		}
	}
	public void findLeftWrongNode(TreeNode node, TreeNode pNode, TreeNode ppNode, boolean isChange) {
		if (!isChange) {
			if (node.val > pNode.val) {
				leftWrongNode = pNode;
				midLNode = node;
			}
		} else {
			if (node.val > pNode.val || node.val < ppNode.val) {
				leftWrongNode = node;
				midLNode = pNode;
			}
		}
	}

	public void findRightWrongNode(TreeNode node, TreeNode pNode, TreeNode ppNode, boolean isChange) {
		if (!isChange) {
			if (node.val < pNode.val) {
				rightWrongNode = pNode;
				midRNode = node;
			}
		} else {
			if (node.val < pNode.val || node.val > ppNode.val) {
				rightWrongNode = node;
				midRNode = pNode;
			}
		}
	}
}
