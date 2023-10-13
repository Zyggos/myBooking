import java.io.Serializable;
import java.util.*;

/**
 * Class that represents the places up for rent
 * @author Anastasios Zyngiridis
 */
public class PlaceToRent implements Serializable
{
    private final Owner owner;
    private String type;
    private String country, city, streetName, streetNumber;
    private int price_per_day;
    private int square_feet;
    private int total_cancelled_bookings;
    private int rooms;
    private boolean wifi;
    private boolean parking;
    private boolean kitchen;
    private boolean heating;
    private boolean backyard;
    private boolean tv;
    private boolean pool;
    private int allTime_total_bookings;
    private final ArrayList<Booking> bookings;
    private ArrayList<String> pictures;
    private final String description;


    /**
     * Constructs and initializes a PlaceToRent with its info
     *
     */

    public PlaceToRent(Owner owner, String type, String country, String city, String streetName, String streetNumber, int price_per_day, int square_feet, int rooms, boolean wifi, boolean parking, boolean kitchen, boolean heating, boolean backyard, boolean tv, boolean pool, ArrayList<String> pictures, String description)
    {
        this.owner = owner;
        this.type = type;
        this.country = country;
        this.city = city;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.price_per_day = price_per_day;
        this.square_feet = square_feet;
        this.rooms = rooms;
        this.wifi = wifi;
        this.parking = parking;
        this.kitchen = kitchen;
        this.heating = heating;
        this.backyard = backyard;
        this.tv = tv;
        this.pool = pool;
        this.allTime_total_bookings = 0;
        this.total_cancelled_bookings = 0;
        this.bookings = new ArrayList<>();
        this.pictures = pictures;
        this.description = description;

    }

    /**
     * This method shows all the information about this property, such as who owns it, what type of property it is,
     * where it's located etc.
     */
    public void showPlaceInfo()
    {
        System.out.println("Owner: " + owner.getFirstName() + " " + owner.getLastName());
        System.out.println("Type: " + type);
        System.out.println("Price per Day: " + price_per_day);
        System.out.println("Square feet: " + square_feet);
        System.out.println("Amount of rooms: " + rooms);
        if (wifi) { System.out.println("Has Wifi");}
        if (parking) { System.out.println("Has Parking"); }
        if (kitchen) { System.out.println("Has a Kitchen"); }
        if (heating) {System.out.println("Has Heating");}
        if (backyard) {System.out.println("Has a Backyard");}
        if (tv) {System.out.println("Has a TV");}
        if (pool) {System.out.println("Has a Pool");}

    }



    public boolean isAvailable(ArrayList<Date> daysToBook) {
        for (Booking b : this.bookings) {
            for (int i = 0; i < b.getNumberOfDays(); i++) {
                for (Date date : daysToBook) {
                    if (b.getDate(i).equals(date)) {
                        return false;
                    }
                }

            }
        }
        return true;
    }

    /**
     * Adds the Booking from the parameter to the ArrayList and adds up the total active bookings.
     * @param booking the Booking we want to add in the Array.
     */
    public void addBooking(Booking booking)
    {
        bookings.add(booking);
        allTime_total_bookings++;
    }

    /**
     * Removes the Booking of the ArrayList that you give in the parameter,adds up the total cancels and decreases
     * the total active bookings.
     * @param booking the Booking we want to remove.
     */
    public void removeBooking(Booking booking)
    {
        bookings.remove(booking);
        total_cancelled_bookings++;
    }

    public String getCountry() { return country; }
    public String getCity() { return city; }


    public int getTotal_cancelled_bookings() {
        return total_cancelled_bookings;
    }

    public int getAllTime_total_bookings() {
        return allTime_total_bookings;
    }

    public ArrayList<Booking> getBookings()
    {
        return bookings;
    }


    public String getType()
    {
        return type;
    }
    public int getRooms() { return rooms; }


    public boolean hasWifi() { return wifi; }

    public boolean hasBackyard() { return backyard; }

    public boolean hasHeating() { return heating; }

    public boolean hasPool() { return pool; }

    public boolean hasTV() { return tv; }

    public boolean hasParking() { return parking; }

    public boolean hasKitchen() { return kitchen; }


    public int getSquare_feet()
    {
        return square_feet;
    }
    public int getPrice_per_day()
    {
        return price_per_day;
    }
    public Owner getOwner()
    {
        return owner;
    }
    public String getDescription() { return description; }
    public ArrayList<String> getPictures() { return pictures; }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public String getLocation()
    {
        return streetName + " " + streetNumber+ " " + city + ", " + country;
    }

    public boolean isHeating() {
        return heating;
    }

    public void setHeating(boolean heating) {
        this.heating = heating;
    }

    public boolean isKitchen() {
        return kitchen;
    }

    public void setKitchen(boolean kitchen) {
        this.kitchen = kitchen;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public void setPool(boolean pool) { this.pool = pool; }

    public void setTv(boolean tv) { this.tv = tv; }

    public void setBackyard(boolean backyard) { this.backyard = backyard; }


    public void setType(String type)
    {
        this.type = type;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPrice_per_day(int price_per_day)
    {
        this.price_per_day = price_per_day;
    }
    public void setSquare_feet(int square_feet)
    {
        this.square_feet = square_feet;
    }
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
    public void setPictures(ArrayList<String> pictures) { this.pictures = pictures; }



}
