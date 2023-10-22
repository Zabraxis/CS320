//Need to import hash map 
import java.util.HashMap;
import java.util.Map;
// Initialize the class 
public class ContactService {
    private Map<String, Contact> contacts;

    public ContactService() {
        this.contacts = new HashMap<>();
    }

    public void addContact(Contact contact) {
        contacts.put(contact.getContactID(), contact);
    }

    public void deleteContact(String contactID) {
        contacts.remove(contactID);
    }

    public void updateFirstName(String contactID, String firstName) {
        Contact contact = contacts.get(contactID);
        if (contact != null) {
            contact.setFirstName(firstName);
        }
    }

    public void updateLastName(String contactID, String lastName) {
        Contact contact = contacts.get(contactID);
        if (contact != null) {
            contact.setLastName(lastName);
        }
    }

    // Additional methods for phone/address

    public Contact getContact(String contactID) {
        return contacts.get(contactID);
    }
}