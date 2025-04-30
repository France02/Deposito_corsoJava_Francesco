package Mercoledi_3004;

import java.util.Scanner;

public class EserciziIf {
    public static void main(String[] args) {
        // Scrivi un programma Java che verifica se un numero intero è positivo, negativo o zero.
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int num = myScanner.nextInt();
        myScanner.nextLine();
        

        if(num > 0){
            System.out.println("Il numero è positivo");

        }else if (num < 0) {
            System.out.println("Il numero è negativo");
        }else{
            System.out.println("Il numero è 0");
        }

        // Scrivi un programma Java che verifica se un numero è pari o dispari.
        if(num % 2 == 0){
            System.out.println("Il numero è pari");

        }else{
            System.out.println("Il numero è dispari");
        }
        

        // Scrivi un programma Java che verifica se un carattere è una lettera maiuscola o una lettera minuscola.

        char lettera = 'A';
        if(Character.isUpperCase(lettera)){
            System.out.println("La lettera è maiuscola");
        }else{ 
            System.out.println("La lettera è minuscola");
        }

        int anno = 2020;
        if (anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0)) {
            System.out.println("L'anno è bisestile.");
        } else {
            System.out.println("L'anno non è bisestile.");
        }
        
        // Scrivi un programma Java che verifica se un numero è positivo e pari.
        if(num > 0 && num % 2 == 0){
            System.out.println("il numero è positivo e pari");
        } else{
            System.out.println("il numero non è positivo ne pari");
        }

        // Scrivi un programma Java che verifica se una stringa è vuota o null.
        System.out.println("Scirvi un stringa");
        String text = myScanner.nextLine();

        if(text == null || text.isEmpty()){
            System.out.println("Il testo che hai scritto è vuoto");
        }else{
            System.out.println("Hai inserito un testo");
        }
        
        
        
        myScanner.close();
    }
}
