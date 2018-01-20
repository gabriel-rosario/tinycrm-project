package swingViews;

import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;

import beans.CRMBean;
import beans.ClientBean;
import views.ClientTCRMView;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JTextField;

public class NewClientSwingView extends NewSwingView {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;

	public NewClientSwingView() {
		super();
		setTitle("Clients");
		
		JScrollPane centerScrollPane = new JScrollPane();
		centerScrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		centerScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		centerScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		setCenterPanel(centerScrollPane);
		
		JPanel centerGrid = new JPanel();
		centerScrollPane.setViewportView(centerGrid);
		GridBagLayout gbl_centerGrid = new GridBagLayout();
		gbl_centerGrid.columnWidths = new int[] {100, 150, 100, 150, 0};
		gbl_centerGrid.rowHeights = new int[] {30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
		gbl_centerGrid.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_centerGrid.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		centerGrid.setLayout(gbl_centerGrid);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 0;
		centerGrid.add(lblId, gbc_lblId);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.WEST;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		centerGrid.add(textField, gbc_textField);
		textField.setColumns(10);
	}

//	public String getTextId()        { return ""; //textId.getText(); }
//	public String getTextCompany()   { return textCompany.getText(); }
//	public String getTextTelephone() { return textTelephone.getText(); }
//	public String getTextEmail()     { return textEmail.getText(); }
//	public String getTextWebsite()   { return textWebsite.getText(); }
//	public String getTextFacebook()  { return textFacebook.getText(); }
//
//	public void setTextId(String textId)              { this.textId.setText(textId); }
//	public void setTextCompany(String textCompany)    { this.textCompany.setText(textCompany); }
//	public void setTextTelephone(String textTelephoe) { this.textTelephone.setText(textTelephoe); }
//	public void setTextEmail(String textEmail)        { this.textEmail.setText(textEmail); }
//	public void setTextWebsite(String textWebsite)    { this.textWebsite.setText(textWebsite); }
//	public void setTextFacebook(String textFacebook)  { this.textFacebook.setText(textFacebook); }
//	
//	public String getErrorCompany()   { return companyLblError.getText(); }
//	public String getErrorTelephone() { return telephoneLblError.getText(); }
//	public String getErrorEmail()     { return emailLblError.getText(); }
//	public String getErrorWebsite()   { return websiteLblError.getText(); }
//	public String getErrorFacebook()  { return facebookLblError.getText(); }
//
//	public void setErrorCompany(String errorCompany)     { companyLblError.setText(errorCompany); }
//	public void setErrorTelephone(String errorFirstName) { telephoneLblError.setText(errorFirstName); }
//	public void setErrorEmail(String errorEmail)         { emailLblError.setText(errorEmail); }
//	public void setErrorWebsite(String errorWebsite)     { websiteLblError.setText(errorWebsite); }
//	public void setErrorFacebook(String errorFacebook)   { facebookLblError.setText(errorFacebook); }
	
	public void enableEditMode() { 
		super.enableEditMode();
		//textId.setEditable(true);
		
//		textCompany.setEditable(true);
//		textTelephone.setEditable(true);
//		textEmail.setEditable(true);
//		textWebsite.setEditable(true);
//		textFacebook.setEditable(true);
	}
	
	public void beanToForm(CRMBean bean) {
//		ClientBean cb = (ClientBean) bean;
//		this.setTextId(""+cb.getId());
//		this.setTextCompany(cb.getCompany());
//		this.setTextTelephone(cb.getTelephone());
//		this.setTextEmail(cb.getEmail());
//		this.setTextWebsite(cb.getWebsite());
//		this.setTextFacebook(cb.getFacebook());
	}
	
	public void formToBean(CRMBean bean) {
//		ClientBean cb = (ClientBean) bean;
//		// cb.setId(Integer.parseInt(textId.getText()));  // Id is never editable
//		cb.setCompany(textCompany.getText());
//		cb.setTelephone(textTelephone.getText());
//		cb.setEmail(textEmail.getText());
//		cb.setWebsite(textWebsite.getText());
//		cb.setFacebook(textFacebook.getText());
	}
	
	public void disableEditMode() {
		super.disableEditMode();
		// Make all fields not editable
//		textId.setEditable(false);
//		textCompany.setEditable(false);
//		textTelephone.setEditable(false);
//		textEmail.setEditable(false);
//		textWebsite.setEditable(false);
//		textFacebook.setEditable(false);
	}

	public void clearForm() {
//		textId.setText("");
//		textCompany.setText("");
//		textTelephone.setText("");
//		textEmail.setText("");
//		textWebsite.setText("");
//		textFacebook.setText("");
		clearFieldErrors();
	}
	
	public void clearFieldErrors() {
//		idLblError.setText("");
//		companyLblError.setText("");
//		telephoneLblError.setText("");
//		emailLblError.setText("");
//		websiteLblError.setText("");
//		facebookLblError.setText("");
	}
}
