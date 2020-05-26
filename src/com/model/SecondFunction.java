package com.model;

import com.model.Function;

public class SecondFunction extends Function {

    public SecondFunction(int topValue, int bottomValue, int aParam) {
        super(topValue, bottomValue, aParam);
    }

    @Override
    public double calculateY(double x) {
        return  (aParam*x / Math.pow(Math.E, Math.pow(x, 3)));
    }
}
