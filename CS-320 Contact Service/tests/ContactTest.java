package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import src.Contact;

class ContactTest {

	@Test
	void testContactStringStringStringString() {
		final String firstName = "Griffin";
		final String lastName = "Nelson";
		final String phoneNumber = "4135556666";
		final String address = "123 Fake street, Walawala WA";
		Contact contact = new Contact(firstName,lastName,phoneNumber, address);
		
		assert(contact.getID() != null);
		assertEquals(firstName, contact.getFirstName());
		assertEquals(lastName, contact.getLastName());
		assertEquals(phoneNumber, contact.getPhoneNumber());
		assertEquals(address, contact.getAddress());
	}

	@Test
	void testGetID() {
		Contact contact = new Contact();
		assert(contact.getID() != null);
		assert(contact.getID().length() <= 10);
	}

	@Test
	void testGetFirstName() {
		final String lastName = "Nelson";
		final String phoneNumber = "4135556666";
		final String address = "123 Fake street, Walawala WA";
		
		Contact contact = new Contact(null,lastName,phoneNumber, address);
		assert(contact.getFirstName() != null);
		assert(contact.getFirstName().length() <= 10);
		
		contact = new Contact("012345678910",lastName,phoneNumber, address);
		assert(contact.getFirstName() != null);
		assert(contact.getFirstName().length() <= 10);
	}

	@Test
	void testGetLastName() {
		final String firstName = "Griffin";
		final String phoneNumber = "4135556666";
		final String address = "123 Fake street, Walawala WA";
		
		Contact contact = new Contact(firstName, null, phoneNumber, address);
		assert(contact.getLastName() != null);
		assert(contact.getLastName().length() <= 10);
		
		contact = new Contact(firstName, "012345678910", phoneNumber, address);
		assert(contact.getLastName() != null);
		assert(contact.getLastName().length() <= 10);
	}

	@Test
	void testGetPhoneNumber() {
		final String firstName = "Griffin";
		final String lastName = "Nelson";
		final String address = "123 Fake street, Walawala WA";
		
		Contact contact = new Contact(firstName,lastName, null, address);
		assert(contact.getPhoneNumber() != null);
		assert(contact.getPhoneNumber().length() == 10);
		
		contact = new Contact(firstName, lastName, "012345678910", address);
		assert(contact.getPhoneNumber() != null);
		assert(contact.getPhoneNumber().length() == 10);
	}

	@Test
	void testGetAddress() {
		final String firstName = "Griffin";
		final String lastName = "Nelson";
		final String phoneNumber = "4135556666";
		
		Contact contact = new Contact(firstName,lastName, phoneNumber, null);
		assert(contact.getAddress() != null);
		assert(contact.getAddress().length() <= 30);
		
		contact = new Contact(firstName,lastName, phoneNumber, "01234567890123456789012345678910");
		assert(contact.getAddress() != null);
		assert(contact.getAddress().length() <= 30);
	}

}
