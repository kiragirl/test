/**
* @author:liyiming
* @date:2018年5月8日
* Description:
**/
package leetcode.easy;

import leetcode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Title: IsSymmetric Description: Company:pusense 理解为有两组二叉树
 * 
 * @author ：lyiming
 * @date ：2018年5月8日
 **/
public class IsSymmetric{

	/**
	 * @author:liyiming
	 * @date:2018年5月8日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(2);
		root.left = left;
		root.right = right;

		TreeNode ll = new TreeNode(3);
		TreeNode lr = new TreeNode(4);
		TreeNode rl = new TreeNode(4);
		TreeNode rr = new TreeNode(3);
		left.left = ll;
		left.right = lr;
		right.left = rl;
		right.right = rr;

		System.out.println(isSymmetric(root));
	}

	/**
	 * 对称二叉树
	 * 
	 * @author:liyiming
	 * @date:2018年5月9日
	 * @Description:
	 * @param root
	 * @return
	 */
	public static boolean isSymmetric(TreeNode root) {
		if (null == root) {
			return true;
		}
		TreeNode[] trs = nodeToArray(root);
		for (TreeNode treeNode : trs) {
			System.out.print(null == treeNode ? "null" : treeNode.val);
		}
		for (int i = 0; i < trs.length / 2; i++) {
			if (null == trs[i] && null == trs[trs.length - i - 1]) {

			} else if (null == trs[i] && null != trs[trs.length - i - 1]) {
				return false;
			} else if (null != trs[i] && null == trs[trs.length - i - 1]) {
				return false;
			} else if (trs[i].val != trs[trs.length - i - 1].val) {
				return false;
			}
		}
		System.out.println();
		return true;
	}

	public static TreeNode[] nodeToArray(TreeNode node) {
		TreeNode[] trs = new TreeNode[0];
		if (null != node && (null != node.left || null != node.right)) {
			trs = new TreeNode[2];
			TreeNode[] tr = new TreeNode[]{node.left, node.right};
			System.arraycopy(tr, 0, trs, 0, tr.length);

			TreeNode[] trl = nodeToArray(node.left);
			TreeNode[] trs2 = new TreeNode[trs.length + trl.length];
			System.arraycopy(trl, 0, trs2, 0, trl.length);
			System.arraycopy(trs, 0, trs2, trl.length, trs.length);
			trs = trs2;

			TreeNode[] trr = nodeToArray(node.right);
			TreeNode[] trs3 = new TreeNode[trs.length + trr.length];
			System.arraycopy(trs, 0, trs3, 0, trs.length);
			System.arraycopy(trr, 0, trs3, trs.length, trr.length);
			trs = trs3;
		}
		return trs;
	}

	/**
	 * Recursive
	 * 
	 * @author:liyiming
	 * @date:2018年5月9日
	 * @Description:理解为有两组二叉树
	 * @param root
	 * @return
	 */
	public boolean isSymmetric2(TreeNode root) {
		return isMirror(root, root);
	}

	public boolean isMirror(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null)
			return true;
		if (t1 == null || t2 == null)
			return false;
		return (t1.val == t2.val) && isMirror(t1.right, t2.left) && isMirror(t1.left, t2.right);
	}

	/**
	 * Iterative
	 * 
	 * @author:liyiming
	 * @date:2018年5月9日
	 * @Description:理解为有两组二叉树
	 * @param root
	 * @return
	 */
	public boolean isSymmetric3(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		q.add(root);
		while (!q.isEmpty()) {
			TreeNode t1 = q.poll();
			TreeNode t2 = q.poll();
			if (t1 == null && t2 == null)
				continue;
			if (t1 == null || t2 == null)
				return false;
			if (t1.val != t2.val)
				return false;
			q.add(t1.left);
			q.add(t2.right);
			q.add(t1.right);
			q.add(t2.left);
		}
		return true;
	}
}
