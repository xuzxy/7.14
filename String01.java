package com.hp.string;
/**
 * 1:输出字符串"HelloWorld"的字符串长度
 * 2:输出"HelloWorld"中"o"的位置
 * 3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
 * 4:截取"HelloWorld"中的"Hello"并输出
 * 5:截取"HelloWorld"中的"World"并输出
 * 6:将字符串"  Hello   "中两边的空白去除后输出
 * 7:输出"HelloWorld"中第6个字符"W"
 * 8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
 * 9:将"HelloWorld"分别转换为全大写和全小写并输出。
 *
 *
 */

public class String01 {
    public static void main(String[] args) {
       //1.获取长度
        String str = "HelloWorld";
        System.out.println("str");
        int length = str.length();
        System.out.println("字符长度"+length);


        //2.输出"HelloWorld"中"o"的位置
        int i = str.indexOf("o");
        System.out.println("i = " + i);
        //3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
        System.out.println("index of 'o':"+str.indexOf('o',5));
        //4:截取"HelloWorld"中的"Hello"并输出
        System.out.println("sub:"+str.substring(0,5));
        //5:截取"HelloWorld"中的"World"并输出
        System.out.println("sub"+str.substring(5));
        //6:将字符串"  Hello   "中两边的空白去除后输出
        String str6 ="hello";
        String trim = str6.trim();
        System.out.println("trim = " + trim);
        //7:输出"HelloWorld"中第6个字符"W"
        System.out.println("charAt:"+str.charAt(5));
        //8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
        System.out.println("startsWith:"+str.startsWith("h"));
        System.out.println("endsWith:" +str.endsWith("ld"));
        //9:将"HelloWorld"分别转换为全大写和全小写并输出。
      /*  System.out.println("upper:"+str.toUpperCase());
        System.out.println("lower:"+str.toLowerCase());*/
       //小写
        String m = "helloworld";
        String m1 = m.toLowerCase();
        System.out.println("m1 = " + m1);
       //大写
        String n = "helloworld";
        String n1 = n.toUpperCase();
        System.out.println("n1 = " + n1);

    }
}
