package Mercoledi_0705.Ereditarietà;

// Creare una classe Veicolo con un campo marca e un metodo mostraMarca per visualizzare la marca del veicolo:


public class Veicolo {

    private String marca;

    public Veicolo(String marca){
        this.marca = marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void mostraMarca(){
        System.out.println("Il nome della Marca è: " + marca );
    }


    public static void main(String[] args) {
        Veicolo veicolo = new Veicolo("Fiat");
        veicolo.mostraMarca();
    }
}
