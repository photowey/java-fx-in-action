package com.photowey.fx.action.layout.dialog;

import com.photowey.fx.action.constant.JavaFxConstants;
import com.photowey.fx.action.factory.ComponentFactory;
import com.photowey.fx.action.factory.PaneFactory;
import com.photowey.fx.action.schedule.ScheduledServiceImpl;
import com.photowey.fx.action.util.JavaFxUtils;
import javafx.application.Application;
import javafx.concurrent.ScheduledService;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 * DialogLauncher
 *
 * @author photowey
 * @date 2020/11/29
 * @since 1.0.0
 */
public class DialogLauncher extends Application {

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

        Button button = new Button("点击弹出对话框!");
        AnchorPane anchorPane = PaneFactory.createAnchorPane();
        AnchorPane.setTopAnchor(button, 100.0D);
        AnchorPane.setLeftAnchor(button, 100.0D);
        anchorPane.getChildren().addAll(button);

        button.setOnAction((actionEvent) -> {
            DialogPane dialogPane = PaneFactory.createDialogPane();
            dialogPane.setHeaderText("HeaderText");
            dialogPane.setContentText("ContentText");

            ImageView view = new ImageView(JavaFxConstants.APP_ALERT_PATH);
            dialogPane.setGraphic(view);

            dialogPane.setExpandableContent(ComponentFactory.createText("这是扩展文本内容"));
            dialogPane.setExpanded(false);

            dialogPane.getButtonTypes().addAll(ButtonType.APPLY, ButtonType.CANCEL);
            Button apply = (Button) dialogPane.lookupButton(ButtonType.APPLY);
            Button cancel = (Button) dialogPane.lookupButton(ButtonType.CANCEL);

            Scene scene = ComponentFactory.createScene(dialogPane);
            Stage stage = ComponentFactory.createStage();
            stage.setTitle("这是对话框标题");
            // JavaFxUtils.populateStageWidthAndHeight(stage, 400, 300);
            stage.initOwner(primaryStage);
            stage.initModality(Modality.WINDOW_MODAL);

            stage.initStyle(StageStyle.UTILITY);
            stage.setResizable(false);

            stage.setScene(scene);

            apply.setOnAction((event) -> System.out.println("applyOnAction"));
            cancel.setOnAction((event) -> stage.close());

            ScheduledService<Integer> scheduledService = new ScheduledServiceImpl(dialogPane, stage, 10);
            scheduledService.setDelay(Duration.millis(0L));
            scheduledService.setPeriod(Duration.millis(1000L));
            scheduledService.start();

            stage.show();
        });


        Scene scene = new Scene(anchorPane);
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