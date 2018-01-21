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
import javax.swing.UIManager;
import java.awt.TextArea;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import java.awt.Panel;
import java.awt.Choice;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;

public class OppSwingView extends NewSwingView
{
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_11;
	private JTextField textField_1;
	private JTextField textField_10;
	private JTextField textField_12;
	private JTextField textField_13;
	
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
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 0;
		centerGrid.add(lblId, gbc_lblId);
		
		textField = new JTextField();
		textField.setText("1");
		textField.setEditable(false);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.WEST;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		centerGrid.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblClient = new JLabel("Client:");
		lblClient.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lblClient = new GridBagConstraints();
		gbc_lblClient.anchor = GridBagConstraints.EAST;
		gbc_lblClient.insets = new Insets(0, 0, 5, 5);
		gbc_lblClient.gridx = 2;
		gbc_lblClient.gridy = 0;
		centerGrid.add(lblClient, gbc_lblClient);
		
		Choice choice = new Choice();
		GridBagConstraints gbc_choice = new GridBagConstraints();
		gbc_choice.fill = GridBagConstraints.HORIZONTAL;
		gbc_choice.insets = new Insets(0, 0, 5, 0);
		gbc_choice.gridx = 3;
		gbc_choice.gridy = 0;
		centerGrid.add(choice, gbc_choice);
		
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
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.anchor = GridBagConstraints.WEST;
		gbc_textField_8.insets = new Insets(0, 0, 5, 0);
		gbc_textField_8.gridx = 3;
		gbc_textField_8.gridy = 2;
		centerGrid.add(textField_8, gbc_textField_8);
		
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
		
		JLabel label_4 = new JLabel("Price per unit:");
		label_4.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.anchor = GridBagConstraints.EAST;
		gbc_label_4.gridx = 0;
		gbc_label_4.gridy = 4;
		centerGrid.add(label_4, gbc_label_4);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.anchor = GridBagConstraints.WEST;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 4;
		centerGrid.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 2;
		gbc_lblEmail.gridy = 4;
		centerGrid.add(lblEmail, gbc_lblEmail);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.anchor = GridBagConstraints.WEST;
		gbc_textField_9.insets = new Insets(0, 0, 5, 0);
		gbc_textField_9.gridx = 3;
		gbc_textField_9.gridy = 4;
		centerGrid.add(textField_9, gbc_textField_9);
		
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
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.anchor = GridBagConstraints.WEST;
		gbc_textField_10.insets = new Insets(0, 0, 5, 0);
		gbc_textField_10.gridx = 3;
		gbc_textField_10.gridy = 6;
		centerGrid.add(textField_10, gbc_textField_10);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.anchor = GridBagConstraints.WEST;
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 1;
		gbc_label_5.gridy = 7;
		centerGrid.add(label_5, gbc_label_5);
		
		JLabel label_8 = new JLabel("New label");
		label_8.setForeground(Color.RED);
		label_8.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.anchor = GridBagConstraints.WEST;
		gbc_label_8.insets = new Insets(0, 0, 5, 0);
		gbc_label_8.gridx = 3;
		gbc_label_8.gridy = 7;
		centerGrid.add(label_8, gbc_label_8);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.anchor = GridBagConstraints.WEST;
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 8;
		centerGrid.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setForeground(UIManager.getColor("InternalFrame.borderShadow"));
		lblNewLabel_1.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 5;
		centerGrid.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.WEST;
		gbc_label_2.insets = new Insets(0, 0, 5, 0);
		gbc_label_2.gridx = 3;
		gbc_label_2.gridy = 5;
		centerGrid.add(label_2, gbc_label_2);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lblPrice = new GridBagConstraints();
		gbc_lblPrice.anchor = GridBagConstraints.EAST;
		gbc_lblPrice.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrice.gridx = 0;
		gbc_lblPrice.gridy = 8;
		centerGrid.add(lblPrice, gbc_lblPrice);
		
		textField_7 = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.anchor = GridBagConstraints.WEST;
		gbc_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_textField_7.gridx = 1;
		gbc_textField_7.gridy = 2;
		centerGrid.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.anchor = GridBagConstraints.WEST;
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 6;
		centerGrid.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JLabel lblAddressH = new JLabel("City:");
		lblAddressH.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lblAddressH = new GridBagConstraints();
		gbc_lblAddressH.anchor = GridBagConstraints.EAST;
		gbc_lblAddressH.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddressH.gridx = 2;
		gbc_lblAddressH.gridy = 8;
		centerGrid.add(lblAddressH, gbc_lblAddressH);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		GridBagConstraints gbc_textField_12 = new GridBagConstraints();
		gbc_textField_12.anchor = GridBagConstraints.WEST;
		gbc_textField_12.insets = new Insets(0, 0, 5, 0);
		gbc_textField_12.gridx = 3;
		gbc_textField_12.gridy = 8;
		centerGrid.add(textField_12, gbc_textField_12);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setForeground(Color.RED);
		label_7.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.anchor = GridBagConstraints.WEST;
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 1;
		gbc_label_7.gridy = 9;
		centerGrid.add(label_7, gbc_label_7);
		
