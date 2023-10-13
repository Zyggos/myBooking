import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getNumberOfBookings() {
        Client client = new Client("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        Owner owner = new Owner("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        PlaceToRent place = new PlaceToRent(owner, "test", "test", "test", "test", "0",0,0,0,true,true,true,true,true,true,true,null, "test");
        Date date = new Date(5,5,5);
        ArrayList<Date> dates = new ArrayList<>();
        dates.add(date);
        Booking booking = new Booking(client, place, dates);
        client.addBooking(booking);
        assertEquals(client.getNumberOfBookings(), 1);

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
        client.addBooking(booking);
        assertEquals(client.getBooking(0), booking);
    }

    @Test
    void removeBooking() {
        Client client = new Client("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        Owner owner = new Owner("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        PlaceToRent place = new PlaceToRent(owner, "test", "test", "test", "test", "0", 0, 0, 0, true, true, true, true, true, true, true, null, "test");
        Date date = new Date(5, 5, 5);
        ArrayList<Date> dates = new ArrayList<>();
        dates.add(date);
        Booking booking = new Booking(client, place, dates);
        client.addBooking(booking);
        client.removeBooking(booking);
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            client.getBooking(0);
        });
    }

    @Test
    void getPhoneNumber() {
        Client client = new Client("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        assertEquals("0",client.getPhoneNumber());
    }

    @Test
    void getCountry() {
        Client client = new Client("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        assertEquals("test", client.getCountry());
    }

    @Test
    void getCity() {
        Client client = new Client("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        assertEquals("test", client.getCity());
    }

    @Test
    void getStreetname() {
        Client client = new Client("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        assertEquals("test",client.getStreetName());
    }

    @Test
    void getStreetNumber() {
        Client client = new Client("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        assertEquals(0,client.getStreetNumber());
    }

    @Test
    void setPhoneNumber() {
        Client client = new Client("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        client.setPhoneNumber("1");
        assertEquals("1", client.getPhoneNumber());
    }

    @Test
    void setCountry() {
        Client client = new Client("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        client.setCountry("test2");
        assertEquals("test2",client.getCountry());
    }

    @Test
    void setCity() {
        Client client = new Client("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        client.setCity("test2");
        assertEquals("test2",client.getCity());
    }

    @Test
    void setStreetName() {
        Client client = new Client("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        client.setStreetName("test2");
        assertEquals("test2",client.getStreetName());
    }
}