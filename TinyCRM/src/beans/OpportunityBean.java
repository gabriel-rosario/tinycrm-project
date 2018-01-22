package beans;

public class OpportunityBean extends CRMBean {
	
	private String clientID;
	private String status;
	private String price;
	private String close;
	private String description;
	private String product;
	private String quantity;
	private String ppu;
	private String phone;
	private String email;
	private String address;
	private String city;
	private String state;
	
	public OpportunityBean (long id) {
		super(id);
		
		clientID = "";
		status = "";
		price = "";
		close = "";
		description = "";
		product = "";
		quantity = "";
		ppu = "";
		phone = "";
		email = "";
		address = "";
		city = "";
		state = "";
		
	}

	public String getClientID() {return clientID;}
	public String getStatus() {return status;}
	public String getPrice() {return price;}
	public String getClose() {return close;}
	public String getDescriptionOpp() {return description;}
	public String getProduct() {return product;}
	public String getQuantity() {return quantity;}
	public String getPPU() {return ppu;}
	public String getPhone() {return phone;}
	public String getEmail() {return email;}
	public String getAddress() {return address;}
	public String getCity() {return city;}
	public String getState() {return state;}
	

	public void setClientID(String clientID) {this.clientID = clientID;}
	public void setStatus(String status) {this.status = status;}
	public void setPrice(String price) {this.price = price;}
	public void setClose(String close) {this.close = close;}
	public void setDescription(String description) {this.description = description;}
	public void setProduct(String product) {this.product = product;}
	public void setQuantity(String quantity) {this.quantity = quantity;}
	public void setPPU(String ppu) {this.ppu = ppu;}
	public void setPhone(String phone) {this.phone = phone;}
	public void setEmail(String email) {this.email = email;}
	public void setAddress(String address) {this.address = address;}
	public void setCity(String city) {this.city = city;}
	public void setState(String state) {this.state = state;}

	public String getDescription() {
		return product;
	}
	
	public boolean equals(Object o) {
		if (o instanceof OpportunityBean) {
			OpportunityBean b = (OpportunityBean) o;
			return (b.getId() == this.getId());
		}
		return false;
	}
	
}
