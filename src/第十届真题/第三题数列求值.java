package 第十届真题;
/**  
    * @Title: 第三题数列求值.java
    * @Package 第十届真题
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年2月1日
    * @version V1.0  
    */
public class 第三题数列求值 {

	//此题类似于斐波那契数列，但是所求20190324项的最后四位数字，要是单纯按照斐波那契数列的
	//思想求下去，别说long类型，BigInteger类型都存不了这么大的数，然后我们发现，所求
	//20190324项的最后四位数字（也就是变相的告诉我们运算过程只和每个数的后四位有关系）
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int c = 1;
		int d = 0;
		for (int i = 4; i <=20190324 ; i++) {
			d = (a + b + c)%10000;
			a = b;
			b = c;
			c = d;
		}
		System.out.println(d);
	}
}
