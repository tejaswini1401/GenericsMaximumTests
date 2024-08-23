package com.generics;
public class MaxOfThree {

    public static int findMaximum(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        int result = findMaximum(a, b, c);
        System.out.println("The maximum value is: " + result);
    }
}
