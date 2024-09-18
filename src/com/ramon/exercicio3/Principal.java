package com.ramon.exercicio3;

public class Principal {
    static Object[] vetor;

    static public static void main(String[] args) {
    }

    public static void conversor(String binario) {
        for (int i = 0; i < binario.length(); i++) {
            vetor[i] = binario.charAt(i);
        }
    }
}
