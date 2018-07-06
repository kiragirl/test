/**
* @author:liyiming
* @date:2018年7月5日
* Description:
**/
package leetcode.medium.linkedList;

import leetcode.easy.ListNode;

/**
 * Title: ReverseLinkedListII Description: Company:pusense 反转从位置 m 到 n
 * 的链表。请使用一趟扫描完成反转。
 * 
 * 说明: 1 ≤ m ≤ n ≤ 链表长度。
 * 
 * 示例:
 * 
 * 输入: 1->2->3->4->5->NULL, m = 2, n = 4 输出: 1->4->3->2->5->NULL
 * 
 * @author ：lyiming
 * @date ：2018年7月5日
 **/
public class ReverseLinkedListII{

	/**
	 * @author:liyiming
	 * @date:2018年7月5日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode a2 = new ListNode(2);
		ListNode a3 = new ListNode(3);
		ListNode a4 = new ListNode(4);
		ListNode a5 = new ListNode(5);
		ListNode a6 = new ListNode(6);
		ListNode a7 = new ListNode(7);
		ListNode a8 = new ListNode(8);
		ListNode a9 = new ListNode(9);
		head.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		a5.next = a6;
		a6.next = a7;
		a7.next = a8;
		a8.next = a9;
		ReverseLinkedListII rl = new ReverseLinkedListII();
		System.out.println(rl.reverseBetween(head, 4, 8));
	}

	// 1 2 3 4 5
	public ListNode reverseBetween(ListNode head, int m, int n) {
		if (m == n) {
			return head;
		}
		ListNode prev = null;
		ListNode node = null;
		ListNode prevn = null;
		ListNode curr = head;
		ListNode nodeM = null;
		int i = 1;
		while (curr != null) {
			ListNode nextTemp = curr.next;
			if (i < m) {
				curr.next = null;
				if (node == null) {
					node = curr;
					prevn = node;
				} else {
					prevn.next = curr;
					prevn = prevn.next;
				}
			}

			if (i >= m && i <= n) {
				curr.next = prev;
				prev = curr;
			}
			if (i == m) {
				nodeM = prev;
			}
			if (i == n) {
				// System.out.println(prev);
				if (null != prevn) {
					prevn.next = prev;
				}else {
					node = prev;
				}
				// System.out.println(node);
				nodeM.next = nextTemp;
			}
			curr = nextTemp;
			i++;
		}
		return node;
	}
}
