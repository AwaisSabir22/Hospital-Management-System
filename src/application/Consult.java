package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Consult 
{
    public Consult()
    {
    	
    	
    }
    
    @FXML
    private Button submit;
	
	@FXML
	private Button goback;
	
	@FXML 
	private Button gotoTest;

	@FXML
	private Button gotoMedicine;
	
	@FXML
	private TextArea history;
	
	@FXML
	private TextArea diagnosis;
	
	public void presssubmit(ActionEvent event) throws Exception
	{
		submitpressed();
	}
	
	
	public void pressback2(ActionEvent event) throws IOException
	{
		backpressed2();
	}
	
	public void testgo(ActionEvent event) throws IOException
	{
		testpressed();
	}
	
	public void medicinego(ActionEvent event) throws IOException
	{
		medicinepressed();
		
	}
	
	private void submitpressed() throws Exception
	{
		Consult1 obj=new Consult1();
		obj.setDetails(diagnosis.getText(),history.getText());
		
		System.out.println("Call succeeded");
	}
	
	private void backpressed2() throws IOException
	{
		Main m= new Main();

		m.changeScene("Menu.fxml");
	
	}
	
	private void testpressed() throws IOException
	{
		Main m= new Main();

		m.changeScene("Test.fxml");
	
	}
	
	private void medicinepressed() throws IOException
	{
		Main m= new Main();
		
		m.changeScene("Medicine.fxml");
	}
		

}
