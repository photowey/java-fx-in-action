package com.photowey.fx.action.factory;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * ComponentFactory
 *
 * @author photowey
 * @date 2020/11/29
 * @since 1.0.0
 */
public final class ComponentFactory {

    private ComponentFactory() {
        throw new AssertionError("No " + this.getClass().getName() + " instances for you!");
    }

    public static Scene createScene(Parent root) {
        return new Scene(root);
    }

    public static Stage createStage() {
        return new Stage();
    }

    public static Button createButton() {
        return new Button();
    }

    public static Button createButton(String title) {
        return new Button(title);
    }

    public static Text createText() {
        return new Text();
    }

    public static Text createText(String title) {
        return new Text(title);
    }
}
