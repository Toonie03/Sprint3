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
//
//	Bindings.bindBidirectional(UserNameLabel.textProperty(),
//  	        model.getUserName());
//      
//      	Bindings.bindBidirectional(JobTitleLabel.textProperty(),
//    	        model.getJobTitle());
//      
//      	Bindings.bindBidirectional(PostContentLabel.textProperty(),
//    	        model.getJobPost());
//      
//      	Bindings.bindBidirectional(ExternalWebLinkLabel.textProperty(),
//    	        model.getJobLink());
	}
//
//	@FXML
//        private Label UserNameLabel;
//	    
//        @FXML
//	private Label JobTitleLabel;
//	    
//	@FXML
//	private Label JobPostLabel;
//	
//	@FXML
//	private Label JobLinkLabel;
	
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
