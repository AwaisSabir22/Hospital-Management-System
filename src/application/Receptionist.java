package application;

public class Receptionist 
{

	
	public void senddata(int id,int age, String Name) throws Exception 
	{
		Database Data=new Database();
		Data.savedata(id,age,Name);
		return;
	}

	public boolean checkid(int id) throws Exception
	{
		Database obj=new Database();
	    boolean check=obj.filecheck(id);
		if(check==true)
		{
			return true;
		}
		else
			return false;
	}
	
	public void sendDocID(int doctorid) throws Exception
	{
		Doctor1 obj=new Doctor1();
		obj.send_id(doctorid);
		return;
	}

	
	
}
