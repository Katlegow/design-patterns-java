package observerPattern;

import java.util.*;


public class Publisher implements Subject {
    private static List<Observer> subscribers;
    private Message message;

    static {
        subscribers = new ArrayList<>();
    }

    public void register(Observer newObserver) {
        this.subscribers.add(newObserver);
    }

    public void unregister(Observer deleteObserver){
        int idx = subscribers.indexOf(deleteObserver);
        subscribers.remove(idx);

    }

    public void publish(Message message) {
        for (Observer observer : subscribers) {
            observer.update(message);
        }
    }

}
