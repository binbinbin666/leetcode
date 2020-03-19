package leetcode;
/**  
    * @Title: 只出现一次的数字.java
    * @Package leetcode
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年3月16日
    * @version V1.0  
    */
public class 只出现一次的数字 {
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
