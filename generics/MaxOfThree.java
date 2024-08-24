package usecase.generics;

public class MaxOfThree<T extends Comparable<T>> {

    private T a;
    private T b;
    private T c;

    public MaxOfThree(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T testMaximum() {
        return findMaximum(a, b, c);
    }

    public void printMax() {
        T max = testMaximum();
        System.out.println("Maximum value: " + max);
    }

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
        MaxOfThree<Integer> intTest = new MaxOfThree<>(10, 20, 30);
        intTest.printMax(); 

        MaxOfThree<String> strTest = new MaxOfThree<>("apple", "banana", "cherry");
        strTest.printMax(); 

        MaxOfThree<Float> floatTest = new MaxOfThree<>(10.5f, 53.2f, 134.4f);
        floatTest.printMax(); 
    }
}
