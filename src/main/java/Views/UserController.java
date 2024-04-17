package Views;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import models.UserModel;
import models.ViewTransitionModelInterface;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
public class UserController
{
  
    UserModel model;
    ViewTransitionModelInterface ViewModel;

  
    public void setModel(ViewTransitionModelInterface newViewModel, UserModel newModel)
    {
      ViewModel=newViewModel;
      model = newModel;
      Bindings.bindBidirectional(UsernameLabel.textProperty(),
    	        model.getName());
    }

   

    @FXML
    private Label FollowerTextLabel;

    @FXML
    private Label FollowingTextLabel;
    @FXML
    private Label UsernameLabel;

    @FXML
    void onClickHome(ActionEvent event) {
    	System.out.println("Clicked on Home");
    	ViewModel.showHome();
    }

    @FXML
    void onClickJobs(ActionEvent event) {
    	System.out.println("Clicked on Jobs");
    	ViewModel.showJobs();
    }

    @FXML
    void onClickSearch(ActionEvent event) {

    }

    @FXML
    void onClickUser(ActionEvent event) {
    	System.out.println("Clicked on User");
    	ViewModel.showUser();
    }




}