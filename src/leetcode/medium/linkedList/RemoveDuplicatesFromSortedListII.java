package leetcode.medium.linkedList;

import leetcode.easy.ListNode;

/**
 * 82. 删除排序链表中的重复元素 II
 * @author yiming.li
 *	给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
	示例 1:
	输入: 1->2->3->3->4->4->5
	输出: 1->2->5
	示例 2:
	输入: 1->1->1->2->3
	输出: 2->3
 */
public class RemoveDuplicatesFromSortedListII {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode a2 = new ListNode(2);
		ListNode a3 = new ListNode(2);
		ListNode a4 = new ListNode(3);
		ListNode a5 = new ListNode(4);
		ListNode a6 = new ListNode(4);
		ListNode a7 = new ListNode(4);
		ListNode a8 = new ListNode(5);
		head.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		a5.next = a6;
		a6.next = a7;
		a7.next = a8;
		
		/**
		 * [-2147483648,2147483647,2]
		 */
	/*	ListNode head = new ListNode(-2147483648);
		ListNode a2 = new ListNode(2147483647);
		ListNode a3 = new ListNode(2);
	
		head.next = a2;
		a2.next = a3;*/

		
		System.out.println(deleteDuplicates(head));
	}

	public static ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode mockHead = new ListNode(Integer.MIN_VALUE==head.val?Integer.MIN_VALUE-1:Integer.MIN_VALUE);
		mockHead.next = head;
		ListNode preHead = mockHead;
		ListNode preTemp = mockHead;
		ListNode nextHead = mockHead.next;
		boolean isDifferentPre = false;
		boolean isDifferentNext = false;
		while (null != nextHead) {
			if (preTemp.val == nextHead.val) {
				preTemp = nextHead;
			} else {
				preTemp = nextHead;
				isDifferentPre = true;
			}
			if (nextHead.next != null && nextHead.val == nextHead.next.val) {
				preTemp = nextHead.next;
			} else {
				isDifferentNext = true;
			}
			if (nextHead.next == null) {
				isDifferentNext = true;
			}
			if (isDifferentPre && isDifferentNext) {
				preHead.next = nextHead;
				preHead = preHead.next;
			}
			if(isDifferentNext && !isDifferentPre){
				preHead.next = null;
			}
			nextHead = nextHead.next;
			isDifferentPre = false;
			isDifferentNext = false;
		}
		return mockHead.next;
	}
}
