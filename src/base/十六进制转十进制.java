package base;

import java.util.Scanner;

/**  
    * @Title: ʮ������תʮ����.java
    * @Package base
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��1��13��
    * @version V1.0  
    */
public class ʮ������תʮ���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		//����һ
//		long num = Long.parseLong(input,16);
//		System.out.println(num);
		
		//������
		char[] c = input.toCharArray();
		long sum = 0;
		int n = c.length;
		for (int i = 0; i < n; i++) {
			if ((int)(c[i])-48 > 9) {
				if(c[i]=='A')
                    sum+=10*Math.pow(16,n-i-1);
                else if(c[i]=='B')
                    sum+=11*Math.pow(16,n-i-1);
                else if(c[i]=='C')
                    sum+=12*Math.pow(16,n-i-1);
                else if(c[i]=='D')
                    sum+=13*Math.pow(16,n-i-1);
                else if(c[i]=='E')
                    sum+=14*Math.pow(16,n-i-1);
                else if(c[i]=='F')
                    sum+=15*Math.pow(16,n-i-1);
			}else {
				sum += ((int)(c[i])-48)*Math.pow(16, n-i-1);
			}
		}
		System.out.println(sum);
	}
}
