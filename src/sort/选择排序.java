package sort;

import java.util.Scanner;

/**  
    * @Title: ѡ������.java
    * @Package sort
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��3��16��
    * @version V1.0  
    */
public class ѡ������ {
	public static void main(String[] args) {
		int[] a = null;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		a = new int[num];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		selectionSort(a);
		//��ӡ���
		for (int i = 0; i < a.length; i++) {
			if (i!=a.length-1) {
				System.out.print(a[i]+" ");
			}else {
				System.out.print(a[i]);
			}
		}
	}

	//ѡ������
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
