package com.practise.designpatterns.structuralpatterns;

// Adapter pattern can be used to connect between two
// incompatible interfaces that otherwise can't be connected directly
public class AdapterPatternTest {
    public static void main(String[] args) {
        Movable bugatti = new Bugatti();
        MovableAdapterImpl adapterTest = new MovableAdapterImpl(bugatti);
        System.out.println(adapterTest.getSpeed());
    }

}
