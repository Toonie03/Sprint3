package Views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import models.ViewTransitionModelInterface;

public class LoginController
{
  
    ViewTransitionModelInterface model;


    @FXML
    private TextField PasswordTextField;

    @FXML
    private TextField UsernameTextField;
    
    public void setModel(ViewTransitionModelInterface newModel)
    {
      model=newModel;
    }
  
    @FXML
    void onClickLogin(ActionEvent event) 
    {
    	if((UsernameTextField.textProperty().get()!="")&&(PasswordTextField.textProperty().get()!=""))
    	{
        	model.showUser();
    	}
    	System.out.println("Login Clicked");
    }


}
