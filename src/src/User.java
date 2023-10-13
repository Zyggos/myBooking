import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * The class that implements a basic user, to be then inherited and expanded on by the Owner, Client and Admin classes.
 * @author Dimitris Kleitsas
 */

public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = -1541840058610914321L;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private ArrayList<Message> messages;

    public User() {}

    /**
     * A basic constructor which sets all the basic info of the user into place, while also initializing the
     * array list of messages of the user
     * @param firstName First name of user
     * @param lastName Last name of user
     * @param email E-mail of user
     * @param password Password of user
     */
    public User(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        messages = new ArrayList<>();
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public void addMessage(Message message) {
        messages.add(message);
    }


    public Message getMessage(int index) {
        return messages.get(index);
    }




    public int getSizeMessages()
    {
        return messages.size();
    }


    public void sendMessage(User recipient, String message) {}


}


