//Snack4
//  Data in input una stringa verificare se è palindroma

package org.learning.java.snack4;

import java.util.Scanner;

public class snack4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Inserisci una stringa: ");
    String stringa = scanner.nextLine();
    boolean isPalindroma = true;
    char[] stringaArray = stringa.toCharArray();
    int j= stringa.length()-1;
    for (int i = 0; i < stringa.length(); i++) {
      if (stringaArray[i]!= stringaArray[j]) {
        isPalindroma = false;
        
        break;
      }
      j--;
    }
    if (isPalindroma) {
    System.out.println( stringa +" è una parola palindroma ");
    
    }else {
      System.out.println( stringa +" non è una parola palindroma ");
      
    }
    scanner.close();
    
  }
}
