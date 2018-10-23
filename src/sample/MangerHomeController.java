package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MangerHomeController {

  public Button buttonNewGuestAccount;
  public Button buttonFloorChart;
  public Button buttonAllRequests;
  public Button buttonEmployees;
  
  //these are request radio buttons - they suppose to disappear when req is done
  public CheckBox radio1;           
  public CheckBox radio2;
  public CheckBox radio3;
  public CheckBox radio4;
  //when this button is clicked - radio disappears
  public Button buttonDone;
  
  

  public void buttonNewGuestAccount(ActionEvent actionEvent) {
  }

  public void viewFloorChart(ActionEvent actionEvent) {
  }

  public void viewAllRequests(ActionEvent actionEvent) {
  }

  public void viewAllEmployees(ActionEvent actionEvent) {
  }

  public void RequestIsDone(ActionEvent actionEvent) {
  }
}
