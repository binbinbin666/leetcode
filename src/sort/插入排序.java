package sort;
/**  
    * @Title: ��������.java
    * @Package sort
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��3��16��
    * @version V1.0  
    */
public class �������� {

	public void insertionSort(int[] arr) {
		int len = arr.length;
		if (len<=1) {
			return;
		}
		for (int i = 1; i < len; i++) {
			//ȡ����ǰ������δ���������Ԫ�أ�����ǰҪ������������Ƚϵ�Ԫ��
			int current = arr[i];
			//����������Ӻ���ǰɨ��ָ��
			int preIndex = i -1;
			while (preIndex >= 0 && arr[preIndex]>current) {
				arr[preIndex+1] = arr[preIndex];
				preIndex--;
			}
			arr[preIndex+1] = current;
		}
	}
}
