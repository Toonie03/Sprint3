package models;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;

public class FeedModel 
{
	Stage stage;
	StringProperty UserName = new SimpleStringProperty();
	StringProperty PostTitle = new SimpleStringProperty();
	StringProperty PostContent = new SimpleStringProperty();
	StringProperty PostDate = new SimpleStringProperty();
	StringProperty ExternalWebLink = new SimpleStringProperty();
	
	public FeedModel(Stage givenStage)
	{
		stage = givenStage;
	}
	
	public void setUserName(String str)
	{
		UserName.setValue(str);
	}
	
	public void setPostTitle(String str)
	{
		PostTitle.setValue(str);
	}
	
	public void setPostContent(String str)
	{
		PostContent.setValue(str);
	}
	
	public void setPostDate(String str)
	{
		PostDate.setValue(str);
	}
	
	public void setExternalWebLink(String str)
	{
		ExternalWebLink.setValue(str);
	}
	
	public StringProperty getUserName()
	{
		setUserName("michael.bradshaw");
		return UserName;
	}
	
	public StringProperty getPostTitle()
	{
		setPostTitle("CSC Classes are full!");
		return PostTitle;
	}
	
	public StringProperty getPostContent()
	{
		setPostContent("Attention students, all seats for Data Structures are now full."
				+ "Please check out our other course offerings below.");
		return PostContent;
	}
	
	public StringProperty getPostDate()
	{
		setPostDate("4/17/24");
		return PostDate;
	}
	
	public StringProperty getExternalWebLink()
	{
		setExternalWebLink("https://www.centre.edu/academics/course-catalog");
		return ExternalWebLink;
	}
	
	
	public void populatePage()
	{
		
	}
	
	
}







