import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationLogicTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void addNewUser() {
        RegistrationLogic logic  = new RegistrationLogic();
        logic.setUserType('C');
        logic.setFirstName("Test");
        logic.setLastName("Test");
        logic.setEmail("email@gmail.com");
        logic.setPassword("password");
        logic.setPhoneNumber("1234123412");
        logic.setCountry("test");
        logic.setCity("test");
        logic.setStreetName("test");
        logic.setStreetNumber("12");
        logic.addNewUser();
        assertEquals(UserBase.getClient(0).getFirstName(), "Test");
    }
}