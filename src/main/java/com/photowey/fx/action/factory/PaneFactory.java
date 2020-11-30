package com.photowey.fx.action.factory;

import javafx.scene.control.DialogPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;

/**
 * PaneFactory
 *
 * @author photowey
 * @date 2020/11/29
 * @since 1.0.0
 */
public final class PaneFactory {

    private PaneFactory() {
        throw new AssertionError("No " + this.getClass().getName() + " instances for you!");
    }

    public static AnchorPane createAnchorPane() {
        return new AnchorPane();
    }

    public static BorderPane createBorderPane() {
        return new BorderPane();
    }

    public static TilePane createTilePane() {
        return new TilePane();
    }

    public static DialogPane createDialogPane() {
        return new DialogPane();
    }

}
