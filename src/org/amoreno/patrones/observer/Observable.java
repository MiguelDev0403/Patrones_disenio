package org.amoreno.patrones.observer;

import java.util.ArrayList;
import java.util.List;

abstract public class Observable {
    protected List<Observer> observers= new ArrayList<>();
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        notifyObservers(null);

    }
    public void notifyObservers(Object obj){
        for(Observer observer : this.observers) {
            observer.update(this,obj);
        }
    }
}
