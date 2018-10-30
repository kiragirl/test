/**
* @author:liyiming
* @date:2018年5月8日
* Description:
**/
package leetcode.easy;

/**
 * Title: ListNode Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年5月8日
 **/
public class ListNode{

	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}

	@Override
	public String toString() {
		String ss = "";
		ListNode nextNode = next;
		while (null != nextNode) {
			ss = ss + "->" + nextNode.val;
			nextNode = nextNode.next;
		}
		return "ListNode [val=" + val + ", " + val + ss + "]";
	}

}
