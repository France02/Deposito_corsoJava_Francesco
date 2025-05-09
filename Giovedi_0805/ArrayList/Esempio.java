package Giovedi_0805.ArrayList;

import java.util.ArrayList;

public class Esempio {
    public static void main(String[] args) {

        // Creiamo un ArrayList di Stringhe
        ArrayList<String> frutta = new ArrayList<>();

        // Aggiungiamo elementi
        frutta.add("Mela");
        frutta.add("Banana");
        frutta.add("Arancia");

        // Stampa
        System.out.println(frutta); // Output: [Mela, Banana, Arancia]

        // Aggiungi in una posizione specifica
        frutta.add(1, "Pera");
        System.out.println(frutta); // Output: [Mela, Pera, Banana, Arancia]

        // Modifica un elemento
        frutta.set(2, "Kiwi");
        System.out.println(frutta); // Output: [Mela, Pera, Kiwi, Arancia]

        // Rimuovi un elemento
        frutta.remove(3);
        System.out.println(frutta); // Output: [Mela, Pera, Kiwi]

        // Cerca elemento
        System.out.println(frutta.contains("Pera")); // true

        // Dimensione
        System.out.println("Dimensione: " + frutta.size()); // 3

        // Cancella tutto
        frutta.clear();
        System.out.println("Vuoto? " + frutta.isEmpty()); // true
    }
}
