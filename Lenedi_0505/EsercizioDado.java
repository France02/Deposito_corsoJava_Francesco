package Lenedi_0505;

class Dado {
    private int numFacciata;

    public Dado(int numFacciata) {
        this.numFacciata = numFacciata;
    }

    public int getnumFacciata() {
        return numFacciata;
    }
}

class EsercizioDado {

    public static void main(String[] args) {
        // Creo un dado a 6 facce
        Dado dado = new Dado(6);

        // Lancio il dado: numero casuale tra 1 e numFacciata
        int lancio = (int)(Math.random() * dado.getnumFacciata()) + 1;

        // Stampo il risultato
        System.out.println("Hai lanciato: " + lancio);
    }
}