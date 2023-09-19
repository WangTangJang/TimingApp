package com.example.timerapp.controller;

import com.example.timerapp.model.TimeSetter;

import java.awt.*;
import java.awt.event.KeyEvent;

public class TimerEvent  {
    public static void keyListener(TimeSetter timeSetter){
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.addKeyEventDispatcher(new KeyEventDispatcher() {
            @Override
            public boolean dispatchKeyEvent(KeyEvent e) {
                if (e.getID() == KeyEvent.KEY_PRESSED) {
                    // 监听按下的键位
                    int keyCode = e.getKeyCode();
//                    System.out.println("按下键位: " + KeyEvent.getKeyText(keyCode));
                    if (KeyEvent.getKeyText(keyCode).equals("Ctrl")){
                        timeSetter.startTimer();
                    }
                    // 在这里执行你想要的操作
                }
                return false;
            }
        });
    }
}
