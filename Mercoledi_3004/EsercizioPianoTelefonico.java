package Mercoledi_3004;

import java.util.Scanner;

public class EsercizioPianoTelefonico {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Benvenuto Scegli io tuo piano telefonico (Base, Plus, Premium):");
        String pianoTel = myScanner.nextLine();

        double prezzoBase = 0;
        switch (pianoTel) {
            case "Base":
                prezzoBase += 10;
                break;
            case "Plus":
                prezzoBase += 15;
                break;
            case "Premium":
                prezzoBase += 20;
                break;

            default:
                System.out.println("Non hai selezionato nessun Piano");
                break;
        }

        System.out.println("Numero di minuti");
        int numMinuti = myScanner.nextInt();
        System.out.println("Numero di Messaggi:");
        int numMessaggi = myScanner.nextInt();
        System.out.println("Numero di GB");
        int numGb = myScanner.nextInt();

        double costoExtraMinuti = 0;
        if (numMinuti > 100) {
            costoExtraMinuti = (numMinuti - 100) * 0.10; // 0.10€ per ogni minuto extra
        }

        double costoExtraMessaggi = 0;
        if (numMessaggi > 50) {
            costoExtraMessaggi = (numMessaggi - 50) * 0.05; // 0.05€ per ogni messaggio extra
        }

        double costoExtraGb = 0;
        if (numGb > 5) {
            costoExtraGb = (numGb - 5) * 2; // 2€ per ogni GB extra
        }

        // Totale parziale
        double totale = prezzoBase + costoExtraMinuti + costoExtraMessaggi + costoExtraGb;

        // Input: Età dell'utente
        System.out.println("Inserisci la tua età:");
        int eta = myScanner.nextInt();

        // Applicazione degli sconti
        if (eta < 18) {
            totale *= 0.90; // Sconto del 10%
        } else if (eta > 65) {
            totale *= 0.95; // Sconto del 5%
        }

        // Output finale
        System.out.println("\nDettagli del preventivo:");
        System.out.println("- Prezzo base (" + pianoTel + "): " + prezzoBase + "€");
        System.out.println("- Costo extra minuti: " + costoExtraMinuti + "€");
        System.out.println("- Costo extra messaggi: " + costoExtraMessaggi + "€");
        System.out.println("- Costo extra GB: " + costoExtraGb + "€");
        System.out.println("- Totale prima degli sconti: "
                + (prezzoBase + costoExtraMinuti + costoExtraMessaggi + costoExtraGb) + "€");
        System.out.println("- Totale dopo gli sconti: " + totale + "€");

        myScanner.close();

    }
}
