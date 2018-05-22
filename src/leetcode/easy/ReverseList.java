/**
* @author:liyiming
* @date:2018年5月22日
* Description:
**/
package leetcode.easy;

/**
 * Title: ReverseList Description: Company:pusense 反转一个单链表。
 * 
 * 示例:
 * 
 * 输入: 1->2->3->4->5->NULL 输出: 5->4->3->2->1->NULL
 * 
 * 进阶: 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * 
 * @author ：lyiming
 * @date ：2018年5月22日
 **/
public class ReverseList{

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode a2 = new ListNode(2);
		ListNode a3 = new ListNode(3);
		ListNode a4 = new ListNode(4);
		ListNode a5 = new ListNode(5);
		head.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		System.out.println(reverseList(head));
	}

	public static ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		while (curr != null) {
			ListNode nextTemp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextTemp ;
		}
		return prev;
	}

	public static ListNode reverse(ListNode pre, ListNode next) {

		return next;
	}

}
