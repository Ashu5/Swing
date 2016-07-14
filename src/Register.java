package Login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Register extends JFrame {

	private JPanel contentPane;
	public  JTextField textUser;
	public JTextField textPass;
	final public JButton btnRegister;
	Database db;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(33, 39, 75, 21);
		getContentPane().add(lblUsername);
		
		textUser = new JTextField();
		textUser.setBounds(131, 39, 175, 21);
		getContentPane().add(textUser);
		textUser.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(40, 86, 46, 14);
		getContentPane().add(lblPassword);
		
		textPass = new JTextField();
		textPass.setBounds(130, 83, 176, 20);
		getContentPane().add(textPass);
		textPass.setColumns(10);
		
	  btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnRegister){
					db=new Database();
					
					try {
						db.insertData();
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
				}
				
			}
		});
		btnRegister.setBounds(173, 152, 89, 23);
		getContentPane().add(btnRegister);
	}

}
