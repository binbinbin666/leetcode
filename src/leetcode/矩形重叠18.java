package leetcode;
/**  
    * @Title: �����ص�18.java
    * @Package leetcode
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��3��18��
    * @version V1.0  
    */
public class �����ص�18 {
	public static void main(String[] args) {
		System.out.println(true&&false);
	}
	public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
	    boolean x_overlap = !(rec1[2] <= rec2[0] || rec2[2] <= rec1[0]);
	    boolean y_overlap = !(rec1[3] <= rec2[1] || rec2[3] <= rec1[1]);
	    return x_overlap && y_overlap;
	}
}
