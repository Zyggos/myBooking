import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getOwnersPlacesForRent() {
        Owner owner = new Owner("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        PlaceToRent place = new PlaceToRent(owner, "test", "test", "test", "test", "0",0,0,0,true,true,true,true,true,true,true,null, "test");
        PlaceToRent place2 = new PlaceToRent(owner, "test2", "test", "test", "test", "0",0,0,0,true,true,true,true,true,true,true,null, "test");
        owner.addPlace(place);
        owner.addPlace(place2);
        ArrayList<PlaceToRent> places = new ArrayList<>();
        places.add(place);
        places.add(place2);
        assertEquals(places,owner.getOwnersPlacesForRent());
    }

    @Test
    void getNumberOfPlacesForRent() {
        Owner owner = new Owner("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        PlaceToRent place = new PlaceToRent(owner, "test", "test", "test", "test", "0",0,0,0,true,true,true,true,true,true,true,null, "test");
        PlaceToRent place2 = new PlaceToRent(owner, "test2", "test", "test", "test", "0",0,0,0,true,true,true,true,true,true,true,null, "test");
        owner.addPlace(place);
        owner.addPlace(place2);

        assertEquals(2, owner.getNumberOfPlacesForRent());
    }

    @Test
    void addPlace() {
        Owner owner = new Owner("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        PlaceToRent place = new PlaceToRent(owner, "test", "test", "test", "test", "0",0,0,0,true,true,true,true,true,true,true,null, "test");
        owner.addPlace(place);
        assertEquals(place, owner.getPlaceOfRenting(0));
    }

    @Test
    void removePlaceOfRenting() {
        Owner owner = new Owner("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        PlaceToRent place = new PlaceToRent(owner, "test", "test", "test", "test", "0",0,0,0,true,true,true,true,true,true,true,null, "test");
        owner.addPlace(place);
        owner.removePlaceOfRenting(0);
        assertEquals(0,owner.getNumberOfPlacesForRent());
    }

    @Test
    void getPlaceOfRenting() {
        Owner owner = new Owner("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        PlaceToRent place = new PlaceToRent(owner, "test", "test", "test", "test", "0",0,0,0,true,true,true,true,true,true,true,null, "test");
        owner.addPlace(place);
        assertEquals(place, owner.getPlaceOfRenting(0));
    }
}