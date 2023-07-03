package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.SQLException;
import java.sql.Statement;



public class Database 
{
	public static int a;
	public static int test_check;
	public static int doc_id;
	public static int count_tests=0;
	public static int count_doctor=0;
	public static int total;
	public static int challan_check;
	
	public void savedata(int id, int age, String name) throws Exception 
	{ 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HOSPITAL", "root", "tiger12345");
		System.out.println("Connection Established!");
		
		
		
		String sql="INSERT INTO Patient (Name, ID, Age) VALUES (?, ?, ?)";
		PreparedStatement statement=con.prepareStatement(sql);
		statement.setInt(2,id );
		statement.setString(1, name);
		statement.setInt(3, age);
		
		int rowsinserted=statement.executeUpdate();
		if(rowsinserted>0)
		{
			System.out.println("A new patient was inserted successfully");
		}

		count_tests=0;
		count_doctor=0;
		
		con.close();
		return;
	}
	
	
	public boolean authentication(int id) throws Exception
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HOSPITAL", "root", "tiger12345");
		System.out.println("Connection Established!");
		
		String ids=Integer.toString(id);
		String query="select * from Patient where ID = ";
		query=query.concat(ids);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		int res=0;
		
		if(rs.next())
		{
			System.out.println("ID already exists");
			res=1;
			
		}
		else
		{
			System.out.println("Continue");
			res=0;
		}
		
		
		con.close();
		if(res==1)
		{
			return false;
		}
		else
		{
			return true;
		}
		
		
		
	}
	
	
	public int getfile(int id) throws Exception
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HOSPITAL", "root", "tiger12345");
		System.out.println("Connection Established!");
		
		String ids=Integer.toString(id);
		String query="select fileno from Patient where ID = ";
		query=query.concat(ids);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		int res=0;
		
		if(rs.next())
		{
			res=rs.getInt("fileno");
			
			
		}

		con.close();
		return res;
		
		
		
	}
	
	
	public void makeslot(int DocID) throws Exception
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HOSPITAL", "root", "tiger12345");
		
		
		doc_id=DocID;
		count_doctor+=1;
		String sql="INSERT INTO Appointment (Patient_id, Doctor_id) VALUES (?, ?)";
		PreparedStatement statement=con.prepareStatement(sql);
		statement.setInt(1,a);
		statement.setInt(2, DocID);
		
		
		int rowsinserted=statement.executeUpdate();
		if(rowsinserted>0)
		{
			System.out.println("A new appointment slot created successfully");
		}
		
		con.close();
		return;
		
		
		
		
	}
	
	public String fetchschedule() throws Exception
	{

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HOSPITAL", "root", "tiger12345");
		//System.out.println("Connection Established!");
		
		String ids=Integer.toString(doc_id);
		String query="select Days,times from Doc_schedule where ID = ";
		query=query.concat(ids);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		String slot="";
		
		while(rs.next())
		{
			slot=slot.concat(rs.getString("Days"));
			slot=slot.concat(" ");
			slot=slot.concat(rs.getString("times"));
			slot=slot.concat("\n");
			//System.out.println(slot);

		}
		con.close();
		return slot;
		
		
		
	}
	
	
	public void updateAppointmenttable(String slot) throws Exception
	{

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HOSPITAL", "root", "tiger12345");
		System.out.println("Connection Established!");
		
		String ids=Integer.toString(doc_id);
		String sql="UPDATE Appointment SET slot = (?) WHERE Doctor_id = "; 
	    sql=sql.concat(ids);
		PreparedStatement statement=con.prepareStatement(sql);
		statement.setString(1, slot);
		
		int rowsinserted=statement.executeUpdate();
		if(rowsinserted>0)
		{
			System.out.println("Appointment table updated successfully!");
		}
		
		con.close();
		return;
		
		
	}
	
	public void removeslot() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HOSPITAL", "root", "tiger12345");
		//System.out.println("Connection Established!");
		


	    PreparedStatement statement = con.prepareStatement("delete from Appointment where Patient_id = ?");
	    statement.setInt(1, a);
	    statement.executeUpdate();
		

			System.out.println("Slot deleted");

		
		con.close();
		return;
		
		
	}
	
	
	public String confirmation() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HOSPITAL", "root", "tiger12345");
		//System.out.println("Connection Established!");
		
		String ids=Integer.toString(a);
		String query="select * from Appointment where Patient_id = ";
		query=query.concat(ids);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		String res="";
		
		if(rs.next())
		{
			res=res.concat(rs.getString("Patient_id"));
			res=res.concat(" ");
			res=res.concat(rs.getString("Doctor_id"));
			res=res.concat(" ");
			res=res.concat(rs.getString("slot"));
			System.out.println(res);

		}
		else
		{
			System.out.println("No entry exists for this patient file number");
		}
		con.close();
		return res;
		
		
		
		
		
	}
	
	
	public static Connection getConnection() throws SQLException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HOSPITAL", "root", "tiger12345");
		return con;
	}
	
	public boolean filecheck(int num) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HOSPITAL", "root", "tiger12345");
		System.out.println("Connection Established!");
		
		String ids=Integer.toString(num);
		String query="select Name from Patient where fileno = ";
		query=query.concat(ids);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		int res=0;
		
		if(rs.next())
		{
			System.out.println("file number does exists");
			res=1;
			a=num;
			test_check=num;
			
		}
		else
		{
			System.out.println("file number does not exist");
			res=0;
		}
		
		
		con.close();
		
		if(res==0)
		{
			return false;
		}
		else
		{
			return true;
		}

		
	}
	public boolean openfiles(int num) 
	{
		return true;
	}
	
	public void uploadData(String diagnosis, String history) throws Exception { //SQL
		System.out.println("diagnosis: "+diagnosis);
		System.out.println("history: "+history);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HOSPITAL", "root", "tiger12345");
		System.out.println("Connection Established!");
		
		
		String sql="INSERT INTO Consultation (fileno, History, Diagnosis) VALUES (?, ?, ?)"; //insert consult waali values here
		PreparedStatement statement=con.prepareStatement(sql);
		statement.setInt(1,a );
		statement.setString(2, history);
		statement.setString(3, diagnosis);
		
		int rowsinserted=statement.executeUpdate();
		if(rowsinserted>0)
		{
			System.out.println("Consultation table updated successfully!");
		}
		
		con.close();
		return;

	}
	
	public void saveProcedure(String procedure) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HOSPITAL", "root", "tiger12345");
		System.out.println("Connection Established!");
		
		count_tests+=1;
		String sql="INSERT INTO Procedures (fileno,  proceduresstr) VALUES (?, ?)"; 
		PreparedStatement statement=con.prepareStatement(sql);
		statement.setInt(1,test_check );
		statement.setString(2, procedure);
		
		
		int rowsinserted=statement.executeUpdate();
		if(rowsinserted>0)
		{
			System.out.println("Procedures table updated successfully!");
		}
		
		con.close();
		return;
		
		
		
		
		
	}
	
	
	public String getprocedure() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HOSPITAL", "root", "tiger12345");
		System.out.println("Connection Established!");
		
		String ids=Integer.toString(test_check);
		String query="select proceduresstr from Procedures where fileno = ";
		query=query.concat(ids);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		String proc="Procedure does not exist for this id";
		
		if(rs.next())
		{
			//System.out.println("Procedure exists for this id");
			proc=rs.getString("proceduresstr");
			//System.out.println(proc);
			con.close();
			return proc;
		}
		else
		{
			//System.out.println("Procedure does not exist for this id");
			con.close();
			return proc;
		}
		
		
		
		
	}
	
	public void uploadResults(String results) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HOSPITAL", "root", "tiger12345");
		System.out.println("Connection Established!");
		
		
		String sql="INSERT INTO Results (fileno,  results) VALUES (?, ?)"; 
		PreparedStatement statement=con.prepareStatement(sql);
		statement.setInt(1,test_check );
		statement.setString(2, results);
		
		
		int rowsinserted=statement.executeUpdate();
		if(rowsinserted>0)
		{
			System.out.println("Results table updated successfully!");
		}
		
		con.close();
		return;
		
		
		
		
		
	}
	
	
	public void uploadMedicine(String Name,String Potency,String Dose) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HOSPITAL", "root", "tiger12345");
		System.out.println("Connection Established!");
		
		
		String sql="INSERT INTO Medicine (Patient_ID, Med_Name, Potency, Dose) VALUES (?,?,?,?)"; 
		PreparedStatement statement=con.prepareStatement(sql);
		statement.setInt(1,a );
		statement.setString(2, Name);
		statement.setString(3, Potency);
		statement.setString(4, Dose);
		
		
		int rowsinserted=statement.executeUpdate();
		if(rowsinserted>0)
		{
			System.out.println("Medicine table updated successfully!");
		}
		
		con.close();
		return;
		
		
		
		
	}
	

	
	public boolean getschedule() {
		return true;
	}
	public void updateProcedure(String procedure) 
	{
		System.out.println("Procedure: "+procedure);
	}
	public String getProcedure(String Procedure) 
	{
		return Procedure;
	}

	

	
}