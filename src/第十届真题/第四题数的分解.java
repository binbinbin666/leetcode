package ��ʮ������;

/**  
    * @Title: ���������ķֽ�.java
    * @Package ��ʮ������
    * @Description: TODO(���� D: ���ķֽ� ----- �𰸣� 40785

����������������

�������� 2019 �ֽ�� 3 ��������ͬ��������֮�ͣ�����Ҫ��ÿ�������������� ������ 2 �� 4��һ���ж����ֲ�ͬ�ķֽⷽ����

������ע�⽻�� 3 ��������˳����Ϊͬһ�ַ��������� 1000+1001+18 �� 1001+1000+18 ����Ϊͬһ�֡�


���������ύ��
����������һ�������յ��⣬��ֻ��Ҫ���������ύ���ɡ�����Ľ��Ϊһ �����������ύ��ʱֻ��д�����������д��������ݽ��޷��÷֡�)
    * @author �º��
    * @date 2020��2��1��
    * @version V1.0  
    */
public class ���������ķֽ� {
    public static void main(String[] args) {
        int n = 2019;
        int num = 0;
        for (int i = 1; i < n; i++) {
            if (String.valueOf(i).indexOf("2") != -1 || String.valueOf(i).indexOf("4") != -1)
                continue;
            for (int j = i + 1; j < n; j++) {
                if (String.valueOf(j).indexOf("2") != -1 || String.valueOf(j).indexOf("4") != -1)
                    continue;
                int k = n - i - j;
                if (i == k || j == k || i == j)
                    continue;
                if (k > 0 && String.valueOf(k).indexOf("2") == -1 && String.valueOf(k).indexOf("4") == -1) {
                    num++;
                }
            }
        }
        System.out.println(num / 3);        
    }
}