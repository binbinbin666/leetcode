package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**  
    * @Title: �ö���ʵ��ջ01.java
    * @Package leetcode
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��3��3��
    * @version V1.0  
    */
public class �ö���ʵ��ջ01 {

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
