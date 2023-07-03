package application;

public class Staff 
{
	
	public String getprocedures() throws Exception
	{
		Database dat=new Database();
		String res=dat.getprocedure();
		return res; 
	}
	
	

}
