package leetcode;
/**  
    * @Title: ��ת����.java
    * @Package leetcode
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��3��13��
    * @version V1.0  
    */
public class ��ת���� {

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
