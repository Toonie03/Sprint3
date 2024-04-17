
package models;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import Views.FeedController;
import Views.JobsController;
import Views.UserController;

public class ViewTransitionModel implements ViewTransitionModelInterface
{

  BorderPane mainview;
  UserModel UserModel;
  Stage stage;
  FeedModel FeedModel;
  JobsModel JobsModel;
  
  public ViewTransitionModel(BorderPane view,UserModel newModel, Stage newStage, FeedModel newFeed, JobsModel newJobs)
  {
    mainview = view;
    UserModel = newModel;
    stage = newStage;
    FeedModel = newFeed;
    JobsModel = newJobs;
  }
  
  
  
  @Override
  public void showUser()
  {
	FXMLLoader loader = new FXMLLoader();
    loader.setLocation(ViewTransitionModel.class
        .getResource("../Views/UserView.fxml"));
    try {
      Pane view = loader.load();
      UserController cont = loader.getController();
      cont.setModel(this,UserModel);
      Scene s = new Scene(view);
      stage.setScene(s);
      stage.show();
      
      
      
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

  @Override
  public void showHome()
  {

	    FXMLLoader loader = new FXMLLoader();
	    loader.setLocation(ViewTransitionModel.class
	        .getResource("../Views/FeedView.fxml"));
	    try {
	      Pane view = loader.load();
	      FeedController cont = loader.getController();
	      cont.setModel(this,FeedModel);
	      Scene s = new Scene(view);
	      stage.setScene(s);
	      stage.show();
	      
	      
	      
	    } catch (IOException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	      

  }
  
  @Override
  public void showJobs()
  {
	    FXMLLoader loader = new FXMLLoader();
	    loader.setLocation(ViewTransitionModel.class
	        .getResource("../Views/JobView.fxml"));
	    try {
	      Pane view = loader.load();
	      FeedController cont = loader.getController();
	      cont.setModel(this,FeedModel);
	      Scene s = new Scene(view);
	      stage.setScene(s);
	      stage.show();
	      
	      
	      
	    } catch (IOException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
  }
  
  @Override
  public void showSettings()
  {
//	    FXMLLoader loader = new FXMLLoader();
//	    loader.setLocation(ViewTransitionModel.class
//	        .getResource("../Views/UserView.fxml"));
//	    try {
//	      Pane view = loader.load();
//	      UserController cont = loader.getController();
//	      Scene s = new Scene(view);
//	      stage.setScene(s);
//	      stage.show();
  }

}
