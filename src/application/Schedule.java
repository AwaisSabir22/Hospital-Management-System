package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Schedule  implements Initializable
{
    public Schedule()
    {
    	
    	
    }
    
	@FXML
	private TextField taking_id;
    
	@FXML
	private Button done;
	
	@FXML
	private Button back;
	
	@FXML
	private TableView<DoctorsTable> table;
	
	@FXML
	private TableColumn<DoctorsTable,String> col_id;
	
	@FXML
	private TableColumn<DoctorsTable,String> col_name;
	
	@FXML
	private TableColumn<DoctorsTable,String> col_specialization;

	
	public void idselect(ActionEvent event) throws Exception
	{
		idselected();
	}
	
	public void pressback(ActionEvent event) throws Exception
	{
		backpressed();
	}
	
	public void idselected() throws Exception
	{
		Main m= new Main();
		int doctorid=Integer.parseInt(taking_id.getText());
		AppointmentControl obj=new AppointmentControl();
		obj.sendID(doctorid);
		
		m.changeScene("Doctorsinfo.fxml");
		
	}
	
	public void backpressed() throws IOException
	{
		Main m=new Main();
		m.changeScene("appointment.fxml");
		
	}

	ObservableList<DoctorsTable> oblist=FXCollections.observableArrayList();
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		
		try {
			Connection con=Database.getConnection();
			ResultSet res=con.createStatement().executeQuery("select * from Doctor");
			
			while(res.next())
			{
				oblist.add(new DoctorsTable(res.getString("ID"),res.getString("Name"),res.getString("Specialization")));
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Logger.getLogger(Schedule.class.getName()).log(Level.SEVERE,null,e);
		}
		
		
		// TODO Auto-generated method stub
		col_id.setCellValueFactory(new PropertyValueFactory<>("ID"));
		col_name.setCellValueFactory(new PropertyValueFactory<>("Name"));
		col_specialization.setCellValueFactory(new PropertyValueFactory<>("Specialization"));
		
		table.setItems(oblist);
		
		
		
	}

}
