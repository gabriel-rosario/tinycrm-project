package swingViews;

import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import beans.CRMBean;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Choice;
import java.awt.Color;

public class NewContactsSwingView extends NewSwingView{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField idTextField;
	private JTextField textField_2;
	private JTextField telephoneTextField;
	private JTextField websiteTextField;
	private JTextField companyTextField;
	private JTextField firstNameTextField;
	private JTextField lastNameTextField;
	private JTextField facebookTextField;
	private JTextField productTextField;
	private JTextField textField_13;
	private JTextField cityTextField;
	
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
	
	public NewContactsSwingView () {
		super();
		setTitle("Contacts");
		
		JScrollPane centerScrollPane = new JScrollPane();
		centerScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		centerScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		setCenterPanel(centerScrollPane);

		JPanel centerGrid = new JPanel();
		centerScrollPane.setViewportView(centerGrid);
		GridBagLayout gbl_centerGrid = new GridBagLayout();
		gbl_centerGrid.columnWidths = new int[] {100, 150, 100, 150};
		gbl_centerGrid.rowHeights = new int[] {30, 0, 30, 0, 0, 0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 30, 30, 30, 30, 30};
		gbl_centerGrid.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0};
		gbl_centerGrid.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
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
		
		JLabel clientLbl = new JLabel("Client:");
		clientLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_clientLbl = new GridBagConstraints();
		gbc_clientLbl.anchor = GridBagConstraints.EAST;
		gbc_clientLbl.insets = new Insets(0, 0, 5, 5);
		gbc_clientLbl.gridx = 2;
		gbc_clientLbl.gridy = 0;
		centerGrid.add(clientLbl, gbc_clientLbl);
		
		Choice contactChoice = new Choice();
		GridBagConstraints gbc_contactChoice = new GridBagConstraints();
		gbc_contactChoice.fill = GridBagConstraints.HORIZONTAL;
		gbc_contactChoice.insets = new Insets(0, 0, 5, 0);
		gbc_contactChoice.gridx = 3;
		gbc_contactChoice.gridy = 0;
		centerGrid.add(contactChoice, gbc_contactChoice);
		
