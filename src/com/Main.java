package com;

import com.model.FindXFunction;
import com.view.MainWindow;


public class Main {
    public static void main(String[] args) {
        MainWindow window = new MainWindow();
        FindXFunction first = new FindXFunction(10,-10, 2);
        window.chartField.addChart(
                "X^2", first.getXes(),
                first.getYes());
        window.run();
    }
}