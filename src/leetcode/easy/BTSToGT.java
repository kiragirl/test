/**
* @author:liyiming
* @date:2018年6月26日
* Description:
**/
package leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Title: BTSToGT N538 Description: Company:pusense 给定一个二叉搜索树(B树)（Binary Search
 * Tree），把它转换成为累加树（Greater Tree)，使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
 * 
 * 例如：
 * 
 * 输入: 二叉搜索树: 5 / \ 2 13
 * 
 * 输出: 转换为累加树: 18 / \ 20 13
 * 
 * @author ：lyiming
 * @date ：2018年6月26日
 **/
public class BTSToGT{

	/**
	 * @author:liyiming
	 * @date:2018年6月26日
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

		BTSToGT b = new BTSToGT();
		// b.convertBST(root);
		b.convertBST2(root);
		System.out.println(root.toString());
	}

	HashMap<Integer, Integer> map = new HashMap<>();

	public TreeNode convertBST(TreeNode root) {
		convertBST(root, 0);
		return root;
	}

	public void convertBST(TreeNode root, int rtv) {
		if (null == root) {
			return;
		}
		int rootVal = this.sumRightNode(root.right) + root.val;
		root.val = rootVal + rtv;
		convertBST(root.right, rtv);
		convertBST(root.left, root.val);
	}

	public int sumRightNode(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int sum = root.val;
		if (root.left != null) {
			sum += sumRightNode(root.left);
		}
		if (root.right != null) {
			if (!map.containsKey(root.val)) {
				map.put(root.val, sumRightNode(root.right));
			}
			sum += map.get(root.val);
		}
		return sum;
	}

	int a = 0;
	public TreeNode convertBST2(TreeNode root) {
		traverseTree(root);
		return root;
	}

	public void traverseTree(TreeNode root) {
		if (null == root) {
			return;
		}
		traverseTree(root.right);
		root.val = a = root.val + a;
		traverseTree(root.left);
	}
}
