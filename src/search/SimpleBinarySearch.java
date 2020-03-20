package search;

import org.junit.Test;

/**
 * @author 陈洪彬
 * @ClassName: SimpleBinarySearch
 * @Description: TODO(简单二分查找，数组是有序且不存在重复元素)
 * @date 2020/3/20 21:45
 */
public class SimpleBinarySearch {
    /**
     * 循环实现简单二分查找
     *
     * @param arr
     * @param value
     * @return
     */
    public int binarySearch(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    /**
     * 递归实现简单二分查找
     *
     * @param arr
     * @param value
     * @param low
     * @param high
     * @return
     */
    public int recursionBinarySearch(int[] arr, int value, int low, int high) {

        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == value) {
            return mid;
        } else if (arr[mid] > value) {
            return recursionBinarySearch(arr,value,low,mid-1);
        } else {
            return recursionBinarySearch(arr,value,mid+1,high);
        }
    }

    @Test
    public void test() {
        int[] a = new int[]{0, 1, 3, 6, 8, 9};
        System.out.println(binarySearch(a, 1));
        System.out.println(recursionBinarySearch(a, 1,0,a.length));
    }
}
