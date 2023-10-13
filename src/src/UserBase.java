import java.util.ArrayList;

/**
 * A class that hold all the existing Clients, Owners, pending Owners and Admins
 * @author Dimitris Kleitsas
 */

public class UserBase {
    private static final ArrayList<Client> clients = new ArrayList<>();
    private static int clientsNumber = 0;

    private static final ArrayList<Owner> owners = new ArrayList<>();
    private static final ArrayList<Owner> pendingOwners = new ArrayList<>();
    private static int ownersNumber = 0;
    private static int pendingOwnersNumber = 0;

    private static final ArrayList<Admin> admins = new ArrayList<>();
    private static int adminsNumber = 0;


    /**
     * Add new client and increase number of clients and users
     * @param newClient New client to be added to list
     */
    public static void addClient(Client newClient) {
        clients.add(newClient);
        clientsNumber++;
    }

    /**
     * Add new owner and increase number of owners and users
     * @param newOwner New owner to be added to list
     */
    public static void addOwner(Owner newOwner) {
        owners.add(newOwner);
        ownersNumber++;
    }

    /**
     * Add new pending owner and increase number of pending owners
     * @param newPendingOwner New pending owner to be added to list
     */
    public static void addPendingOwner(Owner newPendingOwner) {
        pendingOwners.add(newPendingOwner);
        pendingOwnersNumber++;
    }

    /**
     * Add new admin and increase number of admins
     * @param newAdmin New admin to be added to list
     */
    public static void addAdmin(Admin newAdmin) {
        admins.add(newAdmin);
        adminsNumber++;
    }



    /**
     * Remove pending owner from list and decrease number of pending owners
     * @param owner Pending owner to be removed from list
     */
    public static void removePendingOwner(Owner owner){
        pendingOwners.remove(owner);
        pendingOwnersNumber--;
    }


    public static int getClientsNumber() { return clientsNumber; }

    public static int getOwnersNumber() { return ownersNumber; }

    public static int getPendingOwnersNumber() { return pendingOwnersNumber; }

    public static int getAdminsNumber() { return adminsNumber; }

    public static Client getClient(int index) {
        return clients.get(index);
    }

    public static Owner getOwner(int index) { return owners.get(index); }

    public static Owner getPendingOwner(int index) { return pendingOwners.get(index); }

    public static Admin getAdmin(int index) { return admins.get(index); }

}
