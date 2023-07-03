package application;

public class Test1 
{
	public boolean checkFile(int num) throws Exception
	{
		Doctor1 doc=new Doctor1();
	    boolean check=doc.sendnum(num);
		if(check==true)
		{
			return true;
		}
		else
			return false;
	}
	
	public void testresults(String results) throws Exception
	{
		LabTechnician obj=new LabTechnician();
		obj.uploadresults(results);
	}
	
	
	public String callforproc() throws Exception
	{
		Staff obj=new Staff();
		String res=obj.getprocedures();
		return res;
		
	}

	public void updateproc(String proc) throws Exception
	{
		 Doctor1 obj=new Doctor1();
		 obj.updateprocedure(proc);
	}
	
}
