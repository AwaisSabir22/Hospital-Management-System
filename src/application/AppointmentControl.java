package application;

public class AppointmentControl 
{
	public boolean idcheck(int file) throws Exception
	{
		Receptionist obj=new Receptionist();
		boolean checker=obj.checkid(file);
		if(checker==true)
		{
			return true;
		}
		else
			return false;
		
	}
	public String retrieveslot() throws Exception
	{
		Doctor1 obj=new Doctor1();
		String get=obj.getslot();
		return get;
	}
	
	public void saveslot(String slot) throws Exception
	{
		Doctor1 obj=new Doctor1();
		obj.upload(slot);
		return;
	}
	
	public String confirmdetails() throws Exception
	{
		Database obj=new Database();
		String res=obj.confirmation();
		return res;
	}
	
	public void sendID(int id) throws Exception
	{
		Receptionist obj=new Receptionist();
		obj.sendDocID(id);
		return;
	}

}
