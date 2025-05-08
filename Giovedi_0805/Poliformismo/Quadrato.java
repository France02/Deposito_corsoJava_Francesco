// Dichiarazione del package (assicurati che la struttura delle cartelle lo rispetti)
package Giovedi_0805.Poliformismo;

// La classe Quadrato estende la classe Figura, ereditandone le proprietà e i metodi
public class Quadrato extends Figura {

    // Variabile d'istanza privata: rappresenta la lunghezza del lato del quadrato
    private double lato;

    // Costruttore della classe Quadrato
    public Quadrato(double lato) {
        this.lato = lato; // Inizializza il lato del quadrato
    }

    // Override del metodo calcolaArea() definito nella classe padre Figura
    @Override
    public double calcolaArea() {
        // L'area del quadrato si calcola come lato * lato
        return lato * lato;
    }

    // Metodo getter per accedere al valore del lato (opzionale ma utile)
    public double getLato() {
        return lato;
    }

    // Metodo principale main: punto di ingresso del programma
    public static void main(String[] args) {
        // Creiamo un oggetto Quadrato con lato 30.0
        Quadrato quadrato = new Quadrato(30.0);

        // Calcoliamo l'area utilizzando il metodo calcolaArea()
        double areaQuadrato = quadrato.calcolaArea();

        // Stampiamo il risultato a schermo
        // Usiamo System.out.printf per formattare meglio il numero (2 cifre decimali)
        System.out.printf("L'Area del quadrato è: %.2f%n", areaQuadrato);
    }
}