package dev.tanto;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
// import javafx.scene.Node;
// import javafx.stage.Stage;

public class MainController {

    @FXML
    void onClickAboutButton(ActionEvent event) {
        System.out.println("névjegy....");
        App.setRoot("aboutScene");
    }
    
    @FXML
    void onClickExitButton(ActionEvent event) {
        Platform.exit();
    // Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    // stage.close();
}

    @FXML
    void onClickSearchButton(ActionEvent event) {
        System.out.println("Keresés");
        App.setRoot("nameScene");
    }
    
}
