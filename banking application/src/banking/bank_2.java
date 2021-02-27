package banking;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JRadioButton;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import com.toedter.calendar.JDateChooser;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.SystemColor;

 class bank2 extends JFrame {

	private JFrame frmSajibPal;
	Connection conn=null;
	ResultSet rs=null;
	PreparedStatement pst=null;
	private JTextField texta;
	private JTextField textm;
	private JPasswordField passwordp;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textn;
	private JTextField textmo;
	private JTextField texts;
	private JTextField textc;
	private JPanel panel_1;
	 ImageIcon icon;
	    byte[]  image;
	    byte[] butimage;
	 JLabel lblNewLabel_9 ;  
	 String gender;
	 JDateChooser dateChooser;
	 TextArea textArea;

	/**
	 * Launch the application.
	 */
	
	public bank2() {
		initialize();
		conn=sqlconnection. ConnecrDb();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		 Container	frmSajibPal=this.getContentPane();
		 frmSajibPal.setLayout(null);
		frmSajibPal.setForeground(new Color(0, 0, 0));
		frmSajibPal.setBackground(new Color(248, 248, 255));
		
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(90, 5, 610, 172);
		frmSajibPal.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Untitled-1.png"));
		lblNewLabel.setBounds(5, 4, 595, 160);
		panel.add(lblNewLabel);
		
		JLabel lblAccountNumber = new JLabel("Account no :");
		lblAccountNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAccountNumber.setBounds(34, 202, 101, 21);
		frmSajibPal.add(lblAccountNumber);
		
		JLabel lblMicrNumber = new JLabel("Micr no :");
		lblMicrNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMicrNumber.setBounds(34, 245, 101, 21);
		frmSajibPal.add(lblMicrNumber);
		
		JLabel lblPin = new JLabel("Pin :");
		lblPin.setBackground(new Color(248, 248, 255));
		lblPin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPin.setBounds(34, 294, 89, 21);
		frmSajibPal.add(lblPin);
		
		JLabel lblNewLabel_1 = new JLabel("Account type :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(34, 340, 112, 29);
		frmSajibPal.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gender :\r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(34, 398, 101, 29);
		frmSajibPal.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Address :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(34, 461, 75, 29);
		frmSajibPal.add(lblNewLabel_3);
		
		texta = new JTextField();
		texta.setBounds(134, 195, 180, 29);
		frmSajibPal.add(texta);
		texta.setColumns(10);
		
		textm = new JTextField();
		textm.setBounds(136, 245, 178, 29);
		frmSajibPal.add(textm);
		textm.setColumns(10);
		
		passwordp = new JPasswordField();
		passwordp.setBounds(140, 294, 145, 29);
		frmSajibPal.add(passwordp);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Saving", "Current"}));
		comboBox.setBounds(144, 345, 125, 28);
		comboBox.setEditable(true);
		frmSajibPal.add(comboBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				gender="Male";
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton.setBounds(149, 402, 89, 23);
		frmSajibPal.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				gender="Female";
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_1.setBounds(268, 402, 89, 23);
		frmSajibPal.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("Name");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(387, 207, 89, 29);
		frmSajibPal.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Date of Birth");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(387, 250, 106, 29);
		frmSajibPal.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Nationality");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(387, 299, 89, 16);
		frmSajibPal.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Mobile");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(387, 348, 89, 21);
		frmSajibPal.add(lblNewLabel_7);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Ban", "Aus", "Chin", "India", "Eng", "New", ""}));
		comboBox_1.setBounds(509, 296, 125, 27);
		frmSajibPal.add(comboBox_1);
		
		textmo = new JTextField();
		textmo.setBounds(506, 345, 162, 24);
		frmSajibPal.add(textmo);
		textmo.setColumns(10);
		
		panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.control);
		panel_1.setAlignmentY(3.0f);
		panel_1.setAlignmentX(3.0f);
		panel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "New Account", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel_1.setBounds(0, 181, 731, 475);
		frmSajibPal.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCaste = new JLabel("caste");
		lblCaste.setBounds(393, 258, 77, 21);
		panel_1.add(lblCaste);
		lblCaste.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblNewLabel_8 = new JLabel("Security Q");
		lblNewLabel_8.setBounds(384, 204, 86, 29);
		panel_1.add(lblNewLabel_8);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		texts = new JTextField();
		texts.setBounds(509, 205, 153, 29);
		panel_1.add(texts);
		texts.setColumns(10);
		
		textc = new JTextField();
		textc.setBounds(509, 255, 153, 29);
		panel_1.add(textc);
		textc.setColumns(10);
		
	
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				     texta.setText(" ");
					 textm.setText(" ");
					 passwordp.setText(" ");
					 textArea.setText(" ");
					 textn.setText(" ");
					((JTextField)dateChooser.getDateEditor().getUiComponent()).setText(" ");
					 textmo.setText(" ");
			         comboBox_1.setSelectedItem("Selected item");
					  texts.setText(" ");
					  textc.setText(" ");
					  lblNewLabel_9.setIcon(null);
					 comboBox.setSelectedItem("Selected item");	
				
			}
		});
		btnClear.setBounds(357, 430, 89, 23);
		panel_1.add(btnClear);
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(237, 430, 89, 23);
		panel_1.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
				
			 bank1();
			 close();
				
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	          try{
					
					
					String sql="insert into bank_a (account_no,micr_no,pin,gender,address,name,date,mobile,nationality,sequrity,caste,image,account_t) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
					pst=conn.prepareStatement(sql);
					
					pst.setString(1, texta.getText());
					pst.setString(2, textm.getText());
					pst.setString(3, passwordp.getText());
					pst.setString(4, gender);
					pst.setString(5, textArea.getText());
					pst.setString(6, textn.getText());
					pst.setString(7,((JTextField)dateChooser.getDateEditor().getUiComponent()).getText());
					pst.setString(8, textmo.getText());
					pst.setString(9, (String)comboBox_1.getSelectedItem());
					pst.setString(10, texts.getText());
					pst.setString(11, textc.getText());
					pst.setBytes(12, butimage);
					pst.setString(13, (String)comboBox.getSelectedItem());
		
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Sucessfully save");
					
				}catch(Exception e2){
					
					 
				JOptionPane.showMessageDialog(null, e2);
					
				}
				
				
			}
		});
		btnCreate.setBounds(112, 430, 89, 23);
		panel_1.add(btnCreate);
		btnCreate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(497, 300, 193, 130);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		 lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(10, 11, 173, 108);
		panel_2.add(lblNewLabel_9);
		
		JButton btnNewButton = new JButton("Add image");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser chooser=new JFileChooser();
			    chooser.showOpenDialog(null);
			    File f=chooser.getSelectedFile();
			  String stringpath=f.getAbsolutePath();
			    
			       
				  try{
								
					 File ok=new File(stringpath);
					 FileInputStream  fis=new FileInputStream(ok);
					 ByteArrayOutputStream bos=new  ByteArrayOutputStream();
					 byte[] but=new byte[1024];
					 
					 for(int readNum;(readNum=fis.read(but))!=-1;){
						 
						 bos.write(but, 0, readNum);
						 
					  }
					 butimage=bos.toByteArray();
					 
					ImageIcon icon1=new ImageIcon(butimage);
					Image image =icon1.getImage();
	                icon=new ImageIcon(ScaledImage( image,lblNewLabel_9.getWidth(),lblNewLabel_9.getHeight()));
	                lblNewLabel_9.setIcon(icon);
					 
					}catch(Exception e2){
								
								
					}  	
			}
		});
		
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(507, 441, 101, 23);
		panel_1.add(btnNewButton);
		
		 dateChooser = new JDateChooser();
		dateChooser.setBounds(509, 73, 143, 29);
		panel_1.add(dateChooser);
		
		textn = new JTextField();
		textn.setBounds(510, 31, 180, 24);
		panel_1.add(textn);
		textn.setColumns(10);
		
		 textArea = new TextArea();
		textArea.setBounds(118, 257, 236, 136);
		panel_1.add(textArea);
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
	 
	void bank1(){
		
	    bank1 frm=new bank1();
		frm.setVisible(true);	
		frm.setBounds(100, 100, 630, 503);
		frm.setTitle("sajib pal");
				
	}
	 void close(){
			
			WindowEvent windowclose= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
			Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowclose);
		}	

 }

public class bank_2 {
	
	public static void main(String[] args) {
		

		try{
			
			 // UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			 UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
				}
		
				catch(Exception e){
						
			 }
		bank2 frm1=new bank2();
		frm1.setVisible(true);	
		frm1.setBounds(150, 20, 749, 705);
		frm1.setTitle("sajib pal");
		
				
			}
		
	}
