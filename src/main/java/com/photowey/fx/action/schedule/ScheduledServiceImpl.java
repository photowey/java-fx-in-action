package com.photowey.fx.action.schedule;

import com.photowey.fx.action.util.SystemOutUtils;
import javafx.concurrent.ScheduledService;
import javafx.concurrent.Task;
import javafx.scene.control.DialogPane;
import javafx.stage.Stage;

/**
 * ScheduleServiceImpl
 *
 * @author photowey
 * @date 2020/11/29
 * @since 1.0.0
 */
public class ScheduledServiceImpl extends ScheduledService<Integer> {

    private DialogPane dialogPane;
    private Stage stage;
    private int timeout;

    public ScheduledServiceImpl() {
    }

    public ScheduledServiceImpl(DialogPane dialogPane, Stage stage, int timeout) {
        this.dialogPane = dialogPane;
        this.stage = stage;
        this.timeout = timeout;
    }

    @Override
    protected Task<Integer> createTask() {
        return new Task<Integer>() {
            @Override
            protected Integer call() throws Exception {
                SystemOutUtils.println("the thread name is:[%s]", Thread.currentThread().getName());
                return timeout--;
            }

            @Override
            protected void updateValue(Integer value) {
                SystemOutUtils.println("the thread:[%s], new value is:[%d]", Thread.currentThread().getName(), value);
                if (timeout < 0) {
                    cancelScheduledTask();
                    stage.close();
                } else {
                    dialogPane.setContentText(String.valueOf(value));
                }
            }
        };
    }

    private void cancelScheduledTask() {
        this.cancel();
    }
}
