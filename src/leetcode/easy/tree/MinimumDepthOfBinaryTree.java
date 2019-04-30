package leetcode.easy.tree;

import leetcode.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
/**
 * 111. 二叉树的最小深度
 * @author yiming.li
 *给定一个二叉树，找出其最小深度。

最小深度是从根节点到最近叶子节点的最短路径上的节点数量。

说明: 叶子节点是指没有子节点的节点。

示例:

给定二叉树 [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
返回它的最小深度  2.
 */
public class MinimumDepthOfBinaryTree {

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
		//rr.left = rrl;
		//rr.right = rrr;
		MinimumDepthOfBinaryTree md = new MinimumDepthOfBinaryTree();
		System.out.println(md.minDepth(root));
	}

	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		if(root.left == null && root.right == null ){
			return 1;
		}
		int L = 1 + minDepth(root.left);
		int R = 1 + minDepth(root.right);
		if(root.left != null && root.right != null){
			return Math.min(L, R);
		}else{
			return Math.max(L, R);
		}
	}
	//广度优先 计数是错误的 
	public int minDepth2(TreeNode node) {
		if (node == null)
			return 0;
		Deque<TreeNode> deque = new ArrayDeque<TreeNode>();
		deque.offer(node);
		int a = 1;
		while(!deque.isEmpty()){
			TreeNode temp = deque.poll();
			if(null != temp.left){
				deque.offer(temp.left);
			}else{
				return a;
			}
			if(null != temp.right){
				deque.offer(temp.right);
			}else{
				return a;
			}
			a = a + 1;
		}
		return a;
	}
}
