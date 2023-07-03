package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Test 
{
    public Test()
    {
    	
    	
    }
    
	
	@FXML
	private Button proc;
	
	@FXML
	private Button get;
	
	@FXML
	private Button upload;
	
	@FXML
	private Button back;
	
	public void pressproc(ActionEvent event) throws IOException
	{
		procpressed();
	}
	
	public void pressget(ActionEvent event) throws IOException
	{
		getpressed();
	}
	
	public void pressupload(ActionEvent event) throws IOException
	{
		uploadpressed();
	}
	
	
	public void pressback(ActionEvent event) throws IOException
	{
		backpressed();
	}
	
	private void procpressed() throws IOException
	{
		Main m= new Main();

		m.changeScene("proc.fxml");
		
	}
	
	private void getpressed() throws IOException
	{
		Main m= new Main();

		m.changeScene("getproc.fxml");
		
	}
	
	private void uploadpressed() throws IOException
	{
		Main m= new Main();

		m.changeScene("upload.fxml");
		
	}
	
	private void backpressed() throws IOException
	{
		Main m= new Main();

		m.changeScene("Menu.fxml");
		
	}

}
