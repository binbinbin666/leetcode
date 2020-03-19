package leetcode;

import java.util.ArrayList;
import java.util.List;

/**  
    * @Title: 删除排序数组中的重复项.java
    * @Package leetcode
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年3月13日
    * @version V1.0  
    */
public class 删除排序数组中的重复项 {

	
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