/**
 * This class implements the logic behind the registration process, making sure that all provided information is
 * valid
 * @author Dimitris Kleitsas
 */

public class RegistrationLogic {

    char userType;
    String firstName;
    String lastName;
    String password;
    String email;
    String phoneNumber;
    String country;
    String city;
    String streetName;
    int streetNumber;

    /**
     * This method checks whether the user type provided by the user is either C, to signify a client, or O
     * to signify an owner. If it is neither, it does not go through with setting the type
     * @param userType The user type provided by the user
     */
    public void setUserType(char userType) {
        if(userType == 'C' || userType == 'O') {
            this.userType = userType;
        }
    }

    /**
     * This method sets the first name of the user, making sure first that the String provided is not empty
     * @param firstName The first name provided by the user
     * @return False if the String is empty, true otherwise
     */

    public boolean setFirstName(String firstName) {
        if (firstName.equals("")){
            return false;
        }
        this.firstName = firstName;
        return true;
    }

    /**
     * This method sets the last name of the user, making sure first that the String provided is not empty
     * @param lastName The last name provided by the user
     * @return False if the String is empty, true otherwise
     */

    public boolean setLastName(String lastName) {
        if (lastName.equals("")){
            return false;
        }
        this.lastName = lastName;
        return true;
    }

    /**
     * This method sets the password of the user, making sure first that the String provided is longer than 4 characters
     * @param password The password provided by the user
     * @return False if the String is shorter than four characters, true otherwise
     */

    public boolean setPassword(String password) {
        if (password.length() < 4){
            return false;
        }
        this.password = password;
        return true;
    }

    /**
     * This method sets the email of the user, making sure first that the String provided is not empty or
     * that a user with this email doesn't already exist
     * @param email The email provided by the user
     * @return False if the String is empty or the email is already in use, true otherwise
     */
    public char setEmail(String email) {
        if (email.equals("")){
            return 'E';
        } else if(!email.endsWith("@gmail.com") && !email.endsWith("@yahoo.com") && !email.endsWith("@hotmail.com") && !email.endsWith("@csd.auth.gr")){
            return 'W';
        }
        for(int i = 0; i < UserBase.getClientsNumber(); i++){
            if (email.equals(UserBase.getClient(i).getEmail())){
                return 'U';
            }
        }
        for(int i = 0; i < UserBase.getOwnersNumber(); i++){
            if (email.equals(UserBase.getOwner(i).getEmail())){
                return 'U';
            }
        }
        for(int i = 0; i < UserBase.getPendingOwnersNumber(); i++){
            if (email.equals(UserBase.getPendingOwner(i).getEmail())){
                return 'U';
            }
        }
        for(int i = 0; i < UserBase.getAdminsNumber(); i++){
            if (email.equals(UserBase.getAdmin(i).getEmail())){
                return 'U';
            }
        }

        this.email = email;
        return 'Y';
    }

    /**
     * This method sets the phone number of the user, making sure first that the String provided is ten characters long
     * @param phoneNumber The phone number provided by the user
     * @return False if the String is no ten characters long, true otherwise
     */
    public boolean setPhoneNumber(String phoneNumber){
        if (phoneNumber.length() != 10 || !phoneNumber.matches("[0-9]+")) {
            return false;
        }
        this.phoneNumber = phoneNumber;
        return true;
    }

    /**
     * This method sets the country of the user, making sure first that the String provided is not empty
     * @param country The country provided by the user
     * @return False if the String is empty, true otherwise
     */
    public boolean setCountry(String country) {
        if (country.equals("")){
            return false;
        }
        this.country = country;
        return true;
    }
    /**
     * This method sets the city of the user, making sure first that the String provided is not empty
     * @param city The city provided by the user
     * @return False if the String is empty, true otherwise
     */
    public boolean setCity(String city) {
        if (city.equals("")){
            return false;
        }
        this.city = city;
        return true;
    }

    /**
     * This method sets the street name of the user, making sure first that the String provided is not empty
     * @param streetName The street name provided by the user
     * @return False if the String is empty, true otherwise
     */

    public boolean setStreetName(String streetName) {
        if (streetName.equals("")) {
            return false;
        }
        this.streetName = streetName;
        return true;
    }

    /**
     * This method sets the street number of the user, making sure first that the integer provided is a number
     * larger than 1
     * @param streetNumber The streetNumber provided by the user
     * @return False if the street number is smaller than 1, true otherwise
     */

    public boolean setStreetNumber(String streetNumber) {
        if (!streetNumber.matches("[0-9]+") || Integer.parseInt(streetNumber) < 1) {
            return false;
        }
        this.streetNumber = Integer.parseInt(streetNumber);
        return true;
    }

    /**
     * Once all info has been provided, this method creates a new Client or Owner and adds him to the list of
     * already existing ones
     */

    public void addNewUser(){
        if(userType == 'C') {
            Client newClient = new Client(firstName,lastName,email,password,phoneNumber,country,city,streetName,streetNumber);
            UserBase.addClient(newClient);
        } else {
            Owner newOwner = new Owner(firstName,lastName,email,password,phoneNumber,country,city,streetName,streetNumber);
            UserBase.addPendingOwner(newOwner);
        }
    }
}
