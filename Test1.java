/*
输入一个字符串，然后对每个字符进行奇校验，最后输出校验后的二进制数(如'3’，输出：10110011)。

输入描述:
输入包括一个字符串，字符串长度不超过100。

输出描述:
可能有多组测试数据，对于每组数据，
对于字符串中的每一个字符，输出按题目进行奇偶校验后的数，每个字符校验的结果占一行。
示例1
输入
3
3a
输出
10110011
10110011
01100001
*/
package written_test0706;

import java.util.*;
//奇偶校验
public class Test1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s = in.nextLine();
            for(int i =0;i<s.length();i++){
                System.out.println(jijiaoyan(s.charAt(i)));
            }
        }
    }
    public static StringBuffer jijiaoyan(char c){
        StringBuffer s = new StringBuffer();
        int a = c;
        int count = 0;
        while(a != 0 ){
            s.append(a % 2);
            count = a % 2>0?count+1:count;
            a /= 2;
        }
        int len = s.length();
        while(len < 7){
            s.append(0);
            len ++;
        }
        if(count % 2 == 0){
            s.append(1);
        }else{
            s.append(0);
        }
        return s.reverse();
    }
}