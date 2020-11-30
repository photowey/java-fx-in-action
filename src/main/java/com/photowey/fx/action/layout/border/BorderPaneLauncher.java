package com.photowey.fx.action.layout.border;

import com.photowey.fx.action.factory.PaneFactory;
import com.photowey.fx.action.util.JavaFxUtils;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * BorderPaneLauncher
 *
 * @author photowey
 * @date 2020/11/29
 * @since 1.0.0
 */
public class BorderPaneLauncher extends Application {

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

        AnchorPane anchorPane1 = PaneFactory.createAnchorPane();
        AnchorPane anchorPane2 = PaneFactory.createAnchorPane();
        AnchorPane anchorPane3 = PaneFactory.createAnchorPane();
        AnchorPane anchorPane4 = PaneFactory.createAnchorPane();
        AnchorPane anchorPane5 = PaneFactory.createAnchorPane();

        this.setPrefWidthAndHeight(anchorPane1, 100, 100);
        this.setPrefWidthAndHeight(anchorPane2, 100, 100);
        this.setPrefWidthAndHeight(anchorPane3, 100, 100);
        this.setPrefWidthAndHeight(anchorPane4, 100, 100);
        this.setPrefWidthAndHeight(anchorPane5, 100, 100);

        this.setStyle(anchorPane1, "-fx-background-color: #EE6AAE");
        this.setStyle(anchorPane2, "-fx-background-color: #98FB98");
        this.setStyle(anchorPane3, "-fx-background-color: #A0522D");
        this.setStyle(anchorPane4, "-fx-background-color: #1E90FF");
        this.setStyle(anchorPane5, "-fx-background-color: #EEEE00");

        BorderPane borderPane = PaneFactory.createBorderPane();
        this.setStyle(borderPane, "-fx-background-color: #B23AEE");

        borderPane.setTop(anchorPane1);
        borderPane.setBottom(anchorPane2);
        borderPane.setLeft(anchorPane3);
        borderPane.setRight(anchorPane4);
        borderPane.setCenter(anchorPane5);

//        borderPane.setPadding(new Insets(10));
//        BorderPane.setMargin(anchorPane1, new Insets(10));
//        BorderPane.setAlignment(anchorPane1, Pos.BOTTOM_LEFT);

        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        JavaFxUtils.populateStageWidthAndHeight(primaryStage, 800, 800);

        JavaFxUtils.populateStageTitleAndIcon(primaryStage);

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

    public void setPrefWidthAndHeight(AnchorPane anchorPane, int width, int height) {
        anchorPane.setPrefWidth(width);
        anchorPane.setPrefHeight(height);
    }

    public void setStyle(AnchorPane anchorPane, String style) {
        anchorPane.setStyle(style);
    }


    public void setStyle(BorderPane borderPane, String style) {
        borderPane.setStyle(style);
    }
}