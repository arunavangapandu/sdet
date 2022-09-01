package com.test.file;

class OuterClass {
    String name ;
    void printName(String name) {
        System.out.println("name is  " + name);
    }
    static class InnerClass {
        int count = 5;
        void printCount(){
            System.out.println("count is  " + count);
        }
    }
}
public class MainClass {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = new OuterClass.InnerClass();
        System.out.println(inner.count);
        inner.printCount();
        outer.printName("Aruna");
    }
}
