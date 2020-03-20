package 第十届真题;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**  
    * @Title: 第七题外卖店优先级.java
    * @Package 第十届真题
    * @Description: TODO(用一句话描述该文件做什么)
    * @author 陈洪彬
    * @date 2020年2月9日
    * @version V1.0  
    */
public class 第七题外卖店优先级 {

	public static void main(String[] args)  {
        Scanner reader=new Scanner(System.in);
        int res=0;    //统计结果
        int N=reader.nextInt();
        int M=reader.nextInt();
        int T=reader.nextInt();
        int level[]=new int[N+1];    //存放优先级
        boolean judge[]=new boolean[N+1];    //存放是否在缓存队列,初始值为false
        List array[]=new ArrayList[T+1];    //存放每个时刻对应的店铺
        for(int i=0;i<=T;i++){
            array[i]=new ArrayList();
        }
        for(int i=1;i<=M;i++){
            int ts=reader.nextInt();
            int id=reader.nextInt();
            array[ts].add(id);
        }
       for(int i=1;i<=T;i++){    //枚举array
           for(int j=1;j<=N;j++){    //枚举店铺
               int flag=0;
               Object k=j;
               while(array[i].contains(k)){    //使用while是因为存在一个时刻一个店铺存在多个订单
                   flag=1;
                   array[i].remove(k);
                   level[j]+=2;
                   if(level[j]>5){
                       judge[j]=true;
                       res++;
                   }
               }
               if(flag==0){    //此时刻无店铺j的订单
                   level[j]=level[j]==0?0:level[j]-1;
                   if(judge[j]){    //原来在缓存队列
                       if(level[j]<=3){    //优先级下降
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
