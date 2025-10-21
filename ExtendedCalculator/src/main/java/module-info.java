module dk.easv.extendedcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.extendedcalculator to javafx.fxml;
    exports dk.easv.extendedcalculator;
    //exports dk.easv.extendedcalculator.gui;
    opens dk.easv.extendedcalculator.gui to javafx.fxml;
    exports dk.easv.extendedcalculator.bll;
    opens dk.easv.extendedcalculator.bll to javafx.fxml;
}