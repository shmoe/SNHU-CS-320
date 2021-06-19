package src;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Contact {
	static private List<String> IDs = new ArrayList<String>();
	private String ID = null;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contact() {
		if(ID != null)
			return;											// Return if ID already has been set.
		
		UUID id = UUID.randomUUID();
		while(IDs.contains(id.toString().substring(0, 10)))	// Loop until a unique 10 character ID is found
			id = UUID.randomUUID();
		
		ID = id.toString().substring(0, 10);				// Assign said 10 character ID to ID
	}
	public Contact(String firstName, String lastName, String phoneNumber, String address) {
		this();							// Set ID
		setFirstName(firstName);		// Set firstName
		setLastName(lastName);			// Set lastName
		setPhoneNumber(phoneNumber);	// Set phoneNumber
		setAddress(address);			// Set address
	}
	
	public String getID() {
		return ID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		if(firstName == null)
			firstName = "";
		
		if(firstName.length() > 10)
			this.firstName = firstName.substring(0,10);
		else
			this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		if(lastName == null)
			lastName = "";
		
		if(lastName.length() > 10)
			this.lastName = lastName.substring(0, 10);
		else
			this.lastName = lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		if(phoneNumber == null || phoneNumber.length() != 10)
			phoneNumber = "0000000000";
		
		this.phoneNumber = phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if(address == null)
			address = "";
		
		if(address.length() > 30)
			this.address = address.substring(0,30);
		else
			this.address = address;
	}
	
}
