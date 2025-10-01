package dk.easv.extendedcalculator.controllers;

// Java imports
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class HelloController {

    private String operator = "plus";
    private double input1;
    private double input2;
    private double result;

    @FXML
    private Button btnDivide;

    @FXML
    private Button btnDumb;

    @FXML
    private Button btnEight;

    @FXML
    private Button btnEquals;

    @FXML
    private Button btnFive;

    @FXML
    private Button btnFour;

    @FXML
    private Button btnMinus;

    @FXML
    private Button btnModulo;

    @FXML
    private Button btnMultiply;

    @FXML
    private Button btnNine;

    @FXML
    private Button btnOne;

    @FXML
    private Button btnPlus;

    @FXML
    private Button btnSeven;

    @FXML
    private Button btnSix;

    @FXML
    private Button btnThree;

    @FXML
    private Button btnTwo;

    @FXML
    private Button btnZero;

    @FXML
    private TextArea txtArea;

    @FXML
    void onBtnNineClick(ActionEvent event) {
        txtArea.setText(txtArea.getText() + "9");
    }

    @FXML
    void onBtnEightClick(ActionEvent event) {
        txtArea.setText(txtArea.getText() + "8");
    }

    @FXML
    void onBtnSevenClick(ActionEvent event) {
        txtArea.setText(txtArea.getText() + "7");
    }

    @FXML
    void onBtnSixClick(ActionEvent event) {
        txtArea.setText(txtArea.getText() + "6");
    }

    @FXML
    void onBtnFiveClick(ActionEvent event) {
        txtArea.setText(txtArea.getText() + "5");
    }

    @FXML
    void onBtnFourClick(ActionEvent event) {
        txtArea.setText(txtArea.getText() + "4");
    }

    @FXML
    void onBtnThreeClick(ActionEvent event) {
        txtArea.setText(txtArea.getText() + "3");
    }

    @FXML
    void onBtnTwoClick(ActionEvent event) {
        txtArea.setText(txtArea.getText() + "2");
    }

    @FXML
    void onBtnOneClick(ActionEvent event) {
        txtArea.setText(txtArea.getText() + "1");
    }

    @FXML
    void onBtnZeroClick(ActionEvent event) {txtArea.setText(txtArea.getText() + "0");}

    @FXML
    void onBtnDumbClick(ActionEvent event) {
        if (Double.parseDouble(txtArea.getText()) > 0){
            txtArea.setText("-"+txtArea.getText());
        }
        else if (Double.parseDouble(txtArea.getText()) < 0) {
            String text = txtArea.getText();
            text = text.replace("-","");
            txtArea.setText(text);
        }
    }

    @FXML
    void onBtnCClick(ActionEvent event) {
        txtArea.clear();
        input1 = 0;
        input2 = 0;
    }

    @FXML
    void onBtnCommaClick(ActionEvent event) {
        txtArea.setText(txtArea.getText() + ".");
    }

    @FXML
    void onBtnPlusClick(ActionEvent event) {
        operator = "plus";
        input1 = Double.parseDouble(txtArea.getText());
        txtArea.clear();
    }

    @FXML
    void onBtnMinusClick(ActionEvent event) {
        operator = "minus";
        input1 = Double.parseDouble(txtArea.getText());
        txtArea.clear();
    }

    @FXML
    void onBtnMultiplyClick(ActionEvent event) {
        operator = "multiply";
        input1 = Double.parseDouble(txtArea.getText());
        txtArea.clear();
    }

    @FXML
    void onBtnDivideClick(ActionEvent event) {
        operator = "divide";
        input1 = Double.parseDouble(txtArea.getText());
        txtArea.clear();
    }

    @FXML
    void onBtnModuloClick(ActionEvent event) {
        operator = "modulo";
        input1 = Double.parseDouble(txtArea.getText());
        txtArea.clear();
    }

    @FXML
    void onBtnEqualsClick(ActionEvent event) {
        input2 = Double.parseDouble(txtArea.getText());
        if(operator.equals("divide")){
            result = input1 / input2;
        } else if(operator.equals("multiply")){
            result =  input1 * input2;
        } else if(operator.equals("plus")){
            result =  input1 + input2;
        } else if(operator.equals("minus")){
            result =  input1 - input2;
        } else if(operator.equals("modulo")){
            result =  input1 % input2;
        }

        txtArea.setText(String.valueOf(result));
    }


}
