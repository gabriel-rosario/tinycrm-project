package swingViews;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.CRMBean;
import views.TCRMView;

import javax.swing.JLabel;
import java.awt.Label;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.GridBagLayout;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;

import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;

import java.awt.List;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public abstract class NewSwingView extends JFrame implements TCRMView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel rootPanel;
	private JComponent centerPanel;

	private JLabel indexCountLabel;
	private JLabel messagesLabel;
	private JLabel labelCRM; 

	private boolean editMode = false;

	private JButton leftButton;
	private JButton rightButton;
	private JButton editButton;
	private JButton addButton;
	private JButton deleteButton;
	private JButton saveButton;
	private JButton cancelButton;
	private JComboBox<String> moduleComboBox;
	
	/**
	 * Create the frame.
	 */
	public NewSwingView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 624, 506);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mnItemAbout = new JMenuItem("About");
		mnItemAbout.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 14));
		menuBar.add(mnItemAbout);
		
		rootPanel = new JPanel();
		rootPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		rootPanel.setLayout(new BorderLayout(0, 0));
		setContentPane(rootPanel);
		
		Panel topPanel = new Panel();
		rootPanel.add(topPanel, BorderLayout.NORTH);
		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		labelCRM = new JLabel("");
		topPanel.add(labelCRM);
		
		moduleComboBox = new JComboBox<String>();
		moduleComboBox.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		moduleComboBox.setMaximumSize(new Dimension(150, 27));
		moduleComboBox.setPreferredSize(new Dimension(150, 27));
		topPanel.add(moduleComboBox);
		
		messagesLabel = new JLabel("Message of wich module you are in");
		messagesLabel.setForeground(new Color(205, 92, 92));
		messagesLabel.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		topPanel.add(messagesLabel);
		
		Panel bottomPanel = new Panel();
		rootPanel.add(bottomPanel, BorderLayout.SOUTH);
		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		leftButton = new JButton("Left");
		bottomPanel.add(leftButton);
		
		addButton = new JButton("Add");
		bottomPanel.add(addButton);
		
		editButton = new JButton("Edit");
		bottomPanel.add(editButton);
		
		saveButton = new JButton("Save");
		bottomPanel.add(saveButton);
		
		deleteButton = new JButton("Delete");
		bottomPanel.add(deleteButton);
		
		cancelButton = new JButton("Cancel");
		bottomPanel.add(cancelButton);
		
		rightButton = new JButton("Right");
		bottomPanel.add(rightButton);
		
		indexCountLabel = new JLabel("0/0");
		bottomPanel.add(indexCountLabel);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		rootPanel.add(horizontalStrut, BorderLayout.WEST);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		rootPanel.add(horizontalStrut_1, BorderLayout.EAST);
		
		centerPanel = new JPanel();
		rootPanel.add(centerPanel, BorderLayout.CENTER);
	}
	
	protected JComponent getCenterPanel() {
		return centerPanel;
	}

	protected void setCenterPanel(JComponent centerPanel) {
		this.centerPanel = centerPanel;
		getContentPane().add(centerPanel, BorderLayout.CENTER);
	}

	protected JLabel getIndexCountLabel() {
		return indexCountLabel;
	}

	protected void setIndexCountLabel(JLabel indexCountLabel) {
		this.indexCountLabel = indexCountLabel;
	}

	protected String getMessagesText() {
		return messagesLabel.getText();
	}

	public void setMessagesText(String text) {
		this.messagesLabel.setText(text);
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

	public abstract void beanToForm(CRMBean bean);
	public abstract void formToBean(CRMBean bean);

	public void updateIndexCountLabel(int index, int count) {
		indexCountLabel.setText(index+1 + "/" + count);
	}

	public boolean inEditMode() { return editMode; }
	public void enableEditMode() { editMode = true; }
	public void disableEditMode() {editMode = false; }

	public void setLeftButtonListener(Runnable listener) {
		leftButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				listener.run();
			}
		});
	}

	public void setRightButtonListener(Runnable listener) {
		rightButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				listener.run();
			}
		});
	}

	public void setEditButtonListener(Runnable listener) {
		editButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				listener.run();
			}
		});
	}

	public void setAddButtonListener(Runnable listener) {
		addButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				listener.run();
			}
		});
	}

	public void setDeleteButtonListener(Runnable listener) {
		deleteButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				listener.run();
			}
		});
	}

	public void setSaveButtonListener(Runnable listener) {
		saveButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				listener.run();
			}
		});
	}

	public void setCancelButtonListener(Runnable listener) {
		cancelButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				listener.run();
			}
		});
	}
	
	public void enableLeftButton()   { leftButton.setEnabled(true); }
	public void enableRightButton()  { rightButton.setEnabled(true); }
	public void enableEditButton()   { editButton.setEnabled(true); }
	public void enableAddButton()    { addButton.setEnabled(true); }
	public void enableDeleteButton() { deleteButton.setEnabled(true); }
	public void enableSaveButton()   { saveButton.setEnabled(true); }
	public void enableCancelButton() { cancelButton.setEnabled(true); }

	public void disableLeftButton()   { leftButton.setEnabled(false); }
	public void disableRightButton()  { rightButton.setEnabled(false); }
	public void disableEditButton()   { editButton.setEnabled(false); }
	public void disableAddButton()    { addButton.setEnabled(false); }
	public void disableDeleteButton() { deleteButton.setEnabled(false); }
	public void disableSaveButton()   { saveButton.setEnabled(false); }
	public void disableCancelButton() { cancelButton.setEnabled(false); }

	public abstract void clearForm();
	public abstract void clearFieldErrors();

}
