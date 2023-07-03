package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Bill implements Initializable
{
	public Bill()
	{
		
	}
	
	@FXML
	private Label proc_price;
	
	@FXML
	private Label doc_price;
	
	@FXML
	private Label total;
	
	@FXML
	private Button back;

	
	public void pressback(ActionEvent event) throws Exception
	{
		backpressed();
	}
	
	public void backpressed() throws IOException
	{
		Main m=new Main();
		m.changeScene("Menu.fxml");
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{

		int tests=500*Database.count_tests;
		int docfees=1000*Database.count_doctor;
		if(Database.count_tests==0 || Database.count_doctor==0)
		{
			tests=500;
			docfees=1000;
		}
		proc_price.setText(Integer.toString(tests));
		doc_price.setText(Integer.toString(docfees));
		total.setText(Integer.toString(tests+docfees));
		
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
