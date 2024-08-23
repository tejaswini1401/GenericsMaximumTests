package com.generics;

public class MaxOfThree {

    public static <T extends Comparable<T>> T findMaximum(T a, T b, T c) {
        T max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {
        Integer int1 = 10;
        Integer int2 = 20;
        Integer int3 = 30;
        System.out.println("Max Integer: " + findMaximum(int1, int2, int3));

        String str1 = "apple";
        String str2 = "banana";
        String str3 = "cherry";
        System.out.println("Max String: " + findMaximum(str1, str2, str3));
        
        float a = 10.5f;
        float b = 20.6f;
        float c = 30.57f;

        float result = findMaximum(a, b, c);
        System.out.println("Maximum Float: " + result);
    }
}
