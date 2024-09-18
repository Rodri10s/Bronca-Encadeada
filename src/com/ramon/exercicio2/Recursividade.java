package com.ramon.exercicio2;

public class Recursividade {
    public static void main(String[] args) {
        fibonacci();
    }

    public static void recursao(int n, int m) {
        if (m > 100) {
            return;
        }
        System.out.println(m);

        int aux = n + m;
        m = n;
        n = aux;

        recursao(n, m);
    }

    public static void fibonacci() {
        int n = 1;
        int m = 0;
        recursao(n, m);
    }
}
