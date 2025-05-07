package Mercoledi_0705.ModificatoriDiAccesso;

// Creare una classe Automobile con un campo marca protetto e un metodo mostraMarca pubblico per accedere al valore del campo:
class Automobile{
    protected String marca;

    public Automobile(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }
}

public class ClasseAutomobile {
    public static void main(String[] args) {
        Automobile auto = new Automobile("Fiat");

        System.out.println(auto.getMarca());
    }
}
