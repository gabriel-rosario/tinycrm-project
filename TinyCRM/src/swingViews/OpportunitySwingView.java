package swingViews;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import beans.CRMBean;
import beans.ClientBean;
import beans.OpportunityBean;
import swingViews.ContactSwingView.ClientForComboBox;
import views.OpportunityTCRMView;

public class OpportunitySwingView extends SwingView implements OpportunityTCRMView{

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
	
	private JTextField textId;
	private JTextField textStatus;
	private JTextField textPrice;
	private JTextField textClose;
	private JTextField textDescription;
	
	private JLabel idLblError = new JLabel();
	private JLabel statusLblError;
	private JLabel priceLblError;
	private JLabel closeLblError;
	private JLabel descriptionLblError;
	
	private JComboBox<String> moduleComboBox = new JComboBox<String>();
	private JComboBox<ClientForComboBox> comboBoxClient;

	public OpportunitySwingView() {
		super();
		setTitle("Opportunites");
		
		JPanel topPanel = new JPanel();
		
		moduleComboBox = new JComboBox<String>();
		moduleComboBox.setMaximumSize(new Dimension(150, 27));
		moduleComboBox.setPreferredSize(new Dimension(150, 27));
		topPanel.add(moduleComboBox);
		
		JScrollPane centerScrollPane = new JScrollPane();
		centerScrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		centerScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		centerScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		setCenterPanel(centerScrollPane);
		
		JPanel centerGrid = new JPanel();
		centerScrollPane.setViewportView(centerGrid);
		GridBagLayout gbl_centerGrid = new GridBagLayout();
		gbl_centerGrid.columnWidths = new int[]{100, 475, 0};
		gbl_centerGrid.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_centerGrid.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_centerGrid.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		centerGrid.setLayout(gbl_centerGrid);
		
		JLabel lblId = new JLabel("Client ID:");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 0;
		centerGrid.add(lblId, gbc_lblId);
		
		textId = new JTextField();
		textId.setEditable(false);
		GridBagConstraints gbc_txtId = new GridBagConstraints();
		gbc_txtId.insets = new Insets(0, 0, 5, 0);
		gbc_txtId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtId.gridx = 1;
		gbc_txtId.gridy = 0;
		centerGrid.add(textId, gbc_txtId);
		textId.setColumns(5);
		
		comboBoxClient = new JComboBox<ClientForComboBox>();
		comboBoxClient.setEditable(false);
		comboBoxClient.setEnabled(false);
		GridBagConstraints gbc_comboBoxClient = new GridBagConstraints();
		gbc_comboBoxClient.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxClient.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxClient.gridx = 1;
		gbc_comboBoxClient.gridy = 2;
		centerGrid.add(comboBoxClient, gbc_comboBoxClient);
		
		JLabel lblSts = new JLabel("Status:");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblSts = new GridBagConstraints();
		gbc_lblSts.anchor = GridBagConstraints.EAST;
		gbc_lblSts.insets = new Insets(0, 0, 5, 5);
		gbc_lblSts.gridx = 0;
		gbc_lblSts.gridy = 4;
		centerGrid.add(lblSts, gbc_lblSts);
		
		textStatus = new JTextField();
		textStatus.setEditable(true);
		GridBagConstraints gbc_textSts = new GridBagConstraints();
		gbc_textSts.insets = new Insets(0, 0, 5, 0);
		gbc_textSts.fill = GridBagConstraints.HORIZONTAL;
		gbc_textSts.gridx = 1;
		gbc_textSts.gridy = 4;
		centerGrid.add(textStatus, gbc_textSts);
		textStatus.setColumns(10);
		
		statusLblError = new JLabel("New label");
		statusLblError.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		statusLblError.setForeground(Color.RED);
		GridBagConstraints gbc_statusLblError = new GridBagConstraints();
		gbc_statusLblError.anchor = GridBagConstraints.WEST;
		gbc_statusLblError.insets = new Insets(0, 0, 5, 0);
		gbc_statusLblError.gridx = 1;
		gbc_statusLblError.gridy = 5;
		centerGrid.add(statusLblError, gbc_statusLblError);
		
		JLabel lblPrice = new JLabel("Price:");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblPrc = new GridBagConstraints();
		gbc_lblPrc.anchor = GridBagConstraints.EAST;
		gbc_lblPrc.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrc.gridx = 0;
		gbc_lblPrc.gridy = 6;
		centerGrid.add(lblPrice, gbc_lblPrc);
		
		textPrice = new JTextField();
		textPrice.setEditable(true);
		GridBagConstraints gbc_textPrc = new GridBagConstraints();
		gbc_textPrc.insets = new Insets(0, 0, 5, 0);
		gbc_textPrc.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPrc.gridx = 1;
		gbc_textPrc.gridy = 6;
		centerGrid.add(textPrice, gbc_textPrc);
		textPrice.setColumns(10);
		
		priceLblError = new JLabel("New label");
		priceLblError.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		priceLblError.setForeground(Color.RED);
		GridBagConstraints gbc_priceLblError = new GridBagConstraints();
		gbc_priceLblError.anchor = GridBagConstraints.WEST;
		gbc_priceLblError.insets = new Insets(0, 0, 5, 0);
		gbc_priceLblError.gridx = 1;
		gbc_priceLblError.gridy = 7;
		centerGrid.add(priceLblError, gbc_priceLblError);
		
		JLabel lblClose = new JLabel("Close:");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblClose = new GridBagConstraints();
		gbc_lblClose.anchor = GridBagConstraints.EAST;
		gbc_lblClose.insets = new Insets(0, 0, 5, 5);
		gbc_lblClose.gridx = 0;
		gbc_lblClose.gridy = 8;
		centerGrid.add(lblClose, gbc_lblClose);
		
		textClose = new JTextField();
		textClose.setEditable(true);
		GridBagConstraints gbc_textClose = new GridBagConstraints();
		gbc_textClose.insets = new Insets(0, 0, 5, 0);
		gbc_textClose.fill = GridBagConstraints.HORIZONTAL;
		gbc_textClose.gridx = 1;
		gbc_textClose.gridy = 8;
		centerGrid.add(textClose, gbc_textClose);
		textClose.setColumns(10);
		
		closeLblError = new JLabel("New label");
		closeLblError.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		closeLblError.setForeground(Color.RED);
		GridBagConstraints gbc_closeLblError = new GridBagConstraints();
		gbc_closeLblError.anchor = GridBagConstraints.WEST;
		gbc_closeLblError.insets = new Insets(0, 0, 5, 0);
		gbc_closeLblError.gridx = 1;
		gbc_closeLblError.gridy = 9;
		centerGrid.add(closeLblError, gbc_closeLblError);
		
		JLabel lblDesc = new JLabel("Descripcion:");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblDesc = new GridBagConstraints();
		gbc_lblDesc.anchor = GridBagConstraints.EAST;
		gbc_lblDesc.insets = new Insets(0, 0, 5, 5);
		gbc_lblDesc.gridx = 0;
		gbc_lblDesc.gridy = 10;
		centerGrid.add(lblDesc, gbc_lblDesc);
		
		textDescription = new JTextField();
		textDescription.setEditable(true);
		GridBagConstraints gbc_textDesc = new GridBagConstraints();
		gbc_textDesc.insets = new Insets(0, 0, 5, 0);
		gbc_textDesc.fill = GridBagConstraints.HORIZONTAL;
		gbc_textDesc.gridx = 1;
		gbc_textDesc.gridy = 10;
		centerGrid.add(textDescription, gbc_textDesc);
		textDescription.setColumns(10);
		
		descriptionLblError = new JLabel("New label");
		descriptionLblError.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		descriptionLblError.setForeground(Color.RED);
		GridBagConstraints gbc_descriptionLblError = new GridBagConstraints();
		gbc_descriptionLblError.anchor = GridBagConstraints.WEST;
		gbc_descriptionLblError.insets = new Insets(0, 0, 5, 0);
		gbc_descriptionLblError.gridx = 1;
		gbc_descriptionLblError.gridy = 11;
		centerGrid.add(descriptionLblError, gbc_descriptionLblError);
		
		this.setMessagesText("No Opportunities in the CRM");
		
	}
	
