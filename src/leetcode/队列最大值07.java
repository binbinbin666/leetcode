package leetcode;

/**  
    * @Title: �������ֵ.java
    * @Package leetcode
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��3��7��
    * @version V1.0  
    */
public class �������ֵ07 {

	
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
