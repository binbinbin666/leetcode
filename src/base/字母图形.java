package base;

import java.util.Scanner;

/**  
    * @Title: ��ĸͼ��.java
    * @Package base
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��1��12��
    * @version V1.0  
    */
public class ��ĸͼ�� {
	
	public static void main(String[] args) {
		char[] c = new char[26];
		for(int a=0;a<26;a++) {
			c[a] = (char)(65+a);
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++) {
				if (i>j) {
					//���ǰ���ǲ�����ĸ
					System.out.print(c[i-j]);
				}else {
					//�����ǲ�����ĸ
					System.out.print(c[j-i]);
				}
			}
			System.out.println();
		}
	}
}
