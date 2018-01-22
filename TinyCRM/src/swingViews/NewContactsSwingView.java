package swingViews;

import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import beans.CRMBean;
import beans.ContactBean;
import beans.NewContactBean;
import swingViews.ContactSwingView.ClientForComboBox;
import views.NewContactCRMView;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Choice;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;

public class NewContactsSwingView extends NewSwingView implements NewContactCRMView{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField idTextField;
	private JTextField lastTextField;
	private JTextField contactPhoneTextField;
	private JTextField firstNameTextField;
	private JTextField clientPhoneTextField;
	private JTextField clientEmailTextField;
	private JTextField companyTextField;
	private JTextField websiteTextField;
	private JTextField positionTextField;
	private JTextField contactEmailTextField;
	
	private JLabel firstNameLblError;
	private JLabel lastNameLblError;
	private JLabel contactPhoneLblError;
	private JLabel contactEmailLblError;
	private JLabel companyLblError;
	private JLabel positionLblError;
	private JComboBox<ClientForComboBox> clientComboBox;
	
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
		idTextField.setText("");
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
		
		clientComboBox = new JComboBox<ClientForComboBox>();
		GridBagConstraints gbc_clientComboBox = new GridBagConstraints();
		gbc_clientComboBox.insets = new Insets(0, 0, 5, 0);
		gbc_clientComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_clientComboBox.gridx = 3;
		gbc_clientComboBox.gridy = 0;
		centerGrid.add(clientComboBox, gbc_clientComboBox);
		
		JLabel firstNameLbl = new JLabel("First Name:");
		firstNameLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_firstNameLbl = new GridBagConstraints();
		gbc_firstNameLbl.anchor = GridBagConstraints.EAST;
		gbc_firstNameLbl.insets = new Insets(0, 0, 5, 5);
		gbc_firstNameLbl.gridx = 0;
		gbc_firstNameLbl.gridy = 2;
		centerGrid.add(firstNameLbl, gbc_firstNameLbl);
		
		clientPhoneTextField = new JTextField();
		clientPhoneTextField.setEditable(false);
		clientPhoneTextField.setColumns(10);
		GridBagConstraints gbc_clientPhoneTextField = new GridBagConstraints();
		gbc_clientPhoneTextField.anchor = GridBagConstraints.WEST;
		gbc_clientPhoneTextField.insets = new Insets(0, 0, 5, 0);
		gbc_clientPhoneTextField.gridx = 3;
		gbc_clientPhoneTextField.gridy = 2;
		centerGrid.add(clientPhoneTextField, gbc_clientPhoneTextField);
		
		firstNameLblError = new JLabel("New label");
		firstNameLblError.setForeground(Color.RED);
		firstNameLblError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_firstNameLblError = new GridBagConstraints();
		gbc_firstNameLblError.anchor = GridBagConstraints.WEST;
		gbc_firstNameLblError.insets = new Insets(0, 0, 5, 5);
		gbc_firstNameLblError.gridx = 1;
		gbc_firstNameLblError.gridy = 3;
		centerGrid.add(firstNameLblError, gbc_firstNameLblError);
		
		JLabel clientPhoneLbl = new JLabel("Client Phone:");
		clientPhoneLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_clientPhoneLbl = new GridBagConstraints();
		gbc_clientPhoneLbl.insets = new Insets(0, 0, 5, 5);
		gbc_clientPhoneLbl.anchor = GridBagConstraints.EAST;
		gbc_clientPhoneLbl.gridx = 2;
		gbc_clientPhoneLbl.gridy = 2;
		centerGrid.add(clientPhoneLbl, gbc_clientPhoneLbl);
		
		lastTextField = new JTextField();
		GridBagConstraints gbc_lastTextField = new GridBagConstraints();
		gbc_lastTextField.anchor = GridBagConstraints.WEST;
		gbc_lastTextField.insets = new Insets(0, 0, 5, 5);
		gbc_lastTextField.gridx = 1;
		gbc_lastTextField.gridy = 4;
		centerGrid.add(lastTextField, gbc_lastTextField);
		lastTextField.setColumns(10);
		
		JLabel lastNameLbl = new JLabel("Last Name:");
		lastNameLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lastNameLbl = new GridBagConstraints();
		gbc_lastNameLbl.anchor = GridBagConstraints.EAST;
		gbc_lastNameLbl.insets = new Insets(0, 0, 5, 5);
		gbc_lastNameLbl.gridx = 0;
		gbc_lastNameLbl.gridy = 4;
		centerGrid.add(lastNameLbl, gbc_lastNameLbl);
		
