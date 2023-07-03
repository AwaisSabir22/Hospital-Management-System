package application;
import java.sql.*;

public class checkDatabase 
{
/*
	public class checkdatabase 
	{
		public static void main(String args[]) throws Exception
		{
		

			Class.forName("com.mysql.cj.jdbc.Driver");
		
			
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HOSPITAL", "root", "tiger12345");
			System.out.println("Connection Established!");
			
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select Name from Patient where ID=3379");
			rs.next();
			String Name=rs.getString("Name");
			System.out.println(Name);
			
			
		}

	}
	*/
	
	public void check() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HOSPITAL", "root", "tiger12345");
		System.out.println("Connection Established!");
		
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select Name from Patient where ID=3379");
		rs.next();
		String Name=rs.getString("Name");
		System.out.println(Name);
		
	}

}
