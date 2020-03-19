package sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Ͱ���� {
    public List<Integer> bucketSort(List<Integer> array,int bucketSize){
        //�Ϸ���У��
        if (array == null||array.size()<2||bucketSize<1)
            return array;
        int max = array.get(0);
        int min = array.get(0);
        //�ҵ������Сֵ
        for (Integer a : array) {
            if (a < min)
                min = a;
            if (a>max)
                max = a;
        }
        //����Ͱ�ĸ���
        int bucketCount = (max - min)/bucketSize + 1;
        List<List<Integer>> bucketList = new ArrayList<>();
        for (int i = 0; i < bucketCount; i++) {
            bucketList.add(new ArrayList<>());
        }
        //��������ļ�����ӵ�Ͱ��
        for (Integer value : array) {
            int bucketIndex = (value - min) / bucketSize;
            bucketList.get(bucketIndex).add(value);
        }

        //��Ͱ�е�Ԫ�ؽ��еݹ�Ͱ����
        List<Integer> resultList = new ArrayList<>();
        for (List<Integer> everyList : bucketList) {
            if (everyList.size() > 0) {
                if (bucketCount == 1)
                    bucketSize--;
                List<Integer> temp = bucketSort(everyList, bucketSize);
                resultList.addAll(temp);
            }

        }
        return resultList;
    }

    @Test
    public void test(){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(2);
        integers.add(2);
        integers.add(6);
        integers.add(9);
        integers.add(0);
        integers.add(3);
        integers.add(4);
        System.out.println(integers);
        List<Integer> list = bucketSort(integers, 2);
        System.out.println(list);
    }
}
