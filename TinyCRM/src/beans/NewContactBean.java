package beans;

public class NewContactBean extends CRMBean{

	private String firstName;
	private String lastName;
	private String contactPhone;
	private String contactEmail;
	private String company;
	private String position;
	
	public NewContactBean(long id) {
		super(id);
		
		firstName = "";
		lastName = "";
		contactEmail = "";
		contactPhone = "";
		company = "";
		position = "";
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

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String getDescription() {
		return company;
	}
	
	public String toString() {
		return this.getId() + ": " + this.getFirstName() + " " + this.getLastName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof NewContactBean) {
			NewContactBean c = (NewContactBean) o;
			return (c.getId() == this.getId());
		}
		return false;
	}
	
}
