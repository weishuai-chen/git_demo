package com.chen.git_demo.controller;

public class TestController {
    public static void main(String[] args) {
        System.out.println("dev分支，项目结构初始化");
        function1();
        function2();
        function3();
        function5();
    }

    public static void function1() {
        System.out.println("function 1：第5次提交");
    }

    public static void function2() {
        System.out.println("function 2: 第5次提交");
    }

    public static void function3() {
        System.out.println("function 3: 第3次提交");
    }

    public static void function5() {
        System.out.println("function 5: 第3次提交");
    }
}
