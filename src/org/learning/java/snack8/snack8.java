//Snack8 Chiedi un numero di 4 cifre all’utente e calcola la somma di tutte le cifre che compongono il numero.
package org.learning.java.snack8;

import java.util.Scanner;
  
  public class snack8 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      boolean correctNumber =false;
      int number;
      do {
        System.out.println("Inserisci il numero di 4 cifre:");
        number = scanner.nextInt();
        if (number>999 && number<10000) {
          correctNumber = true;
        }
      }
      while (!correctNumber);
      int sum = 0;
      int[] cifre = new int[4];
      cifre[0]=number / 1000 % 10;
      cifre[1]=number / 100 % 10;
      cifre[2]=number / 10 % 10;
      cifre[3]=number % 10;
      for (int i = 0; i < cifre.length; i++) {
        sum += cifre[i];
      }
      scanner.close();
      System.out.println(sum);
    }
  }



