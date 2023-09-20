package com.example.timerapp.model;

import com.example.timerapp.controller.TimerController;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerModel {
    private int seconds;
    private boolean isRunning;
    private TimerController timerController;
    private Timer timer;

    public TimerModel() {
        seconds = 0;
        isRunning = false;
    }

    public void start() {

        if (!isRunning) {
            isRunning = true;
            timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    increment();
                    if (timerController != null) {
                        timerController.timerTimeChanged(getFormattedTime());
                    }
                }
            }, 0, 1000); // 每秒执行一次
        }
    }
    public void stop() {
        if (isRunning) {
            isRunning = false;
            if (timer != null) {
                timer.cancel();
            }
        }
    }

    public void reset() {
        seconds = 0;
        if (timerController != null) {
            timerController.timerTimeChanged(getFormattedTime());
        }
    }

    public void increment() {
        if (isRunning) {
            seconds++;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    private String getFormattedTime() {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secs = seconds % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, secs);
    }

    public void setController(TimerController timerController) {
        this.timerController = timerController;
    }

}
