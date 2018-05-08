/**
* @author:liyiming
* @date:2018年5月8日
* Description:
**/
package leetcode.easy;


/**
* 	Title: ListNode
*	Description:
*	Company:pusense
* 	@author ：lyiming
* 	@date ：2018年5月8日
**/
public class ListNode{
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

	@Override
	public String toString() {
		String ss = "";
		ListNode nextNode = next;
		while(null!=nextNode) {
			ss = ss+"->" + nextNode.val;
			nextNode = nextNode.next;
		}
		return "ListNode [val=" + val + ", next="+ val + ss + "]";
	}
	
}
