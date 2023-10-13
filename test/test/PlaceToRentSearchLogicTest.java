import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PlaceToRentSearchLogicTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void search() {
        Owner owner = new Owner("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        PlaceToRent place = new PlaceToRent(owner, "test", "test", "test", "test", "0",1,1,1,true,true,true,true,true,true,true,null, "test");
        UserBase.addOwner(owner);
        owner.addPlace(place);
        PlaceToRentSearchLogic logic = new PlaceToRentSearchLogic("test", "test", "test", 0, 5,0,5,0,5,true,false,false,false,false,false,false);
        ArrayList<PlaceToRent> matchingPlaces;
        matchingPlaces = logic.search();
        assertEquals(place,matchingPlaces.get(0));
    }
}