package leetcode;
/**  
    * @Title: ֻ����һ�ε�����.java
    * @Package leetcode
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��3��16��
    * @version V1.0  
    */
public class ֻ����һ�ε����� {
	public static void main(String[] args) {
		System.out.println(singleNumber(new int[] {4,1,2,1,2}));
	}

	 public static int singleNumber(int[] nums) {

		 boolean b = true;
		 int n = -1;
		 for (int i = 0; i < nums.length; i++) {
			 b = true;
			for (int j = 0; j < nums.length; j++) {
				if (i==j) {
					continue;
				}
				if (nums[i]==nums[j]) {
					b = false;
					break;
				}
			}
			if (b) {
				n = nums[i];
				break;
			}
		}
		 
		 return n;
	 }
}
