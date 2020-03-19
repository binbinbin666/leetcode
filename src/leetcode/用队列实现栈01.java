package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**  
    * @Title: 用队列实现栈01.java
    * @Package leetcode
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年3月3日
    * @version V1.0  
    */
public class 用队列实现栈01 {

}
class MyStack {
	private Queue<Integer> q1;
	private Queue<Integer> q2;
	private int top;
    /** Initialize your data structure here. */
    public MyStack() {
    	q1 = new LinkedList<Integer>(); 
    	q2 = new LinkedList<Integer>(); 
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
    	q1.add(x);
    	top = x;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	while (q1.size()>1) {
    		 top = q1.poll();
 			 q2.add(top);
		}
    	int top1 = q1.poll();
    	Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    	return top1;
    }
    
    /** Get the top element. */
    public int top() {
    	return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
    	return q1.isEmpty();
    }
}
