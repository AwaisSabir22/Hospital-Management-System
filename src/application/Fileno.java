package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Fileno 
{
	 public Fileno()
	    {
	    	
	    	
	    }
	    
	 	@FXML
	 	private Button file_enter;
		
	 	@FXML
	 	private TextField fileno;
	 	
		@FXML
		private Button return2;
		
		@FXML
		private Label inputcheck;

		public void pressenter(ActionEvent event) throws Exception
		{
			enterpressed();
		}
		
		public void pressreturn2(ActionEvent event) throws IOException
		{
			return2pressed();
		}
		
		private void enterpressed() throws Exception
		{
			Main m= new Main();
			
			int numbertosend=Integer.parseInt(fileno.getText());
			Consult1 cons=new Consult1();
			boolean check=cons.checkFile(numbertosend);
			if(check==true)
			{
				m.changeScene("Consult.fxml");
			}
			else if(check==false)
			{
				inputcheck.setText("File number does not exist! PLease create a file first.");
			}
			
			
		
		}

		private void return2pressed() throws IOException
		{
			Main m= new Main();
			m.changeScene("Menu.fxml");
		
		}
		

}
