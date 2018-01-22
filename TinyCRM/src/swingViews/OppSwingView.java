package swingViews;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import beans.CRMBean;
import beans.OpportunityBean;
import views.OpportunityTCRMView;

import javax.swing.UIManager;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import java.awt.Panel;
import java.awt.Choice;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;

public class OppSwingView extends NewSwingView implements OpportunityTCRMView
{
	private JTextField idText;
	private JTextField ppuText;
	private JTextField quantityText;
	private JTextField priceText;
	private JTextField productText;
	private JTextField phoneText;
	private JTextField emailText;
	private JTextField closeDateText;
	private JTextField statusText;
	private JTextField addressText;
	private JTextField cityText;
	private JTextField stateLblError;
	
	private JLabel statusLblError;
	private JLabel priceLblError;
	private JLabel ppuLblError;
	private JLabel productLblError;
	private JLabel quantityLblError;
	private JLabel closeDateLblError;
	private JLabel descriptionLblError;
	
	JTextArea descriptionTextArea;
	
	private Choice choice;
	
	public OppSwingView() {
		super();
		setTitle("Opportunites");
		
		JScrollPane centerScrollPane = new JScrollPane();
		centerScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		centerScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		setCenterPanel(centerScrollPane);

		JPanel centerGrid = new JPanel();
		centerScrollPane.setViewportView(centerGrid);
		GridBagLayout gbl_centerGrid = new GridBagLayout();
		gbl_centerGrid.columnWidths = new int[] {100, 150, 100, 150};
		gbl_centerGrid.rowHeights = new int[] {30, 0, 30, 0, 30, 0, 30, 0, 0, 0, 30, 0, 30, 0, 0, 0, 0, 0, 30, 30};
		gbl_centerGrid.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0};
		gbl_centerGrid.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		centerGrid.setLayout(gbl_centerGrid);
		
		JLabel idLbl = new JLabel("ID:");
		idLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_idLbl = new GridBagConstraints();
		gbc_idLbl.anchor = GridBagConstraints.EAST;
		gbc_idLbl.insets = new Insets(0, 0, 5, 5);
		gbc_idLbl.gridx = 0;
		gbc_idLbl.gridy = 0;
		centerGrid.add(idLbl, gbc_idLbl);
		
		idText = new JTextField();
		idText.setText("1");
		idText.setEditable(false);
		GridBagConstraints gbc_idText = new GridBagConstraints();
		gbc_idText.anchor = GridBagConstraints.WEST;
		gbc_idText.insets = new Insets(0, 0, 5, 5);
		gbc_idText.gridx = 1;
		gbc_idText.gridy = 0;
		centerGrid.add(idText, gbc_idText);
		idText.setColumns(10);
		
		JLabel lblClient = new JLabel("Client:");
		lblClient.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lblClient = new GridBagConstraints();
		gbc_lblClient.anchor = GridBagConstraints.EAST;
		gbc_lblClient.insets = new Insets(0, 0, 5, 5);
		gbc_lblClient.gridx = 2;
		gbc_lblClient.gridy = 0;
		centerGrid.add(lblClient, gbc_lblClient);
		
		choice = new Choice();
		GridBagConstraints gbc_choice = new GridBagConstraints();
		gbc_choice.fill = GridBagConstraints.HORIZONTAL;
		gbc_choice.insets = new Insets(0, 0, 5, 0);
		gbc_choice.gridx = 3;
		gbc_choice.gridy = 0;
		centerGrid.add(choice, gbc_choice);
		
		JLabel lblProduct = new JLabel("Product:");
		lblProduct.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lblProduct = new GridBagConstraints();
		gbc_lblProduct.anchor = GridBagConstraints.EAST;
		gbc_lblProduct.insets = new Insets(0, 0, 5, 5);
		gbc_lblProduct.gridx = 0;
		gbc_lblProduct.gridy = 2;
		centerGrid.add(lblProduct, gbc_lblProduct);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lblPhone = new GridBagConstraints();
		gbc_lblPhone.anchor = GridBagConstraints.EAST;
		gbc_lblPhone.insets = new Insets(0, 0, 5, 5);
		gbc_lblPhone.gridx = 2;
		gbc_lblPhone.gridy = 2;
		centerGrid.add(lblPhone, gbc_lblPhone);
		
