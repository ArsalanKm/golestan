package Controller.Student;

import Model.pageLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.text.TextFlow;

import java.io.IOException;
import static Controller.Student.Controller.Loggedstudent;


public class StudentChoosenClasses {
@FXML
    ListView listView;
@FXML
    Button BackBtm;
@FXML
    TextFlow ClassesList;
    @FXML
    TextArea StudentTextArea;
    @FXML
    ListView<String> classeslist;
public void initialize()
{
    classeslist.getItems().addAll(Loggedstudent.classes);}
public void back() throws IOException {
    new pageLoader().LoadScene("../Vieww/StudentsPanel/studentPanel.fxml");

}
}
