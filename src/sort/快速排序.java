package sort;

import java.util.Scanner;

/**  
    * @Title: ��������.java
    * @Package sort
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��1��16��
    * @version V1.0  
    */
public class �������� {
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
		//���ÿ��Ž�������
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
			//�ݹ飬����
			quickSort(left,i-1);
			quickSort(i+1,right);
		}
}
