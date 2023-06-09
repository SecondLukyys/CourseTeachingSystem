package com.example.kursumokymosisistema.fxcontrollers;

import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Tab;

import java.net.URL;
import java.util.ResourceBundle;

public class TestForm implements Initializable {

///<TabPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0" tabClosingPolicy="UNAVAILABLE" xmlns:fx="http://javafx.com/fxml/1" xmlns="http://javafx.com/javafx/17" fx:controller="com.example.kursumokymosisistema.fxcontrollers.TestForm">
    ///WARNING: Loading FXML document with JavaFX API of version 17 by JavaFX runtime of version 16
    public Tab adminTools;
    public ChoiceBox choiceBox1;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        adminTools.setDisable(true);
        choiceBox1.getItems().addAll("var1", "var2");
        choiceBox1.getSelectionModel().getSelectedItem();

    }



}
