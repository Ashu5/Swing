package Login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Welcome extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
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
	public Welcome() {
		getContentPane().setBackground(Color.CYAN);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(44, 11, 316, 33);
		getContentPane().add(panel);
		
		JLabel lblWelcomeUser = new JLabel("Welcome  User");
		panel.add(lblWelcomeUser);
		
		textField = new JTextField();
		textField.setBounds(144, 55, 158, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(54, 58, 46, 14);
		getContentPane().add(lblName);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setBounds(54, 96, 46, 14);
		getContentPane().add(lblCourse);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(154, 93, 75, 20);
		getContentPane().add(comboBox);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(168, 196, 89, 23);
		getContentPane().add(btnSubmit);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setBounds(148, 132, 59, 23);
		getContentPane().add(rdbtnMale);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(54, 136, 46, 14);
		getContentPane().add(lblGender);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setBounds(214, 132, 69, 23);
		getContentPane().add(rdbtnFemale);
	
		comboBox.addItem("Btech");
		
		comboBox.addItem("MCA");
		//JOptionPane.showMessageDialog(this, "Welcome");
	}
}
