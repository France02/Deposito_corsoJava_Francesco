package Mercoledi_3004;

public class EserciziOperatoriLogici {
    public static void main(String[] args) {
        // Dichiarazione di una variabile di tipo int con il valore 13
        int numero = 13;

        // Verifica se il numero è compreso tra 10 e 20 (inclusi)
        System.out.println((numero >= 10 && numero <= 20)); 
        // true, perché 13 è compreso tra 10 e 20

        // Dichiarazione di una variabile di tipo int con il valore 2020
        int anno = 2020;

        // Verifica se l'anno è bisestile:
        // Un anno è bisestile se è divisibile per 4 ma non per 100, oppure se è divisibile per 400
        boolean bisestile = (anno % 4 == 0 && anno % 100 != 0) || anno % 400 == 0;
        System.out.println("L'anno " + anno + " è bisestile? " + bisestile); 
        // true, perché 2020 è divisibile per 4 ma non per 100

        // Dichiarazione di una stringa vuota
        String text = "";

        // Verifica se la stringa è vuota o null
        System.out.println("La stringa è vuota o null? " + (text == null || text.isEmpty())); 
        // true, perché la stringa è vuota (non contiene caratteri)

        // Verifica se il numero è positivo e dispari
        System.out.println("Il numero è positivo e dispari? " + (numero > 0 && numero % 2 != 0)); 
        // true, perché 13 è positivo e dispari

        // Dichiarazione di una stringa e di un numero intero
        String persona = "Golino";
        int età = 18;

        // Verifica se la persona è maggiorenne (età >= 18)
        System.out.println("Il signor " + persona + " è maggiorenne? " + (età >= 18)); 
        // true, perché 18 è l'età minima per essere maggiorenne

        // Verifica se il numero è pari e divisibile per 3
        System.out.println("Il numero è pari e divisibile per 3? " + (numero % 2 == 0 && numero % 3 == 0)); 
        // false, perché 13 non è né pari né divisibile per 3

        // Dichiarazione di un nuovo numero negativo
        int num2 = -10;

        // Verifica se il numero è negativo o zero
        System.out.println("Il numero è negativo o zero? " + (num2 <= 0)); 
        // true, perché -10 è minore di 0

        // Dichiarazione di una stringa
        String oggetto = "Barattolo";

        // Verifica se la stringa inizia con "A" o "B"
        System.out.println("La stringa inizia con A o B? " + (oggetto.startsWith("A") || oggetto.startsWith("B"))); 
        // true, perché "Barattolo" inizia con "B"
    }
}