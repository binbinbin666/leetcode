package sort;

import java.util.Scanner;

/**  
    * @Title: 冒泡排序.java
    * @Package sort
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年1月16日
    * @version V1.0  
    */
public class 冒泡排序 {
	static int[] a = null;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		a = new int[num];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		//冒泡排序
		for (int i = 0; i < a.length-1; i++) {
			boolean b = true;
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					b = false;
				}
			}
			if (b) {
				break;
			}
		}
		//打印输出
		for (int i = 0; i < a.length; i++) {
			if (i!=a.length-1) {
				System.out.print(a[i]+" ");
			}else {
				System.out.print(a[i]);
			}
		}
	}
}
