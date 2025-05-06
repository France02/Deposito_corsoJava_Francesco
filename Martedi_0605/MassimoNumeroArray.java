package Martedi_0605;

public class MassimoNumeroArray {
    public static void main(String[] args) {
        // Trovare il valore massimo in un array di numeri interi:
        int[] numeri = {10, 30, 40, 5};
        int massimo = numeri[0];

        for(int i = 0; i < numeri.length; i++){
            if(numeri[i] > massimo){
                massimo = numeri[i];
            }
        }

        System.out.println("il numero massimo è: " + massimo);
        
    }
}
