package com.hp.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 练习:  { "username":"tangseng", "age":"500"  }  提取json 中的  k 和  v .. 赋值到一个对象
// QuJingRen 类-----> username ,  age
public class String08 {
    public static void main(String[] args) {

        Map<String, String > map1 = new HashMap<String, String >();
        map1.put("username", "tangsan");
        map1.put("age", "50");
        QujingRen qujingRen = new QujingRen();

        qujingRen.setUsername(map1.get("username"));
        qujingRen.setAge(map1.get("age"));

    }
    static class QujingRen{
        private String username    ;
        private String age;

        @Override
        public String toString() {
            return "QujingRen{" +
                    "username='" + username + '\'' +
                    ", age='" + age + '\'' +
                    '}';
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }
    }

