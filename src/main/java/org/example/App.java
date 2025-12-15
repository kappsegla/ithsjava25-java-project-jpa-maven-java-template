package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static int add(int a, int b) {
        int[] intArray = {a,b};
        int sum = intArray[0] + intArray[1];
        return sum;
    }
}
