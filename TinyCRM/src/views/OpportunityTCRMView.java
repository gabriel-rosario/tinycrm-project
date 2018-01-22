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
	public String getTextCloseDate(); 
	public String getTextDescription();
	public String getTextProduct();
	public String getTextQuantity();
	public String getTextPPU();
	
	public String getErrorStatus();
	public String getErrorPrice();
	public String getErrorCloseDate();
	public String getErrorDescription();
	public String getErrorProduct();
	public String getErrorQuantity();
	public String getErrorPPU();

	public void setErrorStatus(String errorStatus);
	public void setErrorPrice(String errorPrice);
	public void setErrorCloseDate(String errorClose);
	public void setErrorDescription(String errorDescription) ;
	public void setErrorProduct(String errorProduct) ;
	public void setErrorQuantity(String errorQuantity) ;
	public void setErrorPPU(String errorPPU) ;
	
	public void setTextId(String textId);
	public void setTextStatus(String textStatus);
	public void setTextPrice(String textPrice);
	public void setTextCloseDate(String textClose);
	public void setTextDescription(String textDescription);
	public void setTextProduct(String textProduct);
	public void setTextQuantity(String textQuantity);
	public void setTextPPU(String textPPU);
}
