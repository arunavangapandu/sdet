package com.test.java.pass.by;

public class TestReferenceTypeIsPassByValue {

    public static void main(String[] args) {
        Point p = new Point(1,2);
        System.out.println(p.x);
        testReference(p);
        System.out.println(p.x);
    }
    public static void testReference(Point p) {
        System.out.println(p.x);
        p = new Point(3, 4);
        System.out.println(p.x);
    }
}
