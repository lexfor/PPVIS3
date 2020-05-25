package com;

import com.model.functions.DoubleXFunction;
import com.view.MainWindow;


public class Main {
    public static void main(String[] args) {
        MainWindow window = new MainWindow();
        DoubleXFunction first = new DoubleXFunction(10,-10, 2);
        window.chartField.addChart(
                "X^2", first.getXes(),
                first.getYes());
        window.run();
    }
}