package OnlineTestApp; 

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import java.awt.Color;

@SuppressWarnings("unused")
public class MasterPage extends JFrame {
 
	private static final long serialVersionUID = 1L;
	private JTextField txtUsername;
	private JTextField txtPass;
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MasterPage frame = new MasterPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});		
	}

	public MasterPage() {
		getContentPane().setBackground(new Color(135, 206, 250));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBackground(new Color(139, 0, 0));
		lblUsername.setBounds(32, 30, 71, 28);
		getContentPane().add(lblUsername);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(175, 30, 160, 28);
		getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBackground(new Color(128, 0, 0));
		lblPassword.setBounds(34, 83, 69, 14);
		getContentPane().add(lblPassword);
		
		txtPass = new JTextField();
		txtPass.setBounds(175, 76, 160, 28);
		getContentPane().add(txtPass);
		txtPass.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(0, 255, 0));
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setBounds(173, 137, 71, 44);
		getContentPane().add(btnLogin);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp sign= new SignUp();
				sign.setVisible(true);
			}
		});
		btnNewButton.setBounds(267, 137, 77, 44);
		getContentPane().add(btnNewButton);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 45, 21);
		getContentPane().add(menuBar);
		
		JMenu mnUser = new JMenu("User");
		menuBar.add(mnUser);
		
		JMenuItem mntmStudent = new JMenuItem("Student");
		mntmStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		mnUser.add(mntmStudent);
		
		JMenuItem mntmTeacher = new JMenuItem("Teacher");
		mntmTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  
			}
		});
		mnUser.add(mntmTeacher);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnUser.add(mntmExit);
	}
	
    
	/*class DataConnection 
	{
		Connection conn ;
		Statement stmt;
		ResultSet rs;
		*/
		
		
		// JTextField txtUsername = new JTextField();
		
		/*public String getData() throws SQLException{

			try{
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "password");
				System.out.println("Data Connection Succesful...");
				stmt=conn.createStatement();
				
				
				rs=stmt.executeQuery("select * from online_test");
				while(rs.next())
				{
					 System.out.println(rs.getString("question")+"\n"+rs.getString("option1")+"\n"+rs.getString("option2")
							+"\n"+rs.getString("option3")+"\n"+rs.getString("option4")+"\n"+rs.getString("answer"));
				}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		conn.close();
		rs.close();
		stmt.close();*/
		//return null;
		}
		/*public void insertData() throws SQLException{
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "password");
			System.out.println("Data Connection Succesful...");
			PreparedStatement preparedStatement=conn.prepareStatement("insert into signup_user values(?,?,?,? ");
			preparedStatement.setString(0, txtUsername.getText());
		
			
		
				}*/
//}
