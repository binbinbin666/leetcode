package leetcode;

/**
 * @author �º��
 * @ClassName: ʹ����Ψһ����С����22
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @date 2020/3/22 22:08
 */
public class ʹ����Ψһ����С����22 {

    public int minIncrementForUnique(int[] A) {
        // counter����ͳ��ÿ�����ֵĸ�����
        //������Ϊ�˷�ֹ�������counter��ʱ��ÿ�ζ��ߵ�40000������������һ��max���������������Ҳ�У��ٶ�������minҲ�У�
        int[] counter = new int[40001];
        int max = -1;
        for (int num: A) {
            counter[num]++;
            max = Math.max(max, num);
        }

        // ����counter���飬����ǰ���ֵĸ���cnt����1������ֻ����1����������cnt-1������
        int move = 0;
        for (int num = 0; num <= max; num++) {
            if (counter[num] > 1) {
                int d = counter[num] - 1;
                move += d;
                counter[num + 1] += d;
            }
        }
        // ���, counter[max+1]����ܻ��д�counter[max]���ƹ����ģ�counter[max+1]��ֻ����1����������d�����ơ�
        // �� max+1 = x����ô�����d��������[x+1,x+2,x+3,...,x+d],
        // ��˲���������[1,2,3,...,d],����͹�ʽ��͡�
        int d = counter[max + 1] - 1;
        move += (1 + d) * d / 2;
        return move;
    }
}
