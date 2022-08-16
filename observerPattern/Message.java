package observerPattern;

public class Message {
    String message;
    
    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public Message withMessage(String message) {
        this.setMessage(message);
        return this;
    }
}
