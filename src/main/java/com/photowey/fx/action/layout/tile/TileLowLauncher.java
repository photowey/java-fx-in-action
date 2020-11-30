package com.photowey.fx.action.layout.tile;

import com.photowey.fx.action.factory.PaneFactory;
import com.photowey.fx.action.util.JavaFxUtils;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

/**
 * TileLowLauncher
 *
 * @author photowey
 * @date 2020/11/29
 * @since 1.0.0
 */
public class TileLowLauncher extends Application {

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

        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");
        Button button4 = new Button("button4");
        Button button5 = new Button("button5");
        Button button6 = new Button("button6");
        Button button7 = new Button("button7");
        Button button8 = new Button("button8");

        TilePane tilePane = PaneFactory.createTilePane();
        tilePane.setStyle("-fx-background-color: #EEEE00");

        tilePane.getChildren().addAll(button1, button2, button3, button4, button5, button6, button7, button8);

        tilePane.setHgap(10);
        tilePane.setVgap(10);
        tilePane.setPadding(new Insets(10));
        // tilePane.setAlignment(Pos.TOP_CENTER);

        TilePane.setMargin(button1, new Insets(50));

        Scene scene = new Scene(tilePane);
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
}