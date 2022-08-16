package observerPattern;

public class Subscriber implements Observer {
    private Message message;

    private static int observerTracker = 0;

    private int observerID;

    public Subscriber(Publisher publisher) {
        publisher.register(this);
        this.observerID = ++observerTracker;
    }

    public void update(Message message) {
        this.message = message;

        printMessage();
    }

    private void printMessage() {
        System.out.println("ObserverID: " + observerID + " Message: " + message.getMessage());
    }

}
