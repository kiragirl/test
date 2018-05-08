/**
* @author:liyiming
* @date:2018年5月8日
* Description:
**/
package leetcode.easy;

/**
 * Title: DeleteDuplicates Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年5月8日
 **/
public class DeleteDuplicates{

	/**
	 * @author:liyiming
	 * @date:2018年5月8日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode a2 = new ListNode(1);
		ListNode a3 = new ListNode(2);
		ListNode a4 = new ListNode(3);
		ListNode a5 = new ListNode(3);
		head.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		System.out.println(deleteDuplicates(head));
	}

	/**
	 * 删除有序链表中的重复元素 输入: 1->1->2->3->3 输出: 1->2->3
	 * 
	 * @author:liyiming
	 * @date:2018年5月8日
	 * @Description:
	 * @param head
	 * @return
	 */
	public static ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode nextHead = head;
		while (null != nextHead && null != nextHead.next) {
			if (nextHead.val == nextHead.next.val) {
				nextHead.next = nextHead.next.next;
			} else {
				nextHead = nextHead.next;
			}
			//System.out.println(nextHead.toString());
		}
		return head;
	}
}
