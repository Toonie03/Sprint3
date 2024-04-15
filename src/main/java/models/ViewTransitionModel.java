
package models;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import Views.UserController;

public class ViewTransitionModel implements ViewTransitionModelInterface
{

  BorderPane mainview;
  UserModel model;
  
  public ViewTransitionModel(BorderPane view,UserModel newModel)
  {
    mainview = view;
    model = newModel;
  }
  
  
  
  @Override
  public void showUser()
  {
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(ViewTransitionModel.class
        .getResource("../Views/UserView.fxml"));
    try {
      Pane view = loader.load();
      mainview.setCenter(view);
      UserController cont = loader.getController();
//      cont.setModel(model);
      
      
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

  @Override
  public void showHome()
  {



  }
  
  @Override
  public void showJobs()
  {
	  
  }
  
  @Override
  public void showSettings()
  {
	  
  }

}
