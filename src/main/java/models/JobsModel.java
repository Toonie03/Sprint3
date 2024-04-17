package models;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;


public class JobsModel {

	Stage stage;
	StringProperty UserName = new SimpleStringProperty();
	StringProperty JobTitle = new SimpleStringProperty();
	StringProperty JobPost = new SimpleStringProperty();
	StringProperty JobLink = new SimpleStringProperty();
	
	
	
	public JobsModel(Stage givenStage)
	{
		stage = givenStage;
		
	}
	public StringProperty getUsername()
	{
		setUserName("theson");
		return UserName;
		
	}
	public void setUserName(String str)
	  {
		  UserName.setValue(str);
	  }
	
	
	public StringProperty getJobTitle() {
		setJobTitle("BraveScientist");
		return JobTitle;
	}
	public void setJobTitle(String str) {
		JobTitle.setValue(str);
	}
	
	
	public StringProperty getJobPost() {
		setJobPost("This is the CS depatment of California board of health calling and we want you to help us build a AI which will repsond to History Questions");
		return JobPost;
	}
	public void setJobPost(String string) {
		JobPost.setValue(string);
	}
	public StringProperty getJobLink() {
		setJobLink("centre.edu");
		return JobLink;
	}
	public void setJobLink(String string) {
		JobLink.setValue(string);
	}
	
}

	
