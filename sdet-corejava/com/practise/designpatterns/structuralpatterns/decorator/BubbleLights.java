package com.practise.designpatterns.structuralpatterns.decorator;

public class BubbleLights extends TreeDecorator {
    public BubbleLights() {
    }

    public BubbleLights(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate() +  decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return "with Bubble Lights";
    }
}
