/**
* @author:liyiming
* @date:2018年5月23日
* Description:
**/
package leetcode.easy;

import leetcode.TreeNode;

/**
 * Title: InvertBinaryTree Description:翻转一棵二叉树。 示例： 输入： 4 / \ 2 7 / \ / \ 1 3 6
 * 9 输出： 4 / \ 7 2 / \ / \ 9 6 3 1 Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年5月23日
 **/
public class InvertBinaryTree{

	/**
	 * @author:liyiming
	 * @date:2018年5月23日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(3);
		root.left = left;
		root.right = right;

		TreeNode ll = new TreeNode(4);
		TreeNode lr = new TreeNode(5);
		TreeNode rl = new TreeNode(6);
		TreeNode rr = new TreeNode(7);
		left.left = ll;
		left.right = lr;
		right.left = rl;
		right.right = rr;

		System.out.println(root);
		System.out.println(invertTree(root));
	}

	/**
	 * 4251637
	 * 
	 * @author:liyiming
	 * @date:2018年5月23日
	 * @Description:
	 * @param root
	 * @return
	 */
	public static TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}
		TreeNode temp = root.left;
		root.left = invertTree(root.right);
		root.right = invertTree(temp);
		return root;
	}
}
