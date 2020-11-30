package com.photowey.fx.action.util;

import com.photowey.fx.action.constant.JavaFxConstants;
import com.photowey.fx.action.launcher.Launcher;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

/**
 * JavaFxUtils
 *
 * @author photowey
 * @date 2020/11/29
 * @since 1.0.0
 */
public final class JavaFxUtils {

    private JavaFxUtils() {
        throw new AssertionError("No " + this.getClass().getName() + " instances for you!");
    }

    public static void handleDefaultStart(Stage primaryStage) throws java.io.IOException {
        primaryStage.setTitle(JavaFxConstants.APP_TITLE);
        primaryStage.getIcons().add(new Image(JavaFxConstants.APP_LOGO_PATH));

        Parent root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getClassLoader().getResource(JavaFxConstants.APP_CONFIG_FXML)));
        primaryStage.setScene(new Scene(root, 900, 600));

        primaryStage.show();
    }

    public static void populateTitleAndIconAndShow(Stage primaryStage) {
        primaryStage.setTitle(JavaFxConstants.APP_TITLE);
        primaryStage.getIcons().add(new Image(JavaFxConstants.APP_LOGO_PATH));
        primaryStage.show();
    }

    public static void populateStageTitleAndIcon(Stage primaryStage) {
        primaryStage.setTitle(JavaFxConstants.APP_TITLE);
        primaryStage.getIcons().add(new Image(JavaFxConstants.APP_LOGO_PATH));
    }

    public static void populateStageWidthAndHeight(Stage stage, int width, int height) {
        stage.setWidth(width);
        stage.setHeight(height);
    }
}
