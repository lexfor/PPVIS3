package com.model;

import com.model.Function;

public class FindY extends Function {
    public FindY(int topValue, int bottomValue, int aParam) {
        super(topValue, bottomValue, aParam);
    }

    @Override
    public double calculateY(double x) {
        return Math.pow(x, 2);
    }
}
