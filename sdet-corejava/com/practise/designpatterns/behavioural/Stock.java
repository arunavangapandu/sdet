package com.practise.designpatterns.behavioural;

public interface Stock {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}