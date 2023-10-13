import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Class that represents the people that rent out houses ,apartments ect. to other people
 * @author Anastasios Zyngiridis
 */
public class Owner extends User implements Serializable
{
    @Serial
    private static final long serialVersionUID = 6225239001936193468L;

    private final String phoneNumber;
    private final String country;
    private final String city;
    private final String streetName;
    private final int streetNumber;


    private final ArrayList<PlaceToRent> ownersPlacesForRent;
    private int numberOfPlacesForRent;

    /**
     * Constructs and initializes an Owner with basic info about him.
     */
    public Owner(String firstName, String lastName, String email, String password, String phoneNumber, String country, String city, String streetName, int streetNumber)
    {
        super(firstName, lastName, email, password);
        this.phoneNumber = phoneNumber;
        this.country = country;
        this.city = city;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.numberOfPlacesForRent = 0;
        this.ownersPlacesForRent = new ArrayList<>();

    }



    public ArrayList<PlaceToRent> getOwnersPlacesForRent()
    {
        return ownersPlacesForRent;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public String getCountry()
    {
        return country;
    }
    public String getCity()
    {
        return city;
    }

    public String getStreetName()
    {
        return streetName;
    }
    public int getStreetNumber()
    {
        return streetNumber;
    }
    public int getNumberOfPlacesForRent()
    {
        return numberOfPlacesForRent;
    }



    /**
     * Adds the new place from the parameter to the ArrayList and add up the counter that shows how many places the
     * owner has.
     * @param place the place we want to add to the ArrayList.
     */

    public void addPlace(PlaceToRent place)
    {
        this.ownersPlacesForRent.add(place);
        numberOfPlacesForRent++;
    }
    /**
     * Finds the place you are looking for by checking if the index it was given in the parameter is
     * in the range of the ArrayList size and if it's true it removes the PlaceToRent that corresponds to the index.
     */
    public void removePlaceOfRenting(int index)
    {

        if (index >= 0 && index < this.ownersPlacesForRent.size()) {

            this.ownersPlacesForRent.remove(index);
            numberOfPlacesForRent--;
        }
    }



    /**
     * Finds the place you are looking for by  checking if the index it was given in the parameter is
     * in the range of the ArrayList size and if it's true it gets the PlaceToRent that corresponds to the index and
     * if the index is not in the range it returns null.
     */
    public PlaceToRent getPlaceOfRenting(int index)
    {
        if (index >= 0 && index < this.ownersPlacesForRent.size()) {
            return this.ownersPlacesForRent.get(index);
        }

        return null;
    }




}
