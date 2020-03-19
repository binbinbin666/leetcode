package base;
/**  
    * @Title: 十六进制转八进制.java
    * @Package base
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年1月14日
    * @version V1.0  
    */

import java.util.ArrayList;
import java.util.Scanner;

public class 十六进制转八进制 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		ArrayList<String> s = new ArrayList<String>();
		for (int i = 0; i < num; i++) {
			s.add(sc.nextLine());
		}
		for (int i = 0; i < s.size(); i++) {
			char[] a = s.get(i).toCharArray();
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < a.length; j++) {
				switch (a[j]) {
				case '0':
					sb.append("0000");
					break;
				case '1':
					sb.append("0001");
					break;
				case '2':
					sb.append("0010");
					break;
				case '3':
					sb.append("0011");
					break;
				case '4':
					sb.append("0100");
					break;
				case '5':
					sb.append("0101");
					break;
				case '6':
					sb.append("0110");
					break;
				case '7':
					sb.append("0111");
					break;
				case '8':
					sb.append("1000");
					break;
				case '9':
					sb.append("1001");
					break;
				case 'A':
					sb.append("1010");
					break;
				case 'B':
					sb.append("1011");
					break;
				case 'C':
					sb.append("1100");
					break;
				case 'D':
					sb.append("1101");
					break;
				case 'E':
					sb.append("1110");
					break;
				case 'F':
					sb.append("1111");
					break;
				default:
					break;
				}
			}
			while ((sb.length()%3)!=0) {
				sb.insert(0, "0");
			}
//			System.out.println(sb.toString() +"长度"+(sb.length()/3)+sb.length());
			StringBuilder sb1 = new StringBuilder();
			for (int k = 0; k < sb.length()/3 ; k++) {
				String ss = sb.substring(k*3,k*3+3);
				switch (ss) {
				case "000":
					sb1.append("0");
					break;
				case "001":
					sb1.append("1");
					break;
				case "010":
					sb1.append("2");
					break;
				case "011":
					sb1.append("3");
					break;
				case "100":
					sb1.append("4");
					break;
				case "101":
					sb1.append("5");
					break;
				case "110":
					sb1.append("6");
					break;
				case "111":
					sb1.append("7");
					break;
				default:
					break;
				}
			}
			if (sb1.substring(0, 1).equals("0")) {
				sb1.deleteCharAt(0);
			}
			System.out.println(sb1.toString());
		}
	}
}
