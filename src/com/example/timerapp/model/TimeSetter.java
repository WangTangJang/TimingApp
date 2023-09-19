package com.example.timerapp.model;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimeSetter {
    private Timer timer;
    private int seconds = 0;
    private boolean isRunning = false;
    private final JLabel timerLabel;
    public TimeSetter(JLabel timerLabel){
        this.timerLabel = timerLabel;
    }

    public void initTimer(){
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seconds++;
                updateTimerLabel();
            }
        });
    }

    public void startTimer(){
        if (!isRunning) {
            timer.start();
            isRunning = true;
        }
    }
    public void stopTimer(){
        if (isRunning) {
            timer.stop();
            isRunning = false;
        }
    }
    public void resetTimer(){
        stopTimer();
        seconds = 0;
        updateTimerLabel();
    }
    private void updateTimerLabel(){
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secs = seconds % 60;
        String time = String.format("%02d:%02d:%02d", hours, minutes, secs);
        timerLabel.setText(time);
    }
}
