package Lenedi_0505;

class Cellulare {
    // Variabili d'istanza
    private double carica;
    private int numeroChiamate;

    // Costruttore
    public Cellulare(double unaCarica) {
        this.carica = unaCarica;
        this.numeroChiamate = 0; // Inizializzo a zero come richiesto
    }

    // Metodo per ricaricare il cellulare
    public void ricarica(double unaRicarica) {
        carica += unaRicarica;
    }

    // Metodo per effettuare una chiamata
    public void chiama(double minutiDurata) {
        double costoChiamata = 0.20 * minutiDurata;

        if (carica >= costoChiamata) {
            carica -= costoChiamata;
            numeroChiamate++;
        } else {
            System.out.println("Credito insufficiente per effettuare la chiamata.");
        }
    }

    // Metodo che restituisce la carica residua
    public double numero404() {
        return carica;
    }

    // Metodo che restituisce il numero di chiamate effettuate
    public int getNumeroChiamate() {
        return numeroChiamate;
    }

    // Metodo che azzera il contatore delle chiamate
    public void azzeraChiamate() {
        numeroChiamate = 0;
    }
}

public class EsercizioCellulare {

    public static void main(String[] args) {
        Cellulare mioCellulare = new Cellulare(20.0);

        // Effettuo una chiamata di 5 minuti
        mioCellulare.chiama(5); // Costo: 1 euro

        // Effettuo un'altra chiamata di 10 minuti
        mioCellulare.chiama(10); // Costo: 2 euro

        // Ricarico altri 10 euro
        mioCellulare.ricarica(10.0);

        // Stampo stato del cellulare
        System.out.println("Carica residua: €" + mioCellulare.numero404());
        System.out.println("Numero di chiamate effettuate: " + mioCellulare.getNumeroChiamate());

        // Azzero il contatore delle chiamate
        mioCellulare.azzeraChiamate();

        System.out.println("Dopo l'azzeramento:");
        System.out.println("Nuovo numero di chiamate: " + mioCellulare.getNumeroChiamate());
    }
}