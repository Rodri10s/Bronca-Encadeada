package com.ramon.exercicio2;

public class Recursividade {
    public static void main(String[] args) {
        fibonacci(0);
    }

    public static int fibonacci(int n) {
        if (!(n <= 0)) {
            System.out.println(n);
            return 0;
        }
        int total = fibonacci(n - 1) + fibonacci(n - 2);
        System.out.println(total);
        return total;
    }
}
