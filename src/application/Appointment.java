package application;



import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Appointment 
{
    public Appointment()
    {
    	
    	
    }
    
	
	@FXML
	private Button doctorinfo;
	
	@FXML
	private TextField ID;
	
    @FXML
    private Label wrongID;
    
    @FXML
    private Button back;
	
    
	public void presssubmitappoint(ActionEvent event) throws Exception
	{
		submitappointpressed();
	}
	
	public void pressback(ActionEvent event)throws Exception
	{
		backpressed();
		
	}
	
	private void submitappointpressed() throws Exception
	{
		Main m= new Main();
	
		
		
		int numbertosend=Integer.parseInt(ID.getText());
		AppointmentControl obj=new AppointmentControl();
		
		boolean checker=obj.idcheck(numbertosend);
		if(checker==true)
		{
			m.changeScene("Schedule.fxml");
		}
		else if(checker==false)
		{
			wrongID.setText("File number does not exist! PLease create a file first.");
			
		}
		
	
	}
	
	public void backpressed() throws IOException
	{
		
		Main m=new Main();
		m.changeScene("Menu.fxml");
	}
		
	
	
	
}