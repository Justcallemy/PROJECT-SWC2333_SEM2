import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

public class Ticketing extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtIcPas;
	private JTextField txtAge;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticketing frame = new Ticketing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the frame.
	 */
	public Ticketing() {
		setTitle("TikectIng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 505);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(233, 150, 122));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtName = new JTextField();
		txtName.setBounds(177, 50, 182, 19);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel Name = new JLabel("NAME");
		Name.setFont(new Font("Monospaced", Font.BOLD, 10));
		Name.setBounds(26, 50, 79, 19);
		contentPane.add(Name);
		
		txtIcPas = new JTextField();
		txtIcPas.setBounds(177, 79, 182, 19);
		contentPane.add(txtIcPas);
		txtIcPas.setColumns(10);
		
		JLabel IcPas = new JLabel("IC Number/Passport:");
		IcPas.setFont(new Font("Monospaced", Font.BOLD, 10));
		IcPas.setBounds(26, 79, 128, 19);
		contentPane.add(IcPas);
		
		JLabel member = new JLabel("Membership :");
		member.setFont(new Font("Times New Roman", Font.BOLD, 10));
		member.setBounds(26, 321, 128, 19);
		contentPane.add(member);
		
		JLabel lblCitizen = new JLabel("Citizens");
		lblCitizen.setFont(new Font("Monospaced", Font.PLAIN, 10));
		lblCitizen.setBounds(26, 137, 128, 19);
		contentPane.add(lblCitizen);
		
		
		JLabel lblAdult = new JLabel("Adult");
		lblAdult.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblAdult.setBounds(26, 205, 128, 19);
		contentPane.add(lblAdult);
		
		JLabel lblChildren = new JLabel("Children");
		lblChildren.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblChildren.setBounds(26, 234, 128, 19);
		contentPane.add(lblChildren);
		
		JSpinner SpinnerAdult = new JSpinner();
		SpinnerAdult.setBounds(177, 205, 30, 20);
		contentPane.add(SpinnerAdult);
		
		JSpinner SpinnerChild = new JSpinner();
		SpinnerChild.setBounds(177, 234, 30, 20);
		contentPane.add(SpinnerChild);
		
		JLabel Age = new JLabel("Age");
		Age.setFont(new Font("Monospaced", Font.BOLD, 10));
		Age.setBounds(26, 108, 128, 19);
		contentPane.add(Age);
		
		txtAge = new JTextField();
		txtAge.setBounds(177, 108, 182, 19);
		contentPane.add(txtAge);
		txtAge.setColumns(10);
		
		JCheckBox membership1 = new JCheckBox("Membership");
		membership1.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		membership1.setBounds(177, 320, 176, 21);
		contentPane.add(membership1);
		
		JCheckBox membership2 = new JCheckBox("Not Membership");
		membership2.setFont(new Font("Times New Roman", Font.BOLD, 10));
		membership2.setBounds(177, 352, 176, 21);
		contentPane.add(membership2);
		
		JLabel deco1 = new JLabel("----------------------------------------------------------------------------------");
		deco1.setBounds(26, 28, 333, 13);
		contentPane.add(deco1);
		
		JLabel deco2 = new JLabel("----------------------------------------------------------------------------------");
		deco2.setBounds(26, 390, 351, 13);
		contentPane.add(deco2);
		
		JLabel lblSeniorCitizen = new JLabel("Senior Citizen");
		lblSeniorCitizen.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblSeniorCitizen.setBounds(26, 263, 128, 19);
		contentPane.add(lblSeniorCitizen);
		
		JSpinner SpinnerSC = new JSpinner();
		SpinnerSC.setBounds(177, 262, 30, 20);
		contentPane.add(SpinnerSC);
		
		JCheckBox chckbxMalay = new JCheckBox("Malaysian");
		chckbxMalay.setBounds(177, 136, 182, 20);
		contentPane.add(chckbxMalay);
		
		JCheckBox chckbxForeig = new JCheckBox("Foreigner");
		chckbxForeig.setBounds(177, 167, 182, 20);
		contentPane.add(chckbxForeig);
		
		JButton Return = new JButton("Back");
		Return.setBackground(new Color(238, 232, 170));
		Return.setForeground(new Color(0, 0, 0));
		Return.setBorder(null);
		Return.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) 
			{
				HomePage hp = new HomePage(); //CONNECT TO HOMEPAGE
				hp.setVisible(true);
				dispose();
				
			}
		});
		Return.setBounds(274, 10, 85, 21);
		contentPane.add(Return);
		
		JLabel lblZootTicket = new JLabel("ZOO TICKET");
		lblZootTicket.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblZootTicket.setBounds(26, 10, 333, 30);
		contentPane.add(lblZootTicket);
		
		JButton pay = new JButton("PROCEED");
		pay.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "PAYMENT", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		pay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//declaration
		        int qtyAdult = 0;
		        int qtyChild = 0;
		        int qtySC = 0;
		        double total = 0.0;
		        double totalAdult = 0.0;
		        double totalChild = 0.0;
		        double totalSeniorCitizen = 0.0;
		        double valueAdult = 0.0;
		        double valueChild = 0.0;
		        double valueSeniorCitizen = 0.0;
		        double discount = 0.15;
		        double totaldiscount = 0.0;
		        String citizen = "";
		        String membership = "";
		        
		 
		  
		        
		        if(chckbxMalay.isSelected())//if check box malaysian is selected
		        {
		        	//declaration
		        	//ticket price
		        	valueAdult = 17.80;
					valueChild = 7.10;
					valueSeniorCitizen = 7.10;
					
		            qtyAdult = Integer.parseInt(SpinnerAdult.getValue().toString());
		             totalAdult = valueAdult * qtyAdult;
		             
		             qtyChild = Integer.parseInt(SpinnerChild.getValue().toString());
		             totalChild = valueChild * qtyChild;
		             
		             qtySC = Integer.parseInt(SpinnerSC.getValue().toString());
		             totalSeniorCitizen = valueSeniorCitizen * qtySC;
		             
		             
		             total =+  totalAdult + totalChild + totalSeniorCitizen;
		             
		        	if(membership1.isSelected()) // if check box membership is selected get 15% discount for malaysian
		        		
		        	{
		        		
		             totaldiscount = total * discount;
		             total = total - totaldiscount;
		             membership = "Zoo Member";
		             
		        	}
		        	
		        	if(membership2.isSelected()) // if check box not membership is selected dont have any discount 
		        		
		        	{
		             membership = "Not Member";
		        	}
		        	
		       
		        	citizen = "Malaysian";
		      
		        	
		        	
		        }
		        
		        if(chckbxForeig.isSelected()) // if check box foreigner is selected
		        {
		        	//declaration
		        	//ticket price
		        	valueAdult = 23.70;
					valueChild = 17.80;
					valueSeniorCitizen = 7.10;

					
					
					   qtyAdult = Integer.parseInt(SpinnerAdult.getValue().toString()); //get value from spinner adult for quantity adult
			           totalAdult = valueAdult * qtyAdult;
			             
			           qtyChild = Integer.parseInt(SpinnerChild.getValue().toString()); //get value from spinner children for quantity children
			           totalChild = valueChild * qtyChild;
			             
			           qtySC = Integer.parseInt(SpinnerSC.getValue().toString()); //get value from spinner senior citizen for quantity children
			           totalSeniorCitizen = valueSeniorCitizen * qtySC;
			             
			             
			             total =+  totalAdult + totalChild + totalSeniorCitizen;
			           
			           
			           if(membership1.isSelected()) // if check box membership is selected get 15% discount for foreigner
		        		
		        	{	
		             totaldiscount = total * discount;
		             total = total - totaldiscount;
		             membership = "Zoo Member"; // display membership
		        	}
			           
			           
			           if(membership2.isSelected()) // if check box not membership is selected dont have any discount 
			        		
			        	{
			             membership = "Not Member";  // display membership
			        	}
			           
			             
			           citizen = "Foreigner"; // display foreigner
			      
		        }
		        // conver string to double
		        String quantityAdult = Integer.toString(qtyAdult); 
				String adultTotal = Double.toString(totalAdult);
				String quantityChild = Integer.toString(qtyChild);
				String childTotal = Double.toString(totalChild);
				String qtySeniorCitizen = Integer.toString(qtySC);
				String SCTotal = Double.toString(totalSeniorCitizen);
		        String ttotal = Double.toString(total);
		        
		        // get input from textfield
				String name = txtName.getText();
				String icpass = txtIcPas.getText();
				String age = txtAge.getText();
				
				// connect to main frame
	        	Main mn = new Main(name,icpass,age,ttotal,citizen, membership,adultTotal,quantityAdult,quantityChild,childTotal,SCTotal,qtySeniorCitizen);
	        	mn.setVisible(true);
	        	
	        	//close current frame
	        	dispose();
			}
		});
		pay.setBounds(107, 402, 191, 54);
		contentPane.add(pay);
		
		JLabel lblNewLabel = new JLabel("IF MEMBER U GET 15% DISCOUNT");
		lblNewLabel.setBounds(26, 301, 351, 13);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(21, 301, 227, 13);
		contentPane.add(panel);
		
		setLocationRelativeTo(null);
		
	}
	}


