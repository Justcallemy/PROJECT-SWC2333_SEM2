import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.TitledBorder;

public class TicketPrice extends JFrame {

	private JPanel contentPane;
	JLabel name2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) { 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicketPrice frame = new TicketPrice();
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
	public TicketPrice() {
		setUndecorated(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 518);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(244, 164, 96));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/zoonegaraticket.jpg")); //add image
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 675, 437);
		panel.setBorder(new TitledBorder(null, "TICKET PRICE", TitledBorder.LEADING, TitledBorder.TOP, null, null)); // add title border
		panel.setBackground(new Color(160, 82, 45));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel ticket = new JLabel("");
		ticket.setBounds(62, 23, 559, 387);
		panel.add(ticket);
		ticket.setIcon(img);
		
		JButton btnNewButton = new JButton("RETURN");
		btnNewButton.setBackground(new Color(169, 169, 169));
		btnNewButton.setBounds(305, 457, 70, 25);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				HomePage hp = new HomePage(); //connect to homepage frame
				hp.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnNewButton);
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
	}
}
