package views;

public interface NewContactCRMView extends TCRMView{
	
	public String getFirstNameText();
	public void setFirstNameText(String firstName);
	
	public String getLastNameText();
	public void setLastNameText(String lastName);
	
	public String getContactPhoneText();
	public void setContactPhoneText(String contactPhone);
	
	public String getContactEmailText();
	public void setContactEmailText(String contactEmail);
	
	public String getCompanyText();
	public void setCompanyText(String company);
	
	public String getPositionText();
	public void setPositionText(String position);
	
	public String getCompanyLblError();
	public void setCompanyLblError(String companyError);
	
	public String getPositionLblError();
	public void setPositionLblError(String positionError);
	
	public String getContactEmailLblError();
	public void setContactEmailLblError(String emailError);
	
	public String getContactPhoneLblError();
	public void setContactPhoneLblError(String phoneError);
	
	public String getFirstNameLblError();
	public void setFisrtNameLblError(String firstError);
	
	public String getLastNameLblError();
	public void setLastNameLblError(String lastError);
	
}
