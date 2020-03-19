package base;
/**  
    * @Title: a01字串.java
    * @Package base
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年1月11日
    * @version V1.0  
    */
public class a01字串 {

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
