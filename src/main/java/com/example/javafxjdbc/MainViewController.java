package com.example.javafxjdbc;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    private MenuItem menuItemSeller;

    @FXML
    private MenuItem getMenuItemDepartment;

    @FXML
    private MenuItem getMenuItemAbout;

    @FXML
    public void onMenuItemDepartmentAction(){
        System.out.println("onMenuItemDepartment");
    }
    @FXML
    public void onMenuItemSellerAction(){
        System.out.println("onMenuItemSellerAction");
    }
    @FXML
    public void onMenuItemAboutAction(){
        System.out.println("getMenuItemAbout");
    }

    @Override
    public void initialize(URL uri, ResourceBundle rb) {

    }
}
