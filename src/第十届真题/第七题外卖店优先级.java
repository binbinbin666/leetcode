package ��ʮ������;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**  
    * @Title: ���������������ȼ�.java
    * @Package ��ʮ������
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author �º��
    * @date 2020��2��9��
    * @version V1.0  
    */
public class ���������������ȼ� {

	public static void main(String[] args)  {
        Scanner reader=new Scanner(System.in);
        int res=0;    //ͳ�ƽ��
        int N=reader.nextInt();
        int M=reader.nextInt();
        int T=reader.nextInt();
        int level[]=new int[N+1];    //������ȼ�
        boolean judge[]=new boolean[N+1];    //����Ƿ��ڻ������,��ʼֵΪfalse
        List array[]=new ArrayList[T+1];    //���ÿ��ʱ�̶�Ӧ�ĵ���
        for(int i=0;i<=T;i++){
            array[i]=new ArrayList();
        }
        for(int i=1;i<=M;i++){
            int ts=reader.nextInt();
            int id=reader.nextInt();
            array[ts].add(id);
        }
       for(int i=1;i<=T;i++){    //ö��array
           for(int j=1;j<=N;j++){    //ö�ٵ���
               int flag=0;
               Object k=j;
               while(array[i].contains(k)){    //ʹ��while����Ϊ����һ��ʱ��һ�����̴��ڶ������
                   flag=1;
                   array[i].remove(k);
                   level[j]+=2;
                   if(level[j]>5){
                       judge[j]=true;
                       res++;
                   }
               }
               if(flag==0){    //��ʱ���޵���j�Ķ���
                   level[j]=level[j]==0?0:level[j]-1;
                   if(judge[j]){    //ԭ���ڻ������
                       if(level[j]<=3){    //���ȼ��½�
                           judge[j]=false;
                           res--;
                       }
                   }
               }
           }
       }
       System.out.println(res);
    }
}