		phoneText = new JTextField();
		phoneText.setEditable(false);
		phoneText.setColumns(10);
		GridBagConstraints gbc_phoneText = new GridBagConstraints();
		gbc_phoneText.anchor = GridBagConstraints.WEST;
		gbc_phoneText.insets = new Insets(0, 0, 5, 0);
		gbc_phoneText.gridx = 3;
		gbc_phoneText.gridy = 2;
		centerGrid.add(phoneText, gbc_phoneText);
		
		productLblError = new JLabel("New label");
		productLblError.setForeground(Color.RED);
		productLblError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_productLblError = new GridBagConstraints();
		gbc_productLblError.anchor = GridBagConstraints.WEST;
		gbc_productLblError.insets = new Insets(0, 0, 5, 5);
		gbc_productLblError.gridx = 1;
		gbc_productLblError.gridy = 3;
		centerGrid.add(productLblError, gbc_productLblError);
		
		JLabel lblPPU = new JLabel("Price per unit:");
		lblPPU.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lblPPU = new GridBagConstraints();
		gbc_lblPPU.insets = new Insets(0, 0, 5, 5);
		gbc_lblPPU.anchor = GridBagConstraints.EAST;
		gbc_lblPPU.gridx = 0;
		gbc_lblPPU.gridy = 4;
		centerGrid.add(lblPPU, gbc_lblPPU);
		
		ppuText = new JTextField();
		GridBagConstraints gbc_ppuText = new GridBagConstraints();
		gbc_ppuText.anchor = GridBagConstraints.WEST;
		gbc_ppuText.insets = new Insets(0, 0, 5, 5);
		gbc_ppuText.gridx = 1;
		gbc_ppuText.gridy = 4;
		centerGrid.add(ppuText, gbc_ppuText);
		ppuText.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 2;
		gbc_lblEmail.gridy = 4;
		centerGrid.add(lblEmail, gbc_lblEmail);
		
		emailText = new JTextField();
		emailText.setEditable(false);
		emailText.setColumns(10);
		GridBagConstraints gbc_emailText = new GridBagConstraints();
		gbc_emailText.anchor = GridBagConstraints.WEST;
		gbc_emailText.insets = new Insets(0, 0, 5, 0);
		gbc_emailText.gridx = 3;
		gbc_emailText.gridy = 4;
		centerGrid.add(emailText, gbc_emailText);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lblQuantity = new GridBagConstraints();
		gbc_lblQuantity.anchor = GridBagConstraints.EAST;
		gbc_lblQuantity.insets = new Insets(0, 0, 5, 5);
		gbc_lblQuantity.gridx = 0;
		gbc_lblQuantity.gridy = 6;
		centerGrid.add(lblQuantity, gbc_lblQuantity);
		
		JLabel lblAddressStreet = new JLabel("Address Street:");
		lblAddressStreet.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lblAddressStreet = new GridBagConstraints();
		gbc_lblAddressStreet.anchor = GridBagConstraints.EAST;
		gbc_lblAddressStreet.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddressStreet.gridx = 2;
		gbc_lblAddressStreet.gridy = 6;
		centerGrid.add(lblAddressStreet, gbc_lblAddressStreet);
		
		addressText = new JTextField();
		addressText.setEditable(false);
		addressText.setColumns(10);
		GridBagConstraints gbc_addressText = new GridBagConstraints();
		gbc_addressText.anchor = GridBagConstraints.WEST;
		gbc_addressText.insets = new Insets(0, 0, 5, 0);
		gbc_addressText.gridx = 3;
		gbc_addressText.gridy = 6;
		centerGrid.add(addressText, gbc_addressText);
		
		quantityLblError = new JLabel("New label");
		quantityLblError.setForeground(Color.RED);
		quantityLblError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_quantityLblError = new GridBagConstraints();
		gbc_quantityLblError.anchor = GridBagConstraints.WEST;
		gbc_quantityLblError.insets = new Insets(0, 0, 5, 5);
		gbc_quantityLblError.gridx = 1;
		gbc_quantityLblError.gridy = 7;
		centerGrid.add(quantityLblError, gbc_quantityLblError);
		
