package Mercoledi_3004;

public class EserciziStringhe {
    public static void main(String[] args) {
        // Dichiarazione di una variabile di tipo String con il valore "Francesco"
        String text = "Francesco";
        
        // Dichiarazione di una variabile di tipo int con il valore 20
        int numero = 20;
        
        // Dichiarazione di un'altra variabile di tipo String con il valore "Golino"
        String text2 = "Golino";
        
        // Dichiarazione di una variabile di tipo String contenente uno spazio all'inizio o alla fine
        String textWithSpace = "Francesco gioca a qualcosa";

        // Stampa la lunghezza della stringa "text" (numero di caratteri)
        // Il risultato sarà 9, poiché "Francesco" ha 9 caratteri
        System.out.println(text.length()); // 9 Lunghezza testo

        // Converte la stringa "text" in maiuscolo e stampa il risultato
        // Il risultato sarà "FRANCESCO"
        System.out.println(text.toUpperCase()); // FRANCESCO

        // Verifica se la stringa "text" termina con la lettera "o"
        // Il risultato sarà true, poiché "Francesco" termina con "o"
        System.out.println(text.endsWith("o"));

        // Converte il numero intero "numero" in una stringa e stampa il risultato
        // Il risultato sarà "20", rappresentato come stringa
        System.out.println(String.valueOf(numero));

        // Concatena le due stringhe "text" e "text2" con uno spazio tra loro
        // Il risultato sarà "Francesco Golino"
        System.out.println(text + " " + text2);

        // Verifica se la stringa "text" contiene la sottostringa "sco"
        // Il risultato sarà true, poiché "Francesco" contiene "sco"
        System.out.println(text.contains("sco"));

        // Rimuove eventuali spazi vuoti all'inizio e alla fine della stringa "textWithSpace"
        // In questo caso, non ci sono spazi extra, quindi il risultato sarà identico alla stringa originale
        System.out.println(textWithSpace.trim());
    }
}