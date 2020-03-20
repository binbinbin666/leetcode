package dfsAndbfs;

import java.util.Scanner;

/**
 * @author 陈洪彬
 * @ClassName: 全排列
 * @Description: TODO(用一句话描述该文件做什么)
 * @date 2020/3/20 9:32
 */
public class 全排列 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dfs(0,n);
        int sum = jieCheng(n);
        System.out.println(ans*sum);
    }
    public static int jieCheng(int n){
        if (n==1){
            return 1;
        }else {
            return n*jieCheng(n-1);
        }
    }

    static int[] a = new int[] {1,2,3,4,5,6,7,8,9};
    static int ans = 0;
    static void dfs(int m,int n) {
        if(m>=n) {
            ans++;
            return;
        }

        for(int i=m;i<n;i++) {
            swap(i,m);
            dfs(m+1,n);
            swap(i,m);
        }
    }

    static void swap(int i,int j) {
        int t = a[i];
        a[i] =a[j];
        a[j] = t;
    }
}
