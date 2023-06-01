//Snack2 Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi,
// e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
package org.learning.java.snack2;

public class snack2 {
  public static void main(String[] args) {
    
    // array di nomi e cognomi
    String[] names = {"Mario", "Luigi", "Giovanna", "Francesca","Alessandro", "Martina", "Giuseppe", "Sofia", "Leonardo", "Chiara", "Matteo", "Sara", "Luca", "Valentina"};
    String[] sunames = {"Rossi", "Bianchi", "Verdi", "Neri", "Esposito", "Russo", "Conti", "Moretti", "Santoro", "Rizzo", "De Luca", "Costa", "Greco", "Lombardi"};
    
    // numero casuale di invitati
    double numeroCasuale = Math.random() * (10 - 1) + 1;
    
    // per ogni invitato che si vuole creare si prende una posizione casuale dall' array nomi e una casuale dall' array cognomi e si stampano insieme.
    for (int i = 0; i < numeroCasuale ; i++) {
      double casualName = Math.random() * (names.length - 1);
      int casualNameInt = (int) casualName;
      double casualSur = Math.random() * (sunames.length - 1);
      int casualSurInt = (int) casualSur;
      
      System.out.println(names[casualNameInt] + " " + sunames[casualSurInt]);
      
    }
  }
}
