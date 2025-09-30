module dk.easv.extendedcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.extendedcalculator to javafx.fxml;
    exports dk.easv.extendedcalculator;
    exports dk.easv.extendedcalculator.controllers;
    opens dk.easv.extendedcalculator.controllers to javafx.fxml;
}