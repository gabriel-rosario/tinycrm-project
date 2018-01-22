package swingViews;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.CRMBean;
import main.CRMMain;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.GridLayout;

public class OpeningMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPanel;
	private boolean pressedMod = false;
	private String open;

	public OpeningMenu () {
		
		this.setBounds(100, 100, 633, 450);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//this.setResizable(false);
		
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanel);
		contentPanel.setLayout(new BorderLayout(0, 0));
		
		//buttons for module pick 
		ActionListener buttonHandler = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(e.getActionCommand().equals("Client's Module")) {
						setPressedModule(true);
						setOpenModule("Clients");
					}
					if(e.getActionCommand().equals("Contact's Module")){
						setPressedModule(true);
						setOpenModule("Contacts");
					}
					if(e.getActionCommand().equals("Opportunity's Module")){
						setPressedModule(true);
						setOpenModule("Opportunities");
					}
					
			} catch (Exception e2) {
				e2.printStackTrace(); throw new RuntimeException("IO ERROR");
				}
			}
		};
		
		JPanel panel = new NewImage();
		panel.setSize(this.getWidth(), this.getHeight());
		contentPanel.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitle = new JLabel("Stranger's Software Solutions");
		lblTitle.setForeground(new Color(51, 255, 255));
		lblTitle.setFont(new Font("Apple Chancery", Font.BOLD | Font.ITALIC, 50));
		panel.add(lblTitle, BorderLayout.NORTH);
		
		JPanel bottomPanel = new JPanel();
		panel.add(bottomPanel, BorderLayout.SOUTH);
		
		JButton btnClients = new JButton("Client's Module");
		btnClients.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		btnClients.addActionListener(buttonHandler);
		bottomPanel.add(btnClients);
		
		JButton btnOpportunity = new JButton("Opportunity's Module");
		btnOpportunity.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		btnOpportunity.addActionListener(buttonHandler);
		bottomPanel.add(btnOpportunity);
		
		JButton btnContacts = new JButton("Contact's Module");
		btnContacts.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		btnContacts.addActionListener(buttonHandler);
		bottomPanel.add(btnContacts);
		
		JPanel centerPanel = new JPanel();
		panel.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("<html> <br>CRM Description <html>");
		lblNewLabel.setForeground(new Color(51, 255, 51));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Hoefler Text", Font.BOLD | Font.ITALIC, 18));
		centerPanel.add(lblNewLabel);
	
		this.setVisible(true);
		
	}
	
	public boolean press() {
		while(pressedMod == false) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		return isPressedModule();
	}
	
	public boolean isPressedModule() {
		return pressedMod;
	}

	public void setPressedModule(boolean pressedMod) {
		this.pressedMod = pressedMod;
	}

	public String getOpenModule() {
		return open;
	}

	public void setOpenModule(String string) {
		open = string;
	}

}
