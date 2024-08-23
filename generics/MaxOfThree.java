package com.generics;
public class MaxOfThree {

    public static float findMaximum(float a, float b, float c) {
        float max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {
        float a = 10.5f;
        float b = 20.6f;
        float c = 30.57f;

        float result = findMaximum(a, b, c);
        System.out.println("The maximum value is: " + result);
    }
}
