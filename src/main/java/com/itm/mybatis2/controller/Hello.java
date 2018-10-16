package com.itm.mybatis2.controller;
/**
* @description HelloController
* @author hao.yang
* @create 2018-08-07 
*/

public class Hello {
    public void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Hello h = new Hello();
        h.sayHello();
    }
}