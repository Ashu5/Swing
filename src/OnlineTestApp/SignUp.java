package OnlineTestApp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ButtonGroup;

@SuppressWarnings({ "unused", "serial" })
public class SignUp extends JFrame {

    private JPanel contentPane;
	private JTextField txtName;
	private JTextField textUser;
	private JTextField txtMail;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		getContentPane().setBackground(Color.PINK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(24, 24, 48, 26);
		getContentPane().add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(93, 24, 200, 26);
		getContentPane().add(txtName);
		txtName.setColumns(10);
		
		textUser = new JTextField();
		textUser.setBounds(93, 56, 200, 26);
		getContentPane().add(textUser);
		textUser.setColumns(10);
		
		txtMail = new JTextField();
		txtMail.setColumns(10);
		txtMail.setBounds(93, 94, 200, 26);
		getContentPane().add(txtMail);
		
		JLabel label_1 = new JLabel("UserID");
		label_1.setBounds(24, 56, 48, 26);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Email");
		label_2.setBounds(24, 94, 48, 26);
		getContentPane().add(label_2);
		
		JLabel lblNewLabel = new JLabel("Gender");
		lblNewLabel.setBounds(24, 131, 48, 26);
		getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setBounds(103, 133, 53, 23);
		getContentPane().add(rdbtnMale);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					insertData();
				} catch (SQLException e1) { 
					
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(btnNewButton, "Success");
			}
		});
		btnNewButton.setBounds(158, 181, 102, 37);
		getContentPane().add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Female");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(173, 133, 82, 23);
		getContentPane().add(rdbtnNewRadioButton);
	}
	private void insertData() throws SQLException{
		Connection con ;
		Statement stmt;
		ResultSet rs;
		try{
			
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "password");
		System.out.println("Data Connection Succesful...");
		PreparedStatement preparedStatement=con.prepareStatement("insert into signup_user (name,userid,email,gender) values(?,?,?");
		preparedStatement.setString(1, txtName.getText()); 
	    preparedStatement.setString(2, textUser.getText());
		preparedStatement.setString(3,txtMail.getText());
		//preparedStatement.setCharacterStream(3, (Reader) buttonGroup.getSelection());
		 int rowAffected= preparedStatement.executeUpdate();
		}
		    catch(Exception e){
			e.printStackTrace();
		}
		
		
	
	}
}
 