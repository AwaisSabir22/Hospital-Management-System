package application;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Confirmation implements Initializable
{
	 public Confirmation()
	    {
		 	
	    	
	    }
	    
		
		@FXML
		private Button submit;
		
		@FXML
		private Button back;
		
		@FXML
		private Label patient_id;
		
		@FXML
		private Label doctor_id;
		
		@FXML
		private Label slot_day;
		

		public void pressback(ActionEvent event) throws Exception
		{
			backpressed();
		}
		public void return_back(ActionEvent event) throws Exception
		{
			returnback();
		}
		
		private void backpressed()throws Exception
		{
			Database obj=new Database();
			obj.removeslot();
			Main m=new Main();
			m.changeScene("Schedule.fxml");
		}
		
		private void returnback() throws Exception
		{

			Main m= new Main();

			m.changeScene("Menu.fxml");
		
		}

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) 
		{
			String patid="File Number :";
			String docid="Doctor ID :";
			String day="Slot :";
			try 
			{
				AppointmentControl obj=new AppointmentControl();
				String res=obj.confirmdetails();
				StringTokenizer st = new StringTokenizer(res," ");
				patid=patid.concat(st.nextToken());
				docid=docid.concat(st.nextToken());
				day=day.concat(st.nextToken());
				patient_id.setText(patid);
				doctor_id.setText(docid);
				slot_day.setText(day);
				
			}
		 catch (Exception e1)
		 {
			 
			 
		 }
			
		}

}
