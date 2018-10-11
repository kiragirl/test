/**
* @author:liyiming
* @date:2018年5月8日
* Description:
**/
package leetcode;

/**
 * Title: TreeNode Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年5月8日
 **/
public class TreeNode{

	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int x) {
		val = x;
	}
	/**
	 * @author:liyiming
	 * @date:2018年5月23日
	 * @Description:
	 * @return
	 */
	@Override
	public String toString() {
		int depth = getBinaryTreeDepth();
		//System.out.println(depth);
		return toStringRecursion(this);
	}
	
	private String toStringRecursion(TreeNode node) {
		if(null == node) {
			return "null";
		}
		String ss = "{"+toStringRecursion(node.left)+"{"+node.val+"}"+toStringRecursion(node.right)+"}";
		return ss;
	}
	/**
	 * 必须是一颗二叉树
	 * 
	 * @author:liyiming
	 * @date:2018年5月23日
	 * @Description:
	 * @return
	 */
	private int getBinaryTreeDepth() {
		TreeNode temp = this.left;
		int depth = 1;
		while (null != temp) {
			depth++;
			temp = temp.left;
		}
		return depth;
	}
}
