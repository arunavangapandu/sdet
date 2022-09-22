package com.practise.designpatterns.behavioural;

public class AddToCartCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Insert row in the cart table");
    }

    @Override
    public void unexecute() {
        System.out.println("delete row from the cart table");
    }
}
