package Martedi_0605;

public class NumeroMinimoArray {
    public static void main(String[] args) {
        int[] numeri = {10, 50, 60,30, 2};
        int minimo = numeri[0];

        for(int i = 0; i < numeri.length; i++){
            if(numeri[i] < minimo){
                minimo = numeri[i];
            }
        }

        System.out.println("il numero minimo è: "+ minimo);
    }
}
