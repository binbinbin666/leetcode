package ���߽�����;
/**  
    * @Title: �������С��.java
    * @Package ���߽�����
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��3��2��
    * @version V1.0  
    */
public class �������С�� {

	public static String remain(int[] a){
		String s = "";
		for(int i=0; i<a.length; i++){
			if(a[i] == 0) s += (char)(i+'A');
		}
		return s;
	}
	
}

