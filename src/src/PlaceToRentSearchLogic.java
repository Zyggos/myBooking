import java.util.ArrayList;
import java.util.Objects;

/**
 * A class which implements the logic behind the search for places to rent which takes in the users input
 * and filters through all existing properties and gets all the ones which match the criteria specified
 * by the user in the PlaceToRentSearchCLI class
 * @author Dimitris Kleitsas
 * @author Anastasios Zyngiridis
 */

public class PlaceToRentSearchLogic {

    private final String type;
    private final String country, city;
    private final int minPricePerDay;
    private final int maxPricePerDay;
    private final int minSquareFeet;
    private final int maxSquareFeet;
    private final int minRooms;
    private final int maxRooms;
    private final boolean wifi;
    private final boolean parking;
    private final boolean kitchen;
    private final boolean heating;
    private final boolean backyard;
    private final boolean tv;
    private final boolean pool;

    public PlaceToRentSearchLogic(String type, String country, String city, int minPricePerDay, int maxPricePerDay, int minSquareFeet, int maxSquareFeet, int minRooms, int maxRooms, boolean wifi, boolean parking, boolean kitchen, boolean heating, boolean backyard, boolean tv, boolean pool) {
        this.type = type;
        this.country = country;
        this.city = city;
        this.minPricePerDay = minPricePerDay;
        this.maxPricePerDay = maxPricePerDay;
        this.minSquareFeet = minSquareFeet;
        this.maxSquareFeet = maxSquareFeet;
        this.minRooms = minRooms;
        this.maxRooms = maxRooms;
        this.wifi = wifi;
        this.parking = parking;
        this.kitchen = kitchen;
        this.heating = heating;
        this.backyard = backyard;
        this.tv = tv;
        this.pool = pool;
    }

    /**
     * This method goes through all the existing properties on the platform, finding all the ones
     * that fit the criteria the user searching for a property has set
     * @return An array list of all the places which match the users input
     */
    public ArrayList<PlaceToRent> search(){

        ArrayList<PlaceToRent> matchingPlaces = new ArrayList<>();

        for(int i = 0; i < UserBase.getOwnersNumber(); i++) {
            Owner owner = UserBase.getOwner(i);
            System.out.println(owner.getFirstName());
            for(int j = 0; j < owner.getNumberOfPlacesForRent(); j++) {
                System.out.println("Hi!");
                PlaceToRent place = owner.getPlaceOfRenting(j);
                if(!Objects.equals(this.type, place.getType())){
                    continue;
                }
                if(!Objects.equals(this.country, place.getCountry())) {
                    continue;
                }

                if (!Objects.equals(this.city, place.getCity())) {
                    continue;
                }

                if(place.getPrice_per_day() > this.maxPricePerDay || place.getPrice_per_day() < this.minPricePerDay) {
                    continue;
                }
                if(place.getSquare_feet() > this.maxSquareFeet || place.getSquare_feet() < this.minSquareFeet) {
                    continue;
                }
                if(place.getRooms() > this.maxRooms || place.getRooms() < this.minRooms) {
                    continue;
                }
                if (wifi && !place.hasWifi()) {
                    continue;
                }
                if (backyard && !place.hasBackyard()) {
                    continue;
                }
                if (parking && !place.hasParking()) {
                    continue;
                }
                if (heating && !place.hasHeating()) {
                    continue;
                }
                if (pool && !place.hasPool()) {
                    continue;
                }
                if (kitchen && !place.hasKitchen()) {
                    continue;
                }
                if (tv && !place.hasTV()) {
                    continue;
                }
                matchingPlaces.add(place);
            }
        }

        return matchingPlaces;

    }

}
