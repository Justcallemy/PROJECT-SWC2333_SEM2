import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JLabel lblloginMessage = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) { //RETURN 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_Username = new JPanel();
		panel_Username.setBounds(95, 97, 250, 40);
		contentPane.add(panel_Username);
		panel_Username.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setBorder(null);
		txtUsername.addFocusListener(new FocusAdapter() { //CREATE USERNAME
			@Override
			public void focusGained(FocusEvent e) {
				if(txtUsername.getText().equals("Username"))
				{
					txtUsername.setText("");
				}
				else {
					txtUsername.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUsername.getText().equals(""))
				{
					txtUsername.setText("Username");
				}
			}
		});
		txtUsername.setFont(new Font("Fira Code", Font.PLAIN, 12));
		txtUsername.setText("Username");
		txtUsername.setBounds(10, 10, 144, 20);
		panel_Username.add(txtUsername);
		txtUsername.setColumns(10);
		
		JPanel panel_Password = new JPanel();
		panel_Password.setBounds(95, 147, 250, 40);
		contentPane.add(panel_Password);
		panel_Password.setLayout(null);
		
		txtPassword = new JPasswordField();
		txtPassword.addFocusListener(new FocusAdapter() { //CREATE PASSWORD
			@Override
			public void focusGained(FocusEvent e) {
				if(txtPassword.getText().equals("Password")) { //hide password
				txtPassword.setEchoChar('●');
				txtPassword.setText("");
				}
				else {
					txtPassword.selectAll();
					
				}
			}
			@Override
			public void focusLost(FocusEvent e) 
			{
				if(txtPassword.getText().equals("")) {
					txtPassword.setText("Password");
					txtPassword.setEchoChar((char)0);
				}
				
			}
		});
		txtPassword.setBorder(null);
		txtPassword.setEchoChar((char)0);
		txtPassword.setFont(new Font("Fira Code", Font.PLAIN, 12));
		txtPassword.setText("Password");
		txtPassword.setBounds(10, 11, 144, 20);
		panel_Password.add(txtPassword);
		
		JPanel panelLogin = new JPanel();
		panelLogin.addMouseListener(new MouseAdapter() { //USERNAME & PASSWORD
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtUsername.getText().equals("Muhaimie") && txtPassword.getText().equals("emi123")) 
				{
					lblloginMessage.setText("");
					HomePage hp = new HomePage();
					hp.setVisible(true);
					dispose();
					
				}
				
				else if(txtUsername.getText().equals("") || txtUsername.getText().equals("Username") || 
				txtPassword.getText().equals("") || txtPassword.getText().equals("Password")) 
				{
					lblloginMessage.setText("Please input all requirements!"); //warning text if user dont input username & password
				}
				else 
				{
			lblloginMessage.setText("Username and password didn't match! "); //warning text if username and password didn't match
			    }
		}
	                                                });
		
			
		panelLogin.setBackground(SystemColor.desktop);
		panelLogin.setBounds(95, 210, 250, 40);
		contentPane.add(panelLogin);
		panelLogin.setLayout(null);
		
		JLabel lbllogin = new JLabel("LOG IN");
		lbllogin.setHorizontalAlignment(SwingConstants.CENTER);
		lbllogin.setForeground(SystemColor.inactiveCaptionBorder);
		lbllogin.setFont(new Font("Arial", Font.BOLD, 14));
		lbllogin.setBounds(65, 10, 105, 20);
		panelLogin.add(lbllogin);
		
		JLabel lblClose = new JLabel("X");
		lblClose.addMouseListener(new MouseAdapter() { //MOUSE LISTENER
			@Override
			public void mouseClicked(MouseEvent e) //if JLabel x is clicked message will pop up for closing application
			{
				if(JOptionPane.showConfirmDialog(null, "Are you sure to close this application?","Confirmation",JOptionPane.YES_NO_OPTION) == 0)
				{
					LoginFrame.this.dispose(); //if yes loginframe will close
				}
			}
		});
		lblClose.addKeyListener(new KeyAdapter() {
	
		});
		lblClose.setFont(new Font("Cascadia Code", Font.BOLD, 10));
		lblClose.setBounds(430, 0, 20, 20);
		contentPane.add(lblClose);
		
		lblloginMessage.setFont(new Font("Arial", Font.PLAIN, 11));
		lblloginMessage.setBounds(95, 197, 250, 13);
		contentPane.add(lblloginMessage);
		
		JLabel lblLoginIcon = new JLabel(" ");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/icon2.png")); //add image
		lblLoginIcon.setIcon(img);
		lblLoginIcon.setBounds(42, 97, 55, 40);
		contentPane.add(lblLoginIcon);
		
		JLabel lbliconpass = new JLabel("");
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/iconpass3.png")); //add image
		lbliconpass.setIcon(img2);
		lbliconpass.setBounds(52, 147, 66, 40);
		contentPane.add(lbliconpass);
		
		JLabel lblLoginAccess = new JLabel("");
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/iconzoo1.png")); //add image
		lblLoginAccess.setIcon(img3);
		lblLoginAccess.setBounds(178, 0, 209, 117);
		contentPane.add(lblLoginAccess);
		setLocationRelativeTo(null);
	}
}
