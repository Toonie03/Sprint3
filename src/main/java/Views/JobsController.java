package Views;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import models.JobsModel;
import models.UserModel;
import models.ViewTransitionModelInterface;

public class JobsController {
	
	JobsModel model;
    ViewTransitionModelInterface ViewModel;

  
    public void setModel(ViewTransitionModelInterface newViewModel, JobsModel newModel)
    {
      ViewModel=newViewModel;
      model = newModel;
   
    }
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
