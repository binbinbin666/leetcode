package 第八届真题;
/**  
    * @Title: 第五题取数位.java
    * @Package 第八届真题
    * @Description: TODO(填空题)
    * @author 陈洪彬
    * @date 2020年2月18日
    * @version V1.0  
    */
public class 第五题取数位 {

	static int len(int x) {
		if (x<10) {
			return 1;
		}
		return len(x/10)+1;
	}
	static int f(int x,int k) {
		if(len(x)-k==0) return x%10;
		//return ______________________;  //填空
		return f(x/10, k); //答案为:f(x/10,k)
	}
	
	public static void main(String[] args) {
		int x = 23513;
		System.out.println(f(x,2));
	}
}
