package leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**  
    * @Title: 两个数组的交集Ⅱ.java
    * @Package leetcode
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年3月18日
    * @version V1.0  
    */
public class 两个数组的交集Ⅱ {

	public int[] intersect(int[] nums1, int[] nums2) {
	    if (nums1.length > nums2.length) {
	        return intersect(nums2, nums1);
	    }
	    HashMap<Integer, Integer> m = new HashMap<>();
	    for (int n : nums1) {
	        m.put(n, m.getOrDefault(n, 0) + 1);
	    }
	    int k = 0;
	    for (int n : nums2) {
	        int cnt = m.getOrDefault(n, 0);
	        if (cnt > 0) {
	            nums1[k++] = n;
	            m.put(n, cnt - 1);
	        }
	    }
	    return Arrays.copyOfRange(nums1, 0, k);
	}
}
