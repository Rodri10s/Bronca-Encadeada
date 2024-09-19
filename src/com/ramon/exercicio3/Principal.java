package com.ramon.exercicio3;

import java.util.Scanner;

public class Principal {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.println("Digite o número binário: ");
      String entrada = input.nextLine();

      conversor(entrada);
   }

   public static int recursao(char[] vetor, int m) {
      int n = 0;
      if (vetor.length <= m) {
         return 0;
      }

      if (vetor[m] == '0') {
         n = 0;
      } else if (vetor[m] == '1') {
         n = 1;
      }

      int t = (int) (n * Math.pow(2, m));
      m++;

      return t + recursao(vetor, m);

   }

   public static void conversor(String binario) {
      char[] vetor = new char[binario.length()];
      int j = 0;
      for (int i = binario.length() - 1; i >= 0; i--) {
         vetor[j] = binario.charAt(i);
         j++;
      }
      int m = 0;
      System.out.println(recursao(vetor, m));
   }
}
