package leetcode.medium.linkedList;

import leetcode.Node;

/**
 * 430. 扁平化多级双向链表
 * @author yiming.li
 * 您将获得一个双向链表，除了下一个和前一个指针之外，它还有一个子指针，可能指向单独的双向链表。这些子列表可能有一个或多个自己的子项，依此类推，生成多级数据结构，如下面的示例所示。
	扁平化列表，使所有结点出现在单级双链表中。您将获得列表第一级的头部。
	 
	示例:
	输入:
	 1---2---3---4---5---6--NULL
	         |
	         7---8---9---10--NULL
	             |
	             11--12--NULL
	
	输出:
	1-2-3-7-8-11-12-9-10-4-5-6-NULL
 */
public class FlattenMultilevelDoublyLinkedList {

	public static void main(String[] args) {
		Node node1 = new Node();
		Node node2 = new Node();
		Node node3 = new Node();
		Node node4 = new Node();
		Node node5 = new Node();
		Node node6 = new Node();
		
		Node node7 = new Node();
		Node node8 = new Node();
		Node node9 = new Node();
		Node node10 = new Node();
		
		Node node11 = new Node();
		Node node12 = new Node();
		
		//node1 = new Node(1,null,node2,null);
		node1.val = 1;
		node1.next = node2;
		//node2 = new Node(2,node1,node3,null);
		node2.val = 2;
		node2.prev = node1;
		node2.next = node3;
		//node3 = new Node(3,node2,node4,node7);
		node3.val = 3;
		node3.prev = node2;
		node3.next = node4;
		node3.child = node7;
		//node4 = new Node(4,node3,node5,null);
		node4.val = 4;
		node4.prev = node3;
		node4.next = node5;
		//node5 = new Node(5,node4,node6,null);
		node5.val = 5;
		node5.prev = node4;
		node5.next = node6;
		//node6 = new Node(6,node5,null,null);
		node6.val = 6;
		node6.prev = node5;
		
		//node7 = new Node(7,null,node8,null);
		node7.val = 7;
		node7.prev = node6;
		node7.next = node8;
		//node8 = new Node(8,node7,node9,node11);
		node8.val = 8;
		node8.prev = node7;
		node8.next = node9;
		node8.child = node11;
		//node9 = new Node(9,node8,node10,null);
		node9.val = 9;
		node9.prev = node8;
		node9.next = node10;
		//node10 = new Node(10,node9,null,null);
		node10.val = 10;
		node10.prev = node9;
		
		//node11 = new Node(11,null,node12,null);
		node11.val = 11;
		node11.next = node12;
		//node12 = new Node(12,node11,null,null);
		node12.val = 12;
		node12.prev = node11;
		
		FlattenMultilevelDoublyLinkedList flattenMultilevelDoublyLinkedList = new FlattenMultilevelDoublyLinkedList();
		System.out.println(flattenMultilevelDoublyLinkedList.flatten(node1));
	}

	public Node flatten(Node head) {
		Node temp = null;
		Node headTemp = head;
		boolean isChildNull = false;
		while(headTemp != null){
			if (headTemp.child != null) {
				temp = headTemp.next;
				headTemp.next = headTemp.child;
				headTemp.next.prev = headTemp;
				headTemp.child = null;
				flatten(headTemp.next);
				isChildNull = true;
			}
			if(headTemp.next == null  && isChildNull && temp!= null){
				headTemp.next = temp;
				temp.prev = headTemp;
				isChildNull = false;
			}
			headTemp = headTemp.next;
		}
		return head;
	}
}