	public String getTextIdOpp()        { return this.textId.getText(); }
	public String getTextStatus()   { return textStatus.getText(); }
	public String getTextPrice() { return textPrice.getText(); }
	public String getTextClose()     { return textClose.getText(); }
	public String getTextDescription()   { return textDescription.getText(); }

	public String getErrorStatus()   { return statusLblError.getText(); }
	public String getErrorPrice() { return priceLblError.getText(); }
	public String getErrorClose()     { return closeLblError.getText(); }
	public String getErrorDescription()   { return descriptionLblError.getText(); }

	public void setErrorStatus(String errorStatus)     { statusLblError.setText(errorStatus); }
	public void setErrorPrice(String errorPrice) { priceLblError.setText(errorPrice); }
	public void setErrorClose(String errorClose)         { closeLblError.setText(errorClose); }
	public void setErrorDescription(String errorDescription)     { descriptionLblError.setText(errorDescription); }
	
	public void setTextIdOpp(String textId)              { this.textId.setText(textId); }
	public void setTextStatusOpp(String textStatus)    { this.textStatus.setText(textStatus); }
	public void setTextPrice(String textPrice) { this.textPrice.setText(textPrice); }
	public void setTextClose(String textClose)        { this.textClose.setText(textClose); }
	public void setTextDescription(String textDescription)    { this.textDescription.setText(textDescription); }
	
	
	
