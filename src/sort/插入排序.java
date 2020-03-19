package sort;
/**  
    * @Title: 插入排序.java
    * @Package sort
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年3月16日
    * @version V1.0  
    */
public class 插入排序 {

	public void insertionSort(int[] arr) {
		int len = arr.length;
		if (len<=1) {
			return;
		}
		for (int i = 1; i < len; i++) {
			//取出当前序列中未排序区间的元素，即当前要和已排序区间比较的元素
			int current = arr[i];
			//在有序区间从后往前扫描指针
			int preIndex = i -1;
			while (preIndex >= 0 && arr[preIndex]>current) {
				arr[preIndex+1] = arr[preIndex];
				preIndex--;
			}
			arr[preIndex+1] = current;
		}
	}
}
