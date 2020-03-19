package base;

import java.util.Scanner;

/**  
    * @Title: 查找整数.java
    * @Package base
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年1月12日
    * @version V1.0  
    */
public class 查找整数 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int[] a = new int[total];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int search = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (search==a[i]) {
				System.out.println(i+1);
				break;
			}
			if (i==a.length-1) {
				System.out.println(-1);
				break;
			}
		}
	}
}