	public void beanToForm(CRMBean bean) {
		OpportunityBean ob = (OpportunityBean) bean;
		this.setTextId(""+ob.getId());
		//this.setTextStatus(""+ob.getStatus());
		
	}
	
	public void formToBean(CRMBean bean) {
		OpportunityBean ob = (OpportunityBean) bean;
		
	}
	
	public void enableEditMode() {
		super.enableEditMode();
		// Make all fields not editable
		textStatus.setEditable(true);
		textPrice.setEditable(true);
		textClose.setEditable(true);
		textDescription.setEditable(true);
		
	}
	
	public void disableEditMode() {
		super.disableEditMode();
		// Make all fields not editable
		textId.setEditable(false);
		textStatus.setEditable(false);
		textPrice.setEditable(false);
		textClose.setEditable(false);
		textDescription.setEditable(false);
		
	}

	public void clearForm() {
		textStatus.setText("");
		textPrice.setText("");
		textClose.setText("");
		textDescription.setText("");
		clearFieldErrors();
	}
	
	public void clearFieldErrors() {
		statusLblError.setText("");
		priceLblError.setText("");
		closeLblError.setText("");
		descriptionLblError.setText("");
		
	}
	
	public String getModuleSelected() {
		return (String) moduleComboBox.getSelectedItem();
	}
	
	public void setModuleSelected(int index) {
		moduleComboBox.setEnabled(false); // Avoid firing event listeners
		moduleComboBox.setSelectedIndex(index);
		moduleComboBox.setEnabled(true);
	}
	
	public void setModuleSelectionItems(String[] modules) {
		moduleComboBox.setModel(new DefaultComboBoxModel<String>(modules));
	}
	
	public void setModuleSelectionListener(Runnable listener) {
		moduleComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Combo Box Selected");
				listener.run();
			}
		});
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
	
	public String getTextId() { return textId.getText(); }

	public void setTextId(String textId) { this.textId.setText(textId); }
	
	//public String getTextStatus() { return textStatus.getStatus(); }

	public void setTextStatus(String textSts) { this.textStatus.setText(textSts); }
	
}
