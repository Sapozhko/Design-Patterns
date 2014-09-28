package net.sapozhko.patterns.concurrency.observer;

public interface Observable {

    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObservers(String arg);
}
