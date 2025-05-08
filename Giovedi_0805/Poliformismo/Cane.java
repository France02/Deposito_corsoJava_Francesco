package Giovedi_0805.Poliformismo;

public class Cane extends Animale {
    // Creare una classe Cane che estende la classe Animal e sovrascrive 
    // il metodo emettiSuono per visualizzare il suono del cane:
    @Override
    public void emettiSuono(){
        System.out.println("BAUUU BAUUUUU");
    }


    public static void main(String[] args) {
        Cane cane = new Cane();
        cane.emettiSuono();

    }
}
