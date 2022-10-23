package com.example.assignment7;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        interest.setItems(FXCollections.observableArrayList("3.00", "3.50", "4.00", "4.50", "5.00", "5.50", "6.00", "6.50", "7.00"));
    }

    public double anual = 0;
    @FXML
    private Label AMMOUNT;

    @FXML
    private CheckBox AUTOWITH;


    @FXML
    private Button CALC;
    @FXML
    public void calc(ActionEvent e) {
        int years = 0;
        if (num1.isSelected()) {
            years = 1;
        } else if (num2.isSelected()) {
            years = 2;
        } else if (num3.isSelected()) {
            years = 3;
        } else if (num4.isSelected()) {
            years = 4;
        } else if (num5.isSelected()) {
            years = 5;

        } else if (num6.isSelected()) {
            years = 6;

        } else if (num7.isSelected()) {
            years = 7;
        } else if (num8.isSelected()) {
            years = 8;
        } else if (num9.isSelected()) {
            years = 9;
        } else if (num10.isSelected()) {
            years = 10;

        } else if (num11.isSelected()) {
            years = 11;

        } else if (num12.isSelected()) {
            years = 12;

        } else if (num13.isSelected()) {
            years = 13;
        } else if (num14.isSelected()) {
            years = 14;
        } else if (num15.isSelected()) {
            years = 15;
        } else if (num16.isSelected()) {
            years = 16;
        } else if (num17.isSelected()) {
            years = 17;
        } else if (num18.isSelected()) {
            years = 18;

        } else if (num19.isSelected()) {
            years = 19;

        } else if (num20.isSelected()) {
            years = 10;
        }
        double R = 0;
        if (interest.getValue() == "3.00") {
            R = .03;
        } else if (interest.getValue() == "3.50") {
            R = .035;
        } else if (interest.getValue() == "4.00") {
            R = .04;
        } else if (interest.getValue() == "4.50") {
            R = .045;
        } else if (interest.getValue() == "5.00") {
            R = .05;
        } else if (interest.getValue() == "5.50") {
            R = .055;
        } else if (interest.getValue() == "6.00") {
            R = .06;
        } else if (interest.getValue() == "6.50") {
            R = .065;
        } else if (interest.getValue() == "7.00") {
            R = .07;
        }
        double loan = 0;
        if (YES.isSelected()) {
            anual = 0;
        } else {
            loan = Double.parseDouble(Loanamm.getText());


            anual = (R * loan) / (1 - Math.pow(1 + R, -years));
        }


        if (MISS.isSelected()) {
            anual = (anual - (anual * .0025));
        }
        if (AUTOWITH.isSelected()) {
            anual = (anual - (anual * .0025));
        }
        AMMOUNT.setText(Double.toString(anual));


    }

    @FXML
    private TextField Loanamm;

    @FXML
    private CheckBox MISS;

    @FXML
    private RadioButton No;

    @FXML
    private RadioButton YES;

    @FXML
    private ComboBox<String> interest;

    @FXML
    private RadioButton num1;

    @FXML
    private RadioButton num10;

    @FXML
    private RadioButton num11;

    @FXML
    private RadioButton num12;

    @FXML
    private RadioButton num13;

    @FXML
    private RadioButton num14;

    @FXML
    private RadioButton num15;

    @FXML
    private RadioButton num16;

    @FXML
    private RadioButton num17;

    @FXML
    private RadioButton num18;

    @FXML
    private RadioButton num19;

    @FXML
    private RadioButton num2;

    @FXML
    private RadioButton num20;

    @FXML
    private RadioButton num3;

    @FXML
    private RadioButton num4;

    @FXML
    private RadioButton num5;

    @FXML
    private RadioButton num6;

    @FXML
    private RadioButton num7;

    @FXML
    private RadioButton num8;

    @FXML
    private RadioButton num9;
}