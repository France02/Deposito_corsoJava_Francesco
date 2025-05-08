package Giovedi_0805.Poliformismo;

public class Animale {
// Creare una classe Animal con un metodo emettiSuono che visualizza il suono dell'animale:
    public void emettiSuono(){
        System.out.println("Non parla");
    }



    public static void main(String[] args) {
        Animale animale = new Animale();
        animale.emettiSuono();
    }
}
