package 第七届真题;
/**  
    * @Title: 第四题分小组.java
    * @Package 第七届真题
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年3月2日
    * @version V1.0  
    */
public class 第四题分小组 {

	public static String remain(int[] a){
		String s = "";
		for(int i=0; i<a.length; i++){
			if(a[i] == 0) s += (char)(i+'A');
		}
		return s;
	}
	
}

