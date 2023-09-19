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
        // ...

        // 将控制器与模型关联起来
        // ...
    }

    // 添加方法用于处理各种事件，例如开始、停止、重置等
    // ...
}