		JLabel label = new JLabel("New label");
		label.setForeground(Color.RED);
		label.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 1;
		centerGrid.add(label, gbc_label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.WEST;
		gbc_label_1.insets = new Insets(0, 0, 5, 0);
		gbc_label_1.gridx = 3;
		gbc_label_1.gridy = 1;
		centerGrid.add(label_1, gbc_label_1);
		
		JLabel firstNameLbl = new JLabel("First Name:");
		firstNameLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_firstNameLbl = new GridBagConstraints();
		gbc_firstNameLbl.anchor = GridBagConstraints.EAST;
		gbc_firstNameLbl.insets = new Insets(0, 0, 5, 5);
		gbc_firstNameLbl.gridx = 0;
		gbc_firstNameLbl.gridy = 2;
		centerGrid.add(firstNameLbl, gbc_firstNameLbl);
		
		firstNameTextField = new JTextField();
		firstNameTextField.setColumns(10);
		GridBagConstraints gbc_firstNameTextField = new GridBagConstraints();
		gbc_firstNameTextField.anchor = GridBagConstraints.WEST;
		gbc_firstNameTextField.insets = new Insets(0, 0, 5, 0);
		gbc_firstNameTextField.gridx = 3;
		gbc_firstNameTextField.gridy = 2;
		centerGrid.add(firstNameTextField, gbc_firstNameTextField);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setForeground(Color.RED);
		label_3.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.WEST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 1;
		gbc_label_3.gridy = 3;
		centerGrid.add(label_3, gbc_label_3);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setForeground(Color.RED);
		label_6.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.anchor = GridBagConstraints.WEST;
		gbc_label_6.insets = new Insets(0, 0, 5, 0);
		gbc_label_6.gridx = 3;
		gbc_label_6.gridy = 3;
		centerGrid.add(label_6, gbc_label_6);
		
		JLabel phoneLbl = new JLabel("Client Phone:");
		phoneLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_phoneLbl = new GridBagConstraints();
		gbc_phoneLbl.insets = new Insets(0, 0, 5, 5);
		gbc_phoneLbl.anchor = GridBagConstraints.EAST;
		gbc_phoneLbl.gridx = 2;
		gbc_phoneLbl.gridy = 2;
		centerGrid.add(phoneLbl, gbc_phoneLbl);
		
		telephoneTextField = new JTextField();
		GridBagConstraints gbc_telephoneTextField = new GridBagConstraints();
		gbc_telephoneTextField.anchor = GridBagConstraints.WEST;
		gbc_telephoneTextField.insets = new Insets(0, 0, 5, 5);
		gbc_telephoneTextField.gridx = 1;
		gbc_telephoneTextField.gridy = 4;
		centerGrid.add(telephoneTextField, gbc_telephoneTextField);
		telephoneTextField.setColumns(10);
		
		JLabel lastNameLbl = new JLabel("Last Name:");
		lastNameLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lastNameLbl = new GridBagConstraints();
		gbc_lastNameLbl.anchor = GridBagConstraints.EAST;
		gbc_lastNameLbl.insets = new Insets(0, 0, 5, 5);
		gbc_lastNameLbl.gridx = 0;
		gbc_lastNameLbl.gridy = 4;
		centerGrid.add(lastNameLbl, gbc_lastNameLbl);
		
		lastNameTextField = new JTextField();
		lastNameTextField.setColumns(10);
		GridBagConstraints gbc_lastNameTextField = new GridBagConstraints();
		gbc_lastNameTextField.anchor = GridBagConstraints.WEST;
		gbc_lastNameTextField.insets = new Insets(0, 0, 5, 0);
		gbc_lastNameTextField.gridx = 3;
		gbc_lastNameTextField.gridy = 4;
		centerGrid.add(lastNameTextField, gbc_lastNameTextField);
		
		JLabel emailLbl = new JLabel("Client Email");
		emailLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_emailLbl = new GridBagConstraints();
		gbc_emailLbl.anchor = GridBagConstraints.EAST;
		gbc_emailLbl.insets = new Insets(0, 0, 5, 5);
		gbc_emailLbl.gridx = 2;
		gbc_emailLbl.gridy = 4;
		centerGrid.add(emailLbl, gbc_emailLbl);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.anchor = GridBagConstraints.WEST;
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 1;
		gbc_label_5.gridy = 5;
		centerGrid.add(label_5, gbc_label_5);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.WEST;
		gbc_label_2.insets = new Insets(0, 0, 5, 0);
		gbc_label_2.gridx = 3;
		gbc_label_2.gridy = 5;
		centerGrid.add(label_2, gbc_label_2);
		
		websiteTextField = new JTextField();
		GridBagConstraints gbc_websiteTextField = new GridBagConstraints();
		gbc_websiteTextField.anchor = GridBagConstraints.WEST;
		gbc_websiteTextField.insets = new Insets(0, 0, 5, 5);
		gbc_websiteTextField.gridx = 1;
		gbc_websiteTextField.gridy = 6;
		centerGrid.add(websiteTextField, gbc_websiteTextField);
		websiteTextField.setColumns(10);
		
		JLabel contactPhoneLbl = new JLabel("Contact Phone:");
		contactPhoneLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_contactPhoneLbl = new GridBagConstraints();
		gbc_contactPhoneLbl.anchor = GridBagConstraints.EAST;
		gbc_contactPhoneLbl.insets = new Insets(0, 0, 5, 5);
		gbc_contactPhoneLbl.gridx = 0;
		gbc_contactPhoneLbl.gridy = 6;
		centerGrid.add(contactPhoneLbl, gbc_contactPhoneLbl);
		
		companyTextField = new JTextField();
		GridBagConstraints gbc_companyTextField = new GridBagConstraints();
		gbc_companyTextField.anchor = GridBagConstraints.WEST;
		gbc_companyTextField.insets = new Insets(0, 0, 5, 5);
		gbc_companyTextField.gridx = 1;
		gbc_companyTextField.gridy = 2;
		centerGrid.add(companyTextField, gbc_companyTextField);
		companyTextField.setColumns(10);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setForeground(Color.RED);
		label_7.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.anchor = GridBagConstraints.WEST;
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 1;
		gbc_label_7.gridy = 7;
		centerGrid.add(label_7, gbc_label_7);
		
		JLabel label_11 = new JLabel("New label");
		label_11.setForeground(Color.RED);
		label_11.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.anchor = GridBagConstraints.WEST;
		gbc_label_11.insets = new Insets(0, 0, 5, 0);
		gbc_label_11.gridx = 3;
		gbc_label_11.gridy = 7;
		centerGrid.add(label_11, gbc_label_11);
		
		JLabel label_8 = new JLabel("New label");
		label_8.setForeground(Color.RED);
		label_8.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.anchor = GridBagConstraints.WEST;
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 1;
		gbc_label_8.gridy = 9;
		centerGrid.add(label_8, gbc_label_8);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setForeground(Color.RED);
		label_4.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.WEST;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 1;
		gbc_label_4.gridy = 11;
		centerGrid.add(label_4, gbc_label_4);
		
		JLabel productLbl = new JLabel("Website:");
		productLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_productLbl = new GridBagConstraints();
		gbc_productLbl.anchor = GridBagConstraints.EAST;
		gbc_productLbl.insets = new Insets(0, 0, 5, 5);
		gbc_productLbl.gridx = 2;
		gbc_productLbl.gridy = 6;
		centerGrid.add(productLbl, gbc_productLbl);
		
		productTextField = new JTextField();
		productTextField.setColumns(10);
		GridBagConstraints gbc_productTextField = new GridBagConstraints();
		gbc_productTextField.anchor = GridBagConstraints.WEST;
		gbc_productTextField.insets = new Insets(0, 0, 5, 0);
		gbc_productTextField.gridx = 3;
		gbc_productTextField.gridy = 6;
		centerGrid.add(productTextField, gbc_productTextField);
		
		JLabel contactEmailLbl = new JLabel("Contact Email:");
		contactEmailLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_contactEmailLbl = new GridBagConstraints();
		gbc_contactEmailLbl.anchor = GridBagConstraints.EAST;
		gbc_contactEmailLbl.insets = new Insets(0, 0, 5, 5);
		gbc_contactEmailLbl.gridx = 0;
		gbc_contactEmailLbl.gridy = 8;
		centerGrid.add(contactEmailLbl, gbc_contactEmailLbl);
		
		cityTextField = new JTextField();
		GridBagConstraints gbc_cityTextField = new GridBagConstraints();
		gbc_cityTextField.anchor = GridBagConstraints.WEST;
		gbc_cityTextField.insets = new Insets(0, 0, 5, 5);
		gbc_cityTextField.gridx = 1;
		gbc_cityTextField.gridy = 8;
		centerGrid.add(cityTextField, gbc_cityTextField);
		cityTextField.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		GridBagConstraints gbc_textField_13 = new GridBagConstraints();
		gbc_textField_13.anchor = GridBagConstraints.WEST;
		gbc_textField_13.insets = new Insets(0, 0, 5, 5);
		gbc_textField_13.gridx = 1;
		gbc_textField_13.gridy = 12;
		centerGrid.add(textField_13, gbc_textField_13);
		
		JLabel companyLbl = new JLabel("Company:");
		companyLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_companyLbl = new GridBagConstraints();
		gbc_companyLbl.anchor = GridBagConstraints.EAST;
		gbc_companyLbl.insets = new Insets(0, 0, 5, 5);
		gbc_companyLbl.gridx = 0;
		gbc_companyLbl.gridy = 10;
		centerGrid.add(companyLbl, gbc_companyLbl);
		
		JLabel statusLbl = new JLabel("Position:");
		statusLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_statusLbl = new GridBagConstraints();
		gbc_statusLbl.anchor = GridBagConstraints.EAST;
		gbc_statusLbl.insets = new Insets(0, 0, 5, 5);
		gbc_statusLbl.gridx = 0;
		gbc_statusLbl.gridy = 12;
		centerGrid.add(statusLbl, gbc_statusLbl);
		
		facebookTextField = new JTextField();
		facebookTextField.setColumns(10);
		GridBagConstraints gbc_facebookTextField = new GridBagConstraints();
		gbc_facebookTextField.anchor = GridBagConstraints.WEST;
		gbc_facebookTextField.insets = new Insets(0, 0, 5, 5);
		gbc_facebookTextField.gridx = 1;
		gbc_facebookTextField.gridy = 10;
		centerGrid.add(facebookTextField, gbc_facebookTextField);
		
		JLabel label_10 = new JLabel("New label");
		label_10.setForeground(Color.RED);
		label_10.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.anchor = GridBagConstraints.WEST;
		gbc_label_10.insets = new Insets(0, 0, 5, 5);
		gbc_label_10.gridx = 1;
		gbc_label_10.gridy = 13;
		centerGrid.add(label_10, gbc_label_10);
	}

	@Override
	public void beanToForm(CRMBean bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void formToBean(CRMBean bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearForm() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearFieldErrors() {
		// TODO Auto-generated method stub
		
	}
	
	

}
