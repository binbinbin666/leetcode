package leetcode;

import java.util.ArrayList;
import java.util.List;

/**  
    * @Title: ɾ�����������е��ظ���.java
    * @Package leetcode
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��3��13��
    * @version V1.0  
    */
public class ɾ�����������е��ظ��� {

	
}
class Solution001 {
    public int removeDuplicates(int[] nums) {
    	List<Integer> l = new ArrayList<Integer>();
    	for (int i = 0; i < nums.length; i++) {
    		if (!l.contains(nums[i])) {				
    			l.add(nums[i]);
			}
		}
    	for (int i = 0; i < l.size(); i++) {
			nums[i] = l.get(i);
		}
    	return l.size();
    }
}