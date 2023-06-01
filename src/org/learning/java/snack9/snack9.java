//Snack9 Calcola la somma e la media dei primi 10 numeri.

package org.learning.java.snack9;

public class snack9 {
  public static void main(String[] args) {
    int sum = 0;
    
    for (int i = 1; i <= 10; i++) {
      sum += i;
    }
    double media = (double) sum / 10;
    System.out.println("La somma dei primi 10 numeri è: " + sum);
    System.out.println("La media dei primi 10 numeri è: " + media);
  }
}
