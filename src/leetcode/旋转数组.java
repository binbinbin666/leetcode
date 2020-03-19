package leetcode;
/**  
    * @Title: 旋转数组.java
    * @Package leetcode
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年3月13日
    * @version V1.0  
    */
public class 旋转数组 {

}
class Solution003 {
    public void rotate(int[] nums, int k) {
    	int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
			a[(i+k)%nums.length] = nums[i];
		}
        for (int i = 0; i < a.length; i++) {
			nums[i] = a[i];
		}
    }
}
