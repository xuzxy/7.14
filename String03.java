package com.hp.string;
/**
 * 检查一个字符串是否为回文
 * 回文:正着念与反着念一样，例如:上海自来水来自海上
 *
 *
 *
 */
public class String03 {
    public static void main(String[] args) {
        String str="上海自来水来自海上";
        System.out.println(check(str));
    }

    public static boolean check(String str){
       //判断
        for(int i=0;i<=str.length()/2;i++) {
            if(!(str.charAt(i)==str.charAt(str.length()-i-1))) {
              //不是回文
                return false;
            }
        }
        //回文
        return true;

    }
}
