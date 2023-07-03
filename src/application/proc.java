package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class proc 
{

    public proc()
    {
    	
    	
    }
    
	   
    
	@FXML
	private Button return2;
	
	@FXML 
	private Button submit2;
	
	@FXML
	private TextArea procedure;
	
	
	public void presssubmit2(ActionEvent event) throws Exception
	{
		submit2pressed();
	}
	
	public void go_back(ActionEvent event) throws IOException
	{
		back();
	}
	
	
	private void submit2pressed() throws Exception
	{
		Test1 obj=new Test1();
		obj.updateproc(procedure.getText());		
	}

	
	
	private void back() throws IOException
	{
		Main m= new Main();

		m.changeScene("Test.fxml");
		
	
	}

	

}
