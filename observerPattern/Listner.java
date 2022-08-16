package observerPattern;

public class Listner implements IListner {
    Publisher publisher;

    public Listner(Publisher publisher) {
        this.publisher = publisher;
    }

    public void notify(Message message) {
        this.publisher.publish(message);
    }
}
