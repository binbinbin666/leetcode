package �ڰ˽�����;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**  
    * @Title: ��������������.java
    * @Package �ڰ˽�����
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��2��21��
    * @version V1.0  
    */
public class �������������� {
	 
	  static boolean isLeap(int year) {
	    return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	  }
	 
	 
	  static String f(int a, int b, int c) {
	    if (a >= 0 && a <= 59)a += 2000;
	    else if (a >= 60 && a <= 99)a += 1900;
	    else return "";
	 
	    if (b < 1 || b > 12)return "";
	    if (c < 1 || c > 31)return "";
	 
	    boolean _isLeap = isLeap(a);
	    switch (b) {//����У��
	      case 2:
	        if (_isLeap && c > 29)return "";
	        if (!_isLeap && c > 28)return "";
	        break;
	      case 4:
	        if (c > 30)return "";
	        break;
	      case 6:
	        if (c > 30)return "";
	        break;
	      case 9:
	        if (c > 30)return "";
	        break;
	      case 11:
	        if (c > 30)return "";
	        break;
	      default:
	        break;
	    }
	    String _a=a+"", _b=b+"", _c=c+"";
	 
	    if (_b.length() == 1)_b = "0" + _b;
	    if (_c.length() == 1)_c = "0" + _c;
	 
	    return _a + "-" + _b + "-" + _c;
	  }
	 
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String in=sc.nextLine();
	 
	    int a = 0, b = 0, c = 0;
	    //�ַ�����ASCII�������Ե�
	    //c1-��0����ʾ��c1��ASCII��ֵ��ȥ0��ASCII��ֵ��
	    //'0'��ASCII��ֵ��48��'1'��49��'1'-'0' = 49-48=1
	    a = (in.charAt(0) - '0') * 10 + (in.charAt(1)- '0');
	    b = (in.charAt(3)- '0') * 10 + (in.charAt(4) - '0');
	    c = (in.charAt(6) - '0') * 10 + (in.charAt(7) - '0');
	    String case1 = f(a, b, c);
	    String case2 = f(c, a, b);
	    String case3 = f(c, b, a);
	/*TreeSet��ȥ�غ�������*/
	    Set<String> ans=new TreeSet<String>();
	    if (case1 != "")ans.add(case1);
	    if (case2 != "")ans.add(case2);
	    if (case3 != "")ans.add(case3);
	    for (String s:ans) {
	      System.out.println(s);
	    }
	  }
	}
