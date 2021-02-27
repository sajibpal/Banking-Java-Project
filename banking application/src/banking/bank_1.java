package banking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.border.BevelBorder;

 class bank1 extends JFrame {

	private JFrame frmSajibPal;
	private JTextField textField;
	Connection conn=null;
	ResultSet rs=null;
	PreparedStatement pst=null;
	String databasepass;
	String databasename;
	private JPasswordField passwordField;
	

	
	public bank1() {
		
		initialize();
		conn=sqlconnection. ConnecrDb();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	  Container	frmSajibPal=this.getContentPane();
	   frmSajibPal.setLayout(null);
		frmSajibPal.setBackground(new Color(255, 250, 205));
		frmSajibPal.setBounds(100, 100, 628, 504);
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(3, 03, 614, 170);
		frmSajibPal.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Untitled-1.png"));
		lblNewLabel.setBounds(6, 6, 600, 160);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Account Number :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(59, 215, 120, 32);
		frmSajibPal.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(189, 219, 190, 27);
		frmSajibPal.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Pin :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(82, 295, 97, 27);
		frmSajibPal.add(lblNewLabel_2);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					
					String sql="select *from  bank_a where pin= ? or account_no = ?";
							
					pst=conn.prepareStatement(sql);
			 	    pst.setString(1,passwordField.getText()); 
			 	    pst.setString(2,textField.getText()); 
					rs=pst.executeQuery();
					
					String tpass =passwordField.getText();
					String tname = textField.getText();
					 
					 if(rs.next()){
							 
						 
						databasepass =rs.getString("pin");
						databasename =rs.getString("account_no");	
						rs.close();
						pst.close();
							
					    if(tpass.equals(databasepass) && tname.equals(databasename)){
								 
						   JOptionPane.showMessageDialog(null, "Login sucessfully");
						   
						    bank3();
						    close();
						    
						     }	
					    else{
							 
							JOptionPane.showMessageDialog(null, "User pin or Account number wrong"); 
							
						      }		
						 }	
						 	 
				 } catch(Exception e3){
					 
	                JOptionPane.showMessageDialog(null, e3);
	
	               }
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnLogin.setBounds(194, 379, 89, 23);
		frmSajibPal.add(btnLogin);
		
		JButton btnNewButton = new JButton("New Account");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 bank2(); 
				 close();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(322, 379, 110, 23);
		frmSajibPal.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(194, 298, 173, 25);
		frmSajibPal.add(passwordField);
	}
	 void close(){
			
			WindowEvent windowclose= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
			Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowclose);
		}	
	 
	void bank2(){
		
		bank2 frm1=new bank2();
		frm1.setVisible(true);	
		frm1.setBounds(150, 20, 749, 705);
		frm1.setTitle("sajib pal");
				
			}	
   void bank3(){
			
			bank3 frm1=new bank3();
			frm1.setVisible(true);	
			frm1.setBounds(100, 100, 622, 550);
			frm1.setTitle("sajib pal");
				
			}	
		
	} 


  public class bank_1 {
	
	public static void main(String[] args) {
		

		try{
			
			 UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
				}
		
				catch(Exception e){
						
			 }
		bank1 frm=new bank1();
		frm.setVisible(true);	
		frm.setBounds(100, 100, 630, 503);
		frm.setTitle("sajib pal");
				
			}
		
	}
