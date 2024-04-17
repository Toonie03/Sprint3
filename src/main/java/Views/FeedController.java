package Views;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import models.FeedModel;
import models.ViewTransitionModelInterface;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.util.StringConverter;
import  javafx.util.converter.*;

public class FeedController
{
  
    FeedModel model;
    ViewTransitionModelInterface ViewModel;

  
    public void setModel(ViewTransitionModelInterface newViewModel, FeedModel newModel)
    {
      ViewModel=newViewModel;
      model = newModel;
      
      Bindings.bindBidirectional(UserNameLabel.textProperty(),
  	        model.getUserName());
      
      Bindings.bindBidirectional(PostTitleLabel.textProperty(),
    	        model.getPostTitle());
      
      Bindings.bindBidirectional(PostContentLabel.textProperty(),
    	        model.getPostContent());
      
      Bindings.bindBidirectional(PostDateLabel.textProperty(),
    	        model.getPostDate());
      
      Bindings.bindBidirectional(ExternalWebLinkLabel.textProperty(),
    	        model.getExternalWebLink());
    }
    

   
    @FXML
    private Label UserNameLabel;
    
    @FXML
    private Label PostTitleLabel;
    
    @FXML
    private Label PostContentLabel;
    	
    @FXML
    private Label PostDateLabel;

    @FXML
    private Label ExternalWebLinkLabel;

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