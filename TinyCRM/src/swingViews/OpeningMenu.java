package swingViews;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class OpeningMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPanel;
	private boolean pressedMod = false;
	private String open;

	public OpeningMenu () {

		this.setBounds(100, 100, 650, 450);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//this.setResizable(false);

		contentPanel = new JPanel();
		contentPanel.setSize(this.getWidth(), this.getHeight());
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

		JLabel lblNewLabel = new JLabel("This our Customer Relationship Management");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(6, 130, 560, 40);
		contentPanel.add(lblNewLabel);

		JLabel lblNewLabel2 = new JLabel("Description");
		lblNewLabel2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel2.setForeground(new Color(255, 255, 255));
		lblNewLabel2.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNewLabel2.setBounds(6, 155, 350, 115);
		contentPanel.add(lblNewLabel2);

		JButton btnOpportunity = new JButton("Opportunity's Module");
		btnOpportunity.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		btnOpportunity.addActionListener(buttonHandler);
		btnOpportunity.setBounds(15, 300, 200, 50);
		contentPanel.add(btnOpportunity);

		JButton btnClients = new JButton("Client's Module");
		btnClients.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		btnClients.addActionListener(buttonHandler);
		btnClients.setBounds(220, 300, 200, 50);
		contentPanel.add(btnClients);

		JButton btnContacts = new JButton("Contact's Module");
		btnContacts.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 13));
		btnContacts.addActionListener(buttonHandler);
		btnContacts.setBounds(425, 300, 200, 50);
		contentPanel.add(btnContacts);

		JPanel panel = new NewImage();
		panel.setSize(this.getWidth(), this.getHeight());
		contentPanel.add(panel);

		JLabel lblTitle = new JLabel("<html>Stranger's Software <br> Solutions");
		panel.add(lblTitle, BorderLayout.NORTH);
		lblTitle.setForeground(new Color(255, 255, 255));
		lblTitle.setFont(new Font("Desdemona", Font.BOLD | Font.ITALIC, 47));
		lblTitle.setBounds(30, 30, 424, 80);

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
