/**
* @author:liyiming
* @date:2018年5月11日
* Description:
**/
package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Title: HasCycle Description: Company:pusense 给定一个链表，判断链表中是否有环。
 * 
 * 进阶： 你能否不使用额外空间解决此题？
 * 
 * @author ：lyiming
 * @date ：2018年5月11日
 **/
public class HasCycle{

	/**
	 * @author:liyiming
	 * @date:2018年5月11日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		// [3,2,0,-4]
		ListNode head = new ListNode(3);
		ListNode a2 = new ListNode(2);
		ListNode a3 = new ListNode(0);
		ListNode a4 = new ListNode(-4);
		ListNode a5 = new ListNode(5);
		// ListNode a6 = new ListNode(6);
		head.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		//a5.next = a2;
		// a5.next = head;
		System.out.println(hasCycle2(head));
	}

	/**
	 * set 比 list 比较快
	 * 
	 * @author:liyiming
	 * @date:2018年5月11日
	 * @Description:
	 * @param head
	 * @return
	 */
	public static boolean hasCycle(ListNode head) {
		if (null == head) {
			return false;
		}
		// List<ListNode> list = new ArrayList<ListNode>();
		Set<ListNode> list = new HashSet<ListNode>();
		list.add(head);
		ListNode node = head.next;
		while (node != null) {
			if (list.contains(node)) {
				return true;
			}
			list.add(node);
			node = node.next;
		}
		return false;
	}
	/**
	 * 快慢指针 有环的情况下 快慢指针会相遇
	 * @author:liyiming
	 * @date:2018年5月11日
	 * @Description:
	 * @param head
	 * @return
	 */
	public static boolean hasCycle2(ListNode head) {
		if (head == null || head.next == null) {
			return false;
		}
		ListNode fast = head.next;
		ListNode slow = head;
		while (fast != slow) {
			if (fast == null || fast.next == null) {
				return false;
			}
			fast = fast.next.next;
			slow = slow.next;
		}
		return true;
	}

}