		priceText = new JTextField();
		priceText.setEditable(false);
		GridBagConstraints gbc_priceText = new GridBagConstraints();
		gbc_priceText.anchor = GridBagConstraints.WEST;
		gbc_priceText.insets = new Insets(0, 0, 5, 5);
		gbc_priceText.gridx = 1;
		gbc_priceText.gridy = 8;
		centerGrid.add(priceText, gbc_priceText);
		priceText.setColumns(10);
		
		ppuLblError = new JLabel("New label");
		ppuLblError.setForeground(UIManager.getColor("InternalFrame.borderShadow"));
		ppuLblError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_ppuLblError = new GridBagConstraints();
		gbc_ppuLblError.anchor = GridBagConstraints.WEST;
		gbc_ppuLblError.insets = new Insets(0, 0, 5, 5);
		gbc_ppuLblError.gridx = 1;
		gbc_ppuLblError.gridy = 5;
		centerGrid.add(ppuLblError, gbc_ppuLblError);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lblPrice = new GridBagConstraints();
		gbc_lblPrice.anchor = GridBagConstraints.EAST;
		gbc_lblPrice.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrice.gridx = 0;
		gbc_lblPrice.gridy = 8;
		centerGrid.add(lblPrice, gbc_lblPrice);
		
		productText = new JTextField();
		GridBagConstraints gbc_productText = new GridBagConstraints();
		gbc_productText.anchor = GridBagConstraints.WEST;
		gbc_productText.insets = new Insets(0, 0, 5, 5);
		gbc_productText.gridx = 1;
		gbc_productText.gridy = 2;
		centerGrid.add(productText, gbc_productText);
		productText.setColumns(10);
		
		quantityText = new JTextField();
		GridBagConstraints gbc_quantityText = new GridBagConstraints();
		gbc_quantityText.anchor = GridBagConstraints.WEST;
		gbc_quantityText.insets = new Insets(0, 0, 5, 5);
		gbc_quantityText.gridx = 1;
		gbc_quantityText.gridy = 6;
		centerGrid.add(quantityText, gbc_quantityText);
		quantityText.setColumns(10);
		
		JLabel lblAddressH = new JLabel("City:");
		lblAddressH.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lblAddressH = new GridBagConstraints();
		gbc_lblAddressH.anchor = GridBagConstraints.EAST;
		gbc_lblAddressH.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddressH.gridx = 2;
		gbc_lblAddressH.gridy = 8;
		centerGrid.add(lblAddressH, gbc_lblAddressH);
		
		cityText = new JTextField();
		cityText.setEditable(false);
		cityText.setColumns(10);
		GridBagConstraints gbc_cityText = new GridBagConstraints();
		gbc_cityText.anchor = GridBagConstraints.WEST;
		gbc_cityText.insets = new Insets(0, 0, 5, 0);
		gbc_cityText.gridx = 3;
		gbc_cityText.gridy = 8;
		centerGrid.add(cityText, gbc_cityText);
		
		priceLblError = new JLabel("New label");
		priceLblError.setForeground(Color.RED);
		priceLblError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_priceLblError = new GridBagConstraints();
		gbc_priceLblError.anchor = GridBagConstraints.WEST;
		gbc_priceLblError.insets = new Insets(0, 0, 5, 5);
		gbc_priceLblError.gridx = 1;
		gbc_priceLblError.gridy = 9;
		centerGrid.add(priceLblError, gbc_priceLblError);
		
		JLabel lblState = new JLabel("State:");
		lblState.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lblState = new GridBagConstraints();
		gbc_lblState.insets = new Insets(0, 0, 5, 5);
		gbc_lblState.anchor = GridBagConstraints.EAST;
		gbc_lblState.gridx = 2;
		gbc_lblState.gridy = 10;
		centerGrid.add(lblState, gbc_lblState);
		
		stateLblError = new JTextField();
		stateLblError.setEditable(false);
		stateLblError.setColumns(10);
		GridBagConstraints gbc_stateLblError = new GridBagConstraints();
		gbc_stateLblError.anchor = GridBagConstraints.WEST;
		gbc_stateLblError.insets = new Insets(0, 0, 5, 0);
		gbc_stateLblError.gridx = 3;
		gbc_stateLblError.gridy = 10;
		centerGrid.add(stateLblError, gbc_stateLblError);
		
