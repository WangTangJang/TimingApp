package com.example.timerapp.model;

public class TimerModel {
    private int seconds;
    private boolean isRunning;

    public TimerModel() {
        seconds = 0;
        isRunning = false;
    }

    public void start() {
        isRunning = true;
    }

    public void stop() {
        isRunning = false;
    }

    public void reset() {
        seconds = 0;
    }

    public void increment() {
        if (isRunning) {
            seconds++;
        }
    }

    public int getSeconds() {
        return seconds;
    }
}
