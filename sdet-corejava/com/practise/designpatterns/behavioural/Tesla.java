package com.practise.designpatterns.behavioural;

public class Tesla implements Stock {
    private ArrayList<Observer> observers;
    private float currentPrice;

    public Tesla(){
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        int index = observers.getIndexOf(o);
        if(index >=0 )
            observers.remove(index);
    }

    public void notifyObservers(){
        for(Observer observer : observers){
            observers.updatePrice(currentPrice);
        }
    }

    // Method to put custom logic when to notify observers
    public void priceChanged(){
        if(currentPrice <= thresold || currentPrice >= thresold)
            notifyObservers();
    }

    public void setPrice(float currentPrice){
        this.currentPrice = currentPrice;

        priceChanged();
    }
}