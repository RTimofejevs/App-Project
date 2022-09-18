package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import models.Member;
import models.RandomUser;
import models.RandomUserModel;

public class MainController implements Initializable {
	@FXML
	private TableView<Member> tbVMembers;
	
	@FXML
	private TableColumn<Member,String> tcName;
	@FXML
	private TableColumn<Member,String> tcSurname;
	@FXML
	private TableColumn<Member,String> tcPhone;
	@FXML
	private TableColumn<Member,String> tcEmail;
	@FXML
	private TableColumn<Member,String> tcAction;
	@FXML
	private Button btnAdd,btnImport,btnExport;
	
	private ObservableList<Member> data = FXCollections.observableArrayList();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		tcName.setCellValueFactory(new PropertyValueFactory<>("Name"));;
		tcSurname.setCellValueFactory(new PropertyValueFactory<>("Surname"));
		tcPhone.setCellValueFactory(new PropertyValueFactory<>("Phone"));
		tcEmail.setCellValueFactory(new PropertyValueFactory<>("Email"));	
		tcAction.setCellValueFactory(new PropertyValueFactory<>("Action"));
		try {
			RandomUser.fetchRandomUserList(30, list -> {
				for(RandomUserModel f: list) {
					data.add(new Member(f.getFirstName(),f.getLastName(),f.getPhoneNumber(),f.getEmail(),"Block"));
				}
			});
		} catch(Exception e) {
			e.printStackTrace();
		}
		tbVMembers.setItems(data);
		
	}
	
	  @FXML
	    void handleButtonClick(ActionEvent event) {
		  	if(event.getSource() == btnAdd) {
		  		showDialog("/fxml/AddNew.fxml");
		  	}
		  	if(event.getSource() == btnImport) {
		  		showDialog("/fxml/Import.fxml");
		  	}
		  	if(event.getSource() == btnExport) {
		
		  	}
		  	
	    }
	  
	  private void showDialog(String fxml) {
		 try {
			 Parent root = FXMLLoader.load(getClass().getResource(fxml));
			 Stage stage = new Stage();
			 Scene scene = new Scene(root);
			 stage.setScene(scene);
			 stage.show();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	  }


}
