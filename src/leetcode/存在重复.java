package leetcode;

import java.util.HashSet;
import java.util.Set;

/**  
    * @Title: �����ظ�.java
    * @Package leetcode
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��3��16��
    * @version V1.0  
    */
public class �����ظ� {

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
