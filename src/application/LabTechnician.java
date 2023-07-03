package application;

public class LabTechnician 
{
	
	public void uploadresults(String results) throws Exception
	{
		Database obj=new Database();
		obj.uploadResults(results);
		
	}

}
