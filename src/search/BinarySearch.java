package search;

import org.junit.Test;

/**
 * @author 陈洪彬
 * @ClassName: BinarySearch
 * @Description: TODO(可以对有重复元素的有序数组进行二分查找且如果有重复元素返回第一次出现的下标)
 * @date 2020/3/20 22:31
 */
public class BinarySearch {
    public int binarySearch(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == value) {
                //此时mid以及是第一个元素或者前一个元素不等于value，说明这是重复元素中的第一个
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
