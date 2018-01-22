package views;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import beans.CRMBean;

public interface NewClientCRMView extends TCRMView{
	
	public String getIdTextField();
	public void setIdTextField(String idTextField);	
	
	public String getPriceTextField();
	public void setPriceTextField(String priceTextField);
	
	public String getClientPhoneTextField();
	public void setClientPhoneTextField(String clientPhoneTextField);

	public String getClientEmailTextField();
	public void setClientEmailTextField(String clientEmailTextField);

	public String getStateTextField();
	public void setStateTextField(String stateTextField);

	public String getCompanyTextField();
	public void setCompanyTextField(String companyTextField);

	public String getFirstNameTextField();
	public void setFirstNameTextField(String firstNameTextField);

	public String getLastNameTextField();
	public void setLastNameTextField(String lastNameTextField);

	public String getProductTextField();
	public void setProductTextField(String productTextField);

	public String getCityTextField();
	public void setCityTextField(String cityTextField);

	public String getWebsiteTextField();
	public void setWebsiteTextField(String websiteTextField);

	public String getAddressTextField();
	public void setAddressTextField(String addressTextField);
	
	public String getContactsEmailTextField();
	public void setContactsEmailTextField(String contactsEmailTextField);

	public String getContactsPhoneTextField();
	public void setContactsPhoneTextField(String contactsPhoneTextField);

	public String getStatusTextField();
	public void setStatusTextField(String statusTextField);
	
	public String getIdLabelError();
	public void setIdLabelError(String idLabelError);
	
	public String getCompanyLabelError();
	public void setCompanyLabelError(String companyLabelError);
	
	public String getContactPhoneLabelError();
	public void setContactPhoneLabelError(String contactPhoneLabelError);
	
	public String getContactEmailLabelError();
	public void setContactEmailLabelError(String contactEmailLabelError);
	
	public String getWebsiteLabelError();
	public void setWebsiteLabelError(String websiteLabelError);
	
	public String getClientPhoneLabelError();
	public void setClientPhoneLabelError(String clientPhoneLabelError);
	
	public String getFirstNameLabelError();
	public void setFirstNameLabelError(String firstNameLabelError);
	
	public String getLastNameLabelError();
	public void setLastNameLabelError(String lastNameLabelError);
	
	public String getStatusLabelError();
	public void setStatusLabelError(String statusLabelError);
	
	public String getCityLabelError();
	public void setCityLabelError(String cityLabelError);
	
	public String getPriceLabelError();
	public void setPriceLabelError(String priceLabelError);
	
	public String getClientEmailLabelError();
	public void setClientEmailLabelError(String clientEmailLabelError);
	
	public String getAddressLabelError();
	public void setAddressLabelError(String addressLabelError);
	
	public String getStateLabelError();
	public void setStateLabelError(String stateLabelError);
	
	public String getProductLabelError();
	public void setProductLabelError(String productLabelError);
	
	int getSelectedContactIndex();
	void setSelectedContactIndex(int index);
	void setSelectContactItems(ArrayList<CRMBean> list);
	void setSelectContactListener(ActionListener listener);
	
	int getSelectedOppIndex();
	void setSelectedOppIndex(int index);
	void setSelectOppItems(ArrayList<CRMBean> list);
	void setSelectOppListener(ActionListener listener);

}
