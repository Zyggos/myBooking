import java.io.Serializable;

/**
 * A class that implements a message. It consists of the Admin who is the sender of the message, the user who
 * receives the message and the message itself
 * @author Dimitris Kleitsas
 */

public class Message implements Serializable {
    private final Admin sender;
    private final String message;

    public Message(Admin sender, String message){
        this.sender = sender;
        this.message = message;
    }

    /**
     * A method which overrides the toString method so that the message appears along with the name of the sender
     * @return A string which consists of the first and last name of the Admin who sent the message along with the
     * message itself
     */
    public String toString() {
        return sender.getFirstName() + " " + sender.getLastName() + ":" + message;
    }
}
