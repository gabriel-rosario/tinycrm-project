package swingViews;

import java.awt.Choice;
import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import beans.CRMBean;
import beans.ClientBean;
import beans.NewClientBean;
import views.ClientTCRMView;
import views.NewClientCRMView;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class NewClientSwingView extends NewSwingView implements NewClientCRMView {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField idTextField;
	private JTextField priceTextField;
	private JTextField clientPhoneTextField;
	private JTextField clientEmailTextField;
	private JTextField stateTextField;
	private JTextField companyTextField;
	private JTextField firstNameTextField;
	private JTextField lastNameTextField;
	private JTextField productTextField;
	private JTextField cityTextField;
	private JTextField websiteTextField;
	private JTextField addressTextField;
	private JTextField contactsEmailTextField;
	private JTextField contactsPhoneTextField;
	private JTextField statusTextField;
	
	
	private JLabel companyLabelError;
	private JLabel contactPhoneLabelError;
	private JLabel contactEmailLabelError;
	private JLabel websiteLabelError;
	private JLabel clientPhoneLabelError;
	private JLabel firstNameLabelError;
	private JLabel lastNameLabelError;
	private JLabel statusLabelError;
	private JLabel cityLabelError;
	private JLabel priceLabelError;
	private JLabel clientEmailLabelError;
	private JLabel addressLabelError;
	private JLabel stateLabelError;
	private JLabel productLabelError;
	
	Choice contactChoice;
	Choice oppChoice;

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
		gbl_centerGrid.rowHeights = new int[] {30, 0, 30, 0, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 30, 0, 30, 30};
		gbl_centerGrid.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_centerGrid.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		centerGrid.setLayout(gbl_centerGrid);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 0;
		centerGrid.add(lblId, gbc_lblId);
		
		idTextField = new JTextField();
		idTextField.setText("1");
		idTextField.setEditable(false);
		GridBagConstraints gbc_idTextField = new GridBagConstraints();
		gbc_idTextField.anchor = GridBagConstraints.WEST;
		gbc_idTextField.insets = new Insets(0, 0, 5, 5);
		gbc_idTextField.gridx = 1;
		gbc_idTextField.gridy = 0;
		centerGrid.add(idTextField, gbc_idTextField);
		idTextField.setColumns(10);
		
		JLabel contactLbl = new JLabel("Contact:");
		contactLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_contactLbl = new GridBagConstraints();
		gbc_contactLbl.anchor = GridBagConstraints.EAST;
		gbc_contactLbl.insets = new Insets(0, 0, 5, 5);
		gbc_contactLbl.gridx = 2;
		gbc_contactLbl.gridy = 0;
		centerGrid.add(contactLbl, gbc_contactLbl);
		
		contactChoice = new Choice();
		GridBagConstraints gbc_contactChoice = new GridBagConstraints();
		gbc_contactChoice.fill = GridBagConstraints.HORIZONTAL;
		gbc_contactChoice.insets = new Insets(0, 0, 5, 5);
		gbc_contactChoice.gridx = 3;
		gbc_contactChoice.gridy = 0;
		contactChoice.add("Hola");
		contactChoice.add("Hi");
		centerGrid.add(contactChoice, gbc_contactChoice);
		
		JLabel companyLbl = new JLabel("Company:");
		companyLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_companyLbl = new GridBagConstraints();
		gbc_companyLbl.anchor = GridBagConstraints.EAST;
		gbc_companyLbl.insets = new Insets(0, 0, 5, 5);
		gbc_companyLbl.gridx = 0;
		gbc_companyLbl.gridy = 2;
		centerGrid.add(companyLbl, gbc_companyLbl);
		
		JLabel firstNameLbl = new JLabel("First Name:");
		firstNameLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_firstNameLbl = new GridBagConstraints();
		gbc_firstNameLbl.anchor = GridBagConstraints.EAST;
		gbc_firstNameLbl.insets = new Insets(0, 0, 5, 5);
		gbc_firstNameLbl.gridx = 2;
		gbc_firstNameLbl.gridy = 2;
		centerGrid.add(firstNameLbl, gbc_firstNameLbl);
		
		firstNameTextField = new JTextField();
		firstNameTextField.setColumns(10);
		GridBagConstraints gbc_firstNameTextField = new GridBagConstraints();
		gbc_firstNameTextField.anchor = GridBagConstraints.WEST;
		gbc_firstNameTextField.insets = new Insets(0, 0, 5, 5);
		gbc_firstNameTextField.gridx = 3;
		gbc_firstNameTextField.gridy = 2;
		centerGrid.add(firstNameTextField, gbc_firstNameTextField);
		
		companyLabelError = new JLabel("New label");
		companyLabelError.setForeground(Color.RED);
		companyLabelError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_companyLabelError = new GridBagConstraints();
		gbc_companyLabelError.insets = new Insets(0, 0, 5, 5);
		gbc_companyLabelError.gridx = 1;
		gbc_companyLabelError.gridy = 3;
		centerGrid.add(companyLabelError, gbc_companyLabelError);
		
		firstNameLabelError = new JLabel("New label");
		firstNameLabelError.setForeground(Color.RED);
		firstNameLabelError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_firstNameLabelError = new GridBagConstraints();
		gbc_firstNameLabelError.insets = new Insets(0, 0, 5, 5);
		gbc_firstNameLabelError.gridx = 3;
		gbc_firstNameLabelError.gridy = 3;
		centerGrid.add(firstNameLabelError, gbc_firstNameLabelError);
		
		JLabel clientPhoneLbl = new JLabel("Client Phone:");
		clientPhoneLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_clientPhoneLbl = new GridBagConstraints();
		gbc_clientPhoneLbl.insets = new Insets(0, 0, 5, 5);
		gbc_clientPhoneLbl.anchor = GridBagConstraints.EAST;
		gbc_clientPhoneLbl.gridx = 0;
		gbc_clientPhoneLbl.gridy = 4;
		centerGrid.add(clientPhoneLbl, gbc_clientPhoneLbl);
		
		clientPhoneTextField = new JTextField();
		GridBagConstraints gbc_clientPhoneTextField = new GridBagConstraints();
		gbc_clientPhoneTextField.anchor = GridBagConstraints.WEST;
		gbc_clientPhoneTextField.insets = new Insets(0, 0, 5, 5);
		gbc_clientPhoneTextField.gridx = 1;
		gbc_clientPhoneTextField.gridy = 4;
		centerGrid.add(clientPhoneTextField, gbc_clientPhoneTextField);
		clientPhoneTextField.setColumns(10);
		
		clientPhoneLabelError = new JLabel("New label");
		clientPhoneLabelError.setForeground(Color.RED);
		clientPhoneLabelError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_clientPhoneLabelError = new GridBagConstraints();
		gbc_clientPhoneLabelError.insets = new Insets(0, 0, 5, 5);
		gbc_clientPhoneLabelError.gridx = 1;
		gbc_clientPhoneLabelError.gridy = 5;
		centerGrid.add(clientPhoneLabelError, gbc_clientPhoneLabelError);
		
		JLabel lastNameLbl = new JLabel("Last Name:");
		lastNameLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lastNameLbl = new GridBagConstraints();
		gbc_lastNameLbl.anchor = GridBagConstraints.EAST;
		gbc_lastNameLbl.insets = new Insets(0, 0, 5, 5);
		gbc_lastNameLbl.gridx = 2;
		gbc_lastNameLbl.gridy = 4;
		centerGrid.add(lastNameLbl, gbc_lastNameLbl);
		
		lastNameTextField = new JTextField();
		lastNameTextField.setColumns(10);
		GridBagConstraints gbc_lastNameTextField = new GridBagConstraints();
		gbc_lastNameTextField.anchor = GridBagConstraints.WEST;
		gbc_lastNameTextField.insets = new Insets(0, 0, 5, 5);
		gbc_lastNameTextField.gridx = 3;
		gbc_lastNameTextField.gridy = 4;
		centerGrid.add(lastNameTextField, gbc_lastNameTextField);
		
		lastNameLabelError = new JLabel("New label");
		lastNameLabelError.setForeground(Color.RED);
		lastNameLabelError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_lastNameLabelError = new GridBagConstraints();
		gbc_lastNameLabelError.insets = new Insets(0, 0, 5, 5);
		gbc_lastNameLabelError.gridx = 3;
		gbc_lastNameLabelError.gridy = 5;
		centerGrid.add(lastNameLabelError, gbc_lastNameLabelError);
		
		JLabel lblContactsEmail = new JLabel("Contact's Phone:");
		lblContactsEmail.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lblContactsEmail = new GridBagConstraints();
		gbc_lblContactsEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblContactsEmail.gridx = 2;
		gbc_lblContactsEmail.gridy = 6;
		centerGrid.add(lblContactsEmail, gbc_lblContactsEmail);
		
		contactsPhoneTextField = new JTextField();
		GridBagConstraints gbc_contactsPhoneTextField = new GridBagConstraints();
		gbc_contactsPhoneTextField.anchor = GridBagConstraints.WEST;
		gbc_contactsPhoneTextField.insets = new Insets(0, 0, 5, 5);
		gbc_contactsPhoneTextField.gridx = 3;
		gbc_contactsPhoneTextField.gridy = 6;
		centerGrid.add(contactsPhoneTextField, gbc_contactsPhoneTextField);
		contactsPhoneTextField.setColumns(10);
		
		contactPhoneLabelError = new JLabel("New label");
		contactPhoneLabelError.setForeground(Color.RED);
		contactPhoneLabelError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_contactPhoneLabelError = new GridBagConstraints();
		gbc_contactPhoneLabelError.insets = new Insets(0, 0, 5, 5);
		gbc_contactPhoneLabelError.gridx = 3;
		gbc_contactPhoneLabelError.gridy = 7;
		centerGrid.add(contactPhoneLabelError, gbc_contactPhoneLabelError);
		
		JLabel lblContactssEmail = new JLabel("Contacts's Email:");
		lblContactssEmail.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lblContactssEmail = new GridBagConstraints();
		gbc_lblContactssEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblContactssEmail.gridx = 2;
		gbc_lblContactssEmail.gridy = 8;
		centerGrid.add(lblContactssEmail, gbc_lblContactssEmail);
		
		contactsEmailTextField = new JTextField();
		GridBagConstraints gbc_contactsEmailTextField = new GridBagConstraints();
		gbc_contactsEmailTextField.anchor = GridBagConstraints.WEST;
		gbc_contactsEmailTextField.insets = new Insets(0, 0, 5, 5);
		gbc_contactsEmailTextField.gridx = 3;
		gbc_contactsEmailTextField.gridy = 8;
		centerGrid.add(contactsEmailTextField, gbc_contactsEmailTextField);
		contactsEmailTextField.setColumns(10);
		
		contactEmailLabelError = new JLabel("New label");
		contactEmailLabelError.setForeground(Color.RED);
		contactEmailLabelError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_contactEmailLabelError = new GridBagConstraints();
		gbc_contactEmailLabelError.insets = new Insets(0, 0, 5, 5);
		gbc_contactEmailLabelError.gridx = 3;
		gbc_contactEmailLabelError.gridy = 9;
		centerGrid.add(contactEmailLabelError, gbc_contactEmailLabelError);
		
		JLabel clientEmailLbl = new JLabel("Client's Email:");
		clientEmailLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_clientEmailLbl = new GridBagConstraints();
		gbc_clientEmailLbl.anchor = GridBagConstraints.EAST;
		gbc_clientEmailLbl.insets = new Insets(0, 0, 5, 5);
		gbc_clientEmailLbl.gridx = 0;
		gbc_clientEmailLbl.gridy = 6;
		centerGrid.add(clientEmailLbl, gbc_clientEmailLbl);
		
		
		
		JLabel oppLbl = new JLabel("Opportunities:");
		oppLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_oppLbl = new GridBagConstraints();
		gbc_oppLbl.anchor = GridBagConstraints.EAST;
		gbc_oppLbl.insets = new Insets(0, 0, 5, 5);
		gbc_oppLbl.gridx = 2;
		gbc_oppLbl.gridy = 10;
		centerGrid.add(oppLbl, gbc_oppLbl);
		
		oppChoice = new Choice();
		GridBagConstraints gbc_oppChoice = new GridBagConstraints();
		gbc_oppChoice.fill = GridBagConstraints.HORIZONTAL;
		gbc_oppChoice.insets = new Insets(0, 0, 5, 5);
		gbc_oppChoice.gridx = 3;
		gbc_oppChoice.gridy = 10;
		centerGrid.add(oppChoice, gbc_oppChoice);
		
		websiteLabelError = new JLabel("New label");
		websiteLabelError.setForeground(Color.RED);
		websiteLabelError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_websiteLabelError = new GridBagConstraints();
		gbc_websiteLabelError.insets = new Insets(0, 0, 5, 5);
		gbc_websiteLabelError.gridx = 1;
		gbc_websiteLabelError.gridy = 9;
		centerGrid.add(websiteLabelError, gbc_websiteLabelError);
		
		JLabel websiteLbl = new JLabel("Website:");
		websiteLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_websiteLbl = new GridBagConstraints();
		gbc_websiteLbl.anchor = GridBagConstraints.EAST;
		gbc_websiteLbl.insets = new Insets(0, 0, 5, 5);
		gbc_websiteLbl.gridx = 0;
		gbc_websiteLbl.gridy = 8;
		centerGrid.add(websiteLbl, gbc_websiteLbl);
		
		websiteTextField = new JTextField();
		websiteTextField.setColumns(10);
		GridBagConstraints gbc_websiteTextField = new GridBagConstraints();
		gbc_websiteTextField.anchor = GridBagConstraints.WEST;
		gbc_websiteTextField.insets = new Insets(0, 0, 5, 5);
		gbc_websiteTextField.gridx = 1;
		gbc_websiteTextField.gridy = 8;
		centerGrid.add(websiteTextField, gbc_websiteTextField);
		
		clientEmailLabelError = new JLabel("New label");
		clientEmailLabelError.setForeground(Color.RED);
		clientEmailLabelError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_clientEmailLabelError = new GridBagConstraints();
		gbc_clientEmailLabelError.insets = new Insets(0, 0, 5, 5);
		gbc_clientEmailLabelError.gridx = 1;
		gbc_clientEmailLabelError.gridy = 7;
		centerGrid.add(clientEmailLabelError, gbc_clientEmailLabelError);
		
		addressLabelError = new JLabel("New label");
		addressLabelError.setForeground(Color.RED);
		addressLabelError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_addressLabelError = new GridBagConstraints();
		gbc_addressLabelError.insets = new Insets(0, 0, 5, 5);
		gbc_addressLabelError.gridx = 1;
		gbc_addressLabelError.gridy = 11;
		centerGrid.add(addressLabelError, gbc_addressLabelError);
		
		cityLabelError = new JLabel("New label");
		cityLabelError.setForeground(Color.RED);
		cityLabelError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_cityLabelError = new GridBagConstraints();
		gbc_cityLabelError.insets = new Insets(0, 0, 5, 5);
		gbc_cityLabelError.gridx = 1;
		gbc_cityLabelError.gridy = 13;
		centerGrid.add(cityLabelError, gbc_cityLabelError);
		
		productLabelError = new JLabel("New label");
		productLabelError.setVerticalAlignment(SwingConstants.TOP);
		productLabelError.setForeground(Color.RED);
		productLabelError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_productLabelError = new GridBagConstraints();
		gbc_productLabelError.insets = new Insets(0, 0, 5, 5);
		gbc_productLabelError.gridx = 3;
		gbc_productLabelError.gridy = 13;
		centerGrid.add(productLabelError, gbc_productLabelError);
		
		stateLabelError = new JLabel("New label");
		stateLabelError.setForeground(Color.RED);
		stateLabelError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_stateLabelError = new GridBagConstraints();
		gbc_stateLabelError.insets = new Insets(0, 0, 5, 5);
		gbc_stateLabelError.gridx = 1;
		gbc_stateLabelError.gridy = 15;
		centerGrid.add(stateLabelError, gbc_stateLabelError);
		
		priceLabelError = new JLabel("New label");
		priceLabelError.setForeground(Color.RED);
		priceLabelError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_priceLabelError = new GridBagConstraints();
		gbc_priceLabelError.insets = new Insets(0, 0, 5, 5);
		gbc_priceLabelError.gridx = 3;
		gbc_priceLabelError.gridy = 15;
		centerGrid.add(priceLabelError, gbc_priceLabelError);
		
		addressTextField = new JTextField();
		GridBagConstraints gbc_addressTextField = new GridBagConstraints();
		gbc_addressTextField.anchor = GridBagConstraints.WEST;
		gbc_addressTextField.insets = new Insets(0, 0, 5, 5);
		gbc_addressTextField.gridx = 1;
		gbc_addressTextField.gridy = 10;
		centerGrid.add(addressTextField, gbc_addressTextField);
		addressTextField.setColumns(10);
		
		stateTextField = new JTextField();
		GridBagConstraints gbc_stateTextField = new GridBagConstraints();
		gbc_stateTextField.anchor = GridBagConstraints.WEST;
		gbc_stateTextField.insets = new Insets(0, 0, 5, 5);
		gbc_stateTextField.gridx = 1;
		gbc_stateTextField.gridy = 14;
		centerGrid.add(stateTextField, gbc_stateTextField);
		stateTextField.setColumns(10);
		
		JLabel addressStreetLbl = new JLabel("Address Street:");
		addressStreetLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_addressStreetLbl = new GridBagConstraints();
		gbc_addressStreetLbl.anchor = GridBagConstraints.EAST;
		gbc_addressStreetLbl.insets = new Insets(0, 0, 5, 5);
		gbc_addressStreetLbl.gridx = 0;
		gbc_addressStreetLbl.gridy = 10;
		centerGrid.add(addressStreetLbl, gbc_addressStreetLbl);
		
		companyTextField = new JTextField();
		GridBagConstraints gbc_companyTextField = new GridBagConstraints();
		gbc_companyTextField.anchor = GridBagConstraints.WEST;
		gbc_companyTextField.insets = new Insets(0, 0, 5, 5);
		gbc_companyTextField.gridx = 1;
		gbc_companyTextField.gridy = 2;
		centerGrid.add(companyTextField, gbc_companyTextField);
		companyTextField.setColumns(10);
		
		clientEmailTextField = new JTextField();
		GridBagConstraints gbc_clientEmailTextField = new GridBagConstraints();
		gbc_clientEmailTextField.anchor = GridBagConstraints.WEST;
		gbc_clientEmailTextField.insets = new Insets(0, 0, 5, 5);
		gbc_clientEmailTextField.gridx = 1;
		gbc_clientEmailTextField.gridy = 6;
		centerGrid.add(clientEmailTextField, gbc_clientEmailTextField);
		clientEmailTextField.setColumns(10);
		
		JLabel productLbl = new JLabel("Product:");
		productLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_productLbl = new GridBagConstraints();
		gbc_productLbl.anchor = GridBagConstraints.EAST;
		gbc_productLbl.insets = new Insets(0, 0, 5, 5);
		gbc_productLbl.gridx = 2;
		gbc_productLbl.gridy = 12;
		centerGrid.add(productLbl, gbc_productLbl);
		
		productTextField = new JTextField();
		productTextField.setColumns(10);
		GridBagConstraints gbc_productTextField = new GridBagConstraints();
		gbc_productTextField.anchor = GridBagConstraints.WEST;
		gbc_productTextField.insets = new Insets(0, 0, 5, 5);
		gbc_productTextField.gridx = 3;
		gbc_productTextField.gridy = 12;
		centerGrid.add(productTextField, gbc_productTextField);
		
		JLabel cityLbl = new JLabel("City:");
		cityLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_cityLbl = new GridBagConstraints();
		gbc_cityLbl.anchor = GridBagConstraints.EAST;
		gbc_cityLbl.insets = new Insets(0, 0, 5, 5);
		gbc_cityLbl.gridx = 0;
		gbc_cityLbl.gridy = 12;
		centerGrid.add(cityLbl, gbc_cityLbl);
		
		cityTextField = new JTextField();
		GridBagConstraints gbc_cityTextField = new GridBagConstraints();
		gbc_cityTextField.anchor = GridBagConstraints.WEST;
		gbc_cityTextField.insets = new Insets(0, 0, 5, 5);
		gbc_cityTextField.gridx = 1;
		gbc_cityTextField.gridy = 12;
		centerGrid.add(cityTextField, gbc_cityTextField);
		cityTextField.setColumns(10);
		
		JLabel priceLbl = new JLabel("Price:");
		priceLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_priceLbl = new GridBagConstraints();
		gbc_priceLbl.insets = new Insets(0, 0, 5, 5);
		gbc_priceLbl.anchor = GridBagConstraints.EAST;
		gbc_priceLbl.gridx = 2;
		gbc_priceLbl.gridy = 14;
		centerGrid.add(priceLbl, gbc_priceLbl);
		
		priceTextField = new JTextField();
		GridBagConstraints gbc_priceTextField = new GridBagConstraints();
		gbc_priceTextField.anchor = GridBagConstraints.WEST;
		gbc_priceTextField.insets = new Insets(0, 0, 5, 5);
		gbc_priceTextField.gridx = 3;
		gbc_priceTextField.gridy = 14;
		centerGrid.add(priceTextField, gbc_priceTextField);
		priceTextField.setColumns(10);
		
		JLabel stateLbl = new JLabel("State:");
		stateLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_stateLbl = new GridBagConstraints();
		gbc_stateLbl.anchor = GridBagConstraints.EAST;
		gbc_stateLbl.insets = new Insets(0, 0, 5, 5);
		gbc_stateLbl.gridx = 0;
		gbc_stateLbl.gridy = 14;
		centerGrid.add(stateLbl, gbc_stateLbl);
		
		JLabel statusLbl = new JLabel("Status:");
		statusLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_statusLbl = new GridBagConstraints();
		gbc_statusLbl.anchor = GridBagConstraints.EAST;
		gbc_statusLbl.insets = new Insets(0, 0, 0, 5);
		gbc_statusLbl.gridx = 2;
		gbc_statusLbl.gridy = 16;
		centerGrid.add(statusLbl, gbc_statusLbl);
		
		statusTextField = new JTextField();
		GridBagConstraints gbc_statusTextField = new GridBagConstraints();
		gbc_statusTextField.anchor = GridBagConstraints.WEST;
		gbc_statusTextField.insets = new Insets(0, 0, 5, 5);
		gbc_statusTextField.gridx = 3;
		gbc_statusTextField.gridy = 16;
		centerGrid.add(statusTextField, gbc_statusTextField);
		statusTextField.setColumns(10);
		
		statusLabelError = new JLabel("New label");
		statusLabelError.setForeground(Color.RED);
		statusLabelError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_statusLabelError = new GridBagConstraints();
		gbc_statusLabelError.insets = new Insets(0, 0, 5, 5);
		gbc_statusLabelError.gridx = 3;
		gbc_statusLabelError.gridy = 17;
		centerGrid.add(statusLabelError, gbc_statusLabelError);
		
		this.setMessagesText("No Clients in the CRM");
	}
	
	public String getIdTextField() {return idTextField.getText();}
	public void setIdTextField(String idTextField) {this.idTextField.setText(idTextField);}	
	
	public String getPriceTextField() {return priceTextField.getText();}
	public void setPriceTextField(String priceTextField) {this.priceTextField.setText(priceTextField);}
	
	public String getClientPhoneTextField() {return clientPhoneTextField.getText();}
	public void setClientPhoneTextField(String clientPhoneTextField) {this.clientPhoneTextField.setText(clientPhoneTextField);}

	public String getClientEmailTextField() {return clientEmailTextField.getText();}
	public void setClientEmailTextField(String clientEmailTextField) {this.clientEmailTextField.setText(clientEmailTextField);}

	public String getStateTextField() {return stateTextField.getText();}
	public void setStateTextField(String stateTextField) {this.stateTextField.setText(stateTextField);;}

	public String getCompanyTextField() {return companyTextField.getText();}
	public void setCompanyTextField(String companyTextField) {this.companyTextField.setText(companyTextField);}

	public String getFirstNameTextField() {return firstNameTextField.getText();}
	public void setFirstNameTextField(String firstNameTextField) {this.firstNameTextField.setText(firstNameTextField);}

	public String getLastNameTextField() {return lastNameTextField.getText();}
	public void setLastNameTextField(String lastNameTextField) {this.lastNameTextField.setText(lastNameTextField);}

	public String getProductTextField() {return productTextField.getText();	}
	public void setProductTextField(String productTextField) {this.productTextField.setText(productTextField);}

	public String getCityTextField() {return cityTextField.getText();}
	public void setCityTextField(String cityTextField) {this.cityTextField.setText(cityTextField);;}

	public String getWebsiteTextField() {return websiteTextField.getText();}
	public void setWebsiteTextField(String websiteTextField) {this.websiteTextField.setText(websiteTextField);}

	public String getAddressTextField() {return addressTextField.getText();}
	public void setAddressTextField(String addressTextField) {this.addressTextField.setText(addressTextField);}
	
	public String getContactsEmailTextField() {return contactsEmailTextField.getText();}
	public void setContactsEmailTextField(String contactsEmailTextField) {this.contactsEmailTextField.setText(contactsEmailTextField);}

	public String getContactsPhoneTextField() {return contactsPhoneTextField.getText();}
	public void setContactsPhoneTextField(String contactsPhoneTextField) {this.contactsPhoneTextField.setText(contactsPhoneTextField);;}

	public String getStatusTextField() {return statusTextField.getText();}
	public void setStatusTextField(String statusTextField) {this.statusTextField.setText(statusTextField);}
	
	public String getCompanyLabelError() {return companyLabelError.getText();}
	public void setCompanyLabelError(String companyLabelError) {this.companyLabelError.setText(companyLabelError);}
	
	public String getContactPhoneLabelError() {return contactPhoneLabelError.getText();}
	public void setContactPhoneLabelError(String contactPhoneLabelError) {this.contactPhoneLabelError.setText(contactPhoneLabelError);}
	
	public String getContactEmailLabelError() {return contactEmailLabelError.getText();}
	public void setContactEmailLabelError(String contactEmailLabelError) {this.contactEmailLabelError.setText(contactEmailLabelError);}
	
	public String getWebsiteLabelError() {return websiteLabelError.getText();}
	public void setWebsiteLabelError(String websiteLabelError) {this.websiteLabelError.setText(websiteLabelError);}
	
	public String getClientPhoneLabelError() {return clientPhoneLabelError.getText();}
	public void setClientPhoneLabelError(String clientPhoneLabelError) {this.clientPhoneLabelError.setText(clientPhoneLabelError);}
	
	public String getFirstNameLabelError() {return firstNameLabelError.getText();}
	public void setFirstNameLabelError(String firstNameLabelError) {this.firstNameLabelError.setText(firstNameLabelError);}
	
	public String getLastNameLabelError() {return lastNameLabelError.getText();}
	public void setLastNameLabelError(String lastNameLabelError) {this.lastNameLabelError.setText(lastNameLabelError);}
	
	public String getStatusLabelError() {return statusLabelError.getText();}
	public void setStatusLabelError(String statusLabelError) {this.statusLabelError.setText(statusLabelError);}
	
	public String getCityLabelError() {return cityLabelError.getText();}
	public void setCityLabelError(String cityLabelError) {this.cityLabelError.setText(cityLabelError);}
	
	public String getPriceLabelError() {return priceLabelError.getText();}
	public void setPriceLabelError(String priceLabelError) {this.priceLabelError.setText(priceLabelError);}
	
	public String getClientEmailLabelError() {return clientEmailLabelError.getText();}
	public void setClientEmailLabelError(String clientEmailLabelError) {this.clientEmailLabelError.setText(clientEmailLabelError);}
	
	public String getAddressLabelError() {return addressLabelError.getText();}
	public void setAddressLabelError(String addressLabelError) {this.addressLabelError.setText(addressLabelError);}
	
	public String getStateLabelError() {return stateLabelError.getText();}
	public void setStateLabelError(String stateLabelError) {this.stateLabelError.setText(stateLabelError);}
	
	public String getProductLabelError() {return productLabelError.getText();}
	public void setProductLabelError(String productLabelError) {this.productLabelError.setText(productLabelError);}

	public void enableEditMode() { 
		super.enableEditMode();
		companyTextField.setEditable(true);
		contactsPhoneTextField.setEditable(true);
		contactsEmailTextField.setEditable(true);
		stateTextField.setEditable(true);
		clientPhoneTextField.setEditable(true);
		clientEmailTextField.setEditable(true);
		statusTextField.setEditable(true);
		productTextField.setEditable(true);
		cityTextField.setEditable(true);
		websiteTextField.setEditable(true);
		addressTextField.setEditable(true);
		priceTextField.setEditable(true);
		firstNameTextField.setEditable(true);
		lastNameTextField.setEditable(true);
	}
	
	public void beanToForm(CRMBean bean) {
		NewClientBean cb = (NewClientBean) bean;
		this.setIdTextField(""+cb.getId());
		this.setCompanyTextField(cb.getCompany());
		this.setClientPhoneTextField(cb.getClientPhone());
		this.setClientEmailTextField(cb.getClientEmail());
		this.setWebsiteTextField(cb.getWebsite());
		this.setAddressTextField(cb.getAddress());
		this.setStateTextField(cb.getState());
		this.setCityTextField(cb.getCity());
	}
	
	public void formToBean(CRMBean bean) {
		NewClientBean cb = (NewClientBean) bean;
		cb.setCompany(companyTextField.getText());
		cb.setClientPhone(clientPhoneTextField.getText());
		cb.setClientEmail(clientEmailTextField.getText());
		cb.setWebsite(websiteTextField.getText());
		cb.setAddress(addressTextField.getText());
		cb.setState(stateTextField.getText());
		cb.setCity(cityTextField.getText());
	}
	
	public void disableEditMode() {
		super.disableEditMode();
		companyTextField.setEditable(false);
		contactsPhoneTextField.setEditable(false);
		contactsEmailTextField.setEditable(false);
		stateTextField.setEditable(false);
		clientPhoneTextField.setEditable(false);
		clientEmailTextField.setEditable(false);
		statusTextField.setEditable(false);
		productTextField.setEditable(false);
		cityTextField.setEditable(false);
		websiteTextField.setEditable(false);
		addressTextField.setEditable(false);
		priceTextField.setEditable(false);
		firstNameTextField.setEditable(false);
		lastNameTextField.setEditable(false);
	}

	public void clearForm() {
		//idTextField.setText("");
		companyTextField.setText("");
		contactsPhoneTextField.setText("");
		contactsEmailTextField.setText("");
		stateTextField.setText("");
		clientPhoneTextField.setText("");
		clientEmailTextField.setText("");
		statusTextField.setText("");
		cityTextField.setText("");
		addressTextField.setText("");
		productTextField.setText("");
		priceTextField.setText("");
		firstNameTextField.setText("");
		lastNameTextField.setText("");
		websiteTextField.setText("");
		clearFieldErrors();
	}
	
	public void clearFieldErrors() {
		companyLabelError.setText("");
		contactPhoneLabelError.setText("");
		contactEmailLabelError.setText("");
		stateLabelError.setText("");
		clientPhoneLabelError.setText("");
		clientEmailLabelError.setText("");
		statusLabelError.setText("");
		cityLabelError.setText("");
		addressLabelError.setText("");
		productLabelError.setText("");
		priceLabelError.setText("");
		firstNameLabelError.setText("");
		lastNameLabelError.setText("");
		websiteLabelError.setText("");
	}

	@Override
	public String getIdLabelError() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIdLabelError(String idLabelError) {
		// TODO Auto-generated method stub
		
	}
}