		closeDateLblError = new JLabel("New label");
		closeDateLblError.setForeground(Color.RED);
		closeDateLblError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_closeDateLblError = new GridBagConstraints();
		gbc_closeDateLblError.anchor = GridBagConstraints.WEST;
		gbc_closeDateLblError.insets = new Insets(0, 0, 5, 5);
		gbc_closeDateLblError.gridx = 1;
		gbc_closeDateLblError.gridy = 11;
		centerGrid.add(closeDateLblError, gbc_closeDateLblError);
		
		statusLblError = new JLabel("New label");
		statusLblError.setForeground(Color.RED);
		statusLblError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_statusLblError = new GridBagConstraints();
		gbc_statusLblError.anchor = GridBagConstraints.WEST;
		gbc_statusLblError.insets = new Insets(0, 0, 5, 5);
		gbc_statusLblError.gridx = 1;
		gbc_statusLblError.gridy = 13;
		centerGrid.add(statusLblError, gbc_statusLblError);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lblDescription = new GridBagConstraints();
		gbc_lblDescription.anchor = GridBagConstraints.EAST;
		gbc_lblDescription.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescription.gridx = 0;
		gbc_lblDescription.gridy = 14;
		centerGrid.add(lblDescription, gbc_lblDescription);
		
		descriptionTextArea = new JTextArea();
		GridBagConstraints gbc_descriptionTextArea = new GridBagConstraints();
		gbc_descriptionTextArea.insets = new Insets(0, 0, 5, 5);
		gbc_descriptionTextArea.fill = GridBagConstraints.BOTH;
		gbc_descriptionTextArea.gridx = 1;
		gbc_descriptionTextArea.gridy = 14;
		centerGrid.add(descriptionTextArea, gbc_descriptionTextArea);
		
		statusText = new JTextField();
		statusText.setColumns(10);
		GridBagConstraints gbc_statusText = new GridBagConstraints();
		gbc_statusText.anchor = GridBagConstraints.WEST;
		gbc_statusText.insets = new Insets(0, 0, 5, 5);
		gbc_statusText.gridx = 1;
		gbc_statusText.gridy = 12;
		centerGrid.add(statusText, gbc_statusText);
		
		JLabel lblCloseDate = new JLabel("Close Date:");
		lblCloseDate.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lblCloseDate = new GridBagConstraints();
		gbc_lblCloseDate.anchor = GridBagConstraints.EAST;
		gbc_lblCloseDate.insets = new Insets(0, 0, 5, 5);
		gbc_lblCloseDate.gridx = 0;
		gbc_lblCloseDate.gridy = 10;
		centerGrid.add(lblCloseDate, gbc_lblCloseDate);
		
		JLabel lblNewLabel = new JLabel("Status:");
		lblNewLabel.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 12;
		centerGrid.add(lblNewLabel, gbc_lblNewLabel);
		
		closeDateText = new JTextField();
		closeDateText.setColumns(10);
		GridBagConstraints gbc_closeDateText = new GridBagConstraints();
		gbc_closeDateText.anchor = GridBagConstraints.WEST;
		gbc_closeDateText.insets = new Insets(0, 0, 5, 5);
		gbc_closeDateText.gridx = 1;
		gbc_closeDateText.gridy = 10;
		centerGrid.add(closeDateText, gbc_closeDateText);
		
