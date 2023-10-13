import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserSearchLogicTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void searchClientsByFistAndLastName() {
        Client client = new Client("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        UserSearchLogic logic = new UserSearchLogic();
        UserBase.addClient(client);
        assertEquals(client.getFirstName(), logic.searchClientsByFistAndLastName("Test", "Test").get(0).getFirstName());
    }

    @Test
    void searchOwnersByFistAndLastName() {
        Owner owner = new Owner("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        UserSearchLogic logic = new UserSearchLogic();
        UserBase.addOwner(owner);
        assertEquals(owner.getLastName(), logic.searchOwnersByFistAndLastName("Test", "Test").get(0).getLastName());
    }

    @Test
    void searchClientsByFirstName() {
        Client client = new Client("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        UserSearchLogic logic = new UserSearchLogic();
        UserBase.addClient(client);
        assertEquals(client.getCountry(), logic.searchClientsByFirstName("Test").get(0).getCountry());
    }

    @Test
    void searchOwnersByFirstName() {
        Owner owner = new Owner("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        UserSearchLogic logic = new UserSearchLogic();
        UserBase.addOwner(owner);
        assertEquals(owner.getCity(), logic.searchOwnersByFirstName("Test").get(0).getCity());
    }

    @Test
    void searchClientsByLastName() {
        Client client = new Client("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        UserSearchLogic logic = new UserSearchLogic();
        UserBase.addClient(client);
        assertEquals(client.getPhoneNumber(), logic.searchClientsByLastName("Test").get(0).getPhoneNumber());
    }

    @Test
    void searchOwnersByLastName() {
        Owner owner = new Owner("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        UserSearchLogic logic = new UserSearchLogic();
        UserBase.addOwner(owner);
        assertEquals(owner.getEmail(), logic.searchOwnersByLastName("Test").get(0).getEmail());
    }
}