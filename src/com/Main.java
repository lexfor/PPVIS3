package com;

import com.model.FindY;
import com.view.MainWindow;


public class Main {
    public static void main(String[] args) {
        MainWindow mainwindow = new MainWindow();
        FindY first = new FindY(10,-10, 2);
        mainwindow.chartField.addChart(
                "X^2", first.getXes(),
                first.getYes());
        mainwindow.run();
    }
}