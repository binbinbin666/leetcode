package leetcode;

/**  
    * @Title: 队列最大值.java
    * @Package leetcode
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年3月7日
    * @version V1.0  
    */
public class 队列最大值07 {

	
}
class MaxQueue{
	int[] q = new int[20000];
	int begin = 0,end = 0;

    public MaxQueue() {
    }
    
    public int max_value() {
    	int max = -1;
    	for (int i = begin; i < end; i++) {
			max = Math.max(max, q[i]);
		}
    	return max;
    }
    
    public void push_back(int value) {
    	q[end++] = value;
    }
    
    public int pop_front() {
    	if (begin==end)
			return -1;
		return q[begin++];
    }
}
