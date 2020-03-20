package sort;

import java.util.Scanner;

/**  
    * @Title: 快速排序.java
    * @Package sort
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年1月16日
    * @version V1.0  
    */
public class 快速排序 {
	static int[] a = null;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		a = new int[num];
//		for (int i = 0; i < a.length; i++) {
//			a[i] = sc.nextInt();
//		}
		
		a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
			if (a[i]==0) {
				break;
			}
		}
		//调用快排进行排序
		quickSort(0, a.length-1);
		for (int i = 0; i < a.length; i++) {
			if (a[i]!=0) {
				if (i!=a.length-1) {
					System.out.print(a[i]+" ");
				}else {
					System.out.print(a[i]);
				}
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
			//递归，分治
			quickSort(left,i-1);
			quickSort(i+1,right);
		}
}
