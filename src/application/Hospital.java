package application;


public class Hospital 
{
	
	
	public void details(int num, int age, String name) throws Exception 
	{
		Patient patient=new Patient();
		patient.setID(num);
		patient.setage(age);
		patient.setname(name);
		return;
	}
	
	
	public boolean authenticate_id(int id) throws Exception
	{
		Database obj=new Database();
		boolean check=obj.authentication(id);
		if(check==true)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public int getfileno(int id) throws Exception
	{
		Database obj=new Database();
		int file=obj.getfile(id);
		return file;
	}
	
	 
}