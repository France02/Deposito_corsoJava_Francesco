package Mercoledi_3004;

public class EserciziOperatoreTernario {
    public static void main(String[] args) {
        int numero = 10;
        String risulato = (numero % 2 == 0) ? "il numero è pari" : "il numero è dispari";
        System.out.println(risulato);

        int numero2 = -5;
        int valoreAssoluto = (numero2 >= 0) ? numero2 : -numero2;
        System.out.println("Il valore assoluto del numero è: " + valoreAssoluto);

        int anno = 2020;
        String annoBisestile = (anno % 4 == 0 && anno % 100 != 0) ? "L'anno è bisestile" : "l'anno non è bisestile";
        System.out.println(annoBisestile);

        String numeroMax = (numero > numero2) ? "il valore massimo è " + numero : "il valore massimo è " + numero2;
        System.out.println(numeroMax);

        char carattere = 'A';
        String risultato = (Character.isUpperCase(carattere)) ? "Il carattere è una lettera maiuscola." : "Il carattere non è una lettera maiuscola.";
        System.out.println(risultato);

        String stringVuota = "";
        String risulatoVuota = (stringVuota.isEmpty()) ? "La stringa è vuota" : "La stringa non è vuota";
        System.out.println(risulatoVuota);

        String risultatoPositivo = (numero2 > 0) ? "Il numero è positivo." : (numero < 0) ? "Il numero è negativo." : "Il numero è zero.";
        System.out.println(risultatoPositivo);

        

    }
}
