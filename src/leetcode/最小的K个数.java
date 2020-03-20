package leetcode;

import java.util.Arrays;

/**
 * @author 陈洪彬
 * @ClassName: 最小的K个数
 * @Description: TODO(用一句话描述该文件做什么)
 * @date 2020/3/20 10:47
 */
public class 最小的K个数 {
    //方法一利用库函数排序后直接取前K位数字，但是效率不高
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] a = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            a[i] = arr[i];
        }
        return a;
    }


    /**方法二，利用快排思想
     * 快排切分时间复杂度分析： 因为我们是要找下标为k的元素，第一次切分的时候需要遍历整个数组(0 ~ n)找
     * 到了下标是j的元素，假如k比j小的话，那么我们下次切分只要遍历数组(0~k-1)的元素就行啦，
     * 反之如果k比j大的话，那下次切分只要遍历数组(k+1～n)的元素就行啦，总
     * 之可以看作每次调用partition遍历的元素数目都是上一次遍历的1/2，
     * 因此时间复杂度是N + N/2 + N/4 + ... + N/N = 2N, 因此时间复杂度是O(N)。
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers1(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        // 最后一个参数表示我们要找的是下标为k-1的数
        return quickSearch(arr, 0, arr.length - 1, k - 1);
    }

    private int[] quickSearch(int[] nums, int lo, int hi, int k) {
        // 每快排切分1次，找到排序后下标为j的元素，如果j恰好等于k就返回j以及j左边所有的数；
        int j = partition(nums, lo, hi);
        if (j == k) {
            return Arrays.copyOf(nums, j + 1);
        }
        // 否则根据下标j与k的大小关系来决定继续切分左段还是右段。
        return j > k? quickSearch(nums, lo, j - 1, k): quickSearch(nums, j + 1, hi, k);
    }

    // 快排切分，返回下标j，使得比nums[j]小的数都在j的左边，比nums[j]大的数都在j的右边。
    private int partition(int[] nums, int lo, int hi) {
        int v = nums[lo];
        int i = lo, j = hi + 1;
        while (true) {
            while (++i <= hi && nums[i] < v);
            while (--j >= lo && nums[j] > v);
            if (i >= j) {
                break;
            }
            int t = nums[j];
            nums[j] = nums[i];
            nums[i] = t;
        }
        nums[lo] = nums[j];
        nums[j] = v;
        return j;
    }
}
