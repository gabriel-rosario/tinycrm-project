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

public class OppSwingView extends NewSwingView
{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
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
		gbl_centerGrid.rowHeights = new int[] {30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
		gbl_centerGrid.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0};
		gbl_centerGrid.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
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
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.anchor = GridBagConstraints.WEST;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 0;
		centerGrid.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setFont(new Font("Courier New", Font.ITALIC, 9));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 10, 0);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		centerGrid.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Courier New", Font.ITALIC, 9));
		label_2.setBackground(Color.RED);
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.WEST;
		gbc_label_2.insets = new Insets(0, 0, 10, 0);
		gbc_label_2.gridx = 3;
		gbc_label_2.gridy = 1;
		centerGrid.add(label_2, gbc_label_2);
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
