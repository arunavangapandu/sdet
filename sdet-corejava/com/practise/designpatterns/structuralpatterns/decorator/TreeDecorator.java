package com.practise.designpatterns.structuralpatterns.decorator;

// Decorator pattern can be used to attach additional responsibilities
// to the object either statically or dynamically without affecting the structure
// of the obect
public abstract class TreeDecorator implements ChristmasTree {
    private ChristmasTree tree;

    public TreeDecorator() {
    }

    public TreeDecorator(ChristmasTree tree) {
        this.tree = tree;
    }

    @Override
    public String decorate() {
        return "Beautiful " + tree.decorate();
    }

}
