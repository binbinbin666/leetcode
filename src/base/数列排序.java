package base;

import java.util.Scanner;

/**  
    * @Title: ��������.java
    * @Package base
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��1��16��
    * @version V1.0  
    */
public class �������� {

	static int[] a = null;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		a = new int[num];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
//		//ð������
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
	//��������
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
