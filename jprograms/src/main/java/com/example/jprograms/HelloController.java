package com.example.jprograms;


import java.util.Random;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class HelloController {

    private boolean isPureString(String d) {
        return d == null || !d.matches("-?\\d+");
    }

    @FXML
    private Text text;

    Random r=new Random();

    @FXML
    private TextField enter;

    int c=r.nextInt(10);

    @FXML
    void click(MouseEvent event) {

        String d=enter.getText();

        if (d == null || d.trim().isEmpty() || isPureString(d) || Integer.parseInt(d)>=10) {
            text.setText("Please enter a number!");
        }



        else if(Integer.parseInt(d)==c){
            text.setText("You are correct");
        }
        else if(Integer.parseInt(d)<c){
            text.setText("Higher");

        }

        else {
            text.setText("Lower");

        }


    }



}