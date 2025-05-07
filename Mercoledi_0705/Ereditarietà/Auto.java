package Mercoledi_0705.Ereditarietà;

// Creare una classe Auto che estende la classe Veicolo e 
// aggiunge un campo modello e un metodo mostraModello per visualizzare il modello dell'auto:
public class Auto extends Veicolo {
    
    private String modello;

    public Auto(String marca, String modello){
        super(marca);
        this.modello = modello;

    }

    public void mostraModello(){
        System.out.println("Il modello dell'auto è: " + modello);
    }

    public static void main(String[] args) {
        Auto auto = new Auto("Fiat", "Grande Punto");
        auto.mostraMarca();
        auto.mostraModello();
    }
    
}
