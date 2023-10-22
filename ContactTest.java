import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactTest {
    @Test
    public void testContactCreation() {
        Contact contact = new Contact("01234", "Scott", "Bosdash", "0123456789", "456 Some Street");
        Assertions.assertEquals("01234", contact.getContactID());
        Assertions.assertEquals("Scott", contact.getFirstName());
        Assertions.assertEquals("Bosdash", contact.getLastName());
        Assertions.assertEquals("0123456789", contact.getPhone());
        Assertions.assertEquals("456 Some Street", contact.getAddress());
    }

    // Additional tests go here if needed
}
