package com.example.timerapp.view;

import com.example.timerapp.controller.TimerController;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TimerView extends JFrame {
    private JLabel timerLabel;
    private JButton startButton;
    private JButton stopButton;
    private JButton resetButton;
    private TimerController controller;

    public TimerView() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        JPanel buttonPanel = new JPanel();

        // 设置窗口标题等
        setTitle("祭时器");
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon("resource/clock.png");
        setIconImage(icon.getImage());

        // 创建一个自定义的 JPanel 来设置背景图片
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 读取背景图片并绘制到 JPanel 上
                try {
                    BufferedImage image = ImageIO.read(new File("background.jpg"));
                    g.drawImage(image, 0, 0, null);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        add(panel);

        // 设置 JPanel 的布局为 null，以便自由定位其他组件
        panel.setLayout(null);

        // 创建其他组件并将其添加到 JPanel 上
        JLabel label = new JLabel("这是一个带背景图片的窗口");
        label.setFont(new Font("Arial", Font.BOLD, 24));
        label.setForeground(Color.WHITE);
        label.setBounds(100, 100, 600, 50);
        panel.add(label);

        // 初始化界面组件并配置布局
        initComponents();

        // 添加组件
        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(resetButton);
        mainPanel.add(timerLabel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel,BorderLayout.SOUTH);
        add(mainPanel);
    }

    private void initComponents() {
        // 创建显示计时的标签
        timerLabel = new JLabel("00:00:00");
        timerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        timerLabel.setHorizontalAlignment(JLabel.CENTER);


        startButton = new JButton("开始");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.startButtonClicked();
            }
        });

        stopButton = new JButton("结束");
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.stopButtonClicked();
            }
        });

        resetButton = new JButton("重置");
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.resetButtonClicked();
            }
        });
    }

    public void updateTimeDisplay(String time){
        timerLabel.setText(time);
    }

    public void setController(TimerController controller) {
        this.controller = controller;
    }

}
