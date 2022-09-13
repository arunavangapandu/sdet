package com.practise.designpatterns;

public class Phone implements Computer{
    @Override
    public void compute() {
        System.out.println("I am Phone");
    }
}
