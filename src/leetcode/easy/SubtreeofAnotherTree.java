/**
* @author:liyiming
* @date:2018年6月28日
* Description:
**/
package leetcode.easy;


/**
* 	Title: SubtreeofAnotherTree
*	Description:给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。

示例 1:
给定的树 s:

     3
    / \
   4   5
  / \
 1   2

给定的树 t：

   4 
  / \
 1   2

返回 true，因为 t 与 s 的一个子树拥有相同的结构和节点值。

示例 2:
给定的树 s：

     3
    / \
   4   5
  / \
 1   2
    /
   0

给定的树 t：

   4
  / \
 1   2

返回 false。

*	Company:pusense
* 	@author ：lyiming
* 	@date ：2018年6月28日
**/
public class SubtreeofAnotherTree{

	/**
	 * @author:liyiming
	 * @date:2018年6月28日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode left = new TreeNode(4);
		TreeNode right = new TreeNode(5);
		root.left = left;
		root.right = right;

		TreeNode ll = new TreeNode(1);
		TreeNode lr = new TreeNode(15);
		TreeNode rl = new TreeNode(2);
		TreeNode rr = new TreeNode(35);
		left.left = ll;
		//left.right = lr;
		right.left = rl;
		//right.right = rr;
		
		TreeNode t = new TreeNode(3);

		TreeNode tl = new TreeNode(1);
		TreeNode tr = new TreeNode(2);
		t.left = tl;
		t.right = tr;
		
		/********************************/
		TreeNode a = new TreeNode(1);
		TreeNode aa = new TreeNode(2);
		TreeNode aaa = new TreeNode(1);
		a.left = aa;
		aa.left = aaa;
		
		TreeNode b = new TreeNode(1);
		/********************************/
		TreeNode c = new TreeNode(3);
		TreeNode cl = new TreeNode(4);
		TreeNode cr = new TreeNode(5);
		c.left = cl;
		c.right = cr;
		
		TreeNode cll = new TreeNode(1);
		TreeNode clr = new TreeNode(2);
		cl.left = cll;
		cl.right = clr;
		
		TreeNode clll = new TreeNode(1);
		
		cll.left = clll;
		
		TreeNode d = new TreeNode(4);
		TreeNode dl = new TreeNode(1);
		TreeNode dr = new TreeNode(2);
		d.left = dl;
		d.right = dr;
		
		SubtreeofAnotherTree  st = new SubtreeofAnotherTree();
		
		System.out.println(st.isSubtree(c, d));;
	}
	
	public boolean isSubtree(TreeNode s, TreeNode t) {
        String tree1 = preorder(s, true);
        String tree2 = preorder(t, true);
        return tree1.indexOf(tree2) >= 0;
    }
    public String preorder(TreeNode t, boolean left) {
        if (t == null) {
            if (left)
                return "lnull";
            else
                return "rnull";
        }
        return "#"+t.val + " " +preorder(t.left, true)+" " +preorder(t.right, false);
    }
	
	public boolean isSubtree2(TreeNode s, TreeNode t) {
		return isSubtree(s, t, t);
	}

	public boolean isSubtree(TreeNode s, TreeNode t, TreeNode tr) {
		if (null == s && null == t)
			return true;
		if (null == s && null != t) {
			return false;
		}
		if (null != s && null == t) {
			return false;
		}
		if (s.val != t.val) {
			return isSubtree(s.left, tr, tr) || isSubtree(s.right, tr, tr);
		} else {
			boolean f1 = isSubtree(s.left, t.left, tr);
			if(!f1) {
				f1 = isSubtree(s.left, tr, tr);
			}
			boolean f2 = isSubtree(s.right, t.right, tr);
			if(!f2) {
				f2 = isSubtree(s.right, tr, tr);
			}
			return f1 && f2;
		}
	}
	public boolean noEquals2(TreeNode s, TreeNode t) {
		if(isSubtree(s, t)) {
			return true;
		}
		if(isSubtree(s, t)) {
			return true;
		}
		return false;
	}
	public boolean noEquals(TreeNode s, TreeNode t) {
		if(isSubtree(s.left, t)) {
			return true;
		}
		if(isSubtree(s.right, t)) {
			return true;
		}
		return false;
	}
	
	public boolean valEquals(TreeNode s, TreeNode t) {
		if(s.val == t.val) {
			return true;
		}else {
			return false;
		}
	}
}
