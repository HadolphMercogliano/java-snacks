//Snack1 Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.

package org.learning.java.snack1;

import java.util.Scanner;

public class snack1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Inserisci un numero");
    int n = scanner.nextInt();
    if (n % 2 == 0) {
      System.out.println(n);
    } else {
      System.out.println(n + 1);
    }
  }
}
