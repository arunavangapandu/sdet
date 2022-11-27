package com.test.java.pass.by;

public class Value {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);
        calculate(num);
        System.out.println(num);
    }
    public static void calculate(int x) {
        System.out.println(x);
        x = x+10;
        System.out.println(x);
    }
}
