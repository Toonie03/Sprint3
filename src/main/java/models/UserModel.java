
package models;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;

public class UserModel
{
  Stage stage;
  StringProperty FirstName = new SimpleStringProperty();
  StringProperty LastName = new SimpleStringProperty();
  StringProperty WholeName = new SimpleStringProperty();
  StringProperty Bio = new SimpleStringProperty();
  IntegerProperty Followers = new SimpleIntegerProperty();
  IntegerProperty Following = new SimpleIntegerProperty();
  public UserModel(Stage givenStage)
  {
    stage = givenStage;
  }
  
  public StringProperty getName()
  {
	  setFirstName("John");
	  setLastName("Doe");
	  WholeName.set(FirstName.get()+" "+LastName.get());
	  return WholeName;
  }
  
  public void setFirstName(String str)
  {
	  FirstName.setValue(str);
  }
  
  public void setLastName(String str)
  {
	  LastName.setValue(str);
  }
  
  public void setBio(String str)
  {
	  Bio.setValue(str);
  }
  
  public StringProperty getBio()
  {
	  setBio("I am a computer scientist with a heavy interest in chemestry");
	  return Bio;
  }
  
  public IntegerProperty getFollowers()
  {
	  Followers.setValue(5);
	  return Followers;
  }
  public IntegerProperty getFollowing()
  {
	  Following.setValue(10);
	  return Following;
  }
  public void populatePage()
  {
	  
  }

  
}
