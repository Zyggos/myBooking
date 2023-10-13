import java.io.Serializable;

/**
 * The class that implements the user of type Admin and some of his abilities
 * @author Dimitris Kleitsas
 * @author Anastasios Zyngiridis
 */


public class Admin extends User implements Serializable {
    /**
     * The constructor calls the constructor of the class User, which Admin inherits.
     * @param firstName The first name of the Admin
     * @param lastName The last name of the Admin
     * @param email The email of the Admin
     * @param password The password of the Admin
     */
    public Admin(String firstName, String lastName, String email, String password) {
        super(firstName, lastName, email, password);
    }


    /**
     * This method sends a message to the User of the Admin's choosing, by adding it to the User's array list of messages
     * @param recipient The recipient of the Admin's message
     * @param message The message the Admin wishes to send
     */
    public void sendMessage(User recipient, String message) {
        recipient.addMessage(new Message(this, message));
    }

    /** This method approves the user of the Admin's choosing by removing him from the pending owners list and adding him to the normal owners list
     *
     * @param pendingOwner The owner who is to be approved
     */
    public void approveOwner(Owner pendingOwner) {
        UserBase.removePendingOwner(pendingOwner);
        UserBase.addOwner(pendingOwner);
    }


}
