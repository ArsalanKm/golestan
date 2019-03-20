package Controller.Student;

import Model.Student.Student;
import Model.pageLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;


public class Controller extends Student {
    static Student Loggedstudent = new Student();
    @FXML
    public ImageView ing;
    @FXML
    public TextField User, VisiblePasswordfield;
    @FXML
    public PasswordField Pass;
    @FXML
    public CheckBox PassWordShow;
    @FXML
    public AnchorPane page;
    @FXML
    public Button WantToRegister;


    @FXML
    public void Registration(ActionEvent actionEvent) throws IOException {

        new pageLoader().LoadScene("../Vieww/StudentsPanel/RegisteringPage.fxml");
    }

    @FXML
    public void Login(ActionEvent actionEvent) throws IOException {

        for (int i=0;i<All_Student.size();i++) {

            Loggedstudent = All_Student.get(i);
            if (User.getText().equals(Loggedstudent.getUsername()) && (Pass.getText().equals(Loggedstudent.getPassword())) || VisiblePasswordfield.getText().equals(Loggedstudent.getPassword())) {
                new pageLoader().LoadScene("../Vieww/StudentsPanel/studentPanel.fxml");
break;
            }
        }


    }

    public void displayPassword() {
        if (PassWordShow.isSelected()) {
            VisiblePasswordfield.setText(Pass.getText());
            VisiblePasswordfield.setVisible(true);
            Pass.setVisible(false);


        } else {
            Pass.setText(VisiblePasswordfield.getText());
            VisiblePasswordfield.setVisible(false);
            Pass.setVisible(true);
        }
    }

}