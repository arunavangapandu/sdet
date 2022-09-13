package com.practise.designpatterns.structuralpatterns;

public class MovableAdapterImpl implements MovableAdapter {
    private Movable luxuryCars;

    public MovableAdapterImpl(Movable luxuryCars) {
        this.luxuryCars = luxuryCars;
    }

    public MovableAdapterImpl() {

    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());

    }

    private double convertMPHtoKMPH(double mph) {
        return mph*1.60934;
    }

    @Override
    public String toString() {
        return "MovableAdapterImpl{" +
                "luxuryCars=" + luxuryCars + luxuryCars.getSpeed() +
                '}';
    }
}
