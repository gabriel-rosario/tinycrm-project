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
import swingViews.NewContactsSwingView.ClientForComboBox;
import views.OpportunityTCRMView;

import javax.swing.UIManager;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import java.awt.Panel;
import java.awt.Choice;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import javax.swing.JComboBox;

public class OppSwingView extends NewSwingView implements OpportunityTCRMView
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected class ClientForComboBox {

		private long id;
		private String description;

		protected long getId() {
			return id;
		}

		protected ClientForComboBox(long id, String description) {
			this.id = id;
			this.description = description;
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
	private JTextField stateText;
	
	private JLabel statusLblError;
	private JLabel priceLblError;
	private JLabel ppuLblError;
	private JLabel productLblError;
	private JLabel quantityLblError;
	private JLabel closeDateLblError;
	private JLabel descriptionLblError;
	
	JTextArea descriptionTextArea;
	private JComboBox<ClientForComboBox> comboBoxClient;
	private JLabel phoneLblError;
	private JLabel emailLblError;
	private JLabel addressLblError;
	private JLabel cityLblError;
	private JLabel stateLblError;
	
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
		
		comboBoxClient = new JComboBox<ClientForComboBox>();
		GridBagConstraints gbc_comboBoxClient = new GridBagConstraints();
		gbc_comboBoxClient.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxClient.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxClient.gridx = 3;
		gbc_comboBoxClient.gridy = 0;
		centerGrid.add(comboBoxClient, gbc_comboBoxClient);
		
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
		
		phoneLblError = new JLabel("New label");
		phoneLblError.setForeground(Color.RED);
		phoneLblError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_phoneLblError = new GridBagConstraints();
		gbc_phoneLblError.anchor = GridBagConstraints.WEST;
		gbc_phoneLblError.insets = new Insets(0, 0, 5, 0);
		gbc_phoneLblError.gridx = 3;
		gbc_phoneLblError.gridy = 3;
		centerGrid.add(phoneLblError, gbc_phoneLblError);
		
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
		emailText.setColumns(10);
		GridBagConstraints gbc_emailText = new GridBagConstraints();
		gbc_emailText.anchor = GridBagConstraints.WEST;
		gbc_emailText.insets = new Insets(0, 0, 5, 0);
		gbc_emailText.gridx = 3;
		gbc_emailText.gridy = 4;
		centerGrid.add(emailText, gbc_emailText);
		
		emailLblError = new JLabel("New label");
		emailLblError.setForeground(Color.RED);
		emailLblError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_emailLblError = new GridBagConstraints();
		gbc_emailLblError.anchor = GridBagConstraints.WEST;
		gbc_emailLblError.insets = new Insets(0, 0, 5, 0);
		gbc_emailLblError.gridx = 3;
		gbc_emailLblError.gridy = 5;
		centerGrid.add(emailLblError, gbc_emailLblError);
		
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
		
		addressLblError = new JLabel("New label");
		addressLblError.setForeground(Color.RED);
		addressLblError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_addressLblError = new GridBagConstraints();
		gbc_addressLblError.anchor = GridBagConstraints.WEST;
		gbc_addressLblError.insets = new Insets(0, 0, 5, 0);
		gbc_addressLblError.gridx = 3;
		gbc_addressLblError.gridy = 7;
		centerGrid.add(addressLblError, gbc_addressLblError);
		
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
		
		cityLblError = new JLabel("New label");
		cityLblError.setForeground(Color.RED);
		cityLblError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_cityLblError = new GridBagConstraints();
		gbc_cityLblError.anchor = GridBagConstraints.WEST;
		gbc_cityLblError.insets = new Insets(0, 0, 5, 0);
		gbc_cityLblError.gridx = 3;
		gbc_cityLblError.gridy = 9;
		centerGrid.add(cityLblError, gbc_cityLblError);
		
		JLabel lblState = new JLabel("State:");
		lblState.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lblState = new GridBagConstraints();
		gbc_lblState.insets = new Insets(0, 0, 5, 5);
		gbc_lblState.anchor = GridBagConstraints.EAST;
		gbc_lblState.gridx = 2;
		gbc_lblState.gridy = 10;
		centerGrid.add(lblState, gbc_lblState);
		
		stateText = new JTextField();
		stateText.setColumns(10);
		GridBagConstraints gbc_stateText = new GridBagConstraints();
		gbc_stateText.anchor = GridBagConstraints.WEST;
		gbc_stateText.insets = new Insets(0, 0, 5, 0);
		gbc_stateText.gridx = 3;
		gbc_stateText.gridy = 10;
		centerGrid.add(stateText, gbc_stateText);
		
		closeDateLblError = new JLabel("New label");
		closeDateLblError.setForeground(Color.RED);
		closeDateLblError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_closeDateLblError = new GridBagConstraints();
		gbc_closeDateLblError.anchor = GridBagConstraints.WEST;
		gbc_closeDateLblError.insets = new Insets(0, 0, 5, 5);
		gbc_closeDateLblError.gridx = 1;
		gbc_closeDateLblError.gridy = 11;
		centerGrid.add(closeDateLblError, gbc_closeDateLblError);
		
		stateLblError = new JLabel("New label");
		stateLblError.setForeground(Color.RED);
		stateLblError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_stateLblError = new GridBagConstraints();
		gbc_stateLblError.anchor = GridBagConstraints.WEST;
		gbc_stateLblError.insets = new Insets(0, 0, 5, 0);
		gbc_stateLblError.gridx = 3;
		gbc_stateLblError.gridy = 11;
		centerGrid.add(stateLblError, gbc_stateLblError);
		
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
	public void setTextPhone(String textPhone)    { this.phoneText.setText(textPhone); }
	public void setTextEmail(String textEmail) { this.emailText.setText(textEmail); }
	public void setTextAddress(String textAddress)        { this.addressText.setText(textAddress); }
	public void setTextCity(String textCity)    { this.cityText.setText(textCity); }
	public void setTextState(String textState)    { this.stateText.setText(textState); }
	
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
		for (int i=0; i < comboBoxClient.getItemCount(); i++) {
			ClientForComboBox item = (ClientForComboBox) comboBoxClient.getItemAt(i);
			if (item.getId() == ob.getId()) {
				this.setSelectedClientIndex(i);
			}
		}
		this.setTextPhone(ob.getPhone());
		this.setTextEmail(ob.getEmail());
		this.setTextAddress(ob.getAddress());
		this.setTextCity(ob.getCity());
		this.setTextState(ob.getState());
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
		ob.setPhone(phoneText.getText());
		ob.setEmail(emailText.getText());
		ob.setAddress(addressText.getText());
		ob.setCity(cityText.getText());
		ob.setState(stateText.getText());
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
		phoneText.setEditable(true);
		emailText.setEditable(true);
		addressText.setEditable(true);
		cityText.setEditable(true);
		stateText.setEditable(true);
		
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
		phoneText.setEditable(false);
		emailText.setEditable(false);
		addressText.setEditable(false);
		cityText.setEditable(false);
		stateText.setEditable(false);
		
	}

	public void clearForm() {
		statusText.setText("");
		priceText.setText("");
		closeDateText.setText("");
		descriptionTextArea.setText("");
		productText.setText("");
		quantityText.setText("");
		ppuText.setText("");
		if (comboBoxClient.getItemCount() > 0) { comboBoxClient.setSelectedIndex(0); }
		phoneText.setText("");
		emailText.setText("");
		addressText.setText("");
		cityText.setText("");
		stateText.setText("");
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
		phoneLblError.setText("");
		emailLblError.setText("");
		addressLblError.setText("");
		cityLblError.setText("");
		stateLblError.setText("");
	}
	
	public int getSelectedClientIndex() {
		return comboBoxClient.getSelectedIndex();
	}

	public void setSelectedClientIndex(int index) {
		if (index >= 0 && index <= comboBoxClient.getItemCount()) {
			comboBoxClient.setEnabled(false);
			comboBoxClient.setSelectedIndex(index);
			comboBoxClient.setEnabled(true);
		}
	}

	public void setSelectClientItems(ArrayList<CRMBean> list) {
		comboBoxClient.removeAllItems();
		for (CRMBean item : list) {
			comboBoxClient.addItem(new ClientForComboBox(item.getId(), item.getDescription()));
		}
	}

	public void setSelectClientListener(ActionListener listener) {
		comboBoxClient.addActionListener(listener);
	}
	
}
