package banking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.TextArea;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.border.SoftBevelBorder;

 class bank4 extends JFrame {

	private JFrame frmSajibPal;
	private JTextField textField;
	private JTextField textd;
	private JTextField texta;
	private JTextField textm;
	private JTextField textp;
	private JTextField textn;
	private JTextField textmo;
	private JTextField texts;
	private JTextField textc;
	Connection conn=null;
	ResultSet rs=null;
	PreparedStatement pst=null;
	private JTextField textd1;
	private JTextField textd2;
	private JTextField textu;
	private JTextField textna;
	private JTextField textac;
	private JTextField textb;
	private JTextField textus;
	private JTextField textnam;
	private JTextField textacc;
	private JTextField textbal;
	private JTextField textta;
	private JTextField textta1;
	private JTextField textField_1;
	private JTextField textt;
	private TextArea textArea;
	private JTable table,table1;
	private JTextField texto;
	private JTextField textne;
	JLabel desktopNewLabel;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	public bank4() {
		
		initialize();
		conn=sqlconnection. ConnecrDb();
		Table_update();
		Table_update_1();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		 Container	frmSajibPal=this.getContentPane();
		 frmSajibPal.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 422, 152);
		frmSajibPal.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Untitled-2.png"));
		lblNewLabel.setBounds(10, 11, 402, 133);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\r\nUser");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(447, 27, 66, 24);
		frmSajibPal.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Date");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(447, 83, 66, 24);
		frmSajibPal.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
		 public void keyReleased(KeyEvent e) {
				
			 try{
					
					String sql="select *from  bank_a where name =?";
					
					pst=conn.prepareStatement(sql);
					 pst.setString(1,textField.getText());
					 rs=pst.executeQuery();
					 
					 if(rs.next()){
						 
						   String account =rs.getString("account_no");
							String micr =rs.getString("micr_no");
							String password  =rs.getString("pin");
							String address =rs.getString("address");
							String name=rs.getString("name");
							String mobile =rs.getString("mobile");
						   String nationality =rs.getString("nationality");
						   String security =rs.getString("sequrity");
						   String caste=rs.getString("caste");
						   String birth=rs.getString("date");
							rs.close();	
							pst.close();
						
						    texta.setText(account);
							textm.setText(micr);
						    textp.setText(password);
							textArea.setText(address);
							textn.setText(name);
							textmo.setText(mobile);
						   	texts.setText(security);
						    textc.setText(caste);
						    textd.setText(birth);	
							
					 }
				}
				catch(Exception e3){
					
					 
				JOptionPane.showMessageDialog(null, e3);
					
				}
				
			}
		});
		
		textField.setBounds(485, 30, 148, 24);
		frmSajibPal.add(textField);
		textField.setColumns(10);
		
		textd = new JTextField();
		textd.setBounds(485, 83, 128, 24);
		frmSajibPal.add(textd);
		textd.setColumns(10);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 203, 659, 332);
		frmSajibPal.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Profile", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblAccountNumber = new JLabel("Account no :");
		lblAccountNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAccountNumber.setBounds(34, 15, 101, 21);
		panel_1.add(lblAccountNumber);
		
		JLabel lblMicrNumber = new JLabel("Micr no :");
		lblMicrNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMicrNumber.setBounds(34, 66, 101, 21);
		panel_1.add(lblMicrNumber);
		
		JLabel lblPin = new JLabel("Pin :");
		lblPin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPin.setBounds(34, 114, 89, 21);
		panel_1.add(lblPin );
		
			
			JLabel lblNewLabel_3 = new JLabel("Address :");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_3.setBounds(34, 171, 68, 29);
			panel_1.add(lblNewLabel_3 );
			
			JLabel lblNewLabel_4 = new JLabel("Name :");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_4.setBounds(336, 12, 89, 29);
			panel_1.add(lblNewLabel_4 );
			
			JLabel lblNewLabel_6 = new JLabel("Nationality :");
			lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_6.setBounds(336, 117, 89, 16);
			panel_1.add(lblNewLabel_6 );
			
			JLabel lblNewLabel_7 = new JLabel("Mobile :");
			lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_7.setBounds(336, 66, 89, 21);
			panel_1.add(lblNewLabel_7 );
			
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setEditable(true);
			comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Ban", "Aus", "Chin", "India", "Eng", "New", ""}));
			comboBox_1.setBounds(430, 112, 128, 27);
			panel_1.add(comboBox_1 );
			
			JLabel lblCaste = new JLabel("Caste :");
			lblCaste.setBounds(336, 227, 77, 21);
			panel_1.add(lblCaste);
			lblCaste.setFont(new Font("Tahoma", Font.PLAIN, 14));
			
			JLabel lblNewLabel_8 = new JLabel("Security Q :");
			lblNewLabel_8.setBounds(336, 172, 86, 29);
			panel_1.add(lblNewLabel_8);
			lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
			
			texta = new JTextField();
			texta.setBounds(124, 17, 127, 20);
			panel_1.add(texta);
			texta.setColumns(10);
			
			textm = new JTextField();
			textm.setBounds(124, 68, 127, 20);
			panel_1.add(textm);
			textm.setColumns(10);
			
			textp = new JTextField();
			textp.setBounds(124, 116, 127, 20);
			panel_1.add(textp);
			textp.setColumns(10);
			
			textn = new JTextField();
			textn.setBounds(403, 17, 155, 24);
			panel_1.add(textn);
			textn.setColumns(10);
			
			textmo = new JTextField();
			textmo.setBounds(403, 66, 155, 22);
			panel_1.add(textmo);
			textmo.setColumns(10);
			
			texts = new JTextField();
			texts.setBounds(427, 177, 147, 23);
			panel_1.add(texts);
			texts.setColumns(10);
			
			textc = new JTextField();
			textc.setBounds(430, 229, 144, 19);
			panel_1.add(textc);
			textc.setColumns(10);
			
			JButton btnUpdate = new JButton("Update");
			btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					

			try{

				String account=texta.getText();
				String micr=textm.getText();
				String password= textp.getText();
				String address= textArea.getText();
				String name=textn.getText();
				String mobile=	textmo.getText();
			   String nationality=(String)comboBox_1.getSelectedItem();
			   String security=	texts.getText();
			   String caste=textc.getText();
			   String birth=textd.getText();
					
					 
					
				String sql="update bank_a set account_no='"+account+"',micr_no='"+micr+"',pin='"+password+"',address='"+address+"',name='"+name+"',mobile='"+mobile+"',nationality='"+nationality+"',sequrity='"+security+"',date='"+birth+"',caste='"+caste+"' where date='"+birth+"' ";
				pst=conn.prepareStatement(sql);
				 pst.execute();
				 Table_update();	
				JOptionPane.showMessageDialog(null,"update");
					
			    }catch(Exception e4){
					
					 
				JOptionPane.showMessageDialog(null, e4);
					
				 }
					
			   }
			});
			
			btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnUpdate.setBounds(267, 270, 89, 23);
			panel_1.add(btnUpdate);
			
			textArea = new TextArea();
			textArea.setBounds(105, 149, 189, 104);
			panel_1.add(textArea);
		
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Deposit", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblUseer = new JLabel("User");
		lblUseer.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUseer.setBounds(52, 75, 73, 24);
		panel_2.add(lblUseer);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblName.setBounds(52, 126, 73, 24);
		panel_2.add(lblName);
		
		JLabel lblAccountNo = new JLabel("Account no");
		lblAccountNo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAccountNo.setBounds(45, 178, 99, 24);
		panel_2.add(lblAccountNo);
		
		JLabel lblBalance = new JLabel("Balance");
		lblBalance.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBalance.setBounds(45, 224, 66, 21);
		panel_2.add(lblBalance);
		
		JLabel lblDeposit = new JLabel("Deposit");
		lblDeposit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDeposit.setBounds(357, 75, 58, 24);
		panel_2.add(lblDeposit);
		
		textd1 = new JTextField();
		textd1.setBounds(425, 75, 86, 24);
		panel_2.add(textd1);
		textd1.setColumns(10);
		
		textd2 = new JTextField();
		textd2.setBounds(536, 75, 108, 24);
		panel_2.add(textd2);
		textd2.setColumns(10);
		
		JButton btnDeposit = new JButton("Deposit");
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			try{	
				
				String balence=textd2.getText();
				String name=textna.getText();
				
				String sql="update bank_a set balence='"+balence+"'   where name='"+name+"' ";
				pst=conn.prepareStatement(sql);
				 pst.execute();
				 
				 Table_update();
				 Table_update_1();
				 
				JOptionPane.showMessageDialog(null,"update");
				
			 }catch(Exception e6){
					
				 
				JOptionPane.showMessageDialog(null, e6);
					
				}
			
			}
		});
		btnDeposit.setBounds(539, 143, 89, 23);
		panel_2.add(btnDeposit);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String balence=textb.getText();
				 String balence1=textd1.getText();
				 float sum=Float.parseFloat(balence)+Float.parseFloat(balence1);
				 
				 String total=String.valueOf(sum);
				 textd2.setText(total);
			}
		});
		btnTotal.setBounds(425, 143, 89, 23);
		panel_2.add(btnTotal);
		
		textu = new JTextField();
		textu.setBounds(108, 77, 111, 22);
		panel_2.add(textu);
		textu.setColumns(10);
		
		textna = new JTextField();
		textna.setBounds(108, 128, 111, 22);
		panel_2.add(textna);
		textna.setColumns(10);
		
		textac = new JTextField();
		textac.setBounds(108, 178, 111, 24);
		panel_2.add(textac);
		textac.setColumns(10);
		
		textb = new JTextField();
		textb.setBounds(108, 223, 111, 24);
		panel_2.add(textb);
		textb.setColumns(10);
		
		JButton btnNewButton = new JButton("search");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                try{
					
					String sql="select *from  bank_a where name =?";
					
					pst=conn.prepareStatement(sql);
					 pst.setString(1,textu.getText());
					 rs=pst.executeQuery();
					 
					 if(rs.next()){
						 
						   String account =rs.getString("account_no");
							String name=rs.getString("name");
							String balence=rs.getString("balence");
							 rs.close();
							 pst.close();
							
						    textac.setText(account);
							textna.setText(name);
							textb.setText(balence);			
							
					  }
				}
				catch(Exception e5){
					
					 
				JOptionPane.showMessageDialog(null, e5);
					
				}
			}
		});
	
		
		btnNewButton.setBounds(229, 76, 80, 23);
		panel_2.add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Transfer", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblUseer1 = new JLabel("User");
		lblUseer1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUseer1.setBounds(45, 40, 73, 24);
		panel_3.add(lblUseer1);
		
		JLabel lblName1 = new JLabel("Name");
		lblName1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName1.setBounds(45, 77, 73, 24);
		panel_3.add(lblName1);
		
		JLabel lblAccountNo1 = new JLabel("Account no");
		lblAccountNo1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAccountNo1.setBounds(31, 125, 99, 24);
		panel_3.add(lblAccountNo1);
		
		JLabel lblBalance1 = new JLabel("Balance");
		lblBalance1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBalance1.setBounds(31, 180, 66, 21);
		panel_3.add(lblBalance1);
		
		textus = new JTextField();
		textus.setBounds(123, 42, 118, 24);
		panel_3.add(textus);
		textus.setColumns(10);
		
		textnam = new JTextField();
		textnam.setBounds(123, 79, 118, 24);
		panel_3.add(textnam);
		textnam.setColumns(10);
		
		textacc = new JTextField();
		textacc.setBounds(123, 127, 118, 24);
		panel_3.add(textacc);
		textacc.setColumns(10);
		
		textbal = new JTextField();
		textbal.setBounds(123, 180, 120, 24);
		panel_3.add(textbal);
		textbal.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				  try{
						
						String sql="select *from  bank_a where name =?";
						
						pst=conn.prepareStatement(sql);
						 pst.setString(1,textus.getText());
						 rs=pst.executeQuery();
						 
						 if(rs.next()){
							 
							   String account =rs.getString("account_no");
								String name=rs.getString("name");
								String balence=rs.getString("balence");
								
								  
							byte[] image=rs.getBytes("image");			 
							ImageIcon icon1=new ImageIcon(image);
							Image image1 =icon1.getImage();
							ImageIcon   icon=new ImageIcon(ScaledImage( image1,desktopNewLabel.getWidth(),desktopNewLabel.getHeight()));
							desktopNewLabel.setIcon(icon);	
							 rs.close();
							 pst.close();
								
							    textacc.setText(account);
								textnam.setText(name);
								textbal.setText(balence);			
								
						  }
					}
					catch(Exception e5){
						
						 
					JOptionPane.showMessageDialog(null, e5);
						
					}
				
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSearch.setBounds(248, 42, 73, 23);
		panel_3.add(btnSearch);
		
		JLabel lblTransferAmounth = new JLabel("Transfer Amount");
		lblTransferAmounth.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTransferAmounth.setBounds(281, 146, 103, 21);
		panel_3.add(lblTransferAmounth);
		
		textta = new JTextField();
		textta.setBounds(394, 145, 118, 24);
		panel_3.add(textta);
		textta.setColumns(10);
		
		textta1 = new JTextField();
		textta1.setBounds(527, 145, 117, 24);
		panel_3.add(textta1);
		textta1.setColumns(10);
		
		JButton btnTotal_1 = new JButton("Total");
		btnTotal_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String balence=textbal.getText();
				 String balence1=textta.getText();
				 float sum=Float.parseFloat(balence)-Float.parseFloat(balence1);
				 
				 String total=String.valueOf(sum);
				 textta1.setText(total);	
			}
		});
		btnTotal_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnTotal_1.setBounds(501, 191, 73, 23);
		panel_3.add(btnTotal_1);
		
		
		JLabel lblCreate = new JLabel("Transfer Account");
		lblCreate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCreate.setBounds(17, 225, 101, 24);
		panel_3.add(lblCreate);
		
		textField_1 = new JTextField();
		textField_1.setBounds(248, 229, 111, 20);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		textt = new JTextField();
		textt.setBounds(369, 228, 110, 20);
		panel_3.add(textt);
		textt.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Show");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String balence=textta.getText();
				 String balence1=textField_1.getText();
				 float sum=Float.parseFloat(balence)+Float.parseFloat(balence1);
				 
				 String total=String.valueOf(sum);
				 textt.setText(total);	
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setBounds(258, 270, 73, 23);
		panel_3.add(btnNewButton_1);
		
		JButton btnTransfer = new JButton("Transfer");
		btnTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try{	
					
					String balence=textta1.getText();
					String name=textnam.getText();
					
					String sql="update bank_a set balence='"+balence+"' where name='"+name+"' ";
					pst=conn.prepareStatement(sql);
					 pst.execute();
						
					 Transferaccount();
					 Table_update();
					 Table_update_1();
					 
					JOptionPane.showMessageDialog(null,"Successfully Transfer");
					
				 }catch(Exception e6){
						
					 
					JOptionPane.showMessageDialog(null, e6);
						
					}
			}
		});
		btnTransfer.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnTransfer.setBounds(369, 270, 81, 23);
		panel_3.add(btnTransfer);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(139, 69, 19)));
		panel_6.setBounds(469, 11, 164, 123);
		panel_3.add(panel_6);
		panel_6.setLayout(null);
		
		desktopNewLabel = new JLabel("");
		desktopNewLabel.setBorder(new LineBorder(new Color(139, 69, 19), 3));
		desktopNewLabel.setBounds(0, 0, 165, 123);
		panel_6.add(desktopNewLabel);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				
				 try{
						
						String sql="select *from  bank_a where account_no =?";
						
						pst=conn.prepareStatement(sql);
						 pst.setString(1,textField_2.getText());
						 rs=pst.executeQuery();
						 
						 if(rs.next()){
							 
								String balence=rs.getString("balence");
							    textField_1.setText(balence);
							    rs.close();
								 pst.close();
								
						  }
					}
					catch(Exception e5){
							 
					   JOptionPane.showMessageDialog(null, e5);
						
					}	
			}
		});
		textField_2.setBounds(121, 224, 117, 24);
		panel_3.add(textField_2);
		textField_2.setColumns(10);
		
		
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Customer list", null, panel_4, null);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 26, 634, 267);
		panel_4.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setFont(new Font("Tahoma", Font.PLAIN, 13));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Name", "Account_no", "Micr_no", "Balence"
			}
		));
		table.setFillsViewportHeight(true);
		table.setBorder(new LineBorder(new Color(139, 69, 19)));
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Transaction", null, panel_5, null);
		panel_5.setLayout(null);
		
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(10, 11, 634, 293);
		panel_5.add(scrollPane1);
		
		table1 = new JTable();
		scrollPane1.setViewportView(table1);
		table1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		table1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Name", "Account_no", "Micr_no", "Balence"
			}
		));
		table1.setFillsViewportHeight(true);
		table1.setBorder(new LineBorder(new Color(139, 69, 19)));
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Change pin", null, panel_7, null);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Enter old Pin :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(68, 105, 98, 31);
		panel_7.add(lblNewLabel_5);
		
		JLabel lblNewLabel_9 = new JLabel("Enter new pin :");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(68, 192, 98, 31);
		panel_7.add(lblNewLabel_9);
		
		texto = new JTextField();
		texto.setBounds(169, 105, 161, 27);
		panel_7.add(texto);
		texto.setColumns(10);
		
		textne = new JTextField();
		textne.setBounds(176, 192, 154, 27);
		panel_7.add(textne);
		textne.setColumns(10);
		
		JButton btnChangce = new JButton("Change");
		btnChangce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                  try{	
					
                	String old=texto.getText();
      				String ne=textne.getText();
					
					String sql="update bank_a set pin='"+ne+"' where pin='"+old+"' ";
					pst=conn.prepareStatement(sql);
					 pst.execute();
						
					 
					JOptionPane.showMessageDialog(null,"Successfully Change");
					
				 }catch(Exception e6){
						
					 
					JOptionPane.showMessageDialog(null, e6);
						
					}	
				String old=texto.getText();
				String ne=textne.getText();
			}
		});
		btnChangce.setBounds(131, 258, 89, 23);
		panel_7.add(btnChangce);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
            	texto.setText(" ");
  				textne.setText(" ");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnClear.setBounds(243, 258, 69, 23);
		panel_7.add(btnClear);
		
		JPanel panel_8 = new JPanel();
		tabbedPane.addTab("About", null, panel_8, null);
		panel_8.setLayout(null);
		
		JLabel lblName_1 = new JLabel("Name : sajib pal");
		lblName_1.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblName_1.setBounds(286, 72, 146, 36);
		panel_8.add(lblName_1);
		
		JLabel lblEmailsajibpalgmailcom = new JLabel("Email :sajibpal20@gmail.com");
		lblEmailsajibpalgmailcom.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblEmailsajibpalgmailcom.setBounds(286, 119, 224, 28);
		panel_8.add(lblEmailsajibpalgmailcom);
		
		JLabel lblMobile = new JLabel("Mobile :01926101829");
		lblMobile.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblMobile.setBounds(286, 165, 188, 28);
		panel_8.add(lblMobile);
		
		JLabel lblBsccseduet = new JLabel("Study :B.SC(CSE),DUET");
		lblBsccseduet.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblBsccseduet.setBounds(286, 204, 188, 28);
		panel_8.add(lblBsccseduet);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(139, 69, 19), new Color(184, 134, 11), new Color(128, 0, 0), new Color(165, 42, 42)));
		panel_9.setBounds(37, 45, 224, 257);
		panel_8.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBounds(10, 11, 200, 240);
		panel_9.add(lblNewLabel_10);
		lblNewLabel_10.setIcon(new ImageIcon("201711.jpg"));
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(34, 174, 46, 14);
		frmSajibPal.add(label_1);
	}
	
	
	
	void Transferaccount(){
		
		 try{	
			
			
			String account=textField_2.getText();
			String balence=textt.getText();
			
			String sql="update bank_a set balence='"+balence+"' where account_no='"+account+"' ";
			pst=conn.prepareStatement(sql);
			 pst.execute();
			
		 }catch(Exception e6){
				
			 
			JOptionPane.showMessageDialog(null, e6);
				
			}
	}
	
	void Table_update(){ 
	   	
		 try{
			 
			 String sql="select  name,account_no,balence,micr_no,gender,mobile,nationality,account_t from  bank_a ";	
			 
			 pst=conn.prepareStatement(sql);
			
			 rs=pst.executeQuery();
			 table.setModel(DbUtils.resultSetToTableModel(rs));
			 
			 
			
     } catch(Exception e){
	 
	    JOptionPane.showMessageDialog(null, e);
      }
		 
	
	}	
	
	void Table_update_1(){ 
	   	
		 try{
			 
			 String sql="select  name,account_no,balence,micr_no from  bank_a ";	
			 
			 pst=conn.prepareStatement(sql);
			 rs=pst.executeQuery();
			 table1.setModel(DbUtils.resultSetToTableModel(rs));
			 
			
    } catch(Exception e){
	 
	    JOptionPane.showMessageDialog(null, e);
     }
		 
	 finally{
			  
		 try{
				 
		 rs.close();
		 pst.close();
		}catch (Exception e){
				 
		  JOptionPane.showMessageDialog(null,e);
		
		  }			
					
		} 	 
	}
 Image ScaledImage(Image ima,int w,int h){
		
		
		BufferedImage resizedImage=new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
		Graphics2D g2=resizedImage.createGraphics();
		g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR );
		g2.drawImage(ima, 0, 0, w, h, null);
		g2.dispose();
		
		return resizedImage; 
	   }
  	  BufferedImage getScreenShot(Component component){
			
			
		   BufferedImage image=new BufferedImage(component.getWidth(),component.getHeight(),BufferedImage.TYPE_INT_RGB);
		  
		   component.paint(image.getGraphics());
		   return image;
			}
		
		
		 void SaveScreenShot (Component component,String name) throws Exception{
			
			 BufferedImage img=getScreenShot(component);
			 ImageIO.write(img, "jpg",new File (name));
		}
}
 
 public class bank_4 {
		
	public static void main(String[] args) {
		

		try{
			
			
			 UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
				}
		
				catch(Exception e){
						
			 }
		bank4 frm3=new bank4();
		frm3.setVisible(true);
		frm3.setDefaultCloseOperation(bank4.EXIT_ON_CLOSE);
		frm3.setBounds(100, 100, 695, 584);
		frm3.setTitle("sajib pal");
				
			}
		
	}
