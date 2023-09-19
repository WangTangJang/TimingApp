package com.example.timerapp.gui;

import com.example.timerapp.timer.TimeSetter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerFrame extends JFrame {

    private JLabel timerLabel;
    TimeSetter timeSetter;
    public TimerFrame(){
        setTitle("祭时");
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 创建并配置界面组件
        initComponents();
        // 初始化计时器
        timeSetter = new TimeSetter(timerLabel);
        timeSetter.initTimer();
    }
    private void initComponents(){
        JPanel mainPanel = new JPanel();

        mainPanel.setLayout(new BorderLayout());

        // 创建显示计时的标签
        timerLabel = new JLabel("00:00:00");
        timerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        timerLabel.setHorizontalAlignment(JLabel.CENTER);
        mainPanel.add(timerLabel, BorderLayout.CENTER);

        // 创建按钮面板
        JPanel buttonPanel = new JPanel();

        // 创建开始按钮
        JButton startButton = new JButton("开始");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timeSetter.startTimer();
            }
        });
        buttonPanel.add(startButton);

        // 创建停止按钮
        JButton stopButton = new JButton("停止");
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timeSetter.stopTimer();
            }
        });
        buttonPanel.add(stopButton);

        // 创建重置按钮
        JButton resetButton = new JButton("重置");
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timeSetter.resetTimer();
            }
        });
        buttonPanel.add(resetButton);

        // 将按钮面板添加到主面板
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // 将主面板添加到窗口
        add(mainPanel);
    }
}
