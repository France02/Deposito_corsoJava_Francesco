package Lenedi_0505;

// Classe principale con il main
public class ProvaClassiOggetti {

    public static void main(String[] args) {
        // Creo auto1 usando il costruttore di default
        Auto auto1 = new Auto();
        auto1.setMarca("Fiat");
        auto1.setModello("Panda");
        auto1.setAnnoDiProduzione(2020);
        auto1.setColore("Blu");

        // Stampo i dati dell'auto1
        System.out.println("Auto 1:");
        System.out.println("Marca: " + auto1.getMarca());
        System.out.println("Modello: " + auto1.getModello());
        System.out.println("Anno: " + auto1.getAnnoDiProduzione());
        System.out.println("Colore: " + auto1.getColore());

        // Creo auto2 con il costruttore con parametri
        Auto auto2 = new Auto("Ford", "Focus", 2018, "Rosso");

        // Stampo i dati dell'auto2
        System.out.println("\nAuto 2:");
        System.out.println("Marca: " + auto2.getMarca());
        System.out.println("Modello: " + auto2.getModello());
        System.out.println("Anno: " + auto2.getAnnoDiProduzione());
        System.out.println("Colore: " + auto2.getColore());
    }
}

// Classe Auto definita nello stesso file ma fuori dalla classe principale
class Auto {
    // Attributi privati
    private String marca;
    private String modello;
    private int annoDiProduzione;
    private String colore;

    // Costruttore di default
    public Auto() {
        this.marca = "";
        this.modello = "";
        this.annoDiProduzione = 0;
        this.colore = "";
    }

    // Costruttore con parametri
    public Auto(String marca, String modello, int annoDiProduzione, String colore) {
        this.marca = marca;
        this.modello = modello;
        this.annoDiProduzione = annoDiProduzione;
        this.colore = colore;
    }

    // Getter e Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getAnnoDiProduzione() {
        return annoDiProduzione;
    }

    public void setAnnoDiProduzione(int annoDiProduzione) {
        this.annoDiProduzione = annoDiProduzione;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }
}