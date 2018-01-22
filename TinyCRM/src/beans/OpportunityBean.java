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
		
	}

	public String getClientID() {return clientID;}
	public String getStatus() {return status;}
	public String getPrice() {return price;}
	public String getClose() {return close;}
	public String getDescriptionOpp() {return description;}
	public String getProduct() {return product;}
	public String getQuantity() {return quantity;}
	public String getPPU() {return ppu;}

	public void setClientID(String clientID) {this.clientID = clientID;}
	public void setStatus(String status) {this.status = status;}
	public void setPrice(String price) {this.price = price;}
	public void setClose(String close) {this.close = close;}
	public void setDescription(String description) {this.description = description;}
	public void setProduct(String product) {this.product = product;}
	public void setQuantity(String quantity) {this.quantity = quantity;}
	public void setPPU(String ppu) {this.ppu = ppu;}

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
