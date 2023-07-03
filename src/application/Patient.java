package application;


public class Patient {
	
	private int AGE;
	private int ID;
	private String NAME; 
	private String hist;
	private String diag;
	
	public void setID(int num)
	{
	 	this.ID=num;
	} 
	public void setage(int age) 
	{
	    AGE=age;	
	}
	public void setname(String name) throws Exception 
	{
		this.NAME=name;
		Receptionist recept=new Receptionist();
		recept.senddata(ID,AGE,NAME);
		return;
	}
	
	
	public void setDiagnosis(String diagnosis) 
	{
		diag=diagnosis;
	}
	public void sethistory(String history) throws Exception 
	{
		hist=history;
		Database Data=new Database();
		Data.uploadData(diag, hist);
		return;
	}
	
	
	public void setprocedure(String procedure) throws Exception 
	{
		Database Data=new Database();
		Data.saveProcedure(procedure);;
		return;
	}
	
	
	
	
	
} 
