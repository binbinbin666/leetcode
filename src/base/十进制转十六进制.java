package base;
/**  
    * @Title: ʮ����תʮ������.java
    * @Package test
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��1��11��
    * @version V1.0  
    */

import java.util.Scanner;

public class ʮ����תʮ������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();	
		if (input==0) {
			System.out.println(0);
		}else {
			StringBuilder sb = new StringBuilder();
			while (input!=0) {
				String b = String.valueOf (input%16);
				switch (b) {
				case "10":
					b = "A";
					break;
				case "11":
					b = "B";
					break;
				case "12":
					b = "C";
					break;
				case "13":
					b = "D";
					break;
				case "14":
					b = "E";
					break;
				case "15":
					b = "F";
					break;

				default:
					break;
				}
				sb.append(b);
				input = input/16;
			}
			System.out.println(sb.reverse().toString());
		}
	}	
}
