import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PlaceToRentTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isAvailable() {
        Client client = new Client("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        Owner owner = new Owner("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        PlaceToRent place = new PlaceToRent(owner, "test", "test", "test", "test", "0",0,0,0,true,true,true,true,true,true,true,null, "test");
        Date date = new Date(5,5,5);
        ArrayList<Date> dates = new ArrayList<>();
        dates.add(date);
        Booking booking = new Booking(client, place, dates);
        assertEquals(true,place.isAvailable(dates));
        place.addBooking(booking);
        assertEquals(false, place.isAvailable(dates));
    }

    @Test
    void addBooking() {
        Client client = new Client("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        Owner owner = new Owner("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        PlaceToRent place = new PlaceToRent(owner, "test", "test", "test", "test", "0",0,0,0,true,true,true,true,true,true,true,null, "test");
        Date date = new Date(5,5,5);
        ArrayList<Date> dates = new ArrayList<>();
        dates.add(date);
        Booking booking = new Booking(client, place, dates);
        place.addBooking(booking);
        assertEquals(booking,place.getBookings().get(0));
    }

    @Test
    void getTotal_cancelled_bookings() {
        Client client = new Client("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        Owner owner = new Owner("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        PlaceToRent place = new PlaceToRent(owner, "test", "test", "test", "test", "0",0,0,0,true,true,true,true,true,true,true,null, "test");
        Date date = new Date(5,5,5);
        ArrayList<Date> dates = new ArrayList<>();
        dates.add(date);
        Booking booking = new Booking(client, place, dates);
        place.addBooking(booking);
        place.removeBooking(booking);
        assertEquals(1,place.getTotal_cancelled_bookings());
    }

    @Test
    void getAllTime_total_bookings() {
        Client client = new Client("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        Owner owner = new Owner("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        PlaceToRent place = new PlaceToRent(owner, "test", "test", "test", "test", "0",0,0,0,true,true,true,true,true,true,true,null, "test");
        Date date = new Date(5,5,5);
        ArrayList<Date> dates = new ArrayList<>();
        dates.add(date);
        Booking booking = new Booking(client, place, dates);
        place.addBooking(booking);
        place.removeBooking(booking);
        place.addBooking(booking);
        place.removeBooking(booking);
        place.addBooking(booking);
        assertEquals(3,place.getAllTime_total_bookings());

    }

    @Test
    void getBookings() {
        Client client = new Client("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        Owner owner = new Owner("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        PlaceToRent place = new PlaceToRent(owner, "test", "test", "test", "test", "0",0,0,0,true,true,true,true,true,true,true,null, "test");
        Date date = new Date(5,5,5);
        ArrayList<Date> dates = new ArrayList<>();
        dates.add(date);
        Booking booking = new Booking(client, place, dates);
        place.addBooking(booking);
        assertEquals(booking,place.getBookings().get(0));
    }
}