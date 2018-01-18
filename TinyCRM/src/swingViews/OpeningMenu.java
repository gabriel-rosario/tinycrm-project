//package swingViews;
//
//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JComboBox;
//import javax.swing.JComponent;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//
//import beans.CRMBean;
//import main.CRMMain;
//
//public class OpeningMenu extends JFrame {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	
//	private JPanel contentPanel;
//	private boolean pressedMod = false;
//	private String open;
//
//	public OpeningMenu () {
//		
//		this.setBounds(100, 100, 633, 450);
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		//this.setResizable(false);
//		
//		contentPanel = new JPanel();
//		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPanel);
//		contentPanel.setLayout(new BorderLayout(0, 0));
//		
//		JLabel lblNewLabel = new JLabel("CRM");
//		lblNewLabel.setForeground(Color.lightGray);
//		lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 50));
//		lblNewLabel.setBounds(45, 47, 424, 80);
//		contentPanel.add(lblNewLabel);
//		
//		JLabel lblNewLabel_2 = new JLabel("Our new Bussiness ");
//		lblNewLabel_2.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 13));
//		lblNewLabel_2.setForeground(Color.white);
//		lblNewLabel_2.setBounds(45, 100, 588, 130);
//		contentPanel.add(lblNewLabel_2);
//		
//		//buttons for module pick 
//		ActionListener buttonHandler = new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				try {
//					if(e.getActionCommand().equals("Client Module")) {
//						setPressedModule(true);
//						setOpenModule("Clients");
//						CRMMain.switchToModule("Clients");
//						CRMMain.clientView.setVisible(true);	
//					}
//					if(e.getActionCommand().equals("Contact Module")){
//						setPressedModule(true);
//						setOpenModule("Contacts");
//						CRMMain.switchToModule("Contacts");
//						//CRMMain.contactView.setVisible(true);
//					}
//					if(e.getActionCommand().equals("Opportunities Module")){
//						setPressedModule(true);
//						setOpenModule("Opportunities");
//						CRMMain.switchToModule("Opportunities");
//						//CRMMain.opportunityView.setVisible(true);
//					}
//					
//			} catch (Exception e2) {
//				e2.printStackTrace(); throw new RuntimeException("IO ERROR");
//				}
//			}
//		};
//		
//		JButton btnClntMod = new JButton("Client Module");
//		btnClntMod.setBounds(40, 300, 136, 40);
//		btnClntMod.addActionListener(buttonHandler);
//		contentPanel.add(btnClntMod);
//		
//		JButton btnCntcMod = new JButton("Contact Module");
//		btnCntcMod.setBounds(200, 300, 136, 40);
//		btnCntcMod.addActionListener(buttonHandler);
//		contentPanel.add(btnCntcMod);
//		
//		JButton btnOppMod = new JButton("Opportunities Module");
//		btnOppMod.setBounds(360, 300, 150, 40);
//		btnOppMod.addActionListener(buttonHandler);
//		contentPanel.add(btnOppMod);
//		
//		JPanel panel = new NewImage();
//		panel.setSize(this.getWidth(), this.getHeight());
//		contentPanel.add(panel);
//	
//		this.setVisible(true);
//		
//	}
//	
//	public boolean press() {
//		while(pressedMod == false) {
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			} 
//		}
//		return isPressedModule();
//	}
//	
//	public boolean isPressedModule() {
//		return pressedMod;
//	}
//
//	public void setPressedModule(boolean pressedMod) {
//		this.pressedMod = pressedMod;
//	}
//
//	public String getOpenModule() {
//		return open;
//	}
//
//	public void setOpenModule(String string) {
//		open = string;
//	}
//
//}
