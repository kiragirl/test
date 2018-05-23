/**
* @author:liyiming
* @date:2018年5月23日
* Description:
**/
package leetcode.easy;

import java.util.Stack;

/**
* 	Title: MyQueue
*	Description:
*	Company:pusense
* 	@author ：lyiming
* 	@date ：2018年5月23日
**/
public class MyQueue{
	public static void main(String[] args) {
		MyQueue q = new MyQueue();
		q.push(1);
		q.push(2);
		q.push(3);
		System.out.println(q);
		q.push(4);
		System.out.println(q);
		q.peek();
		System.out.println(q);
		q.pop();
		System.out.println(q);
		q.peek();
		System.out.println(q);
	}
	private Stack<Integer> stack1;
	private Stack<Integer> stack2;
    /** Initialize your data structure here. */
    public MyQueue() {
    	stack1 = new Stack<>();
    	stack2 = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
    	
    	while(!stack1.isEmpty()) {
    		stack2.push(stack1.pop());
    	}
    	stack2.push(x);
    	while(!stack2.isEmpty()) {
    		stack1.push(stack2.pop());
    	}
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	return stack1.pop();
    }
    
    /** Get the front element. */
    public int peek() {
    	return stack1.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
    	return stack1.isEmpty();
    }
    
    /**
     * @author:liyiming
     * @date:2018年5月23日
     * @Description:
     * @return
     */
    @Override
    public String toString() {
    	return stack1.toString();
    }
}
