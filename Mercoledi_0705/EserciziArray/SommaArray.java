package Mercoledi_0705.EserciziArray;

import java.util.Arrays;

public class SommaArray {
    public static void main(String[] args) {
        // Invertire l'ordine degli elementi in un array:
        int numeri[] = {1, 5, 3, 4, 10};
        int numeri2[] = {1 , 2 , 3, 4, 5};
        int sommaArray[] = new int[numeri.length];

        for(int i = 0; i < numeri.length; i++){
            sommaArray[i] = numeri[i] + numeri2[i];
        }

        System.out.println(Arrays.toString(sommaArray));
    }
}
