package leetcode;

import java.util.HashMap;
import java.util.Map;

/**  
    * @Title: 多数元素13.java
    * @Package leetcode
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年3月13日
    * @version V1.0  
    */
public class 多数元素13 {

}
class Solution13 {
    public int majorityElement(int[] nums) {
    	Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
    	for (int i = 0; i < nums.length; i++) {
    		if (!counts.containsKey(nums[i])) {
                counts.put(nums[i], 1);
            }
            else {
                counts.put(nums[i], counts.get(nums[i])+1);
            }
		}
    	long limit = nums.length >> 1;
    	for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
    		if (entry.getValue() > limit)
                return entry.getKey();
    	}
    	return -1;
    }
}