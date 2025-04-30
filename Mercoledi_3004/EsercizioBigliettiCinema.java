package Mercoledi_3004;

import java.util.Scanner; // Importa la classe Scanner per leggere input dall'utente

public class EsercizioBigliettiCinema {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); // Crea un oggetto Scanner per leggere input da tastiera

        int postiStandard = 100; // Inizializza il numero di posti Standard disponibili
        int postiVip = 20; // Inizializza il numero di posti VIP disponibili
        int postiTotali = postiStandard + postiVip; // Calcola il numero totale di posti disponibili
        
        double totale = 0; // Variabile per tenere traccia del totale incassato dal cinema

        boolean scelta = true; // Variabile booleana per controllare il ciclo while
        while (scelta && postiTotali > 0) { // Continua il ciclo finché l'utente sceglie di continuare e ci sono posti disponibili
            
            System.out.println("Benvenuto prenota i tuoi biglietti Standard o Vip"); // Messaggio di benvenuto
            String biglietto = myScanner.nextLine(); // Legge il tipo di biglietto scelto dall'utente

            double prezzo = 0; // Variabile per memorizzare il prezzo del singolo biglietto
            if (biglietto.equals("Standard") && postiStandard > 0) { // Se l'utente sceglie un biglietto Standard e ci sono posti disponibili
                prezzo += 8; // Aggiunge il prezzo del biglietto Standard (8€)
                postiStandard--; // Decrementa il numero di posti Standard disponibili
            } else if (biglietto.equals("Vip") && postiVip > 0) { // Se l'utente sceglie un biglietto VIP e ci sono posti disponibili
                prezzo += 15; // Aggiunge il prezzo del biglietto VIP (15€)
                postiVip--; // Decrementa il numero di posti VIP disponibili
            } else { // Se il biglietto non è valido o i posti sono esauriti
                System.out.println("Seleziona un posto valido/Posti finiti"); // Stampa un messaggio di errore
            }

            System.out.println("Inserisci la tua età"); // Chiede all'utente di inserire la sua età
            int eta = myScanner.nextInt(); // Legge l'età inserita dall'utente
            myScanner.nextLine(); // Consuma il newline lasciato da nextInt()

            if (eta < 25) { // Se l'utente ha meno di 25 anni
                prezzo *= 0.95; // Applica uno sconto del 5% sul prezzo del biglietto corrente
                System.out.println("Hai uno sconto del 5%"); // Notifica all'utente dello sconto applicato
            }

            totale += prezzo; // Aggiunge il prezzo del biglietto corrente al totale incassato

            System.out.println("Il prezzo totale è: " + prezzo); // Stampa il prezzo del biglietto corrente
            System.out.println("Vuoi acquistare un altro biglietto? (Scrivi 'si' per continuare, 'no' per uscire):"); // Chiede all'utente se vuole continuare
            String continua = myScanner.nextLine(); // Legge la risposta dell'utente

            if (!(continua.equals("si"))) { // Se l'utente non vuole continuare
                scelta = false; // Imposta la variabile scelta a false per terminare il ciclo
            }
        }

        // Riepilogo finale dopo la fine del ciclo
        System.out.println("\n--- Riepilogo finale ---");
        System.out.println("Ha pagato: " + totale); // Stampa il totale incassato dal cinema
        System.out.println("Posti Standard rimasti: " + postiStandard); // Stampa il numero di posti Standard rimasti
        System.out.println("Posti VIP rimasti: " + postiVip); // Stampa il numero di posti VIP rimasti

        myScanner.close(); // Chiude lo Scanner per liberare le risorse
    }
}