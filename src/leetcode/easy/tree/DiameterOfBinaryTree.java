/**
* @author:liyiming
* @date:2018年6月27日
* Description:
**/
package leetcode.easy.tree;

import leetcode.TreeNode;

/**
 * Title: DiameterOfBinaryTree Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年6月27日
 **/
public class DiameterOfBinaryTree{

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

		TreeNode lll = new TreeNode(2);
		TreeNode llr = new TreeNode(7);
		ll.left = lll;
		ll.right = llr;

		TreeNode lrl = new TreeNode(12);
		TreeNode lrr = new TreeNode(17);
		lr.left = lrl;
		lr.right = lrr;

		TreeNode rll = new TreeNode(22);
		TreeNode rlr = new TreeNode(27);
		rl.left = rll;
		rl.right = rlr;

		TreeNode rrl = new TreeNode(32);
		TreeNode rrr = new TreeNode(37);
		rr.left = rrl;
		rr.right = rrr;
		DiameterOfBinaryTree btd = new DiameterOfBinaryTree();
		System.out.println(btd.diameterOfBinaryTree(root));
	}

	int ans;

	public int diameterOfBinaryTree(TreeNode root) {
		ans = 1;
		depth(root);
		return ans - 1;
	}

	public int depth(TreeNode node) {
		if (node == null)
			return 0;
		int L = depth(node.left);
		int R = depth(node.right);
		ans = Math.max(ans, L + R + 1);
		return Math.max(L, R) + 1;
	}
}