		clientEmailTextField = new JTextField();
		clientEmailTextField.setEditable(false);
		clientEmailTextField.setColumns(10);
		GridBagConstraints gbc_clientEmailTextField = new GridBagConstraints();
		gbc_clientEmailTextField.anchor = GridBagConstraints.WEST;
		gbc_clientEmailTextField.insets = new Insets(0, 0, 5, 0);
		gbc_clientEmailTextField.gridx = 3;
		gbc_clientEmailTextField.gridy = 4;
		centerGrid.add(clientEmailTextField, gbc_clientEmailTextField);
		
		JLabel clientEmailLbl = new JLabel("Client Email");
		clientEmailLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_clientEmailLbl = new GridBagConstraints();
		gbc_clientEmailLbl.anchor = GridBagConstraints.EAST;
		gbc_clientEmailLbl.insets = new Insets(0, 0, 5, 5);
		gbc_clientEmailLbl.gridx = 2;
		gbc_clientEmailLbl.gridy = 4;
		centerGrid.add(clientEmailLbl, gbc_clientEmailLbl);
		
		lastNameLblError = new JLabel("New label");
		lastNameLblError.setForeground(Color.RED);
		lastNameLblError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_lastNameLblError = new GridBagConstraints();
		gbc_lastNameLblError.anchor = GridBagConstraints.WEST;
		gbc_lastNameLblError.insets = new Insets(0, 0, 5, 5);
		gbc_lastNameLblError.gridx = 1;
		gbc_lastNameLblError.gridy = 5;
		centerGrid.add(lastNameLblError, gbc_lastNameLblError);
		
		contactPhoneTextField = new JTextField();
		GridBagConstraints gbc_contactPhoneTextField = new GridBagConstraints();
		gbc_contactPhoneTextField.anchor = GridBagConstraints.WEST;
		gbc_contactPhoneTextField.insets = new Insets(0, 0, 5, 5);
		gbc_contactPhoneTextField.gridx = 1;
		gbc_contactPhoneTextField.gridy = 6;
		centerGrid.add(contactPhoneTextField, gbc_contactPhoneTextField);
		contactPhoneTextField.setColumns(10);
		
		JLabel contactPhoneLbl = new JLabel("Contact Phone:");
		contactPhoneLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_contactPhoneLbl = new GridBagConstraints();
		gbc_contactPhoneLbl.anchor = GridBagConstraints.EAST;
		gbc_contactPhoneLbl.insets = new Insets(0, 0, 5, 5);
		gbc_contactPhoneLbl.gridx = 0;
		gbc_contactPhoneLbl.gridy = 6;
		centerGrid.add(contactPhoneLbl, gbc_contactPhoneLbl);
		
		firstNameTextField = new JTextField();
		GridBagConstraints gbc_firstNameTextField = new GridBagConstraints();
		gbc_firstNameTextField.anchor = GridBagConstraints.WEST;
		gbc_firstNameTextField.insets = new Insets(0, 0, 5, 5);
		gbc_firstNameTextField.gridx = 1;
		gbc_firstNameTextField.gridy = 2;
		centerGrid.add(firstNameTextField, gbc_firstNameTextField);
		firstNameTextField.setColumns(10);
		
		contactPhoneLblError = new JLabel("New label");
		contactPhoneLblError.setForeground(Color.RED);
		contactPhoneLblError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_contactLblError = new GridBagConstraints();
		gbc_contactLblError.anchor = GridBagConstraints.WEST;
		gbc_contactLblError.insets = new Insets(0, 0, 5, 5);
		gbc_contactLblError.gridx = 1;
		gbc_contactLblError.gridy = 7;
		centerGrid.add(contactPhoneLblError, gbc_contactLblError);
		
		contactEmailLblError = new JLabel("New label");
		contactEmailLblError.setForeground(Color.RED);
		contactEmailLblError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_contactEmailLblError = new GridBagConstraints();
		gbc_contactEmailLblError.anchor = GridBagConstraints.WEST;
		gbc_contactEmailLblError.insets = new Insets(0, 0, 5, 5);
		gbc_contactEmailLblError.gridx = 1;
		gbc_contactEmailLblError.gridy = 9;
		centerGrid.add(contactEmailLblError, gbc_contactEmailLblError);
		
		companyLblError = new JLabel("New label");
		companyLblError.setForeground(Color.RED);
		companyLblError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_companyLblError = new GridBagConstraints();
		gbc_companyLblError.anchor = GridBagConstraints.WEST;
		gbc_companyLblError.insets = new Insets(0, 0, 5, 5);
		gbc_companyLblError.gridx = 1;
		gbc_companyLblError.gridy = 11;
		centerGrid.add(companyLblError, gbc_companyLblError);
		
		JLabel websiteLbl = new JLabel("Website:");
		websiteLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_websiteLbl = new GridBagConstraints();
		gbc_websiteLbl.anchor = GridBagConstraints.EAST;
		gbc_websiteLbl.insets = new Insets(0, 0, 5, 5);
		gbc_websiteLbl.gridx = 2;
		gbc_websiteLbl.gridy = 6;
		centerGrid.add(websiteLbl, gbc_websiteLbl);
		
