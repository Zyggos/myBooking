import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class BookingTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getDate() {
        Client client = new Client("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        Owner owner = new Owner("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        PlaceToRent place = new PlaceToRent(owner, "test", "test", "test", "test", "0",0,0,0,true,true,true,true,true,true,true,null, "test");
        Date date = new Date(5,5,5);
        ArrayList<Date> dates = new ArrayList<>();
        dates.add(date);
        Booking booking = new Booking(client, place, dates);

        assertEquals(booking.getDate(0), date);

    }

    @Test
    void getCalendar() {
        Client client = new Client("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        Owner owner = new Owner("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        PlaceToRent place = new PlaceToRent(owner, "test", "test", "test", "test", "0",0,0,0,true,true,true,true,true,true,true,null, "test");
        Date date = new Date(5,5,5);
        Date date2 = new Date(6,6,6);
        Date date3 = new Date(7,7,7);
        ArrayList<Date> dates = new ArrayList<>();
        dates.add(date);
        dates.add(date2);
        dates.add(date3);
        Booking booking = new Booking(client, place, dates);

        assertEquals(booking.getDate(0), date);
        assertEquals(booking.getDate(1), date2);
        assertEquals(booking.getDate(2), date3);
    }

    @Test
    void startDate() {
        Client client = new Client("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        Owner owner = new Owner("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        PlaceToRent place = new PlaceToRent(owner, "test", "test", "test", "test", "0",0,0,0,true,true,true,true,true,true,true,null, "test");
        Date date = new Date(5,5,5);
        Date date2 = new Date(6,6,6);
        Date date3 = new Date(7,7,7);
        ArrayList<Date> dates = new ArrayList<>();
        dates.add(date);
        dates.add(date2);
        dates.add(date3);
        Booking booking = new Booking(client, place, dates);

        assertEquals(booking.startDate(), date);

    }

    @Test
    void endDate() {
        Client client = new Client("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        Owner owner = new Owner("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        PlaceToRent place = new PlaceToRent(owner, "test", "test", "test", "test", "0",0,0,0,true,true,true,true,true,true,true,null, "test");
        Date date = new Date(5,5,5);
        Date date2 = new Date(6,6,6);
        Date date3 = new Date(7,7,7);
        ArrayList<Date> dates = new ArrayList<>();
        dates.add(date);
        dates.add(date2);
        dates.add(date3);
        Booking booking = new Booking(client, place, dates);


        assertEquals(booking.endDate(), date3);

    }

    @Test
    void getNumberOfDays() {
        Client client = new Client("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        Owner owner = new Owner("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        PlaceToRent place = new PlaceToRent(owner, "test", "test", "test", "test", "0",0,0,0,true,true,true,true,true,true,true,null, "test");
        Date date = new Date(5,5,5);
        Date date2 = new Date(6,6,6);
        Date date3 = new Date(7,7,7);
        ArrayList<Date> dates = new ArrayList<>();
        dates.add(date);
        dates.add(date2);
        dates.add(date3);
        Booking booking = new Booking(client, place, dates);

        assertEquals(3, booking.getNumberOfDays());

    }

    @Test
    void getPlace() {
        Client client = new Client("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        Owner owner = new Owner("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        PlaceToRent place = new PlaceToRent(owner, "test", "test", "test", "test", "0",0,0,0,true,true,true,true,true,true,true,null, "test");
        Date date = new Date(5,5,5);
        Date date2 = new Date(6,6,6);
        Date date3 = new Date(7,7,7);
        ArrayList<Date> dates = new ArrayList<>();
        dates.add(date);
        dates.add(date2);
        dates.add(date3);
        Booking booking = new Booking(client, place, dates);
        assertEquals(place, booking.getPlace());
    }

    @Test
    void setPerson() {
        Client client = new Client("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        Owner owner = new Owner("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        PlaceToRent place = new PlaceToRent(owner, "test", "test", "test", "test", "0",0,0,0,true,true,true,true,true,true,true,null, "test");
        Date date = new Date(5,5,5);
        Date date2 = new Date(6,6,6);
        Date date3 = new Date(7,7,7);
        ArrayList<Date> dates = new ArrayList<>();
        dates.add(date);
        dates.add(date2);
        dates.add(date3);
        Booking booking = new Booking(null, place, dates);
        booking.setPerson(client);
        assertEquals(client, booking.getPerson());
    }

    @Test
    void getPerson() {
        Client client = new Client("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        Owner owner = new Owner("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        PlaceToRent place = new PlaceToRent(owner, "test", "test", "test", "test", "0",0,0,0,true,true,true,true,true,true,true,null, "test");
        Date date = new Date(5,5,5);
        Date date2 = new Date(6,6,6);
        Date date3 = new Date(7,7,7);
        ArrayList<Date> dates = new ArrayList<>();
        dates.add(date);
        dates.add(date2);
        dates.add(date3);
        Booking booking = new Booking(client, place, dates);
        assertEquals(client, booking.getPerson());
    }
}

