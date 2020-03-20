package 第八届真题;

import java.util.Arrays;
import java.util.Scanner;

/**  
    * @Title: 第三题承压计算.java
    * @Package 第八届真题
    * @Description: TODO(类似杨辉三角)
    * @author 陈洪彬
    * @date 2020年2月16日
    * @version V1.0  
    */
public class 第三题承压计算 {

	static long[][] arr = new long[30][30];
	 
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    long factor=1;//2的 30次方
	    for (int i = 0; i < 30; ++i) {
	      factor<<=1;
	    }
	 
//	    输入数据放入二维数组
	    for (int i = 0; i < 29; ++i) {
	      for (int j = 0; j <= i; ++j) {
	        long a=sc.nextLong();
	        arr[i][j]=a*factor;//每个数据都乘以factor
	      }
	    }
	 
	//自上而下处理a[i][j]*factor（2的30次方）-->除以2，计入a[i+1][j]和a[i+1][j+1]
	//循环处理第1~N-1行
	    for (int i = 0; i < 29; ++i) {
	      for (int j = 0; j <=i ; ++j) {
	        long ha =arr[i][j]/2;
	        arr[i+1][j]+=ha;
	        arr[i+1][j+1]+=ha;
	      }
	    }
	//对a[N-1]这一行进行排序，查看最小值与factor之间的倍数关系，决定最大值是多少
	    Arrays.sort(arr[29]);
	    System.out.println(arr[29][0]);
	    System.out.println(arr[29][29]);
	    System.out.println(arr[29][29]/(arr[29][0]/2086458231));
	  }
}
