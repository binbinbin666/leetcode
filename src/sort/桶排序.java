package sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class 桶排序 {
    public List<Integer> bucketSort(List<Integer> array,int bucketSize){
        //合法性校验
        if (array == null||array.size()<2||bucketSize<1)
            return array;
        int max = array.get(0);
        int min = array.get(0);
        //找到最大最小值
        for (Integer a : array) {
            if (a < min)
                min = a;
            if (a>max)
                max = a;
        }
        //计算桶的个数
        int bucketCount = (max - min)/bucketSize + 1;
        List<List<Integer>> bucketList = new ArrayList<>();
        for (int i = 0; i < bucketCount; i++) {
            bucketList.add(new ArrayList<>());
        }
        //将待排序的集合添加到桶中
        for (Integer value : array) {
            int bucketIndex = (value - min) / bucketSize;
            bucketList.get(bucketIndex).add(value);
        }

        //对桶中的元素进行递归桶排序
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
