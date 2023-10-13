import java.util.ArrayList;
import java.util.Objects;

/**
 * A class that implements the logic behind the user searching process
 * @author Dimitris Kleitsas
 */

public class UserSearchLogic {

    public UserSearchLogic() {

    }

    /**
     * This method iterates through the array lists containing all client and owners and returns
     * the one whose first and last name match the input given by the user
     * @param firstName The first name of the user being searched
     * @param lastName The last name of the user being searched
     * @return An array list of all users that have the first and last name specified
     */
    public ArrayList<Client> searchClientsByFistAndLastName(String firstName, String lastName) {
        ArrayList<Client> matchingUsers = new ArrayList<>();
        for(int i = 0; i < UserBase.getClientsNumber(); i++){
            if (Objects.equals(UserBase.getClient(i).getFirstName(), firstName) && Objects.equals(UserBase.getClient(i).getLastName(), lastName)) {
                matchingUsers.add(UserBase.getClient(i)); 

            }
        }

        return matchingUsers;
    }

    public ArrayList<Owner> searchOwnersByFistAndLastName(String firstName, String lastName) {
        ArrayList<Owner> matchingUsers = new ArrayList<>();

        for(int i = 0; i < UserBase.getOwnersNumber(); i++){
            if (Objects.equals(UserBase.getOwner(i).getFirstName(), firstName) && Objects.equals(UserBase.getOwner(i).getLastName(), lastName)) {
                matchingUsers.add(UserBase.getOwner(i));
            }
        }

        return matchingUsers;
    }


    /**
     * This method iterates through the array lists containing all client and owners and returns
     * the one whose first name matches the input given by the user
     * @param firstName The first name of the user being searched
     * @return An array list of all users that have the first name specified
     */
    public ArrayList<Client> searchClientsByFirstName(String firstName) {
        ArrayList<Client> matchingUsers = new ArrayList<>();
        for(int i = 0; i < UserBase.getClientsNumber(); i++){
            if (Objects.equals(UserBase.getClient(i).getFirstName(), firstName)) {
                matchingUsers.add(UserBase.getClient(i));

            }
        }

        return matchingUsers;
    }

    public ArrayList<Owner> searchOwnersByFirstName(String firstName) {
        ArrayList<Owner> matchingUsers = new ArrayList<>();

        for(int i = 0; i <UserBase.getOwnersNumber(); i++){
            if (Objects.equals(UserBase.getOwner(i).getFirstName(), firstName)) {
                matchingUsers.add(UserBase.getOwner(i));
            }
        }

        return matchingUsers;
    }


    /**
     * This method iterates through the array lists containing all client and owners and returns
     * the one whose last name matches the input given by the user
     * @param lastName The last name of the user being searched
     * @return An array list of all users that have the last name specified
     */
    public ArrayList<Client> searchClientsByLastName(String lastName) {
        ArrayList<Client> matchingUsers = new ArrayList<>();
        for(int i = 0; i < UserBase.getClientsNumber(); i++){
            if (Objects.equals(UserBase.getClient(i).getLastName(), lastName)) {
                matchingUsers.add(UserBase.getClient(i));

            }
        }


        return matchingUsers;
    }

    public ArrayList<Owner> searchOwnersByLastName(String lastName) {
        ArrayList<Owner> matchingUsers = new ArrayList<>();

        for(int i = 0; i < UserBase.getOwnersNumber(); i++){
            if (Objects.equals(UserBase.getOwner(i).getLastName(), lastName)) {
                matchingUsers.add(UserBase.getOwner(i));
            }
        }

        return matchingUsers;
    }
}

