package banking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Container;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

import javax.swing.border.BevelBorder;
import java.awt.Font;

 class bank3 extends JFrame implements Runnable{

	private JFrame frmSajibPal;
	Thread th;
	JProgressBar progressBar ;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public bank3() {
		
		initialize();
		th=new Thread((Runnable)this);
		uploding();
	}
   void uploding(){
	  
	 
	 th.start();  
	   
   }
	
 public void run(){
	   
	  try{ 
		  
		for(int i=0;i<=110;i++){
		   
			
			int m=progressBar.getMaximum();
			int v=progressBar.getValue(); 
			
		   if(v<m){
			   
			 progressBar.setValue(progressBar.getValue()+1);  
			   
		   }else{
			   
			 i=111;
			 bank4();
			 close();
	
		   }
		Thread.sleep(50); 
	   }
		
	  }catch(Exception e){
		  
	JOptionPane.showMessageDialog(null, e);	  
		  
	  }  
   }
   
	private void initialize() {
		
		
		 Container	frmSajibPal=this.getContentPane();
		frmSajibPal.setLayout(null);
		frmSajibPal.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(0, 0, 614, 170);
		frmSajibPal.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel1 = new JLabel("");
		lblNewLabel1.setIcon(new ImageIcon("Untitled-1.png"));
		lblNewLabel1.setBounds(6, 6, 600, 160);
		panel.add(lblNewLabel1);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon("blue-loading-gif-transparent-4.gif"));
		lblNewLabel.setBounds(175, 286, 274, 226);
		frmSajibPal.add(lblNewLabel);
		
	     progressBar = new JProgressBar();
	     progressBar.setForeground(new Color(204, 153, 0));
	     progressBar.setBackground(SystemColor.text);
		progressBar.setStringPainted(true);
		progressBar.setBounds(160, 222, 255, 17);
		frmSajibPal.add(progressBar);
		
		JLabel lblNewLabe = new JLabel("Loading....");
		lblNewLabe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabe.setBounds(236, 250, 92, 17);
		frmSajibPal.add(lblNewLabe);
	}
	
	 void bank4(){
			
			bank4 frm3=new bank4();
			frm3.setVisible(true);	
			frm3.setBounds(100, 100, 695, 584);
			frm3.setTitle("sajib pal");
				
			}	
	 
	 void close(){
			
			WindowEvent windowclose= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
			Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowclose);
		}	
}

public class bank_3 {
	
	public static void main(String[] args) {
		

		try{
			
			 // UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			 UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
				}
		
				catch(Exception e){
						
			 }
		bank3 frm2=new bank3();
		frm2.setVisible(true);	
		frm2.setBounds(100, 100, 622, 550);
		frm2.setTitle("sajib pal");
				
			}
		
	}