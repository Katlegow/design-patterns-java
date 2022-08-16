package observerPattern;

public interface Subject {
    void register(Observer newObserver);
    void unregister(Observer deleteObserver);
    void publish(Message message);
}
