package com.example.timerapp.view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class WindowIconExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("应用程序标题");

        try {
            // 加载ico图标文件
            File iconFile = new File("resource/clock.ico"); // 请替换为你的ico文件路径
            Image iconImage = ImageIO.read(iconFile);
            frame.setIconImage(iconImage);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 设置窗口大小和关闭操作
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 添加其他组件和内容到窗口
        // ...

        frame.setVisible(true);
    }
}
   