		websiteTextField = new JTextField();
		websiteTextField.setEditable(false);
		websiteTextField.setColumns(10);
		GridBagConstraints gbc_websiteTextField = new GridBagConstraints();
		gbc_websiteTextField.anchor = GridBagConstraints.WEST;
		gbc_websiteTextField.insets = new Insets(0, 0, 5, 0);
		gbc_websiteTextField.gridx = 3;
		gbc_websiteTextField.gridy = 6;
		centerGrid.add(websiteTextField, gbc_websiteTextField);
		
		JLabel contactEmailLbl = new JLabel("Contact Email:");
		contactEmailLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_contactEmailLbl = new GridBagConstraints();
		gbc_contactEmailLbl.anchor = GridBagConstraints.EAST;
		gbc_contactEmailLbl.insets = new Insets(0, 0, 5, 5);
		gbc_contactEmailLbl.gridx = 0;
		gbc_contactEmailLbl.gridy = 8;
		centerGrid.add(contactEmailLbl, gbc_contactEmailLbl);
		
		contactEmailTextField = new JTextField();
		GridBagConstraints gbc_contactEmailTextField = new GridBagConstraints();
		gbc_contactEmailTextField.anchor = GridBagConstraints.WEST;
		gbc_contactEmailTextField.insets = new Insets(0, 0, 5, 5);
		gbc_contactEmailTextField.gridx = 1;
		gbc_contactEmailTextField.gridy = 8;
		centerGrid.add(contactEmailTextField, gbc_contactEmailTextField);
		contactEmailTextField.setColumns(10);
		
		positionTextField = new JTextField();
		positionTextField.setColumns(10);
		GridBagConstraints gbc_positionTextField = new GridBagConstraints();
		gbc_positionTextField.anchor = GridBagConstraints.WEST;
		gbc_positionTextField.insets = new Insets(0, 0, 5, 5);
		gbc_positionTextField.gridx = 1;
		gbc_positionTextField.gridy = 12;
		centerGrid.add(positionTextField, gbc_positionTextField);
		
		JLabel companyLbl = new JLabel("Company:");
		companyLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_companyLbl = new GridBagConstraints();
		gbc_companyLbl.anchor = GridBagConstraints.EAST;
		gbc_companyLbl.insets = new Insets(0, 0, 5, 5);
		gbc_companyLbl.gridx = 0;
		gbc_companyLbl.gridy = 10;
		centerGrid.add(companyLbl, gbc_companyLbl);
		
		JLabel positionLbl = new JLabel("Position:");
		positionLbl.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_positionLbl = new GridBagConstraints();
		gbc_positionLbl.anchor = GridBagConstraints.EAST;
		gbc_positionLbl.insets = new Insets(0, 0, 5, 5);
		gbc_positionLbl.gridx = 0;
		gbc_positionLbl.gridy = 12;
		centerGrid.add(positionLbl, gbc_positionLbl);
		
		companyTextField = new JTextField();
		companyTextField.setColumns(10);
		GridBagConstraints gbc_companyTextField = new GridBagConstraints();
		gbc_companyTextField.anchor = GridBagConstraints.WEST;
		gbc_companyTextField.insets = new Insets(0, 0, 5, 5);
		gbc_companyTextField.gridx = 1;
		gbc_companyTextField.gridy = 10;
		centerGrid.add(companyTextField, gbc_companyTextField);
		
		positionLblError = new JLabel("New label");
		positionLblError.setForeground(Color.RED);
		positionLblError.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_positionLblError = new GridBagConstraints();
		gbc_positionLblError.anchor = GridBagConstraints.WEST;
		gbc_positionLblError.insets = new Insets(0, 0, 5, 5);
		gbc_positionLblError.gridx = 1;
		gbc_positionLblError.gridy = 13;
		centerGrid.add(positionLblError, gbc_positionLblError);
		
