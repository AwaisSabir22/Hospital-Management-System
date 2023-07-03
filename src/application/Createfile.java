package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Createfile 
{
    public Createfile()
    {
    	
    	
    }
    
	
	@FXML
	private Button back;
	
	@FXML
	private TextField name;
	
	@FXML
	private TextField id;
	
	@FXML
	private TextField age;
	
	@FXML
	private Button save;
	
	@FXML
	private Label done;
	
	@FXML
	private Label id_authenticate;
	
	public void presssave(ActionEvent event) throws Exception
	{
		savepressed();
	}

	
	public void pressback(ActionEvent event) throws IOException
	{
		backpressed();
	}
	
	
	private void savepressed() throws Exception
	{
		int idtosend=Integer.parseInt(id.getText());
		Hospital obj1=new Hospital();
		boolean check=obj1.authenticate_id(idtosend);
		if(check==true)
		{
			id_authenticate.setText("Continue");
			int agetosend=Integer.parseInt(age.getText());
			 
			
			Hospital obj=new Hospital();
			obj.details(idtosend, agetosend, name.getText());
			
			Hospital obj2=new Hospital();
			int fileno=obj2.getfileno(idtosend);
			String file=Integer.toString(fileno);
			String display="Patient inserted successfully! The new patient file no is : ";
			display=display.concat(file);
			
			done.setText(display);
		}
		else
		{
			id_authenticate.setText("ID already exists");
		}
		
	}
	
	
	private void backpressed() throws IOException
	{
		Main m= new Main();

		m.changeScene("Menu.fxml");
	
	}
		
	
	
	
}
