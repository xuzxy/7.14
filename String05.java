package com.hp.string;

import java.util.Random;
import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 *
 *
 */
public class String05 {
    public static void main(String[] args) {
        String str = random();
        System.out.println(str);
        System.out.println("请输入验证码（不区分大小写）");
        Scanner sc = new Scanner(System.in);
        String strin = sc.next();
        str = str.toUpperCase();
        strin = strin.toUpperCase();
        if (strin.equals(str)) {
            System.out.println("正确");
        } else {
            System.out.println("错误");
        }
    }

    private static String random() {
        char[] c = new char[5];
        String str = "";
        for (int i = 0; i < c.length; i++) {
            int x = (int) (Math.random() * 2);
            {
                if (x == 1) {
                    c[i] = (char) ((Math.random() * 25) + 97);
                    str += c[i];
                } else {
                    c[i] = (char) ((Math.random() * 25) + 65);
                    str += c[i];
                }
            }
        }
        return str;

    }

}

