package leetcode;

import java.util.Arrays;

/**
 * @author �º��
 * @ClassName: ��С��K����
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @date 2020/3/20 10:47
 */
public class ��С��K���� {
    //����һ���ÿ⺯�������ֱ��ȡǰKλ���֣�����Ч�ʲ���
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] a = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            a[i] = arr[i];
        }
        return a;
    }


    /**�����������ÿ���˼��
     * �����з�ʱ�临�Ӷȷ����� ��Ϊ������Ҫ���±�Ϊk��Ԫ�أ���һ���зֵ�ʱ����Ҫ������������(0 ~ n)��
     * �����±���j��Ԫ�أ�����k��jС�Ļ�����ô�����´��з�ֻҪ��������(0~k-1)��Ԫ�ؾ�������
     * ��֮���k��j��Ļ������´��з�ֻҪ��������(k+1��n)��Ԫ�ؾ���������
     * ֮���Կ���ÿ�ε���partition������Ԫ����Ŀ������һ�α�����1/2��
     * ���ʱ�临�Ӷ���N + N/2 + N/4 + ... + N/N = 2N, ���ʱ�临�Ӷ���O(N)��
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers1(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        // ���һ��������ʾ����Ҫ�ҵ����±�Ϊk-1����
        return quickSearch(arr, 0, arr.length - 1, k - 1);
    }

    private int[] quickSearch(int[] nums, int lo, int hi, int k) {
        // ÿ�����з�1�Σ��ҵ�������±�Ϊj��Ԫ�أ����jǡ�õ���k�ͷ���j�Լ�j������е�����
        int j = partition(nums, lo, hi);
        if (j == k) {
            return Arrays.copyOf(nums, j + 1);
        }
        // ��������±�j��k�Ĵ�С��ϵ�����������з���λ����ҶΡ�
        return j > k? quickSearch(nums, lo, j - 1, k): quickSearch(nums, j + 1, hi, k);
    }

    // �����з֣������±�j��ʹ�ñ�nums[j]С��������j����ߣ���nums[j]���������j���ұߡ�
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
