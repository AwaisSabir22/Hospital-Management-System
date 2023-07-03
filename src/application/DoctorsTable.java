package application;

public class DoctorsTable 
{
	String id,name,specialization;
	
	public DoctorsTable(String id,String name,String specialization)
	{
		this.id=id;
		this.name=name;
		this.specialization=specialization;
	}
	
	public String getID()
	{
		return id;
	}
	
	public void setID(String id)
	{
		this.id=id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getSpecialization()
	{
		return specialization;
	}
	
	public void setSpecialization(String specialize)
	{
		this.specialization=specialize;
	}
	
	
	
	
	
}
