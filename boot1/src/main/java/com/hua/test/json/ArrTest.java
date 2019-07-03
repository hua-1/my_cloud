/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ArrTest
 * Author:   Administrator
 * Date:     2019/3/23 0023 11:06
 * Description: 数组遍历
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hua.test.json;

import java.util.Vector;

/**
 * 〈一句话功能简述〉<br> 
 * 〈数组遍历〉
 *
 * @author Administrator
 * @create 2019/3/23 0023
 * @since 1.0.0
 */
public class ArrTest {



    public static String str=new String("123");
    public static char[] ch={'a','b'};

    public static void main(String[] args) {

        Vector vector=new Vector();
        vector.add('a');
        Object o = vector.get(0);

    }
    public void test(String chr,char ch[]){
        chr="234";
        ch[0]='c';
    }

    public static String getStr() {
        return str;
    }

    public static void setStr(String str) {
        ArrTest.str = str;
    }

    public static char[] getCh() {
        return ch;
    }

    public static void setCh(char[] ch) {
        ArrTest.ch = ch;
    }
}