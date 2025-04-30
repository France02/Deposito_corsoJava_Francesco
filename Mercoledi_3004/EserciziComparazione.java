package Mercoledi_3004;

public class EserciziComparazione {
    public static void main(String[] args) {
        // Dichiarazione di una variabile di tipo int con il valore 10
        int numero = 10;

        // Verifica se il numero è positivo (maggiore di 0)
        boolean isPositive = numero > 0;
        // Stampa il risultato della verifica
        System.out.println("Il numero è positivo? " + isPositive); // true, perché 10 > 0

        // Dichiarazione di una variabile di tipo int con il valore 6
        int numeroPari = 6;

        // Verifica se il numero è pari (il resto della divisione per 2 è 0)
        boolean isPari = numeroPari % 2 == 0;
        // Stampa il risultato della verifica
        System.out.println("Il numero è pari? " + isPari); // true, perché 6 % 2 == 0

        // Dichiarazione di due stringhe con lo stesso valore
        String text = "Francesco";
        String textEquals = "Francesco";

        // Verifica se le due stringhe sono uguali usando il metodo equals()
        System.out.println(text.equals(textEquals)); // true, perché il contenuto delle stringhe è identico

        // Verifica se i due numeri sono diversi usando l'operatore !=
        boolean isDifferent = !(numero == numeroPari);
        // Stampa il risultato della verifica
        System.out.println("I due numeri sono differenti? " + isDifferent); // true, perché 10 != 6

        // Verifica se la stringa è vuota usando il metodo isEmpty()
        System.out.println("La stringa è vuota? " + text.isEmpty()); // false, perché "Francesco" non è vuota

        // Confronto se il primo numero è maggiore del secondo
        System.out.println((numero > numeroPari)); // false, perché 10 non è maggiore di 6

        // Confronto se la lunghezza della prima stringa è maggiore della seconda
        System.out.println((text.length() > textEquals.length())); // false, perché hanno la stessa lunghezza (9)

        // Dichiarazione di un nuovo numero e di due limiti
        int numero2 = 15;
        int limiteInferiore = 10;
        int limiteSuperiore = 20;

        // Verifica se il numero è compreso tra i due limiti (esclusi)
        boolean compreso = numero2 > limiteInferiore && numero2 < limiteSuperiore;
        // Stampa il risultato della verifica
        System.out.println("Il numero è compreso tra " + limiteInferiore + " e " + limiteSuperiore + "? " + compreso); // true, perché 15 è compreso tra 10 e 20

        // Dichiarazione di due caratteri
        char carattere1 = 'a';
        char carattere2 = 'b';

        // Verifica se i due caratteri sono uguali
        boolean uguali = carattere1 == carattere2;
        // Stampa il risultato della verifica
        System.out.println("I caratteri sono uguali? " + uguali); // false, perché 'a' != 'b'
    }
}