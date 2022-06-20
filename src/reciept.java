

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.text.DecimalFormat;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class reciept extends JFrame {

	private JPanel contentPane;
	static String name;
	static String icpass;
	static String age;
	static String total;
	static String citizen;
	static String totalAdult;
	static String qtyAdult;
	static String quantityChild;
	static String childTotal;
	static String allpayment;
	static String balance;
	static String membership;
	static String sctotal;
	static String qtysc;
	
	DecimalFormat df = new DecimalFormat("#0.00"); //use decimal format


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reciept frame = new reciept(name,icpass,age,total,citizen, membership,totalAdult,qtyAdult,quantityChild,childTotal,allpayment,balance, sctotal, qtysc);
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
	
	public reciept(String name, String icpass, String age,String ttotal, String citizen, String membership,String totalAdult, String qtyAdult, String quantityChild, String childTotal, String ttotalpayment, String totalbalance, String SCTotal, String qtySeniorCitizen) {
		setBackground(new Color(169, 169, 169));
		setTitle("Reciept");
		
		
		setUndecorated(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 373);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 222, 179));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		df.setMaximumFractionDigits(2);
		
		JLabel icpass2 = new JLabel("");
		icpass2.setBounds(121, 45, 200, 13);
		contentPane.add(icpass2);
		icpass2.setText(icpass);

		double totpay = Double.parseDouble(ttotal);
		JLabel total = new JLabel("");
		total.setFont(new Font("Tahoma", Font.BOLD, 25));
		total.setBounds(279, 248, 129, 25);
		contentPane.add(total);
		total.setText(df.format(totpay));
		
		JLabel lblIcPass = new JLabel("IC/PASSPORT     :");
		lblIcPass.setBounds(10, 39, 292, 25);
		contentPane.add(lblIcPass);
		
		JLabel MalayForeg = new JLabel("");
		MalayForeg.setBounds(121, 100, 181, 13);
		contentPane.add(MalayForeg);
		MalayForeg.setText(citizen);
		
		JLabel titleCitizen = new JLabel("CITIZEN             :");
		titleCitizen.setBounds(10, 94, 292, 25);
		contentPane.add(titleCitizen);
		
		JLabel times = new JLabel("x");
		times.setBounds(134, 149, 20, 13);
		contentPane.add(times);
		
		JLabel equals = new JLabel("=");
		equals.setBounds(279, 149, 14, 13);
		contentPane.add(equals);
		
		double totAdult = Double.parseDouble(totalAdult);
		JLabel lblTotalAdult = new JLabel("");
		lblTotalAdult.setBounds(358, 149, 76, 13);
		contentPane.add(lblTotalAdult);
		lblTotalAdult.setText(df.format(totAdult));
		
		JLabel titleAT = new JLabel("Ticket Adult");
		titleAT.setBounds(0, 149, 142, 13);
		contentPane.add(titleAT);
		
		JLabel equals2 = new JLabel("=");
		equals2.setBounds(279, 179, 14, 13);
		contentPane.add(equals2);
		
		double totChild = Double.parseDouble(childTotal);
		JLabel lblTotalChild = new JLabel("");
		lblTotalChild.setBounds(358, 179, 76, 13);
		contentPane.add(lblTotalChild);
		lblTotalChild.setText(df.format(totChild));
		
		JLabel titleChild = new JLabel("Ticket Child");
		titleChild.setBounds(0, 179, 142, 13);
		contentPane.add(titleChild);
		
		JLabel times2 = new JLabel("x");
		times2.setBounds(134, 179, 20, 13);
		contentPane.add(times2);
		
		JLabel deco = new JLabel("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		deco.setBounds(0, 136, 434, 13);
		contentPane.add(deco);
		
		JLabel rm = new JLabel("RM");
		rm.setFont(new Font("Tahoma", Font.BOLD, 25));
		rm.setBounds(210, 248, 62, 25);
		contentPane.add(rm);
		
		JLabel lblTotal = new JLabel("Total      : ");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTotal.setBounds(0, 248, 292, 25);
		contentPane.add(lblTotal);
		
		JLabel deco2 = new JLabel("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		deco2.setBounds(0, 225, 456, 13);
		contentPane.add(deco2);
		
		JLabel rm2 = new JLabel("RM");
		rm2.setBounds(320, 149, 28, 13);
		contentPane.add(rm2);
		
		JLabel rm3 = new JLabel("RM");
		rm3.setBounds(320, 179, 28, 13);
		contentPane.add(rm3);
		
		JLabel lblQuantityAdult = new JLabel("");
		lblQuantityAdult.setBounds(178, 149, 76, 13);
		contentPane.add(lblQuantityAdult);
		lblQuantityAdult.setText(qtyAdult);
		
		JLabel lblQuantityChild = new JLabel("");
		lblQuantityChild.setBounds(178, 179, 76, 13);
		contentPane.add(lblQuantityChild);
		lblQuantityChild.setText(quantityChild);
		
		JLabel nama = new JLabel("");
		nama.setBounds(121, 16, 191, 13);
		contentPane.add(nama);
		nama.setText(name);
		
		JLabel lblname = new JLabel("NAME                 : ");
		lblname.setBounds(10, 10, 292, 25);
		contentPane.add(lblname);
		
		JLabel deco2_1 = new JLabel("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		deco2_1.setBounds(0, 323, 434, 13);
		contentPane.add(deco2_1);
		
		JLabel lblBalance = new JLabel("Balance :");
		lblBalance.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblBalance.setBounds(0, 283, 142, 24);
		contentPane.add(lblBalance);
		
		JLabel rm4 = new JLabel("RM");
		rm4.setFont(new Font("Tahoma", Font.BOLD, 25));
		rm4.setBounds(210, 283, 45, 25);
		contentPane.add(rm4);
		
		Double tbalance = Double.parseDouble(totalbalance);
		JLabel balance = new JLabel("");
		balance.setFont(new Font("Tahoma", Font.BOLD, 25));
		balance.setBounds(277, 283, 157, 25);
		contentPane.add(balance);
		balance.setText(df.format(tbalance));
		
		JLabel lblNewLabel = new JLabel("AGE                    :");
		lblNewLabel.setBounds(10, 68, 297, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblAge = new JLabel("");
		lblAge.setBounds(121, 74, 181, 13);
		contentPane.add(lblAge);
		lblAge.setText(age);
		
		JLabel lblMembership = new JLabel("MEMBERSHIP      :");
		lblMembership.setBounds(10, 123, 292, 16);
		contentPane.add(lblMembership);
		
		JLabel lblmembership = new JLabel("");
		lblmembership.setBounds(121, 126, 142, 13);
		contentPane.add(lblmembership);
		lblmembership.setText(membership);
		
		JLabel lblSeniorCitizen = new JLabel("Ticket Senior Citizen");
		lblSeniorCitizen.setBounds(0, 213, 142, 13);
		contentPane.add(lblSeniorCitizen);
		
		JLabel times3 = new JLabel("x");
		times3.setBounds(134, 213, 14, 13);
		contentPane.add(times3);
		
		JLabel lblQtySc = new JLabel("");
		lblQtySc.setBounds(178, 213, 76, 13);
		contentPane.add(lblQtySc);
		lblQtySc.setText(qtySeniorCitizen);
		
		JLabel equals3 = new JLabel("=");
		equals3.setBounds(279, 213, 14, 13);
		contentPane.add(equals3);
		
		JLabel rm5 = new JLabel("RM");
		rm5.setBounds(320, 213, 28, 13);
		contentPane.add(rm5);
		
		double SeniorC = Double.parseDouble(SCTotal);
		JLabel lblTotalSeniorCitizen = new JLabel("");
		lblTotalSeniorCitizen.setBounds(358, 213, 76, 13);
		contentPane.add(lblTotalSeniorCitizen);
		lblTotalSeniorCitizen.setText(df.format(SeniorC));
		
		JLabel lblreciept = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/iconreciept.png"));
		lblreciept.setIcon(img);
		lblreciept.setBounds(375, 228, 81, 108);
		contentPane.add(lblreciept);
		
		JLabel lblZNicon = new JLabel("");
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/ZNicon1.jpg"));
		lblZNicon.setIcon(img2);
		lblZNicon.setBounds(258, 29, 150, 110);
		contentPane.add(lblZNicon);
		
	}
	}
	
	


