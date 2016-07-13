import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;




import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;


public class OnlineTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OnlineTest online= new OnlineTest();
					online.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public OnlineTest() {
		
		JButton btnNewButton = new JButton("New button");
		getContentPane().add(btnNewButton, BorderLayout.NORTH);
		getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setBounds(28, 29, 65, 14);
		getContentPane().add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(122, 26, 123, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(26, 70, 46, 14);
		getContentPane().add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(122, 67, 123, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton(" Student Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "Login");
				
				getLogin();
				DatabaseConn db;
				try {
					db = new DatabaseConn();
					db.setVisible(true);
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnLogin.setBounds(28, 116, 113, 46);
		getContentPane().add(btnLogin);
		
		JButton button = new JButton(" Teacher Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(176, 116, 113, 46);
		getContentPane().add(button);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterUser user=new RegisterUser();
				user.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(95, 184, 138, 46);
		getContentPane().add(btnNewButton_1);
	}
	private void getLogin(){
		String user="ram";
		String t;
		String p;
		String pass="123";
		//JTextField text=new  JTextField();
	t=textField.getText();
	p=textField_1.getText();
	
	 if(user.equals(t) && pass.equals(p) ){
			JOptionPane.showMessageDialog(this,"Login sucess");
		}
	 	else
			JOptionPane.showMessageDialog(this,"Error");
		
	}		
	
	}

