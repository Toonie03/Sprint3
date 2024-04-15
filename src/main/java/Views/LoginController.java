package Views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import models.UserModel;
import models.ViewTransitionModelInterface;

public class LoginController
{
  
    ViewTransitionModelInterface ViewModel;
    
    UserModel model;

    @FXML
    private TextField PasswordTextField;

    @FXML
    private TextField UsernameTextField;
    
    public void setModel(ViewTransitionModelInterface newViewModel, UserModel newModel)
    {
      ViewModel=newViewModel;
      model = newModel;
    }
  
    @FXML
    void onClickLogin(ActionEvent event) 
    {
    	if((UsernameTextField.textProperty().get()!="")&&(PasswordTextField.textProperty().get()!=""))
    	{
        	ViewModel.showUser();
    	}
    	System.out.println("Login Clicked");
    }


}
