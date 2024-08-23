package com.generics;
public class MaxOfThree {

	public static String findMaximum(String a, String b, String c) {
        String max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {
        String a = "apple";
        String b = "banana";
        String c = "Leamon";

        String result = findMaximum(a, b, c);
        System.out.println("The maximum string is: " + result);
    }
}
