package sort;

import java.util.Scanner;

/**  
    * @Title: 选择排序.java
    * @Package sort
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年3月16日
    * @version V1.0  
    */
public class 选择排序 {
	public static void main(String[] args) {
		int[] a = null;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		a = new int[num];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		selectionSort(a);
		//打印输出
		for (int i = 0; i < a.length; i++) {
			if (i!=a.length-1) {
				System.out.print(a[i]+" ");
			}else {
				System.out.print(a[i]);
			}
		}
	}

	//选择排序
	public static void selectionSort(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			int minIndex = i;
			for (int j = i+1; j < len; j++) {
				if (arr[j]<arr[minIndex]) {
					minIndex = j;
				}
			}
			int current = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = current;
		}
	}
}
