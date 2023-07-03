package application;




import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Login 
{
    public Login()
    {
    	
    	
    }
    
	
	@FXML
	private Button login;
	
    @FXML
    private Label wronglogin;
    
	@FXML
	private TextField username;
	
	@FXML
	private PasswordField password;
	
	public void loginpress(ActionEvent event) throws IOException
	{
		logincheck();
	}
	
	private void logincheck() throws IOException
	{
		Main m= new Main();
		if(username.getText().toString().equals("admin") && password.getText().toString().equals("123"))
		{
			m.changeScene("Menu.fxml");
		}
		   else if(username.getText().isEmpty() && password.getText().isEmpty()) 
		   {
	            wronglogin.setText("Please enter your data.");
	       }
	        else 
	        {
	            wronglogin.setText("Wrong username or password!");
	        }
	}
		
	
	
	
}
