package swingViews;

public class OppForComboBox {
	private long id;
	private String description;

	protected OppForComboBox(long id, String description) {
		this.id = id;
		this.description = description;
	}

	protected long getId() {
		return id;
	}
	
	protected String getDescription() {
		return description;
	}
	protected void setId(long id) {
		this.id = id;
	}
	protected void setDescription(String description) {
		this.description = description;
	}
	
	// toString() called by JComboBox to obtain display text for item
	public String toString() {
		return description;
	}
}
