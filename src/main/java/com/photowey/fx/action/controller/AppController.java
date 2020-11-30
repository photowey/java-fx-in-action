package com.photowey.fx.action.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * AppController
 *
 * @author photowey
 * @date 2020/11/24
 * @since 1.0.0
 */
public class AppController {

    @FXML
    private Button btn;
    @FXML
    private Label label;

    @FXML
    public void onButtonClick(ActionEvent event) {
        this.label.setText("Text");
        this.btn.setText("I am dynamic Text");

        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Title");
        alert.setHeaderText("HeaderText");
        alert.setContentText("ContentText");

        alert.show();
    }
}
