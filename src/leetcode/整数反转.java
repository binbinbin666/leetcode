package leetcode;
/**  
    * @Title: ������ת.java
    * @Package leetcode
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��3��17��
    * @version V1.0  
    */
public class ������ת {

	public static void main(String[] args) {
//		System.out.println(reverse(-1254));
		System.out.println(-11%10);
	}
	public static int reverse(int x) {
		StringBuilder sb = new StringBuilder();
		if (x>=0) {
			sb.append(x%10);
			x = x/10;
			while (x/10>0) {
				sb.append(x%10);
				x = x/10;
			}
			if (x!=0) {
				sb.append(x);
			}
		}else {
			sb.append("-");
			x = -x;
			sb.append(x%10);
			x = x/10;
			while (x/10>0) {
				sb.append(x%10);
				x = x/10;
			}
			if (x!=0) {
				sb.append(x);
			}
		}
		try {
			return Integer.parseInt(sb.toString());
		} catch (Exception e) {
			return 0;
		}
		
	}
}
