package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Database {
Connection con;
PreparedStatement ps;
ResultSet rs;


Database()
{
 try{
	 Class.forName("com.mysql.jdbc.Driver");
	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "password");
	 
 }
 catch(Exception e)
 {
	 e.printStackTrace();
 }
}
public Boolean checkLogin(String user, String pass)
{
	
	try{
		ps=con.prepareStatement("Select username,password from swing_db where username=? and password=?");
		ps.setString(1, user);
		ps.setString(2, pass);
		rs=ps.executeQuery();
		if(rs.next())
		{
			return true;
		}
		else{
			return false;
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return false;
	}
}
public void insertData() throws SQLException{
	
	Register reg= new Register();
    int i=0;
	String query="insert into swing_db values(?,?)";
	String user=reg.textUser.getText();
	String pass=reg.textPass.getText();
	if(user.equals(pass))
	{

	try{
			 Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root" , "password");
ps=con.prepareStatement(query);

ps.setString(1,user);
ps.setString(2, pass);
rs=ps.executeQuery();
i++;
if(i>0)
{
	JOptionPane.showMessageDialog(null, "Register Successfully");
}

	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	else
	{
		JOptionPane.showMessageDialog(null, "Invalid Login");
	}
}

}
