package org.learning.java.snack5;
//Snack5
//  Data una stringa in input mostrare a video quanti caratteri alfabetici contiene, quanti numeri e quanti simboli non alfanumerici.
//  Continuare a chiedere una nuova stringa finchè non si inserisce 0.


import java.util.Scanner;

public class snack5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String stringa;
    boolean condizione = true;
    while (condizione){
    
    int charAlpha = 0;
    int charNumber = 0;
    int charSymbol = 0;
      System.out.print("Inserisci una stringa: ");
      stringa = scanner.nextLine();
      char[] stringaArray= stringa.toCharArray();
      for (int i = 0; i < stringa.length(); i++) {
        char character = stringaArray[i];
        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
          charAlpha +=1;
        } else if (character >= '0' && character <= '9') {
          charNumber +=1;
        }
        else {
          charSymbol +=1;
        }
        
        if (stringa.equals("0")) {
        condizione = false;
      }
    }
    
    
      if (condizione) {
        System.out.println("lettere: " + charAlpha);
        System.out.println("numeri:  " +charNumber);
        System.out.println("simboli: " +charSymbol);
      }
      
      
    
    }
   
   
    
  }
}