		JLabel label_9 = new JLabel("New label");
		label_9.setForeground(Color.RED);
		label_9.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.anchor = GridBagConstraints.WEST;
		gbc_label_9.insets = new Insets(0, 0, 5, 0);
		gbc_label_9.gridx = 3;
		gbc_label_9.gridy = 9;
		centerGrid.add(label_9, gbc_label_9);
		
		JLabel lblState = new JLabel("State:");
		lblState.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lblState = new GridBagConstraints();
		gbc_lblState.insets = new Insets(0, 0, 5, 5);
		gbc_lblState.anchor = GridBagConstraints.EAST;
		gbc_lblState.gridx = 2;
		gbc_lblState.gridy = 10;
		centerGrid.add(lblState, gbc_lblState);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		GridBagConstraints gbc_textField_13 = new GridBagConstraints();
		gbc_textField_13.anchor = GridBagConstraints.WEST;
		gbc_textField_13.insets = new Insets(0, 0, 5, 0);
		gbc_textField_13.gridx = 3;
		gbc_textField_13.gridy = 10;
		centerGrid.add(textField_13, gbc_textField_13);
		
		JLabel label_11 = new JLabel("New label");
		label_11.setForeground(Color.RED);
		label_11.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.anchor = GridBagConstraints.WEST;
		gbc_label_11.insets = new Insets(0, 0, 5, 5);
		gbc_label_11.gridx = 1;
		gbc_label_11.gridy = 11;
		centerGrid.add(label_11, gbc_label_11);
		
		JLabel label_10 = new JLabel("New label");
		label_10.setForeground(Color.RED);
		label_10.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.anchor = GridBagConstraints.WEST;
		gbc_label_10.insets = new Insets(0, 0, 5, 0);
		gbc_label_10.gridx = 3;
		gbc_label_10.gridy = 11;
		centerGrid.add(label_10, gbc_label_10);
		
		JLabel label_12 = new JLabel("New label");
		label_12.setForeground(Color.RED);
		label_12.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.anchor = GridBagConstraints.WEST;
		gbc_label_12.insets = new Insets(0, 0, 5, 5);
		gbc_label_12.gridx = 1;
		gbc_label_12.gridy = 13;
		centerGrid.add(label_12, gbc_label_12);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lblDescription = new GridBagConstraints();
		gbc_lblDescription.anchor = GridBagConstraints.EAST;
		gbc_lblDescription.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescription.gridx = 0;
		gbc_lblDescription.gridy = 14;
		centerGrid.add(lblDescription, gbc_lblDescription);
		
		JTextArea textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 1;
		gbc_textArea.gridy = 14;
		centerGrid.add(textArea, gbc_textArea);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.anchor = GridBagConstraints.WEST;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 12;
		centerGrid.add(textField_1, gbc_textField_1);
		
		JLabel lblClosed = new JLabel("Close Date:");
		lblClosed.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lblClosed = new GridBagConstraints();
		gbc_lblClosed.anchor = GridBagConstraints.EAST;
		gbc_lblClosed.insets = new Insets(0, 0, 5, 5);
		gbc_lblClosed.gridx = 0;
		gbc_lblClosed.gridy = 10;
		centerGrid.add(lblClosed, gbc_lblClosed);
		
		JLabel lblNewLabel = new JLabel("Status:");
		lblNewLabel.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 12;
		centerGrid.add(lblNewLabel, gbc_lblNewLabel);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.anchor = GridBagConstraints.WEST;
		gbc_textField_11.insets = new Insets(0, 0, 5, 5);
		gbc_textField_11.gridx = 1;
		gbc_textField_11.gridy = 10;
		centerGrid.add(textField_11, gbc_textField_11);
		
		JLabel label_13 = new JLabel("New label");
		label_13.setForeground(Color.RED);
		label_13.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_label_13 = new GridBagConstraints();
		gbc_label_13.anchor = GridBagConstraints.WEST;
		gbc_label_13.insets = new Insets(0, 0, 5, 5);
		gbc_label_13.gridx = 1;
		gbc_label_13.gridy = 15;
		centerGrid.add(label_13, gbc_label_13);
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
