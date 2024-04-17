
package main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import models.ViewTransitionModel;
import models.FeedModel;
import models.JobsModel;
import models.UserModel;
import Views.LoginController;
import Views.UserController;

public class Main extends Application
{

  @Override
  public void start(Stage stage) throws Exception
  {
    UserModel model = new UserModel(stage);
    FeedModel FeedModel = new FeedModel(stage);
    JobsModel JobsModel = new JobsModel(stage);
    
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(Main.class.getResource("../Views/LoginView.fxml"));
    BorderPane view = loader.load();
    LoginController cont = loader.getController();
    ViewTransitionModel vm =new ViewTransitionModel(view,model, stage, FeedModel, JobsModel); 
    cont.setModel(vm, model);
    
    
    Scene s = new Scene(view);
    stage.setScene(s);
    stage.show();
   }

  
  public static void main(String [] args)
  {
    launch(args);
  }
  
}
