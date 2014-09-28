package net.sapozhko.patterns.concurrency;

import net.sapozhko.patterns.concurrency.observer.ConcreteObservable;
import net.sapozhko.patterns.concurrency.observer.ConcreteObserver;
import net.sapozhko.patterns.concurrency.observer.Observable;

public class ObserverExample {

    public static void main(String[] args) {
        Observable observable = new ConcreteObservable();

        observable.addObserver(new ConcreteObserver());
        observable.addObserver(new ConcreteObserver());
        observable.addObserver(new ConcreteObserver());

        observable.notifyObservers(String.valueOf(ObserverExample.class));
    }
}
