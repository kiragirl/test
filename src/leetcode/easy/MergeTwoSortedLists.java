/**
* @author:liyiming
* @date:2018年5月8日
* Description:
**/
package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: MergeTwoSortedLists Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年5月8日
 **/
public class MergeTwoSortedLists{

	/**
	 * @author:liyiming
	 * @date:2018年5月8日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {

		ListNode l1 = new ListNode(1);
		ListNode a2 = new ListNode(2);
		ListNode a3 = new ListNode(4);
		l1.next = a2;
		a2.next = a3;
		ListNode l2 = new ListNode(1);
		ListNode b2 = new ListNode(3);
		ListNode b3 = new ListNode(4);
		l2.next = b2;
		b2.next = b3;

		/*
		 * ListNode l1 = new ListNode(2); ListNode l2 = new ListNode(1);
		 */
		System.out.println(mergeTwoLists(l1, l2).toString());;
	}
	/**
	 * Merge Two Sorted Lists
	 * @author:liyiming
	 * @date:2018年5月8日
	 * @Description:因为链表有序 首元素不断比较 获得数据
	 * @param l1
	 * @param l2
	 * @return
	 */
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode node = new ListNode(0);
		ListNode nextNode1 = l1;
		ListNode nextNode2 = l2;
		ListNode nextRNode2 = node;
		while (null != nextNode1 || null != nextNode2) {
			if (null == nextNode1 && null != nextNode2) {
				nextRNode2.next = new ListNode(nextNode2.val);
				nextNode2 = nextNode2.next;
			}
			if (null == nextNode2 && null != nextNode1) {
				nextRNode2.next = new ListNode(nextNode1.val);
				nextNode1 = nextNode1.next;
			}
			if (null != nextNode1 && null != nextNode2) {
				if (nextNode1.val <= nextNode2.val) {
					nextRNode2.next = new ListNode(nextNode1.val);
					nextNode1 = nextNode1.next;
				} else {
					nextRNode2.next = new ListNode(nextNode2.val);
					nextNode2 = nextNode2.next;
				}
			}
			nextRNode2 = nextRNode2.next;
		}
		return node.next;
	}

	/**
	 * Merge Two Sorted Lists
	 * 第一种方法 两个链表数据取出 组成一个集合 再排序
	 * @author:liyiming
	 * @date:2018年5月8日
	 * @Description:
	 * @param l1
	 * @param l2
	 * @return
	 */
	public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
		ListNode node = null;
		if (null == l1 && null == l2) {
			return node;
		}
		List<Integer> list = new ArrayList<Integer>();
		if (null != l1) {
			list.add(l1.val);
			ListNode nextNode1 = l1.next;
			while (null != nextNode1) {
				list.add(nextNode1.val);
				nextNode1 = nextNode1.next;
			}
		}
		if (null != l2) {
			list.add(l2.val);
			ListNode nextNode2 = l2.next;
			while (null != nextNode2) {
				list.add(nextNode2.val);
				nextNode2 = nextNode2.next;
			}
		}
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				int a = list.get(i);
				int b = list.get(j);
				if (a > b) {
					list.set(i, b);
					list.set(j, a);
				}
			}
		}
		node = new ListNode(list.get(0));
		ListNode next = node;
		for (int i = 1; i < list.size(); i++) {
			next.next = new ListNode(list.get(i));
			next = next.next;
		}
		return node;
	}
}
