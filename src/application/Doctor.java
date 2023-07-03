package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Doctor implements Initializable
{
	
	  public Doctor()
	    {
	    	
	    	
	    }
	    
		
		@FXML
		private Button confirm;
		
		@FXML
		private Label slotdetails;
		
		@FXML
		private TextField slotday;
		
		@FXML
		private Button back;
		
		public void pressback(ActionEvent event) throws Exception
		{
			backpressed();
		}
		
		public void pressconfirm(ActionEvent event) throws Exception
		{
			confirmpressed();
		}
		
		public void backpressed() throws IOException
		{
			Main m=new Main();
			m.changeScene("Schedule.fxml");
		}
		
		private void confirmpressed() throws Exception
		{
			Main m= new Main();
			AppointmentControl obj=new AppointmentControl();
			obj.saveslot(slotday.getText());
			
			m.changeScene("Confirmation.fxml");

		
		
		}

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) 
		{
			try 
			{
				AppointmentControl obj=new AppointmentControl();
				String get=obj.retrieveslot();
			  	slotdetails.setText(get);
				
			}
		 catch (Exception e1)
		 {
			 
			 
		 }
			
		}
			
		

}
