package com.example.slm;

public class Calculator {
    public int sum(int a, int b) {

        return a + b;
    }


    public int division(int a, int b) {

        return Math.floorDiv(a, b);
    }

    public double convertInchesToCm(double a) {
        return a * 2.54;
    }

}
