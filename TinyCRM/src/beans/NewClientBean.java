package beans;

public class NewClientBean extends CRMBean{

	String company;
	String clientPhone;
	String clientEmail;
	String website;
	String address;
	String city;
	String state;
	
	public NewClientBean(long id) {
		super(id);
		company = "";
		clientPhone = "";
		clientEmail = "";
		website = "";
		address = "";
		city = "";
		state = "";
		
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getClientPhone() {
		return clientPhone;
	}

	public void setClientPhone(String clientPhone) {
		this.clientPhone = clientPhone;
	}

	public String getClientEmail() {
		return clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDescription() {
		return company;
	}
	
	public String toString() {
		return this.getId() + ": " + this.getCompany();
	}
	
	public boolean equals(Object o) {
		if (o instanceof ClientBean) {
			ClientBean c = (ClientBean) o;
			return (c.getId() == this.getId());
		}
		return false;
	}

}