		this.setMessagesText("No Contacts in the CRM");
	}
	
	@Override
	public void beanToForm(CRMBean bean) {
		NewContactBean cb = (NewContactBean) bean;
		this.setIdTextField(""+cb.getId());
		this.setFirstNameText(cb.getFirstName());
		this.setLastNameText(cb.getLastName());
		this.setCompanyText(cb.getCompany());
		this.setContactPhoneText(cb.getContactPhone());
		this.setContactEmailText(cb.getContactEmail());
		this.setPositionText(cb.getPosition());
		for (int i=0; i < clientComboBox.getItemCount(); i++) {
			ClientForComboBox item = (ClientForComboBox) clientComboBox.getItemAt(i);
			if (item.getId() == cb.getId()) {
				this.setSelectedClientIndex(i);
			}
		}
	}

	@Override
	public void formToBean(CRMBean bean) {
		NewContactBean cb = (NewContactBean) bean;
		//cb.setId(Integer.parseInt(textId.getText()));  // Id is never editable
		cb.setFirstName(firstNameTextField.getText());
		cb.setLastName(lastTextField.getText());
		cb.setCompany(companyTextField.getText());
		cb.setClient(((ClientForComboBox) clientComboBox.getSelectedItem()).getId());
		cb.setContactPhone(contactPhoneTextField.getText());
		cb.setContactEmail(contactEmailTextField.getText());
		cb.setPosition(positionTextField.getText());
	}

	public void enableEditMode() { 
		super.enableEditMode();
		//textId.setEditable(true);
		firstNameTextField.setEditable(true);
		lastTextField.setEditable(true);
		companyTextField.setEditable(true);
		contactPhoneTextField.setEditable(true);
		contactEmailTextField.setEditable(true);
		companyTextField.setEditable(true);
		positionTextField.setEditable(true);
	}
	public void disableEditMode() {
		super.disableEditMode();
		firstNameTextField.setEditable(false);
		lastTextField.setEditable(false);
		companyTextField.setEditable(false);
		contactPhoneTextField.setEditable(false);
		contactEmailTextField.setEditable(false);
		companyTextField.setEditable(false);
		positionTextField.setEditable(false);
	}

	public void clearForm() {
		firstNameTextField.setText("");
		lastTextField.setText("");
		companyTextField.setText("");
		if (clientComboBox.getItemCount() > 0) { clientComboBox.setSelectedIndex(0); }
		contactPhoneTextField.setText("");
		contactEmailTextField.setText("");
		companyTextField.setText("");
		clearFieldErrors();
	}

	public void clearFieldErrors() {
		firstNameLblError.setText("");
		lastNameLblError.setText("");
		companyLblError.setText("");
		positionLblError.setText("");
		contactPhoneLblError.setText("");
		contactEmailLblError.setText("");
	}

	public String getIdTextField() {return idTextField.getText();}
	public void setIdTextField(String idTextField) {this.idTextField.setText(idTextField);}
	
	public String getFirstNameText() {return firstNameTextField.getText();}
	public void setFirstNameText(String firstName) {firstNameTextField.setText(firstName);}

	public String getLastNameText() {return lastTextField.getText();}
	public void setLastNameText(String lastName) { lastTextField.setText(lastName);}

	public String getContactPhoneText() {return contactPhoneTextField.getText();}
	public void setContactPhoneText(String contactPhone) {contactPhoneTextField.setText(contactPhone);}

	public String getContactEmailText() {return contactEmailTextField.getText();}
	public void setContactEmailText(String contactEmail) {contactEmailTextField.setText(contactEmail);}

	public String getCompanyText() {return companyTextField.getText();}
	public void setCompanyText(String company) {companyTextField.setText(company);}

	public String getPositionText() {return positionTextField.getText();}
	public void setPositionText(String position) {positionTextField.setText(position);}

	public String getCompanyLblError() {return companyLblError.getText();}
	public void setCompanyLblError(String companyError) {companyLblError.setText(companyError);}

	public String getPositionLblError() {return positionLblError.getText();}
	public void setPositionLblError(String positionError) {positionLblError.setText(positionError);}
	
	public String getContactEmailLblError() {return contactEmailLblError.getText();}
	public void setContactEmailLblError(String emailError) {contactEmailLblError.setText(emailError);}
	
	public String getContactPhoneLblError() {return contactPhoneLblError.getText();}
	public void setContactPhoneLblError(String phoneError) {contactPhoneLblError.setText(phoneError);}

	public String getFirstNameLblError() {return firstNameLblError.getText();}
	public void setFisrtNameLblError(String firstError) {firstNameLblError.setText(firstError);}

	public String getLastNameLblError() {return lastNameLblError.getText();}
	public void setLastNameLblError(String lastError) {lastNameLblError.setText(lastError);}

	public int getSelectedClientIndex() {
		return clientComboBox.getSelectedIndex();
	}

	public void setSelectedClientIndex(int index) {
		if (index >= 0 && index <= clientComboBox.getItemCount()) {
			clientComboBox.setEnabled(false);
			clientComboBox.setSelectedIndex(index);
			clientComboBox.setEnabled(true);
		}
	}

	public void setSelectClientItems(ArrayList<CRMBean> list) {
		clientComboBox.removeAllItems();
		for (CRMBean item : list) {
			clientComboBox.addItem(new ClientForComboBox(item.getId(), item.getDescription()));
		}
	}

	public void setSelectClientListener(ActionListener listener) {
		clientComboBox.addActionListener(listener);
	}

}
