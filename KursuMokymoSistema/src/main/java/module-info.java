module com.example.kursumokymosisistema {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.kursumokymosisistema to javafx.fxml;
    exports com.example.kursumokymosisistema;
    exports com.example.kursumokymosisistema.fxcontrollers;
    opens com.example.kursumokymosisistema.fxcontrollers to javafx.fxml;
}