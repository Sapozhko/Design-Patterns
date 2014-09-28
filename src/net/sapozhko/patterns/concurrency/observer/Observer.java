package net.sapozhko.patterns.concurrency.observer;

public interface Observer {

    void update(Observable observable, String arg);
}
