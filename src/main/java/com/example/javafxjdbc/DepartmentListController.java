package com.example.javafxjdbc;

import com.example.javafxjdbc.model.entities.Department;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class DepartmentListController implements Initializable {

    @FXML
    private TableView<Department> tableViewDepartments;

    @FXML
    private TableColumn<Department, Integer> tableColumnId;

    @FXML
    private TableColumn<Department, String> tableColumnName;

    @FXML
    private Button btNew;

    @FXML
    public void onBtNewAction(){
        System.out.println("On bt new action");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initializeNodes();
    }

    private void initializeNodes() {
        //padrão para inicializar comportamento das colunas.
        tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tableColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));

        //pega referencia da janela (fazer downcasting pra Stage
        Stage stage = (Stage) MainApp.getMainScene().getWindow();
        //truque para fazer o table view acompanhar o tamanho da janela
        tableViewDepartments.prefHeightProperty().bind(stage.heightProperty());
    }
}
