package 第九届真题;
/**  
    * @Title: 第三题复数幂.java
    * @Package 第九届真题
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年2月11日
    * @version V1.0  
    */
import java.io.*;
import java.math.BigInteger;
 
public class 第三题复数幂 {
 
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream ps=new PrintStream(new FileOutputStream("work.txt"));  
	        System.setOut(ps);  //文件输出
		int n=123456;
		BigInteger a=new BigInteger("2");
		BigInteger b=new BigInteger("3");
		BigInteger a1=new BigInteger("2");
		BigInteger b1=new BigInteger("3");
		for(int i=1;i<n;i++) {
			BigInteger ta=a;
			a=a.multiply(a1).subtract(b.multiply(b1));//a=a*a1-b*b1;
			b=ta.multiply(b1).add(b.multiply(a1));//b=a*b1+b*a1
		}
		System.out.println(a+(b.compareTo(BigInteger.ZERO)>0?"+":"")+b+"i");
	}
}
