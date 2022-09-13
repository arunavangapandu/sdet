package com.practise.designpatterns.structuralpatterns;

// structural patetrns simplify the design of large object structures
// by identifying relationships between them
public class DecoratorPatternTest {
    public static void main(String[] args) {
        BubbleLights lights = new BubbleLights(new ChristmasTreeImpl());
        System.out.println(lights.decorate());
    }
}
