package leetcode;
/**  
    * @Title: ������ֳɺ���ȵ���������11.java
    * @Package leetcode
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��3��11��
    * @version V1.0  
    */
public class ������ֳɺ���ȵ���������11 {

}
class Solution11 {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for(int i : A){
            sum += i;
        }
        if(sum%3 != 0){
            // �ܺͲ���3�ı�����ֱ�ӷ���false
            return false;
        }

        // ʹ��˫ָ��,��������ͷ��ʼһ���ң���Լʱ��
        int left = 0;
        int leftSum = A[left];
        int right = A.length - 1;
        int rightSum = A[right];

        // ʹ��left + 1 < right ��ԭ�򣬷�ֹֻ�ܽ�����ֳ���������
        // ���磺[1,-1,1,-1]��ʹ��left < right��Ϊ�ж������ͻ����
        while(left + 1 < right){
            if(leftSum == sum/3 && rightSum == sum/3){
                // �������߶����� sum/3 ���м�Ҳһ������
                return true;
            }
            if(leftSum != sum/3){
                // left = 0�����˳�ֵ��Ӧ����left++����leftSum += A[left];
                leftSum += A[++left];
            }
            if(rightSum != sum/3){
                // right = A.length - 1 �����˳�ֵ��Ӧ����right--����rightSum += A[right];
                rightSum += A[--right];
            }
        }
        return false;  
    }
}