package beans;

public class OpportunityBean extends CRMBean {
	
	private String clientID;
	private String status;
	private String price;
	private String close;
	private String description;
	
	public OpportunityBean (long id) {
		super(id);
		
		clientID = "";
		status = "";
		price = "";
		close = "";
		description = "";
		
	}

	public String getClientID() {return clientID;}
	public String getStatus() {return status;}
	public String getPrice() {return price;}
	public String getClose() {return close;}
	public String getDescriptionOpp() {return description;}

	public void setClientID(String clientID) {this.clientID = clientID;}
	public void setStatus(String status) {this.status = status;}
	public void setPrice(String price) {this.price = price;}
	public void setClose(String close) {this.close = close;}
	public void setDescription(String description) {this.description = description;}

	public String getDescription() {
		return clientID;
	}
	
	public boolean equals(Object o) {
		if (o instanceof OpportunityBean) {
			OpportunityBean b = (OpportunityBean) o;
			return (b.getId() == this.getId());
		}
		return false;
	}
	
}
