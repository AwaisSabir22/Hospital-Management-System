package application;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class PatientID 
{
	 public PatientID()
	    {
	    	
	    	
	    }
	    
	 	@FXML
	 	private Button submit1;
		
		@FXML
		private Button return1;
		
		@FXML
		private TextField filenum;
		
		@FXML 
		private Label check;

		public void presssubmit(ActionEvent event) throws Exception
		{
			submitpressed();
		}
		
		public void pressreturn(ActionEvent event) throws IOException
		{
			returnpressed();
		}
		
		private void submitpressed() throws Exception
		{
			Main m= new Main();
			
			
			int numbertosend=Integer.parseInt(filenum.getText());
			Test1 test=new Test1();
			boolean checker=test.checkFile(numbertosend);
			if(checker==true)
			{
				m.changeScene("Test.fxml");
			}
			else if(checker==false)
			{
				check.setText("File number does not exist! PLease create a file first.");
				
			}
			
			
		
		}

		private void returnpressed() throws IOException
		{
			Main m= new Main();

			m.changeScene("Menu.fxml");
			
		
		}
		


}
