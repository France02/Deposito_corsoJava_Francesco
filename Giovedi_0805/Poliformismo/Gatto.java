package Giovedi_0805.Poliformismo;

public class Gatto extends Animale {
    // Creare una classe Gatto che estende la classe Animal e sovrascrive
    //  il metodo emettiSuono per visualizzare il suono del gatto:
    @Override
    public void emettiSuono(){
        System.out.println("Miao Miao noooo");
    }


    public static void main(String[] args) {
        Gatto gatto = new Gatto();
        gatto.emettiSuono();
    }
}
