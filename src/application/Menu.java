package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class Menu 
{
    public Menu()
    {
    	
    	
    }
    
	
	@FXML
	private Button createfile;
	
	@FXML
	private Button makeapp;
	
	@FXML
	private Button consultation;
	
	@FXML 
	private Button test;

	@FXML 
	private Button medicine;
	
	@FXML 
	private Button bill;
	


	public void presscreate(ActionEvent event) throws IOException
	{
		createpressed();
	}
	
	public void pressmakeapp(ActionEvent event) throws IOException
	{
		makeapppressed();
	}
	
	public void pressconsultation(ActionEvent event) throws IOException
	{
		consultpressed();
	}
	
	public void presstest(ActionEvent event) throws IOException
	{
		testpressed();
	}
	
	public void pressmedicine(ActionEvent event) throws IOException
	{
		medicinepressed();
	}
	
	public void pressgenerate_bill(ActionEvent event) throws IOException
	{
		generate_billpressed();
	}
	
	
	private void createpressed() throws IOException
	{
		Main m= new Main();

		m.changeScene("createfile.fxml");
		
	
	}
	
	private void makeapppressed() throws IOException
	{
		Main m= new Main();

		m.changeScene("appointment.fxml");
	
	}
	
	private void consultpressed() throws IOException
	{
		Main m= new Main();
		m.changeScene("Fileno.fxml");
		
	}
	
	private void testpressed() throws IOException
	{
		Main m= new Main();
		m.changeScene("PatientID.fxml");
		
	}
	
	private void medicinepressed() throws IOException
	{
		Main m= new Main();
		m.changeScene("Patienttype.fxml");
		
	}
	
	
	private void generate_billpressed() throws IOException
	{
		
		Main m=new Main();
		m.changeScene("Bill.fxml");
		//Database obj=new Database();
	
	}
		
	
	
	
}
