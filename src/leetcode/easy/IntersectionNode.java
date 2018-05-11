/**
* @author:liyiming
* @date:2018年5月11日
* Description:
**/
package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Title: IntersectionNode Description: Company:pusense 编写一个程序，找到两个单链表相交的起始节点。
 * 
 * 例如，下面的两个链表：
 * 
 * A: 		a1 → a2 ↘ 
 * 					c1 → c2 → c3
 * B: b1 → b2 → b3 ↗
 * 
 * 在节点 c1 开始相交。
 * 
 * 注意：
 * 
 * 如果两个链表没有交点，返回 null. 在返回结果后，两个链表仍须保持原有的结构。 可假定整个链表结构中没有循环。 程序尽量满足 O(n)
 * 时间复杂度，且仅用 O(1) 内存。
 * 
 * @author ：lyiming
 * @date ：2018年5月11日
 **/
public class IntersectionNode{

	/**
	 * @author:liyiming
	 * @date:2018年5月11日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		ListNode headA = new ListNode(1);
		ListNode a2 = new ListNode(2);
		ListNode a3 = new ListNode(3);
		ListNode a4 = new ListNode(4);
		ListNode a5 = new ListNode(5);

		headA.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;

		ListNode headB = new ListNode(6);
		ListNode b2 = new ListNode(7);
		ListNode b3 = new ListNode(8);
		ListNode b4 = new ListNode(9);

		headB.next = b2;
		b2.next = b3;
		b3.next = b4;

		ListNode c1 = new ListNode(11);
		ListNode c2 = new ListNode(22);
		ListNode c3 = new ListNode(33);

		c1.next = c2;
		c2.next = c3;

		a5.next = c1;
		b4.next = c1;
		System.out.println(getIntersectionNode(headA, headB));
	}
	/**
	 * two Pointers
	 * A = {1,3,5,7,9,11}
	 * B = {2,4,9,11}
	 * A+B = {1,3,5,7,9,11,2,4,9,11}
	 * B+A = {2,4,9,11,1,3,5,7,9,11}
	 * @author:liyiming
	 * @date:2018年5月11日
	 * @Description:
	 * @param headA
	 * @param headB
	 * @return
	 */
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (null == headA || null == headB) {
			return null;
		}
		ListNode pointer1 = headA;
		ListNode pointer2 = headB;
		boolean flagA = true;
		boolean flagB = true;
		while (null != pointer1 && null != pointer2) {
			if (pointer1 == pointer2) {
				return pointer1;
			} else {
				pointer1 = pointer1.next;
				if (pointer1 == null && flagA) {
					pointer1 = headB;
					flagA = false;
				}
				pointer2 = pointer2.next;
				if (pointer2 == null && flagB) {
					pointer2 = headA;
					flagB = false;
				}
			}
		}
		return null;
	}

	public static ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
		if(null==headA||null==headB) {
			return null;
		}
		Set<ListNode> set = new HashSet<ListNode>();
		ListNode node = headA;
		while (null != node) {
			set.add(node);
			node = node.next;
		}
		node = headB;
		while (null != node) {
			if(set.contains(node)) {
				return node;
			}
			node = node.next;
		}
		return null;
	}
}
