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
import views.ClientTCRMView;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class NewClientSwingView extends NewSwingView {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField idTextField;
	private JTextField textField_2;
	private JTextField priceTextField;
	private JTextField telephoneTextField;
	private JTextField emailTextField;
	private JTextField websiteTextField;
	private JTextField companyTextField;
	private JTextField firstNameTextField;
	private JTextField lastNameTextField;
	private JTextField productTextField;
	private JTextField cityTextField;
	private JTextField textField;
	private JTextField addressStreetTextField;
	private JTextField contactsEmailTextField;
	private JTextField contactsPhoneTextField;
	private JTextField statusTextField;

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
		
		Choice contactChoice = new Choice();
		GridBagConstraints gbc_contactChoice = new GridBagConstraints();
		gbc_contactChoice.fill = GridBagConstraints.HORIZONTAL;
		gbc_contactChoice.insets = new Insets(0, 0, 5, 5);
		gbc_contactChoice.gridx = 3;
		gbc_contactChoice.gridy = 0;
		centerGrid.add(contactChoice, gbc_contactChoice);
		
		JLabel label = new JLabel("New label");
		label.setForeground(Color.RED);
		label.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 1;
		centerGrid.add(label, gbc_label);
		
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
		
		JLabel label_6 = new JLabel("New label");
		label_6.setForeground(Color.RED);
		label_6.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 1;
		gbc_label_6.gridy = 3;
		centerGrid.add(label_6, gbc_label_6);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 3;
		gbc_label_1.gridy = 3;
		centerGrid.add(label_1, gbc_label_1);
		
		JLabel phoneLbl = new JLabel("Client Phone:");
		phoneLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_phoneLbl = new GridBagConstraints();
		gbc_phoneLbl.insets = new Insets(0, 0, 5, 5);
		gbc_phoneLbl.anchor = GridBagConstraints.EAST;
		gbc_phoneLbl.gridx = 0;
		gbc_phoneLbl.gridy = 4;
		centerGrid.add(phoneLbl, gbc_phoneLbl);
		
		telephoneTextField = new JTextField();
		GridBagConstraints gbc_telephoneTextField = new GridBagConstraints();
		gbc_telephoneTextField.anchor = GridBagConstraints.WEST;
		gbc_telephoneTextField.insets = new Insets(0, 0, 5, 5);
		gbc_telephoneTextField.gridx = 1;
		gbc_telephoneTextField.gridy = 4;
		centerGrid.add(telephoneTextField, gbc_telephoneTextField);
		telephoneTextField.setColumns(10);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setForeground(Color.RED);
		label_3.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 1;
		gbc_label_3.gridy = 5;
		centerGrid.add(label_3, gbc_label_3);
		
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
		
		JLabel label_8 = new JLabel("New label");
		label_8.setForeground(Color.RED);
		label_8.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 3;
		gbc_label_8.gridy = 5;
		centerGrid.add(label_8, gbc_label_8);
		
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
		
		JLabel label_11 = new JLabel("New label");
		label_11.setForeground(Color.RED);
		label_11.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.insets = new Insets(0, 0, 5, 5);
		gbc_label_11.gridx = 3;
		gbc_label_11.gridy = 7;
		centerGrid.add(label_11, gbc_label_11);
		
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
		
		JLabel label_12 = new JLabel("New label");
		label_12.setForeground(Color.RED);
		label_12.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.insets = new Insets(0, 0, 5, 5);
		gbc_label_12.gridx = 3;
		gbc_label_12.gridy = 9;
		centerGrid.add(label_12, gbc_label_12);
		
		JLabel emailLbl = new JLabel("Client's Email:");
		emailLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_emailLbl = new GridBagConstraints();
		gbc_emailLbl.anchor = GridBagConstraints.EAST;
		gbc_emailLbl.insets = new Insets(0, 0, 5, 5);
		gbc_emailLbl.gridx = 0;
		gbc_emailLbl.gridy = 6;
		centerGrid.add(emailLbl, gbc_emailLbl);
		
		
		
		JLabel oppLbl = new JLabel("Opportunities:");
		oppLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_oppLbl = new GridBagConstraints();
		gbc_oppLbl.anchor = GridBagConstraints.EAST;
		gbc_oppLbl.insets = new Insets(0, 0, 5, 5);
		gbc_oppLbl.gridx = 2;
		gbc_oppLbl.gridy = 10;
		centerGrid.add(oppLbl, gbc_oppLbl);
		
		Choice OppChoice = new Choice();
		GridBagConstraints gbc_OppChoice = new GridBagConstraints();
		gbc_OppChoice.fill = GridBagConstraints.HORIZONTAL;
		gbc_OppChoice.insets = new Insets(0, 0, 5, 5);
		gbc_OppChoice.gridx = 3;
		gbc_OppChoice.gridy = 10;
		centerGrid.add(OppChoice, gbc_OppChoice);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 1;
		gbc_label_2.gridy = 9;
		centerGrid.add(label_2, gbc_label_2);
		
		JLabel websiteLbl = new JLabel("Website:");
		websiteLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_websiteLbl = new GridBagConstraints();
		gbc_websiteLbl.anchor = GridBagConstraints.EAST;
		gbc_websiteLbl.insets = new Insets(0, 0, 5, 5);
		gbc_websiteLbl.gridx = 0;
		gbc_websiteLbl.gridy = 8;
		centerGrid.add(websiteLbl, gbc_websiteLbl);
		
		textField = new JTextField();
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.WEST;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 8;
		centerGrid.add(textField, gbc_textField);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 1;
		gbc_label_5.gridy = 7;
		centerGrid.add(label_5, gbc_label_5);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setForeground(Color.RED);
		label_4.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 1;
		gbc_label_4.gridy = 11;
		centerGrid.add(label_4, gbc_label_4);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setForeground(Color.RED);
		label_7.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 1;
		gbc_label_7.gridy = 13;
		centerGrid.add(label_7, gbc_label_7);
		
		JLabel label_13 = new JLabel("New label");
		label_13.setVerticalAlignment(SwingConstants.TOP);
		label_13.setForeground(Color.RED);
		label_13.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_13 = new GridBagConstraints();
		gbc_label_13.insets = new Insets(0, 0, 5, 5);
		gbc_label_13.gridx = 3;
		gbc_label_13.gridy = 13;
		centerGrid.add(label_13, gbc_label_13);
		
		JLabel label_9 = new JLabel("New label");
		label_9.setForeground(Color.RED);
		label_9.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 1;
		gbc_label_9.gridy = 15;
		centerGrid.add(label_9, gbc_label_9);
		
		JLabel label_15 = new JLabel("New label");
		label_15.setForeground(Color.RED);
		label_15.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_15 = new GridBagConstraints();
		gbc_label_15.insets = new Insets(0, 0, 5, 5);
		gbc_label_15.gridx = 3;
		gbc_label_15.gridy = 15;
		centerGrid.add(label_15, gbc_label_15);
		
		addressStreetTextField = new JTextField();
		GridBagConstraints gbc_addressStreetTextField = new GridBagConstraints();
		gbc_addressStreetTextField.anchor = GridBagConstraints.WEST;
		gbc_addressStreetTextField.insets = new Insets(0, 0, 5, 5);
		gbc_addressStreetTextField.gridx = 1;
		gbc_addressStreetTextField.gridy = 10;
		centerGrid.add(addressStreetTextField, gbc_addressStreetTextField);
		addressStreetTextField.setColumns(10);
		
		websiteTextField = new JTextField();
		GridBagConstraints gbc_websiteTextField = new GridBagConstraints();
		gbc_websiteTextField.anchor = GridBagConstraints.WEST;
		gbc_websiteTextField.insets = new Insets(0, 0, 5, 5);
		gbc_websiteTextField.gridx = 1;
		gbc_websiteTextField.gridy = 14;
		centerGrid.add(websiteTextField, gbc_websiteTextField);
		websiteTextField.setColumns(10);
		
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
		
		emailTextField = new JTextField();
		GridBagConstraints gbc_emailTextField = new GridBagConstraints();
		gbc_emailTextField.anchor = GridBagConstraints.WEST;
		gbc_emailTextField.insets = new Insets(0, 0, 5, 5);
		gbc_emailTextField.gridx = 1;
		gbc_emailTextField.gridy = 6;
		centerGrid.add(emailTextField, gbc_emailTextField);
		emailTextField.setColumns(10);
		
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
		
		JLabel label_16 = new JLabel("New label");
		label_16.setForeground(Color.RED);
		label_16.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_16 = new GridBagConstraints();
		gbc_label_16.insets = new Insets(0, 0, 5, 5);
		gbc_label_16.gridx = 3;
		gbc_label_16.gridy = 17;
		centerGrid.add(label_16, gbc_label_16);
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
