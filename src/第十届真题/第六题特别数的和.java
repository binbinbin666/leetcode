package 第十届真题;

import java.util.Scanner;

/**  
    * @Title: 第六题特别数的和.java
    * @Package 第十届真题
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年2月4日
    * @version V1.0  
    */
public class 第六题特别数的和 {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			//第一种方法
			String s = String.valueOf(i);
			if (s.indexOf("2")!=-1||s.indexOf("0")!=-1||s.indexOf("1")!=-1||s.indexOf("9")!=-1) {
				sum += i;
			}
			
			//第二种方法
//			char[] c = String.valueOf(i).toCharArray();
//			for (int j = 0; j < c.length; j++) {
//				if (c[j]=='2'||c[j]=='0'||c[j]=='1'||c[j]=='9') {
//					sum +=i;
//					break;
//				}
//			}
			
		}
		System.out.println(sum);
	}
}
