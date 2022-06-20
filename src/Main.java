import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField txtPayment;
	
	//static declare for void main and main frame constructor 
	static String name;
	static String icpass;
	static String AgeInput;
	static String total;
	static String citizen;
	static String totalAdult;
	static String qtyAdult;
	static String quantityChild;
	static String childTotal;
	static String membership;
	static String sctotal;
	static String qtysc;
	
	DecimalFormat df = new DecimalFormat("#0.00");
	private JTextField txtPay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//recieve data from ticketing
					Main frame = new Main(name,icpass,AgeInput,total, membership,citizen,totalAdult,qtyAdult,quantityChild,childTotal,sctotal,qtysc);
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
	
	//recieve data from ticketing frame
	public Main(String name, String icpass, String Age,String ttotal, String citizen, String membership,String adultTotal, String quantityAdult, String quantityChild, String childTotal, String SCTotal, String qtySeniorCitizen) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 275);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 235, 68);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnCreditCard = new JRadioButton("CREDIT CARD");
		rdbtnCreditCard.setBorder(null);
		rdbtnCreditCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(rdbtnCreditCard.isSelected())
				{
					double Total = Double.parseDouble(ttotal);
					txtPayment.setText("RM" + df.format(Total));
				}
			}
		});
		rdbtnCreditCard.setBounds(6, 10, 219, 52);
		panel.add(rdbtnCreditCard);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 82, 235, 68);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnBankpayment = new JRadioButton("BANK PAYMENT");
		rdbtnBankpayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(rdbtnBankpayment.isSelected())
				{
					double Total = Double.parseDouble(ttotal);
					txtPayment.setText("RM" + df.format(Total));
				}
			}
		});
		rdbtnBankpayment.setBounds(0, 6, 229, 56);
		panel_1.add(rdbtnBankpayment);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(10, 154, 235, 69);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JRadioButton rdbtnEwallet = new JRadioButton("EWALLET");
		rdbtnEwallet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(rdbtnEwallet.isSelected())
				{
					double Total = Double.parseDouble(ttotal);
					txtPayment.setText("RM" + df.format(Total));
				}
			}
		});
		rdbtnEwallet.setBounds(0, 6, 229, 57);
		panel_1_1.add(rdbtnEwallet);
		
		JLabel lblTotal = new JLabel("TOTAL :");
		lblTotal.setFont(new Font("Segoe UI", Font.BOLD, 30));
		lblTotal.setBounds(255, 27, 235, 104);
		contentPane.add(lblTotal);
		
		txtPayment = new JTextField();
		txtPayment.setFont(new Font("Segoe UI", Font.BOLD, 30));
		txtPayment.setBounds(394, 54, 182, 50);
		contentPane.add(txtPayment);
		txtPayment.setColumns(10);
		
		JButton btnPay = new JButton("Pay");
		btnPay.setBackground(new Color(216, 191, 216));
		btnPay.setBorder(null);
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Total = Double.parseDouble(ttotal);
				double Totalpayment = 0.0;
				String totalmoney = txtPay.getText();
				double tm = Double.parseDouble(totalmoney);
				
				

				if(tm < Total)
				{
					JOptionPane.showMessageDialog(null,"Your money is not enough");
				}
				else if(tm > Total)
				{
					Totalpayment = tm - Total;
					JOptionPane.showMessageDialog(null,"Thank you for purchase!!!" + "\nThis is your reciept");
					String ttotalpayment = Double.toString(Totalpayment); 
					String totalbalance = Double.toString(Totalpayment);
					reciept rp = new reciept(name,icpass, Age,ttotal,citizen, membership,adultTotal,quantityAdult,quantityChild,childTotal,ttotalpayment,totalbalance,SCTotal,qtySeniorCitizen);
					rp.setVisible(true);
					dispose();
				}
				else if(tm == Total)
				{
					Totalpayment = tm - Total;
					JOptionPane.showMessageDialog(null,"Thank you for purchase!!!" + "\nThis is your reciept");
					String ttotalpayment = Double.toString(Totalpayment);
					String totalbalance = Double.toString(Totalpayment);
					reciept rp = new reciept(name,icpass, Age,ttotal,citizen, membership,adultTotal,quantityAdult,quantityChild,childTotal,ttotalpayment,totalbalance,SCTotal,qtySeniorCitizen);
					rp.setVisible(true);
					dispose();
				}
		
			}
		});
		btnPay.setBounds(275, 184, 301, 27);
		contentPane.add(btnPay);
		
		JLabel totalPayment = new JLabel("");
		totalPayment.setBounds(465, 46, 111, 104);
		contentPane.add(totalPayment);
		
		txtPay = new JTextField();
		txtPay.setFont(new Font("Segoe UI", Font.BOLD, 30));
		txtPay.setBounds(394, 114, 182, 49);
		contentPane.add(txtPay);
		txtPay.setColumns(10);
		
		JLabel lblRm = new JLabel("     RM :");
		lblRm.setFont(new Font("Segoe UI", Font.BOLD, 30));
		lblRm.setBounds(255, 87, 235, 104);
		contentPane.add(lblRm);
	}
}
