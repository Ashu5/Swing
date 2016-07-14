package Login;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;

public class LoginFrame extends JFrame {
Database db;
	private JTextField txtUser;
	private JTextField txtPass;
	JButton btnSubmit;
	private JButton btnRegister;

	public static void main(String[] args) {
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
		getContentPane().setBackground(Color.ORANGE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	getContentPane().setLayout(null);
	
	JLabel lblUsername = new JLabel("Username");
	lblUsername.setBounds(26, 35, 62, 14);
	getContentPane().add(lblUsername);
	
	txtUser = new JTextField();
	txtUser.setBounds(98, 32, 186, 29);
	getContentPane().add(txtUser);
	txtUser.setColumns(10);
	
	JLabel lblPassword = new JLabel("Password");
	lblPassword.setBounds(26, 93, 62, 14);
	getContentPane().add(lblPassword);
	
	txtPass = new JTextField();
	txtPass.setBounds(101, 90, 183, 29);
	getContentPane().add(txtPass);
	txtPass.setColumns(10);
	db=new Database();
	
       btnSubmit = new JButton("Login");
       btnSubmit.setBackground(Color.GREEN);
	btnSubmit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			// check for button click
			if(e.getSource()==btnSubmit){
				String user=txtUser.getText();
				String pwd=txtPass.getText();
				if(db.checkLogin(user, pwd)){
					  JOptionPane.showMessageDialog(null, "You have logged in successfully","Success",
                              JOptionPane.INFORMATION_MESSAGE);;
                              Welcome wel=new Welcome();
                              wel.setVisible(true);
				}
				else
				{
					 JOptionPane.showMessageDialog(null, "Login failed!","Failed!!",
                             JOptionPane.ERROR_MESSAGE);
				}
			}
			
		}
	});
	btnSubmit.setBounds(101, 165, 89, 23);
	getContentPane().add(btnSubmit);
	
	btnRegister = new JButton("Register");
	btnRegister.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Register reg= new Register();
			reg.setVisible(true);
		}
	});
	btnRegister.setBackground(Color.GREEN);
	btnRegister.setBounds(195, 165, 89, 23);
	getContentPane().add(btnRegister);
	
	}
	
		
	}

