package com.example.timerapp.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerView extends JFrame {
    private JLabel timerLabel;
    private JButton startButton;
    private JButton stopButton;
    private JButton resetButton;

    public TimerView() {
        // 初始化界面组件并配置布局
        initComponents();

        // 设置窗口标题等
        setTitle("祭时");
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(resetButton);
        mainPanel.add(timerLabel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel,BorderLayout.SOUTH);
        add(mainPanel);
        // ...
    }

    private void initComponents() {
        // 创建显示计时的标签
        timerLabel = new JLabel("00:00:00");
        timerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        timerLabel.setHorizontalAlignment(JLabel.CENTER);
        // 添加按钮的事件监听器

        startButton = new JButton("开始");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 处理开始按钮点击事件
            }
        });

        stopButton = new JButton("结束");
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 处理停止按钮点击事件
            }
        });

        resetButton = new JButton("重置");
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 处理重置按钮点击事件
            }
        });
    }
}
