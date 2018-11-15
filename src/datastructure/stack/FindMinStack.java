package datastructure.stack;

import java.util.LinkedList;
/**
 * 算法与数据结构 69页，题3.25
 * 提出一种数据结构支持栈push和pop操作以及第三种操作findMin，它返回该数据结构中的最小元素。所有操作均以O(1)的最坏时间运行
 * @author yiming.li
 *
 */
public class FindMinStack {
	private Node topNode;
	public static void main(String[] args) {
		FindMinStack findMinStack = new FindMinStack();
		
		findMinStack.push(50);
		findMinStack.push(10);
		findMinStack.push(20);
		findMinStack.push(30);
		System.out.println(findMinStack.finMin());
		findMinStack.push(5);
		System.out.println(findMinStack.finMin());
		findMinStack.pop();
		System.out.println(findMinStack.finMin());
		findMinStack.push(40);
		System.out.println(findMinStack.finMin());
	}
	public void push(int e) {
		if(null == topNode){
			topNode = new Node(e);
			topNode.currentMinNode = topNode;
		}else{
			Node temp = topNode;
			topNode = new Node(e);
			topNode.nextNode = temp;
			if(temp.currentMinNode.e < topNode.e){
				topNode.currentMinNode = temp.currentMinNode;
			}else{
				topNode.currentMinNode = topNode;
			}
		}
	}
	public int pop(){
		int returnValue = topNode.e;
		topNode = topNode.nextNode;
		return returnValue;
	}
	public int finMin(){
		return topNode.currentMinNode.e;
	}
	
	class Node{
		/**
		 * 上一节点 暂时没用
		 */
		private Node preNode;
		/**
		 * 下一节点
		 */
		private Node nextNode;
		/**
		 * 但前节点为顶节点时的最小节点
		 */
		private Node currentMinNode;
		private int e;
		Node(int e){
			this.e = e;
		}
	}
}
