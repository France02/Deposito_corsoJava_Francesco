package Lenedi_0505;

import java.util.Scanner;

class CostantiTempo {
    public static final int GIORNOSEC = 86400; // 24 * 3600
    public static final int ORESEC = 3600;      // 60 * 60
    public static final int MINUTISEC = 60;
}

public class EsercizioTimeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Chiediamo all'utente i valori
        System.out.print("Inserisci giorni: ");
        int giorni = input.nextInt();

        System.out.print("Inserisci ore: ");
        int ore = input.nextInt();

        System.out.print("Inserisci minuti: ");
        int minuti = input.nextInt();

        System.out.print("Inserisci secondi: ");
        int secondi = input.nextInt();

        // Calcoliamo il totale in secondi
        long totaleSecondi = 
            giorni * CostantiTempo.GIORNOSEC + 
            ore * CostantiTempo.ORESEC + 
            minuti * CostantiTempo.MINUTISEC + 
            secondi;

        // Stampiamo il risultato
        System.out.println("\nTotale secondi: " + totaleSecondi);
        
        input.close();
    }
}

