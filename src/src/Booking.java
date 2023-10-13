import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * Booking class represents the way the clients rent places.
 * @author Anastasios Zyngiridis
 */

public class Booking implements Serializable {

    private final ArrayList<Date> days;
    private Client person;
    private final PlaceToRent place;



    /**
     * Constructs and initializes a Booking on a place up for renting.
     * @param person the client that is renting.
     * @param place  the place that is getting rented.
     * @param daysToBook An ArrayList that takes in and saves all the days rented in each place.

     */
    public Booking(Client person, PlaceToRent place, ArrayList<Date> daysToBook)
    {
        this.person = person;
        this.place = place;
        this.days = daysToBook;

    }


    public Date getDate(int index)
    {
        return days.get(index);
    }

    public ArrayList<Date> getCalendar()
    {
        return days;
    }

    public int getNumberOfDays()
    {
        return days.size();
    }

    public PlaceToRent getPlace()
    {
        return place;
    }

    public Client getPerson()
    {
        return person;
    }

    public void setPerson(Client person)
    {
        this.person = person;
    }

    public Date startDate()
    {
        return days.get(0);
    }

    public Date endDate()
    {
        return days.get(days.size()-1);
    }


}





