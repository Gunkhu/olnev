package dev.tanto;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NameController {



    @FXML
    private Label countNameLabel;

    @FXML
    private TextField huNameField;

    @FXML
    private TextField itNameField;

    @FXML
    void initialize(){
        System.out.println("tölt....");
        Integer size = App.nameDictList.size();
        countNameLabel.setText(size.toString());
    }


    @FXML
    void onClickBackButton(ActionEvent event) {
        App.setRoot("mainScene");
    }

    @FXML
    void onClickSearchButton(ActionEvent event) {
        System.out.println(App.nameDictList.get(0).getHuName());
        String searchName = huNameField.getText();
        for (NameDict nameDict : App.nameDictList) {
        if (searchName.equals(nameDict.getHuName())) {
            if (nameDict.getItName().equals("-")) {
                itNameField.setText("ez minusz");
            } else {
                itNameField.setText(nameDict.getItName());
            }
            return;
        }
        itNameField.setText("Nincs ilyen név");
    }

    }
}


