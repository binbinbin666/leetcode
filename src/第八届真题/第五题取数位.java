package �ڰ˽�����;
/**  
    * @Title: ������ȡ��λ.java
    * @Package �ڰ˽�����
    * @Description: TODO(�����)
    * @author �º��
    * @date 2020��2��18��
    * @version V1.0  
    */
public class ������ȡ��λ {

	static int len(int x) {
		if (x<10) {
			return 1;
		}
		return len(x/10)+1;
	}
	static int f(int x,int k) {
		if(len(x)-k==0) return x%10;
		//return ______________________;  //���
		return f(x/10, k); //��Ϊ:f(x/10,k)
	}
	
	public static void main(String[] args) {
		int x = 23513;
		System.out.println(f(x,2));
	}
}
