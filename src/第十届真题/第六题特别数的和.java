package ��ʮ������;

import java.util.Scanner;

/**  
    * @Title: �������ر����ĺ�.java
    * @Package ��ʮ������
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��2��4��
    * @version V1.0  
    */
public class �������ر����ĺ� {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			//��һ�ַ���
			String s = String.valueOf(i);
			if (s.indexOf("2")!=-1||s.indexOf("0")!=-1||s.indexOf("1")!=-1||s.indexOf("9")!=-1) {
				sum += i;
			}
			
			//�ڶ��ַ���
//			char[] c = String.valueOf(i).toCharArray();
//			for (int j = 0; j < c.length; j++) {
//				if (c[j]=='2'||c[j]=='0'||c[j]=='1'||c[j]=='9') {
//					sum +=i;
//					break;
//				}
//			}
			
		}
		System.out.println(sum);
	}
}
