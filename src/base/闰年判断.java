package base;

import java.util.Scanner;

/**  
    * @Title: �����ж�.java
    * @Package test
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��1��11��
    * @version V1.0  
    */
public class �����ж� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		if (s<=2050&&s>=1990) {
			if (s%4==0&&s%100!=0||s%400==0) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
		scanner.close();
	}
}
