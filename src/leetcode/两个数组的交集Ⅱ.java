package leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**  
    * @Title: ��������Ľ�����.java
    * @Package leetcode
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��3��18��
    * @version V1.0  
    */
public class ��������Ľ����� {

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
