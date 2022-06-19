

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setUndecorated(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 698);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 222, 179));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(218, 165, 32));
		panel.setBounds(22, 10, 598, 30);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnHome = new JButton("BUY TICKET");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Ticketing tc = new Ticketing();
				tc.setVisible(true);
				dispose();
			}
		});
		btnHome.setBorder(null);
		btnHome.setBackground(new Color(255, 218, 185));
		btnHome.setBounds(11, 0, 95, 30);
		panel.add(btnHome);
		
		JButton btnMap = new JButton("MAP");
		btnMap.setBorder(null);
		btnMap.setBackground(new Color(255, 218, 185));
		btnMap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Map mp = new Map();
				mp.setVisible(true);
				dispose();
			}
		});
		btnMap.setBounds(233, 0, 107, 30);
		panel.add(btnMap);
		
		JButton btnPrice = new JButton("TICKET PRICE");
		btnPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				TicketPrice tc = new TicketPrice();
				tc.setVisible(true);
				dispose();
			}
		});
		btnPrice.setBorder(null);
		btnPrice.setBackground(new Color(255, 218, 185));
		btnPrice.setBounds(116, 0, 107, 30);
		panel.add(btnPrice);
		
		JButton btnAboutus = new JButton("ABOUT US");
		btnAboutus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(null,"This program & design was created by ABDUL MUHAIMIE AR BAAIN" + "\nAny Problem You Can Call The Number" + "\n01112826173");
			}
		});
		btnAboutus.setBorder(null);
		btnAboutus.setBackground(new Color(255, 218, 185));
		btnAboutus.setBounds(350, 0, 107, 30);
		panel.add(btnAboutus);
		
		JButton btnSignOut = new JButton("SIGN OUT");
		btnSignOut.setBounds(467, 0, 121, 30);
		panel.add(btnSignOut);
		btnSignOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(null,"You account has been disconnected, thank you!!");
				LoginFrame lf = new LoginFrame();
				lf.show();
				dispose();
			}
		});
		btnSignOut.setBorder(null);
		btnSignOut.setBackground(new Color(255, 218, 185));
		
		JPanel panelbackground = new JPanel();
		panelbackground.setBackground(new Color(222, 184, 135));
		panelbackground.setBounds(10, 425, 610, 226);
		contentPane.add(panelbackground);
		panelbackground.setLayout(null);
		
		JLabel animal1 = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/rimauicon.jpg"));
		animal1.setIcon(img);
		animal1.setBounds(10, 10, 122, 86);
		panelbackground.add(animal1);
		
		JLabel animal2 = new JLabel("");
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/gajahicon.jpg"));
		animal2.setIcon(img2);
		animal2.setBounds(166, 10, 122, 86);
		panelbackground.add(animal2);
		
		JLabel animal3 = new JLabel("");
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/zirafahicon.jpg"));
		animal3.setIcon(img3);
		animal3.setBounds(329, 10, 122, 86);
		panelbackground.add(animal3);
		
		JLabel animal4 = new JLabel("");
		ImageIcon img4 = new ImageIcon(this.getClass().getResource("/zebraicon.jpg"));
		animal4.setIcon(img4);
		animal4.setBounds(478, 10, 122, 86);
		panelbackground.add(animal4);
		
		JLabel rimau = new JLabel("TIGER");
		rimau.setHorizontalAlignment(SwingConstants.CENTER);
		rimau.setBounds(10, 97, 122, 13);
		panelbackground.add(rimau);
		
		JLabel gajah = new JLabel("ELEPHANT");
		gajah.setHorizontalAlignment(SwingConstants.CENTER);
		gajah.setBounds(166, 97, 122, 13);
		panelbackground.add(gajah);
		
		JLabel zirafah = new JLabel("GIRAFFE");
		zirafah.setHorizontalAlignment(SwingConstants.CENTER);
		zirafah.setBounds(329, 97, 122, 13);
		panelbackground.add(zirafah);
		
		JLabel zebra = new JLabel("ZEBRA");
		zebra.setHorizontalAlignment(SwingConstants.CENTER);
		zebra.setBounds(478, 97, 122, 13);
		panelbackground.add(zebra);
		
		JLabel animal5 = new JLabel("");
		ImageIcon img5 = new ImageIcon(this.getClass().getResource("/badakairicon.jpg"));
		animal5.setIcon(img5);
		animal5.setBounds(10, 120, 122, 86);
		panelbackground.add(animal5);
		
		JLabel animal6 = new JLabel("");
		ImageIcon img6 = new ImageIcon(this.getClass().getResource("/merakicon.jpg"));
		animal6.setIcon(img6);
		animal6.setBounds(166, 120, 122, 86);
		panelbackground.add(animal6);
		
		JLabel animal7 = new JLabel("");
		ImageIcon img7 = new ImageIcon(this.getClass().getResource("/pandaicon.jpg"));
		animal7.setIcon(img7);
		animal7.setBounds(329, 120, 122, 86);
		panelbackground.add(animal7);
		
		JLabel animal8 = new JLabel("");
		ImageIcon img8 = new ImageIcon(this.getClass().getResource("/oranghutanicon.jpg"));
		animal8.setIcon(img8);
		animal8.setBounds(478, 120, 122, 86);
		panelbackground.add(animal8);
		
		JLabel badak = new JLabel("HIPPO");
		badak.setHorizontalAlignment(SwingConstants.CENTER);
		badak.setBounds(10, 205, 122, 13);
		panelbackground.add(badak);
		
		JLabel merak = new JLabel("PEACOCK");
		merak.setHorizontalAlignment(SwingConstants.CENTER);
		merak.setBounds(166, 205, 122, 13);
		panelbackground.add(merak);
		
		JLabel panda = new JLabel("PANDA");
		panda.setHorizontalAlignment(SwingConstants.CENTER);
		panda.setBounds(329, 205, 122, 13);
		panelbackground.add(panda);
		
		JLabel orangutan = new JLabel("ORANG UTAN");
		orangutan.setHorizontalAlignment(SwingConstants.CENTER);
		orangutan.setBounds(478, 205, 122, 13);
		panelbackground.add(orangutan);
		
		JLabel title = new JLabel("ANIMAL LIST :");
		title.setBounds(10, 406, 178, 13);
		contentPane.add(title);
		
		JLabel zoomain = new JLabel("");
		ImageIcon img9 = new ImageIcon(this.getClass().getResource("/zoomain2.jpg"));
		zoomain.setIcon(img9);
		zoomain.setBounds(22, 61, 600, 335);
		contentPane.add(zoomain);
		
	}
}
