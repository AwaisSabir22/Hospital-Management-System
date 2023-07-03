package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Patienttype 
{
	 public Patienttype()
	    {
	    	
	    	
	    }
	    
	 	@FXML
	 	private Button submit;
		
		@FXML
		private Button return0;
		
		@FXML
		private Label wrong_id;
		
		@FXML
		private TextField patient_id;
		
		
		
		public void entertype(ActionEvent event) throws Exception
		{
			typeentered();
		}


		
		public void pressreturn(ActionEvent event) throws IOException
		{	
			returnpressed();
		}
		

		private void returnpressed() throws IOException
		{
			Main m= new Main();

			m.changeScene("Menu.fxml");
			
		
		}
		
		private void typeentered() throws Exception
		{

			Main m= new Main();
			
			Database obj=new Database();
			int send=Integer.parseInt(patient_id.getText());
			
			boolean check=obj.filecheck(send);
			if(check==true)
			{
			m.changeScene("Medicine.fxml");
			}
			else
			{
				wrong_id.setText("The entered ID is not correct!");
			}
		
		}


}
