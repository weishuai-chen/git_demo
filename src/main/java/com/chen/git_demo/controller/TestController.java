package com.chen.git_demo.controller;

public class TestController {
    public static void main(String[] args) {
        System.out.println("dev分支，项目结构初始化");
        function1();
        function2();
        function3();
        function4();
        function5();
    }

    public static void function1() {
        System.out.println("function 2 修改的");
        System.out.println("function 3 修改");
        System.out.println("function 4 修改");
    }

    public static void function2() {
        System.out.println("function 2 修改的");
        System.out.println("function 3 修改");
        System.out.println("function 4 修改");
    }

    public static void function3() {
        System.out.println("function 2 修改的");
        System.out.println("function 3 修改");
        System.out.println("function 4 修改");
    }

    public static void function4() {
        System.out.println("function 4 修改");
    }

    public static void function5() {
        System.out.println("function 2 修改的");
        System.out.println("function 3 修改");
        System.out.println("function 4 修改");
    }
}
