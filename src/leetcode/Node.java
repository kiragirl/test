package leetcode;

/**
 * 包含子表得双向链表
 * @author yiming.li
 *
 */
public class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {}

    public Node(int _val,Node _prev,Node _next,Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
	public String toString() {
		String ss = "";
		Node nextNode = next;
		while (null != nextNode) {
			ss = ss + "->" + nextNode.val;
			nextNode = nextNode.next;
		}
		return "ListNode [val=" + val + ", " + val + ss + "]";
	}
}
