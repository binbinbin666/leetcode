package leetcode;
/**  
    * @Title: 整数反转.java
    * @Package leetcode
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年3月17日
    * @version V1.0  
    */
public class 整数反转 {

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
