package Giovedi_0805.Poliformismo.ArrayList;

import java.util.ArrayList;

public class ProvaArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numeri = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            numeri.add((int) (Math.random() * 100) + 1);
        }

        System.out.println("Lista originale: "  + numeri);

    }
}