		descriptionLblError = new JLabel("New label");
		descriptionLblError.setForeground(Color.RED);
		descriptionLblError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_descriptionLblError = new GridBagConstraints();
		gbc_descriptionLblError.anchor = GridBagConstraints.WEST;
		gbc_descriptionLblError.insets = new Insets(0, 0, 5, 5);
		gbc_descriptionLblError.gridx = 1;
		gbc_descriptionLblError.gridy = 15;
		centerGrid.add(descriptionLblError, gbc_descriptionLblError);
	}

	public String getTextId()        { return this.idText.getText(); }
	public String getTextStatus()   { return statusText.getText(); }
	public String getTextPrice() { return priceText.getText(); }
	public String getTextCloseDate()     { return closeDateText.getText(); }
	public String getTextDescription()   { return descriptionTextArea.getText(); }
	public String getTextProduct()   { return productText.getText(); }
	public String getTextQuantity()   { return quantityText.getText(); }
	public String getTextPPU()   { return ppuText.getText(); }

	public String getErrorStatus()   { return statusLblError.getText(); }
	public String getErrorPrice() { return priceLblError.getText(); }
	public String getErrorCloseDate()     { return closeDateLblError.getText(); }
	public String getErrorDescription()   { return descriptionLblError.getText(); }
	public String getErrorPPU()   { return ppuLblError.getText(); }
	public String getErrorQuantity()   { return quantityLblError.getText(); }
	public String getErrorProduct()   { return productLblError.getText(); }

	public void setErrorStatus(String errorStatus)     { statusLblError.setText(errorStatus); }
	public void setErrorPrice(String errorPrice) { priceLblError.setText(errorPrice); }
	public void setErrorCloseDate(String errorClose)         { closeDateLblError.setText(errorClose); }
	public void setErrorDescription(String errorDescription)     { descriptionLblError.setText(errorDescription); }
	public void setErrorProduct(String errorProduct)     { productLblError.setText(errorProduct); }
	public void setErrorPPU(String errorPPU)     { ppuLblError.setText(errorPPU); }
	public void setErrorQuantity(String errorQuantity)     { quantityLblError.setText(errorQuantity); }
	
	public void setTextId(String textId)              { this.idText.setText(textId); }
	public void setTextStatus(String textStatus)    { this.statusText.setText(textStatus); }
	public void setTextPrice(String textPrice) { this.priceText.setText(textPrice); }
	public void setTextCloseDate(String textClose)        { this.closeDateText.setText(textClose); }
	public void setTextDescription(String textDescription)    { this.descriptionTextArea.setText(textDescription); }
	public void setTextProduct(String textProduct)    { this.productText.setText(textProduct); }
	public void setTextQuantity(String textQuantity)    { this.quantityText.setText(textQuantity); }
	public void setTextPPU(String textPPU)    { this.ppuText.setText(textPPU); }
	
	
	public void beanToForm(CRMBean bean) {
		OpportunityBean ob = (OpportunityBean) bean;
		//this.setTextId(""+ob.getId());
		this.setTextStatus(ob.getStatus());
		this.setTextPrice(ob.getPrice());
		this.setTextCloseDate(ob.getClose());
		this.setTextDescription(ob.getDescriptionOpp());
		this.setTextProduct(ob.getProduct());
		this.setTextQuantity(ob.getQuantity());
		this.setTextPPU(ob.getPPU());
	}
	
	public void formToBean(CRMBean bean) {
		OpportunityBean ob = (OpportunityBean) bean;
		ob.setStatus(statusText.getText());
		ob.setPrice(priceText.getText());
		ob.setClose(closeDateText.getText());
		ob.setDescription(descriptionTextArea.getText());
		ob.setProduct(productText.getText());
		ob.setQuantity(quantityText.getText());
		ob.setPPU(ppuText.getText());
	}
	
	public void enableEditMode() {
		super.enableEditMode();
		// Make all fields not editable
		statusText.setEditable(true);
		priceText.setEditable(true);
		closeDateText.setEditable(true);
		descriptionTextArea.setEditable(true);
		productText.setEditable(true);
		quantityText.setEditable(true);
		ppuText.setEditable(true);
		
	}
	
	public void disableEditMode() {
		super.disableEditMode();
		// Make all fields not editable
		statusText.setEditable(false);
		priceText.setEditable(false);
		closeDateText.setEditable(false);
		descriptionTextArea.setEditable(false);
		productText.setEditable(false);
		quantityText.setEditable(false);
		ppuText.setEditable(false);
		
	}

	public void clearForm() {
		statusText.setText("");
		priceText.setText("");
		closeDateText.setText("");
		descriptionTextArea.setText("");
		productText.setText("");
		quantityText.setText("");
		ppuText.setText("");
		clearFieldErrors();
	}
	
	public void clearFieldErrors() {
		statusLblError.setText("");
		priceLblError.setText("");
		closeDateLblError.setText("");
		descriptionLblError.setText("");
		productLblError.setText("");
		quantityLblError.setText("");
		ppuLblError.setText("");
	}
}
