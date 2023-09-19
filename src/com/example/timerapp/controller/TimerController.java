package com.example.timerapp.controller;

import com.example.timerapp.model.TimerModel;
import com.example.timerapp.view.TimerView;

public class TimerController {
    private TimerModel model;
    private TimerView view;

    public TimerController(TimerModel model, TimerView view) {
        this.model = model;
        this.view = view;

        // 将控制器与视图关联起来
        view.setController(this);
        // 将控制器与模型关联起来
        model.setController(this);
    }


    public void startButtonClicked() {
        model.start();
    }
    public void stopButtonClicked(){
        model.stop();
    }
    public void resetButtonClicked(){
        model.reset();
    }
    public void timerTimeChanged(String time){
        view.updateTimeDisplay(time);
    }

}
