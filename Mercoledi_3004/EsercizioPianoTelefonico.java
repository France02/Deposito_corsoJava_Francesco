package Mercoledi_3004;

import java.util.Scanner; // Importa la classe Scanner per leggere input dall'utente

public class EsercizioPianoTelefonico {
    public static void main(String[] args) {
        // Creazione di un oggetto Scanner per leggere input da tastiera
        Scanner myScanner = new Scanner(System.in);

        // Messaggio di benvenuto e richiesta del tipo di piano telefonico
        System.out.println("Benvenuto Scegli io tuo piano telefonico (Base, Plus, Premium):");
        String pianoTel = myScanner.nextLine(); // Legge il piano scelto dall'utente

        // Variabile per memorizzare il prezzo base del piano selezionato
        double prezzoBase = 0;

        // Determina il prezzo base in base al piano scelto
        switch (pianoTel) {
            case "Base": // Se il piano è "Base", il prezzo base è 10€
                prezzoBase += 10;
                break;
            case "Plus": // Se il piano è "Plus", il prezzo base è 15€
                prezzoBase += 15;
                break;
            case "Premium": // Se il piano è "Premium", il prezzo base è 20€
                prezzoBase += 20;
                break;

            default: // Se il piano non è valido, stampa un messaggio di errore
                System.out.println("Non hai selezionato nessun Piano");
                break;
        }

        // Richiesta del numero di minuti consumati
        System.out.println("Numero di minuti");
        int numMinuti = myScanner.nextInt(); // Legge il numero di minuti inserito dall'utente

        // Richiesta del numero di messaggi inviati
        System.out.println("Numero di Messaggi:");
        int numMessaggi = myScanner.nextInt(); // Legge il numero di messaggi inserito dall'utente

        // Richiesta del numero di GB consumati
        System.out.println("Numero di GB");
        int numGb = myScanner.nextInt(); // Legge il numero di GB inserito dall'utente

        // Calcolo del costo extra per i minuti
        double costoExtraMinuti = 0;
        if (numMinuti > 100) { // Se i minuti superano i 100, calcola il costo extra
            costoExtraMinuti = (numMinuti - 100) * 0.10; // 0.10€ per ogni minuto extra
        }

        // Calcolo del costo extra per i messaggi
        double costoExtraMessaggi = 0;
        if (numMessaggi > 50) { // Se i messaggi superano i 50, calcola il costo extra
            costoExtraMessaggi = (numMessaggi - 50) * 0.05; // 0.05€ per ogni messaggio extra
        }

        // Calcolo del costo extra per i GB
        double costoExtraGb = 0;
        if (numGb > 5) { // Se i GB superano i 5, calcola il costo extra
            costoExtraGb = (numGb - 5) * 2; // 2€ per ogni GB extra
        }

        // Calcolo del totale parziale (prezzo base + costi extra)
        double totale = prezzoBase + costoExtraMinuti + costoExtraMessaggi + costoExtraGb;

        // Richiesta dell'età dell'utente
        System.out.println("Inserisci la tua età:");
        int eta = myScanner.nextInt(); // Legge l'età inserita dall'utente

        // Applicazione degli sconti in base all'età
        if (eta < 18) { // Se l'utente ha meno di 18 anni, applica uno sconto del 10%
            totale *= 0.90; // Riduce il totale del 10%
        } else if (eta > 65) { // Se l'utente ha più di 65 anni, applica uno sconto del 5%
            totale *= 0.95; // Riduce il totale del 5%
        }

        // Stampa dei dettagli del preventivo
        System.out.println("\nDettagli del preventivo:");
        System.out.println("- Prezzo base (" + pianoTel + "): " + prezzoBase + "€"); // Mostra il prezzo base
        System.out.println("- Costo extra minuti: " + costoExtraMinuti + "€"); // Mostra il costo extra per i minuti
        System.out.println("- Costo extra messaggi: " + costoExtraMessaggi + "€"); // Mostra il costo extra per i messaggi
        System.out.println("- Costo extra GB: " + costoExtraGb + "€"); // Mostra il costo extra per i GB
        System.out.println("- Totale prima degli sconti: "
                + (prezzoBase + costoExtraMinuti + costoExtraMessaggi + costoExtraGb) + "€"); // Mostra il totale prima degli sconti
        System.out.println("- Totale dopo gli sconti: " + totale + "€"); // Mostra il totale finale dopo gli sconti

        // Chiude lo Scanner per liberare le risorse
        myScanner.close();
    }
}
