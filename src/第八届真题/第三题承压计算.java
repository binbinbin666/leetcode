package �ڰ˽�����;

import java.util.Arrays;
import java.util.Scanner;

/**  
    * @Title: �������ѹ����.java
    * @Package �ڰ˽�����
    * @Description: TODO(�����������)
    * @author �º��
    * @date 2020��2��16��
    * @version V1.0  
    */
public class �������ѹ���� {

	static long[][] arr = new long[30][30];
	 
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    long factor=1;//2�� 30�η�
	    for (int i = 0; i < 30; ++i) {
	      factor<<=1;
	    }
	 
//	    �������ݷ����ά����
	    for (int i = 0; i < 29; ++i) {
	      for (int j = 0; j <= i; ++j) {
	        long a=sc.nextLong();
	        arr[i][j]=a*factor;//ÿ�����ݶ�����factor
	      }
	    }
	 
	//���϶��´���a[i][j]*factor��2��30�η���-->����2������a[i+1][j]��a[i+1][j+1]
	//ѭ�������1~N-1��
	    for (int i = 0; i < 29; ++i) {
	      for (int j = 0; j <=i ; ++j) {
	        long ha =arr[i][j]/2;
	        arr[i+1][j]+=ha;
	        arr[i+1][j+1]+=ha;
	      }
	    }
	//��a[N-1]��һ�н������򣬲鿴��Сֵ��factor֮��ı�����ϵ���������ֵ�Ƕ���
	    Arrays.sort(arr[29]);
	    System.out.println(arr[29][0]);
	    System.out.println(arr[29][29]);
	    System.out.println(arr[29][29]/(arr[29][0]/2086458231));
	  }
}
