package com.hp.string;

import java.io.Console;
import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 *
 *
 */
public class String04 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("请输入email");
        String str=sc.next();
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            String str1=(String) str.subSequence(i, i+1);
            if(str1.matches("\\w")) {
                sb.append(str1);
            }else {
                break;
            }
        }
        System.out.println(sb);
    }
}
