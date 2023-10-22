import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
    private ContactService contactService;

    @BeforeEach
    public void setUp() {
        contactService = new ContactService();
    }

    @Test
    public void testAddContact() {
        Contact contact = new Contact("01234", "Scott", "Bosdash", "0123456789", "456 Some Street");
        contactService.addContact(contact);

        Contact retrievedContact = contactService.getContact("01234");
        Assertions.assertEquals(contact, retrievedContact);

        // Extra assertions the contact
        Assertions.assertEquals("01234", retrievedContact.getContactID());
        Assertions.assertEquals("Scott", retrievedContact.getFirstName());
        Assertions.assertEquals("Bosdash", retrievedContact.getLastName());
        Assertions.assertEquals("0123456789", retrievedContact.getPhone());
        Assertions.assertEquals("456 Some Street", retrievedContact.getAddress());
    }

    @Test
    public void testDeleteContact() {
        Contact contact = new Contact("01234", "Scott", "Bosdash", "0123456789", "456 Some Street");
        contactService.addContact(contact);

        contactService.deleteContact("01234");

        Contact retrievedContact = contactService.getContact("01234");
        Assertions.assertNull(retrievedContact);
    }

    @Test
    public void testUpdateFirstName() {
        Contact contact = new Contact("01234", "Scott", "Bosdash", "0123456789", "456 Some Street");
        contactService.addContact(contact);

        contactService.updateFirstName("01234", "Tom");

        Contact retrievedContact = contactService.getContact("01234");
        Assertions.assertEquals("Tom", retrievedContact.getFirstName());
    }

    // Additional tests for other updates to methods or edge cases
}
