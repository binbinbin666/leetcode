package sort;

import java.util.Scanner;

/**  
    * @Title: ð������.java
    * @Package sort
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��1��16��
    * @version V1.0  
    */
public class ð������ {
	static int[] a = null;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		a = new int[num];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		//ð������
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
		//��ӡ���
		for (int i = 0; i < a.length; i++) {
			if (i!=a.length-1) {
				System.out.print(a[i]+" ");
			}else {
				System.out.print(a[i]);
			}
		}
	}
}
