package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Medicine 
{
    public Medicine()
    {
    	
    	
    }
    
	
	@FXML
	private Button back;
	
	@FXML
	private TextField med_name;
	
	@FXML
	private TextField med_pot;
	
	@FXML
	private TextField med_dose;
	
	@FXML
	private Button submit;
	
	public void presssubmitmed(ActionEvent event) throws Exception
	{
		submitpressedmed();
	}
	
	public void pressback(ActionEvent event) throws IOException
	{
		backpressed();
	}
	
	private void submitpressedmed() throws Exception
	{
		Database obj=new Database();
		obj.uploadMedicine(med_name.getText(), med_pot.getText(), med_dose.getText());
		
	}
	
	
	private void backpressed() throws IOException
	{
		Main m= new Main();
		
		m.changeScene("Menu.fxml");
		
	
	}

}
