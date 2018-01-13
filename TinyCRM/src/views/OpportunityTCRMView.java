package views;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import beans.CRMBean;

public interface OpportunityTCRMView extends TCRMView {

	int getSelectedClientIndex();
	void setSelectedClientIndex(int index);
	void setSelectClientItems(ArrayList<CRMBean> list);
	void setSelectClientListener(ActionListener listener);
	
	public String getTextId();
	public String getTextStatus();
	public String getTextPrice();
	public String getTextClose(); 
	public String getTextDescription();   
	
	public String getErrorStatus();
	public String getErrorPrice();
	public String getErrorClose();
	public String getErrorDescription();

	public void setErrorStatus(String errorStatus);
	public void setErrorPrice(String errorPrice);
	public void setErrorClose(String errorClose);
	public void setErrorDescription(String errorDescription) ;
	
	public void setTextId(String textId);
	public void setTextStatus(String textStatus);
	public void setTextPrice(String textPrice);
	public void setTextClose(String textClose);
	public void setTextDescription(String textDescription);
}
