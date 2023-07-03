package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class getproc implements Initializable
{
    public getproc()
    {
    	
    	
    }
    
    //public static String user;
    
	@FXML
	private Button return3;
	
	@FXML
	private Label procdisplay;
	
	
	@Override
	 public void initialize(URL url, ResourceBundle rb) 
	 {		 
		try 
			{
				Test1 obj=new Test1();
				String proc=obj.callforproc();
			  	procdisplay.setText(proc);
				
			}
		 catch (Exception e1)
		 {
			 
			 
		 }
	 }
	

	
	
	public void go_back(ActionEvent event) throws IOException
	{
		back();
	}
	
	private void back() throws IOException
	{
		Main m= new Main();

		m.changeScene("Test.fxml");
		
	
	}
	

}
