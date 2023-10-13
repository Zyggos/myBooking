import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogInLogicTest {

    @Test
    void setEmail() {
        LogInLogic logic = new LogInLogic();
        logic.setEmail("email");
        assertEquals("email",logic.email);
    }

    @Test
    void setPassword() {
        LogInLogic logic = new LogInLogic();
        logic.setPassword("password");
        assertEquals("password",logic.password);
    }

    @Test
    void verifyInfo() {
        Admin testAdmin = new Admin("Test", "Admin","testadmin@gmail.com","test");
        Client client = new Client("Test", "Test", "testclient@gmail.com", "test", "0", "test", "test", "test", 0);
        Owner owner = new Owner("Test", "Test", "testowner@gmail.com", "test", "0", "test", "test", "test", 0);
        UserBase.addAdmin(testAdmin);
        UserBase.addClient(client);
        UserBase.addOwner(owner);

        LogInLogic logic = new LogInLogic();
        logic.setEmail("testadmin@gmail.com");
        logic.setPassword("test");

        assertEquals(logic.verifyInfo(),true);

        logic.setEmail("testowner@gmail.com");
        logic.setPassword("test");

        assertEquals(logic.verifyInfo(),true);

        logic.setEmail("testclient@gmail.com");
        logic.setPassword("test");

        assertEquals(logic.verifyInfo(),true);
    }
}