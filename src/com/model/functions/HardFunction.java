package com.model.functions;

import com.model.Function;

public class HardFunction extends Function {

    public HardFunction(int topValue, int bottomValue, int aParam) {
        super(topValue, bottomValue, aParam);
    }

    @Override
    public double calculateY(double x) {
        return  (aParam*x / Math.pow(Math.E, Math.pow(x, 3)));
    }
}
