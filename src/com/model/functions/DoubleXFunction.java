package com.model.functions;

import com.model.Function;

public class DoubleXFunction extends Function {
    public DoubleXFunction(int topValue, int bottomValue, int aParam) {
        super(topValue, bottomValue, aParam);
    }

    @Override
    public double calculateY(double x) {
        return Math.pow(x, 2);
    }
}
