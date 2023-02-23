
public class PersonCode {
	
	private String firstName;
	private String lastName;
	private String emailAddress;
	
	public PersonCode(String fName, String lName, String email) {
		this.firstName=fName;
		this.lastName=lName;
		this.emailAddress=email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return firstName + " "+lastName + " (" + emailAddress + ")";
	}
	
	
	
}
