package Mercoledi_0705.EserciziArray;

import java.util.Arrays;

public class ArrayInverso {
    public static void main(String[] args) {
        // Invertire l'ordine degli elementi in un array:
        int numeri[] = {1, 5, 3, 4, 10};
        int numeriInverso[] = new int[numeri.length];
        
        for(int i = 0; i < numeri.length; i++){
            numeriInverso[i] = numeri[numeri.length - i - 1];
        }

        System.out.println("Array inverso " + Arrays.toString(numeriInverso));
    }
}
