package com.example.timerapp;

import com.example.timerapp.controller.TimerController;
import com.example.timerapp.model.TimerModel;
import com.example.timerapp.view.TimerFrame;
import com.example.timerapp.view.TimerView;

public class Main {
    public static void main(String[] args) {
        TimerView timerView = new TimerView();
        TimerModel timerModel = new TimerModel();
        TimerController timerController = new TimerController(timerModel,timerView);
        timerView.setVisible(true);
    }
}
