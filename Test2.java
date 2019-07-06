/*
对N个长度最长可达到1000的数进行排序。

输入描述:
输入第一行为一个整数N，(1<=N<=100)。
接下来的N行每行有一个数，数的长度范围为1<=len<=1000。
每个数都是一个正数，并且保证不包含前缀零。

输出描述:
可能有多组测试数据，对于每组数据，将给出的N个数从小到大进行排序，输出排序后的结果，每个数占一行。
示例1
输入
3
11111111111111111111111111111
2222222222222222222222222222222222
33333333
输出
33333333
11111111111111111111111111111
2222222222222222222222222222222222
*/
package written_test0706;

import java.util.Scanner;
//大整数排序
public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            String[] strs = new String[n];
            for(int i =0;i<n;i++){
                strs[i] = in.next();
            }
            aSort(strs,n);
            for(String s:strs){
                System.out.println(s);
            }
        }
    }
    public static void aSort(String[] s,int len){
        for(int i = 0;i<len-1;i++){
            for(int j = i+1;j<len;j++){
                if(s[i].length()>s[j].length()){
                    String str = s[i];
                    s[i] = s[j];
                    s[j] = str;
                }else if(s[i].length()==s[j].length()){
                    if(s[i].compareTo(s[j])>0){
                        String str = s[i];
                        s[i] = s[j];
                        s[j] = str;
                    }
                }
            }
        }
    }
}