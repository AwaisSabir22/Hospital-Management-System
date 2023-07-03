package application;


public class Doctor1 
{
	public void send_id(int id) throws Exception
	{
		Database obj=new Database();
		obj.makeslot(id);
		return;
	}
	
	public String getslot() throws Exception 
	{
		Database obj=new Database();
		String res=obj.fetchschedule();
		return res;
	}
	
	public void upload(String slot) throws Exception
	{
		Database obj=new Database();
		obj.updateAppointmenttable(slot);
		return;
	}
	
	public boolean saveslot(int num) 
	{
		return true;
	}
	public void updateprocedure(String proced) throws Exception 
	{
		
		Patient obj=new Patient();
		obj.setprocedure(proced);
		return;
	}
	
	public boolean sendnum(int num) throws Exception
	{
		Database dat=new Database();
		boolean check=dat.filecheck(num);
		if(check==true)
		{
			return true;
		}
		else
			return false;
	}
	
	public void enterdata(String symptoms, String diagnosis, String history) throws Exception 
	{
		Patient patient=new Patient();
		patient.setDiagnosis(diagnosis);
		patient.sethistory(history);
	}
}
