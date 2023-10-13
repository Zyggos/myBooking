/**
 * This class implements the logic behind the log in process
 * @author Dimitris Kleitsas
 */

public class LogInLogic {
    String email;
    String password;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method checks whether the information provided by the user in the LogInCLI class matches any existing user
     * and if so, sets them as the current user in the Main Menu.
     * @return Returns true if the user exists, false if they don't.
     */
    public boolean verifyInfo() {

        for(int i = 0; i < UserBase.getClientsNumber(); i++) {
            if (this.email.equals(UserBase.getClient(i).getEmail()) && this.password.equals(UserBase.getClient(i).getPassword())) {
                ClientMenu clientMenu = new ClientMenu();
                clientMenu.startClientMenu(UserBase.getClient(i));
                return true;
            }
        }
        for(int i = 0; i < UserBase.getOwnersNumber(); i++) {
            if (this.email.equals(UserBase.getOwner(i).getEmail()) && this.password.equals(UserBase.getOwner(i).getPassword())) {
                OwnerMenu ownerMenu = new OwnerMenu();
                ownerMenu.startOwnerMenu(UserBase.getOwner(i));
                return true;
            }
        }

        for(int i = 0; i < UserBase.getAdminsNumber(); i++) {
            if(this.email.equals(UserBase.getAdmin(i).getEmail()) && this.password.equals(UserBase.getAdmin(i).getPassword())) {
                AdminMenu adminMenu = new AdminMenu();
                adminMenu.startAdminMenu(UserBase.getAdmin(i));
                return true;
            }
        }

        return false;
    }















}
