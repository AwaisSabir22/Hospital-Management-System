package application;


public class Consult1 
{
	public void PatientData(String symtoms, String diagnosis, String history) throws Exception 
	{
		Doctor1 doctor=new Doctor1();
		doctor.enterdata(symtoms, diagnosis, history);
		return;
	}
	
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
	
	public void setDetails(String diag,String hist) throws Exception
	{
		Patient obj=new Patient();
		obj.setDiagnosis(diag);
		obj.sethistory(hist);

		return;
		
	}
	
	
}
