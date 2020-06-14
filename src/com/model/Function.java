package com.model;

import java.util.LinkedList;
import java.util.List;

public abstract class Function {
    private final double step = 0.1;
    protected int aParam;
    double[] X;
    double[] Y;
    int topValue;
    int bottomValue;

    public Function(int topValue, int bottomValue, int aParam) {
        this.topValue = topValue;
        this.bottomValue = bottomValue;
        this.aParam = aParam;
        List<Double> xes = new LinkedList<>();
        List<Double> yes = new LinkedList<>();
        for (double i = bottomValue; i < topValue; i += step) {
            xes.add(i);
            yes.add(calculateY(i));
        }
        X = new double[xes.size()];
        Y = new double[yes.size()];
        for (int i = 0; i < xes.size(); i++) {
            X[i] = xes.get(i);
            Y[i] = yes.get(i);
        }
    }

    public abstract double calculateY(double x);

    public double[] getXes() {
        return X;
    }

    public double[] getYes() {
        return Y;
    }
}
