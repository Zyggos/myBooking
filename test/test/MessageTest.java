import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testToString() {
        Admin admin = new Admin("Test", "Admin","testadmin@gmail.com","testpassword");
        Message message = new Message(admin, "Hello");
        assertEquals(message.toString(), "Test Admin:Hello");
    }
}