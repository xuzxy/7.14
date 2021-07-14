package com.hp.string;
/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 *
 *
 */
public class String02 {
    public static void main(String[] args) {
       // 将"大家好!"修改为:"大家好!我是程序员!"并输出。
        StringBuilder yy=new StringBuilder("大家好!");
        yy.append("我是程序员!");
        System.out.println(yy);
        //2. 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
        yy.insert(6,"优秀的");
        System.out.println(yy);
        //3.然后再修改为:"大家好!我是牛牛的程序员!"并输出
        yy.replace(6,9,"牛牛的");
        System.out.println(yy);
        //4.然后在修改为:"我是牛牛的程序员!"并输出
        yy.delete(0,4);
        System.out.println(yy);
    }
}
