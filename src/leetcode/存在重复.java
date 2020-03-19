package leetcode;

import java.util.HashSet;
import java.util.Set;

/**  
    * @Title: 存在重复.java
    * @Package leetcode
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年3月16日
    * @version V1.0  
    */
public class 存在重复 {

	 public boolean containsDuplicate(int[] nums) {
		 Set<Integer> s = new HashSet<Integer>();
		 boolean b = false;
		 for (int i = 0; i < nums.length; i++) {
			if (!s.add(nums[i])) {
				b = true;
				break;
			}
		}
		 return b;
	}
}
