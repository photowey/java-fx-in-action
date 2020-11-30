package com.photowey.fx.action.layout.text;

import com.photowey.fx.action.factory.PaneFactory;
import com.photowey.fx.action.util.JavaFxUtils;
import com.photowey.fx.action.util.SystemOutUtils;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.*;
import javafx.stage.Stage;

/**
 * TextFLowLauncher
 *
 * @author photowey
 * @date 2020/11/29
 * @since 1.0.0
 */
public class TextFLowLauncher extends Application {

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

        Text text1 = new Text("这里是JavaFx");
        Text text2 = new Text("In-Action");
        Text text3 = new Text("Hello-World");

        text1.setFont(Font.font(20));
        text1.setStyle("-fx-fill: #A0522D");
        // text1.setFill(Paint.valueOf("#A0522D"));

        text2.setFont(Font.font("Helvetica", FontPosture.REGULAR, 40));
        text3.setFont(Font.font("Helvetica", FontWeight.BOLD, 10));

        TextFlow textFlow1 = new TextFlow();
        textFlow1.setStyle("-fx-background-color: #EEEE00");
        textFlow1.getChildren().addAll(text1, text2, text3);


        Text text4 = new Text("Hello-WorldHello-WorldHello-WorldHello-WorldHello-World");
        text4.setFont(Font.font(20));
        TextFlow textFlow2 = new TextFlow();
        textFlow2.getChildren().addAll(text4);

        AnchorPane anchorPane = PaneFactory.createAnchorPane();
        AnchorPane.setTopAnchor(textFlow1, 100.0D);
        AnchorPane.setLeftAnchor(textFlow1, 100.0D);

        anchorPane.getChildren().addAll(textFlow1, textFlow2);

        Scene scene = new Scene(anchorPane);
        primaryStage.setScene(scene);
        JavaFxUtils.populateStageWidthAndHeight(primaryStage, 800, 800);

        JavaFxUtils.populateStageTitleAndIcon(primaryStage);

        primaryStage.widthProperty().addListener((observable, oldValue, newValue) -> {
            SystemOutUtils.println("这是 AnchorPane 的 宽度=%f", anchorPane.getWidth());
            SystemOutUtils.println("这是 TextFlow 的 宽度=%f", textFlow1.getWidth());
        });

        anchorPane.widthProperty().addListener((observable, oldValue, newValue) -> {
            textFlow1.setPrefWidth(newValue.doubleValue() - 100);
        });

        primaryStage.show();
    }

    /**
     * stop
     *
     * @throws Exception
     */
    @Override
    public void stop() throws Exception {
        super.stop();
    }
}