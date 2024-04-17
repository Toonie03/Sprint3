
package models;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;

public class UserModel
{
  Stage stage;
  StringProperty FirstName;
  StringProperty LastName;
  StringProperty WholeName = null;
  public UserModel(Stage givenStage)
  {
    stage = givenStage;
  }
  
  public StringProperty getName()
  {
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
  
  public void populatePage()
  {
	  
  }

  
}
