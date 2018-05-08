/**
* @author:liyiming
* @date:2018年5月8日
* Description:
**/
package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: IsSymmetric Description: Company:pusense
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
		left.left=ll;
		left.right=lr;
		right.left=rl;
		right.right=rr;
		
		System.out.println(isSymmetric(root));
	}

	public static boolean isSymmetric(TreeNode root) {
		if(null == root) {
			return false;
		}
		List<int[]> list = new ArrayList<int[]>();
		int i=1;
		while(null != root.left) {
			int[] nums = new int [] {root.left.val,root.right.val};
		}
		return false;
	}
}
