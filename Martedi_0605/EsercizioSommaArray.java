package Martedi_0605;

public class EsercizioSommaArray {
    public static void main(String[] args) {
        // Calcolare la somma degli elementi di un array di interi:
        int[] numeri = {10 , 20, 30};
        int somma = 0;

        for(int i = 0; i < numeri.length; i++){
            somma += numeri[i];
        }
        System.out.println("La somma è:" + somma);
    }
}
