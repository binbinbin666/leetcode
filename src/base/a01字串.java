package base;
/**  
    * @Title: a01�ִ�.java
    * @Package base
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��1��11��
    * @version V1.0  
    */
public class a01�ִ� {

	 public static void main(String[] args) {  
	        String str = "";  
	        int len;  
	        for(int i = 0; i <= 31; i++){  
	            str = Integer.toBinaryString(i);
	            len = str.length();  
	            while(len <= 4){  
	                System.out.print(0);  
	                len++;  
	            }  
	            System.out.println(str);  
	        }  
	    }  
}
