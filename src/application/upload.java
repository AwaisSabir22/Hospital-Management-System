package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class upload 
{

    public upload()
    {
    	
    	
    }
    
	   
    
	@FXML
	private Button return4;
	
	@FXML
	private Button submit4;
	
	@FXML 
	private TextArea result;
	
	public void presssubmit4(ActionEvent event) throws Exception
	{
		submit4pressed();
	}
	

	
	public void go_back(ActionEvent event) throws IOException
	{
		back();
	}
	
	private void submit4pressed() throws Exception
	{
		Test1 obj=new Test1();
		obj.testresults(result.getText());
		
	}
	
	
	private void back() throws IOException
	{
		Main m= new Main();

		m.changeScene("Test.fxml");
		
	
	}
}
