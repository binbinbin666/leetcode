package leetcode;
/**  
    * @Title: 矩形重叠18.java
    * @Package leetcode
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年3月18日
    * @version V1.0  
    */
public class 矩形重叠18 {
	public static void main(String[] args) {
		System.out.println(true&&false);
	}
	public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
	    boolean x_overlap = !(rec1[2] <= rec2[0] || rec2[2] <= rec1[0]);
	    boolean y_overlap = !(rec1[3] <= rec2[1] || rec2[3] <= rec1[1]);
	    return x_overlap && y_overlap;
	}
}
