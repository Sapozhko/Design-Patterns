package net.sapozhko.patterns.concurrency.observer;

import java.util.HashSet;
import java.util.Set;

public class ConcreteObservable implements Observable {
    private Set<Observer> observers = new HashSet<Observer>();

    @Override
    public void addObserver(Observer observer) {
        throwExceptionIfNull(observer);
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        throwExceptionIfNull(observer);
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String arg) {
        for (Observer observer : observers) {
            observer.update(this, arg);
        }
    }

    private void throwExceptionIfNull(Object object) {
        if (object == null) {
            throw new NullPointerException();
        }
    }
}
