package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class openController {

    @FXML
    private TextField fileNameField;

    @FXML
    private Button selectFileButton;

    @FXML
    void fileName(ActionEvent event) {
    //User will be prompted to enter the name or path of the file they wish to open
    }

    @FXML
    void selectFile(ActionEvent event) {
    //User can hit select once they are done typing
    }

}
