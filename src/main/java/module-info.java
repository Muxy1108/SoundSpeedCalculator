module com.example.soundspeedcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.soundspeedcalculator to javafx.fxml;
    exports com.example.soundspeedcalculator;
}