package search;

import org.junit.Test;

/**
 * @author �º��
 * @ClassName: BinarySearch
 * @Description: TODO(���Զ����ظ�Ԫ�ص�����������ж��ֲ�����������ظ�Ԫ�ط��ص�һ�γ��ֵ��±�)
 * @date 2020/3/20 22:31
 */
public class BinarySearch {
    public int binarySearch(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == value) {
                //��ʱmid�Լ��ǵ�һ��Ԫ�ػ���ǰһ��Ԫ�ز�����value��˵�������ظ�Ԫ���еĵ�һ��
                if (mid==0||arr[mid-1]!=value) {
                    return mid;
                }else {
                    high = mid - 1;
                }
            } else if (arr[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    @Test
    public void test() {
        int[] a = new int[]{0 ,0, 1, 3, 3, 3, 3, 6, 6, 8, 9};
        System.out.println(binarySearch(a, 3));
    }
}
