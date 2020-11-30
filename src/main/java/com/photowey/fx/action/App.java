package com.photowey.fx.action;

import com.photowey.fx.action.layout.dialog.DialogLauncher;
import javafx.application.Application;

/**
 * FX App
 *
 * @author photowey
 * @date 2020/11/24
 * @since 1.0.0
 */
public class App {

    public static void main(String[] args) throws Exception {
        // Application.launch(Launcher.class, args);
        // Application.launch(BorderPaneLauncher.class, args);
        // Application.launch(TextFLowLauncher.class, args);
        // Application.launch(TileLowLauncher.class, args);
        Application.launch(DialogLauncher.class, args);
    }
}