package com.example.kursumokymosisistema;

import com.example.kursumokymosisistema.fxcontrollers.ProjectTest;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TESTFORM2 implements Initializable {


    public TextField name;
    public DatePicker datecreated;
    public TextArea descrip;
    public ListView projectList;


    private ArrayList<ProjectTest> allPrj = new ArrayList<>();


    public void createProject(ActionEvent actionEvent) {

        ProjectTest projectTest = new ProjectTest(name.getText(), descrip.getText(), datecreated.getValue());
        allPrj.add(projectTest);

        projectList.getItems().addAll(projectTest);
        projectList.refresh();

        name.clear();
        descrip.clear();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        projectList.getItems().clear();
        projectList.getItems().addAll(allPrj);
    }
}
