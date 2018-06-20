/**
* @author:liyiming
* @date:2018年6月20日
* Description:
**/
package leetcode.easy;

/**
 * Title: DeleteLinkedListNode Description: Company:pusense
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
 * 
 * 现有一个链表 -- head = [4,5,1,9]，它可以表示为:
 * 
 * 4 -> 5 -> 1 -> 9
 * 
 * 示例 1:
 * 
 * 输入: head = [4,5,1,9], node = 5 输出: [4,1,9] 解释: 给定你链表中值为 5
 * 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 * 
 * 示例 2:
 * 
 * 输入: head = [4,5,1,9], node = 1 输出: [4,5,9] 解释: 给定你链表中值为 1
 * 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
 * 
 * 说明:
 * 
 * 链表至少包含两个节点。 链表中所有节点的值都是唯一的。 给定的节点为非末尾节点并且一定是链表中的一个有效节点。 不要从你的函数中返回任何结果。
 * 
 * 
 * @author ：lyiming
 * @date ：2018年6月20日
 **/
public class DeleteLinkedListNode{

	/**
	 * @author:liyiming
	 * @date:2018年6月20日
	 * @Description:
	 * @param args
	 */
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
		deleteNode(a3);
		System.out.println(head);
	}

	public static void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
