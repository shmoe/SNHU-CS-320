package src;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
	private Map<String, Contact> contacts;
	
	private void add(Contact contact) {
		contacts.put(contact.getID(), contact);
	}
	
	public ContactService() {
		contacts = new HashMap<String, Contact>();
	}
	
	public String add(String firstName, String lastName, String phoneNumber, String address) {
		Contact toAdd = new Contact(firstName, lastName, phoneNumber, address);
		this.add(toAdd);
		
		return toAdd.getID();
	}
	
	public Contact get(String UUID) {
		return contacts.get(UUID);
	}
	
	public void remove(String UUID) {
		contacts.remove(UUID);
	}
	
	public void setField(String UUID, String field, String value) {
		Contact contact = contacts.get(UUID);
		
		switch(field.toLowerCase()) {
		case "firstname":
		case "first name":
			contact.setFirstName(value);
			break;
		
		case "lastname":
		case "last name":
			contact.setLastName(value);
			break;
		
		case "phonenumber":
		case "phone number":
			contact.setPhoneNumber(value);
			break;
		
		case "address":
			contact.setAddress(value);
			break;
			
		default:
			break;
		}
	}
}
