package 第十届真题;

/**  
    * @Title: 第四题数的分解.java
    * @Package 第十届真题
    * @Description: TODO(试题 D: 数的分解 ----- 答案： 40785

　　【问题描述】

　　　把 2019 分解成 3 个各不相同的正整数之和，并且要求每个正整数都不包 含数字 2 和 4，一共有多少种不同的分解方法？

　　　注意交换 3 个整数的顺序被视为同一种方法，例如 1000+1001+18 和 1001+1000+18 被视为同一种。


　　【答案提交】
　　　这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一 个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。)
    * @author 陈洪彬
    * @date 2020年2月1日
    * @version V1.0  
    */
public class 第四题数的分解 {
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