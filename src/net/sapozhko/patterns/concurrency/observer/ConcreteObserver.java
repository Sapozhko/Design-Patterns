package net.sapozhko.patterns.concurrency.observer;

public class ConcreteObserver implements Observer {

    @Override
    public void update(Observable observable, String arg) {
        System.out.println("ConcreteObserver: " + this.hashCode() + " Received Response: " + arg);
    }
}
