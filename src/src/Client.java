import java.io.Serial;
import java.io.Serializable;
import java.util.*;

/**
 * The class that represents the people that rent a place.
 * @author Dimitris Kleitsas
 * @author Anastasios Zyngiridis
 */
public class Client extends User implements Serializable {

    @Serial
    private static final long serialVersionUID = 5573207804815181223L;

    private String phoneNumber;
    private String country;
    private String city;
    private String streetName;
    private final int streetNumber;
    private final ArrayList<Booking> bookings;
    private int numberOfBookings;



    Client(String firstName, String lastName, String email, String password, String phoneNumber, String country, String city, String streetName, int streetNumber){
        super(firstName, lastName, email, password);
        this.phoneNumber = phoneNumber;
        this.country = country;
        this.city = city;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.bookings = new ArrayList<>();
        numberOfBookings = 0;
    }





    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getCountry(){
        return country;
    }

    public String getCity(){
        return city;
    }

    public String getStreetName(){
        return streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public Booking getBooking(int index)
    {
        return bookings.get(index);
    }

    public int getNumberOfBookings()
    {
        return numberOfBookings;
    }



    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public void setCountry(String country) { this.country = country; }

    public void setCity(String city) { this.city = city; }

    public void setStreetName(String streetName) { this.streetName = streetName; }



    /**
     * Adds the new booking in the ArrayList and add up the counter that shows how many bookings the client has.
     * @param booking the new booking that get put in the ArrayList.
     */
    public void addBooking(Booking booking)
    {
        bookings.add(booking);
        numberOfBookings++;
    }

    /**
     * Removes the booking in the ArrayList of the client and subtracts one to the counter that shows
     * how many bookings the client has.
     * @param booking the booking that the client wants to remove.
     */
    public void removeBooking(Booking booking)
    {
        bookings.remove(booking);
        numberOfBookings--;
    }





}

