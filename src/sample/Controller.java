package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    float data = 0f;
    float eye = 0f;
    int operation1 = -1;
    int operation2 = -1;
    @FXML
    private TextField display1;

    @FXML
    private TextField display2;
    @FXML
    private Button sight;

    @FXML
    private Button ac;

    @FXML
    private Button div;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button multiply;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button minus;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button plus;

    @FXML
    private Button dot;

    @FXML
    private Button zero;

    @FXML
    private Button del;

    @FXML
    private Button eq;

    @FXML
    void handleButtonAction(ActionEvent event) {
        String str;
        if (event.getSource() == one) {
            display2.setText(display2.getText() + "1");
        } else if (event.getSource() == two) {
            display2.setText(display2.getText() + "2");
        } else if (event.getSource() == three) {
            display2.setText(display2.getText() + "3");
        } else if (event.getSource() == four) {
            display2.setText(display2.getText() + "4");
        } else if (event.getSource() == five) {
            display2.setText(display2.getText() + "5");
        } else if (event.getSource() == six) {
            display2.setText(display2.getText() + "6");
        } else if (event.getSource() == seven) {
            display2.setText(display2.getText() + "7");
        } else if (event.getSource() == eight) {
            display2.setText(display2.getText() + "8");
        } else if (event.getSource() == nine) {
            display2.setText(display2.getText() + "9");
        } else if (event.getSource() == zero) {
            display2.setText(display2.getText() + "0");
        } else if (event.getSource() == dot) {
            display2.setText(display2.getText() + ".");
        }
        else if (event.getSource() == ac) {
            operation1 = -1;
            operation2 = -1;
            display2.setText("");
            display1.setText("");
        }
        else if (event.getSource() == del) {
            try{

                str = display2.getText();
                str = str.substring(0, str.length() - 1);
                display2.setText(str);
            }
            catch(Exception e){
                System.out.println("errordel");
            }
            operation1 = -1;
        }
        else if (event.getSource() == sight) {
            operation1 = -1;
            operation2 = 1;
            display2.setText("");
            display1.setText("Enter Left Eye Sight");
        }
        if(operation2 == -1) {
            if (event.getSource() == plus) {
                if (display2.getText().equals("")) {

                }
                else {
                    try{
                        data = Float.parseFloat(display2.getText());
                        display1.setText(display2.getText());
                    }
                    catch (Exception e){
                        System.out.println("error3");
                    }
                }
                operation1 = 1; //Addition
                display2.setText("");
            }
            else if (event.getSource() == minus) {
                if (display2.getText().equals("")) {

                } else {
                    try{
                        data = Float.parseFloat(display2.getText());
                        display1.setText(display2.getText());
                    }
                    catch (Exception e){
                        System.out.println("error4");
                    }
                }
                operation1 = 2; //Subtraction
                display2.setText("");
            }
            else if (event.getSource() == multiply) {
                if (display2.getText().equals("")) {

                } else {
                    try{
                        data = Float.parseFloat(display2.getText());
                        display1.setText(display2.getText());
                    }
                    catch (Exception e){
                        System.out.println("error3");
                    }
                }
                operation1 = 3; //multiplication
                display2.setText("");
            }
            else if (event.getSource() == div) {
                if (display2.getText().equals("")) {

                } else {
                    try{
                        data = Float.parseFloat(display2.getText());
                        display1.setText(display2.getText());
                    }
                    catch (Exception e){
                        System.out.println("error3");
                    }
                }
                operation1 = 4; //division
                display2.setText("");
            }
            else if (event.getSource() == eq) {
                try{
                    Float secondOperand = Float.parseFloat(display2.getText());
                    switch (operation1) {
                        case 1: //Addition
                            Float ans = data + secondOperand;
                            display2.setText(String.valueOf(ans));
                            display1.setText("");
                            break;
                        case 2: //Subtraction
                            ans = data - secondOperand;
                            display2.setText(String.valueOf(ans));
                            display1.setText("");
                            break;
                        case 3: //Mul
                            ans = data * secondOperand;
                            display2.setText(String.valueOf(ans));
                            display1.setText("");
                            break;
                        case 4: //Div
                            ans = 0f;
                            try {
                                ans = data / secondOperand;
                            } catch (Exception e) {
                                display2.setText("Error");
                            }
                            display2.setText(String.valueOf(ans));
                            display1.setText("");
                            break;
                    }
                }
                catch(Exception e){
                    System.out.println("Main error");
                }
            }
        }
        else{
            if (event.getSource() == eq) {
                if(operation2 == 1){
                    try{
                        data = Float.parseFloat(display2.getText());
                        operation1 = -1;
                        operation2 = 2;
                        display1.setText("Enter Right Eye Sight");
                        display2.setText("");
                    }
                    catch (Exception e){
                        System.out.println("error");
                    }
                }
                else{
                    try{
                        eye = Float.parseFloat(display2.getText());
                        display1.setText("Maximum distance you can see");
                        float res = eye + data;
                        display2.setText(String.valueOf(res));
                    }
                    catch(Exception e){
                        System.out.println("error2");
                    }
                }
            }
        }
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
