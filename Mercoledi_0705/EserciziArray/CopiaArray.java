package Mercoledi_0705.EserciziArray;

import java.util.Arrays;

public class CopiaArray {
    public static void main(String[] args) {
        int numer1[] = {1 , 2 , 3, 4};
        int numer2[] = new int[numer1.length];
        for(int i = 0; i < numer1.length; i++){
            numer2[i] = numer1[i];
        }

        System.out.println("Primo array: " + Arrays.toString(numer1) + " Secondo array: " + Arrays.toString(numer2));
    }
}
