/**
* @author:liyiming
* @date:2018年6月27日
* Description:
**/
package leetcode.easy;

import leetcode.TreeNode;

/**
 * Title: BinaryTreeTilt Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年6月27日
 **/
public class BinaryTreeTilt{

	/**
	 * @author:liyiming
	 * @date:2018年6月27日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode root = new TreeNode(20);
		TreeNode left = new TreeNode(10);
		TreeNode right = new TreeNode(30);
		root.left = left;
		root.right = right;

		TreeNode ll = new TreeNode(5);
		TreeNode lr = new TreeNode(15);
		TreeNode rl = new TreeNode(25);
		TreeNode rr = new TreeNode(35);
		left.left = ll;
		left.right = lr;
		right.left = rl;
		right.right = rr;
		BinaryTreeTilt btt = new BinaryTreeTilt();
		System.out.println(btt.findTilt(root));;
	}

	int tilt = 0;

	public int findTilt(TreeNode root) {
		calTilt(root);
		return tilt;
	}

	public int calTilt(TreeNode root) {
		//int sum = 0;
		if (root == null) {
			return 0;
		}
		int l = calTilt(root.left);
		int r = calTilt(root.right);
		tilt += Math.abs(l - r);
		return l+r+root.val;
	}
}
