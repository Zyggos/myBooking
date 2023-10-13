import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testSendMessage() {
        String message = "Test message";
        Admin testAdmin = new Admin("Test", "Admin","testadmin@gmail.com","testpassword");
        User user = new User("Test", "User", "testuser@gmail.com","testpassword");

        testAdmin.sendMessage(user,message);
        assertEquals("Test Admin:" + message, user.getMessage(0).toString());

    }

    @Test
    void approveOwner() {
        Owner pendingOwner = new Owner("Test", "Test", "test", "test", "0", "test", "test", "test", 0);
        Admin testAdmin = new Admin("Test", "Admin","testadmin@gmail.com","testpassword");
        UserBase.addPendingOwner(pendingOwner);
        testAdmin.approveOwner(pendingOwner);
        assertEquals(UserBase.getOwner(0).getFirstName(),"Test");


    }
}