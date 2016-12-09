package smartcity;
import java.sql.*;

import javax.swing.JOptionPane;

public class DbConnect {
	Connection connect=null;
	public static Connection dataConnector()
	{
		try
		{
			Class.forName("org.sqlite.JDBC");
			Connection connect=DriverManager.getConnection("jdbc:sqlite:E:\\accounts.db");
			//JOptionPane.showMessageDialog(null, "Successful connection");
			return connect;
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Error in connection");
			return null;
		}
	}
	

}
