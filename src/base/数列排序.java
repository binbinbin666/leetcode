package base;

import java.util.Scanner;

/**  
    * @Title: 数列排序.java
    * @Package base
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年1月16日
    * @version V1.0  
    */
public class 数列排序 {

	static int[] a = null;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		a = new int[num];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
//		//冒泡排序
//		for (int i = 0; i < a.length-1; i++) {
//			for (int j = 0; j < a.length-1-i; j++) {
//				if (a[j]>a[j+1]) {
//					int temp = a[j];
//					a[j] = a[j+1];
//					a[j+1] = temp;
//				}
//			}
//		}
		quickSort(0, a.length-1);
		for (int i = 0; i < a.length; i++) {
			if (i!=a.length-1) {
				System.out.print(a[i]+" ");
			}else {
				System.out.print(a[i]);
			}
		}
	}
	//快速排序
	public static void quickSort(int left,int right) {
		if (left>right) {
			return;
		}
		int temp = a[left];
		int i = left;
		int j = right;
		while (i!=j) {
			while (a[j]>=temp && i<j) {
				j--;
			}
			while (a[i]<=temp && i<j) {
				i++;
			}
			if (i<j) {
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
		a[left] = a[i];
		a[i] = temp;
		quickSort(left,i-1);
		quickSort(i+1,right);
	}
}
