package com.photowey.fx.action.launcher;


import com.photowey.fx.action.util.JavaFxUtils;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FX App
 *
 * @author photowey
 * @date 2020/11/24
 * @since 1.0.0
 */
public class Launcher extends Application {

    /**
     * init
     *
     * @throws Exception
     */
    @Override
    public void init() throws Exception {
        super.init();
    }

    /**
     * start
     *
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        JavaFxUtils.handleDefaultStart(primaryStage);
        // this.handleGroupStart(primaryStage);

        JavaFxUtils.populateTitleAndIconAndShow(primaryStage);
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }

    private void handleGroupStart(Stage primaryStage) {
        Button button1 = new Button();
        Button button2 = new Button();
        Button button3 = new Button();

        this.populateButton(button1, 0, 10, 80, 20, "button1");
        this.populateButton(button2, 100, 20, 80, 20, "button2");
        this.populateButton(button3, 200, 30, 150, 20, "button3");

        button3.setOnAction(event -> {
            ((Button) event.getSource()).setText("I am dynamic Text");
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Title");
            alert.setHeaderText("HeaderText");
            alert.setContentText("ContentText");

            alert.show();
        });

        Group group = new Group();
        group.getChildren().addAll(button1, button2, button3);

        primaryStage.setScene(new Scene(group, 900, 600));
    }

    private void populateButton(Button button, int x, int y, double width, double height, String buttonText) {
        button.setLayoutX(x);
        button.setLayoutY(y);
        button.setPrefWidth(width);
        button.setPrefHeight(height);

        button.setText(buttonText);
    }
}